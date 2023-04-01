package br.edu.utfpr.caixa_medicamentos.models.domain;

import javax.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "medicamento")
@Data(staticConstructor = "of")
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String nome;
    @NonNull
    private String tipo;
    @NonNull
    private Date vencimento;
    @NonNull
    private String caixa;

}
