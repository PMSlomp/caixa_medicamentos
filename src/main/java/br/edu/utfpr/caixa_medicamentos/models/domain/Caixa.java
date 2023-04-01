package br.edu.utfpr.caixa_medicamentos.models.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "caixas")
@Data
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Caixa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String nome;


}
