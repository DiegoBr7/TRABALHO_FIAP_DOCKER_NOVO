package br.com.fiap.gerenciamento.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_acidente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Acidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "acidente_id")
    private Long id;

    private String localizacao;
    private String gravidade;
    private LocalDateTime data;


}