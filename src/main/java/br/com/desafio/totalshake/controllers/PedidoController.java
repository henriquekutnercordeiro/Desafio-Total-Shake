package br.com.desafio.totalshake.controller;

import br.com.desafio.totalshake.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    public PedidoService pedidoService;

    @GetMapping
    public ResponseEntity<?> findAllPedidos() {
        return ResponseEntity.ok(pedidoService.findallPedidos());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> findClienteById(@PathVariable("id") Long id){
        return ResponseEntity.ok(pedidoService.findPedidoById(id));
    }

}