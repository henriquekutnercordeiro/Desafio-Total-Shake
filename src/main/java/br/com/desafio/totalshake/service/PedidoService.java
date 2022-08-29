package br.com.desafio.totalshake.service;

import br.com.desafio.totalshake.model.Pedido;
import br.com.desafio.totalshake.model.Status;
import br.com.desafio.totalshake.repositorio.PedidoRepo;
import org.springframework.stereotype.Service;


import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class PedidoService {

    private final PedidoRepo pedidoRepo;

    public PedidoService(PedidoRepo pedidoRepo) {
        this.pedidoRepo = pedidoRepo;
    }

    @Transactional
    public Pedido salvarPedido(Pedido pedido) {
        return pedidoRepo.save(pedido);
    }
}
