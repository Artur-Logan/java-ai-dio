package com.arturlogan.javaaidio.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numero;

    @Column(name = "limite_disponivel", precision = 13, scale = 2)
    private BigDecimal limite;
}
