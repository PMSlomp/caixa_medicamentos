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

//    @OneToMany
//    @NonNull
//    private Medicamento medicamento;

//    static int idClass = 0;
//    private String nome;
//    private List<Medicamento> listaMed = new ArrayList<>();
//    private int id;

//    static List<Caixa> caixas = new ArrayList<>();
//
//    public Caixa(String nome) {
//        idClass += 1;
//        this.setId(idClass);
//        this.nome = nome;
//    }
//
//    public void addMedicamento(Medicamento med) {
//        listaMed.add(med);
//    }
//
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String toString() {
//        return this.nome;
//    }

}
