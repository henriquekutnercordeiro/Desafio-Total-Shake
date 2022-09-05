package br.com.desafio.totalshake.service;

import br.com.desafio.totalshake.dto.PedidoDTO;
import br.com.desafio.totalshake.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    public PedidoRepository pedidoRepository;
    public List<PedidoDTO> findallPedidos() {
        return pedidoRepository.findAll()
                .stream()
                .map(PedidoDTO::convertToDTO)
                .toList();
    }

    public PedidoDTO findPedidoById(Long id) {
        var pedido = pedidoRepository.findById(id).orElseThrow(RuntimeException::new);
        return PedidoDTO.convertToDTO(pedido);
    }
}