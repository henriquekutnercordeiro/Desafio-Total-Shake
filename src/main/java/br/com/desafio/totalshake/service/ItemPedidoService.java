package br.com.desafio.totalshake.service;

import br.com.desafio.totalshake.dto.ItemPedidoDTO;
import br.com.desafio.totalshake.repository.ItemPedidoRepository;
import br.com.desafio.totalshake.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ItemPedidoService {

    @Autowired
    public ItemPedidoRepository itemPedidoRepository;

    public List<ItemPedidoDTO> findall() {
        return itemPedidoRepository.findAll()
                .stream()
                .map(ItemPedidoDTO::convertToDTO)
                .toList();
    }


}