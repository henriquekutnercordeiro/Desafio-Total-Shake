package br.com.desafio.totalshake.model;

import br.com.desafio.totalshake.dto.ItemPedidoDTO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ItemPedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private String descricao;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_pedido", referencedColumnName="id", nullable=false)
    private Pedido pedido;
}
