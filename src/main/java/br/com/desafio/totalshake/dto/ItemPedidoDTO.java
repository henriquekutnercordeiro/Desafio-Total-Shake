package br.com.desafio.totalshake.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


import br.com.desafio.totalshake.model.ItemPedido;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class ItemPedidoDTO {

    @JsonIgnore
    @NotNull(message = "Missing 'id'")
    private Long id;

    @JsonIgnore
    @NotNull(message = "Missing 'id_pedido'")
    private Long pedido;

    private String descricao;

    @NotNull(message = "Missing 'quantidade'")
    private Integer quantidade;

    public static ItemPedidoDTO convertToDTO(ItemPedido itemPedido) {
        ModelMapper mapper = new ModelMapper();
        ItemPedidoDTO dto = mapper.map(itemPedido, ItemPedidoDTO.class);
        return dto;
    }
}