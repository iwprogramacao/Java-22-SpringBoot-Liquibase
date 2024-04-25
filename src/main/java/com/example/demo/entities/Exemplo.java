package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "example")
public class Exemplo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    @Column(name = "cpf", nullable = false)
    private String CPF;
}
