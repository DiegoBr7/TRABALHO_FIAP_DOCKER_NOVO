package br.com.fiap.gerenciamento.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TB_SEMAFORO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Semaforo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String localizacao;
    private String status;
    private int fluxoTrafego;

}
