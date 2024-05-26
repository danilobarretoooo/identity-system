package com.unijorge.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;



@Entity
@Getter
@Setter
public class Denuncia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private LocalDateTime dataHora;
    private String status;

    // Getters and Setters
}

