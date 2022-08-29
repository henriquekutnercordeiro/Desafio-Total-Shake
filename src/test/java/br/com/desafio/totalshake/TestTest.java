package br.com.desafio.totalshake;

import br.com.desafio.totalshake.model.ItemPedido;
import br.com.desafio.totalshake.model.Pedido;
import br.com.desafio.totalshake.model.Status;
import br.com.desafio.totalshake.repositorio.PedidoRepo;
import br.com.desafio.totalshake.service.PedidoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
public class TestTest {

    @Autowired
    private PedidoRepo pedidoRepo;

    @Autowired
    PedidoService pedidoService;


    @Test
    void criandoPedido() {
        Pedido pedido = new Pedido();
        pedido.setStatus(Status.CONFIRMADO);
        pedido.setDataHora(LocalDateTime.now());
        List<ItemPedido> itensPedido = new ArrayList<>(Arrays.asList(new ItemPedido("Coca-cola", 6)));
        pedido.setItensPedido(itensPedido);

        System.out.println(">>>>>>>>>>" + pedido.toString());
        var ped = pedidoService.salvarPedido(pedido);
        System.out.println(">>>>>" + ped);

    }
}
