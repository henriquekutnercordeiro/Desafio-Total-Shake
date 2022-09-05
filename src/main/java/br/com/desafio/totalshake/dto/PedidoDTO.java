package br.com.desafio.totalshake.dto;

import br.com.desafio.totalshake.enums.Status;
import br.com.desafio.totalshake.model.ItemPedido;
import br.com.desafio.totalshake.model.Pedido;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.modelmapper.ModelMapper;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;


@Data
public class PedidoDTO {

    @JsonIgnore
    @NotNull(message = "Missing 'id'")
    private Long id;

    @NotNull(message = "Missing 'data e hora'")
    @Column(name = "data_hora")
    private LocalDateTime dataHora;

    @NotNull(message = "Missing 'status'")
    private Status status;

    @NotNull(message = "Missing 'itens'")
    private List< ItemPedido > itensPedidoList;

    public static PedidoDTO convertToDTO(Pedido pedido) {
        ModelMapper mapper = new ModelMapper();
        PedidoDTO dto = mapper.map(pedido, PedidoDTO.class);
        return dto;
    }
}