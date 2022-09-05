package br.com.desafio.totalshake.controller;

import br.com.desafio.totalshake.service.ItemPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
@RequestMapping("/item")
public class ItemPedidoController {

    @Autowired
    public ItemPedidoService itemPedidoService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        System.out.println(LocalDateTime.now());
        return ResponseEntity.ok(itemPedidoService.findall());
    }

}