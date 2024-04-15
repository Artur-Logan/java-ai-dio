package com.arturlogan.javaaidio.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity(name = "tb_conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numero;

    private String agencia;

    @Column(precision = 13, scale = 2)
    private BigDecimal saldo;

    @Column(name = "limite_adicional", precision = 13, scale = 2)
    private BigDecimal limite;
}
