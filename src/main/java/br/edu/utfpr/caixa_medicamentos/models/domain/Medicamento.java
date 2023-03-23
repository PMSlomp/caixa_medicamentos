package br.edu.utfpr.caixa_medicamentos.models.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Medicamento {

    static int idClass = 0;
    static List<Medicamento> listaMed = new ArrayList<>();

    private int id;
    private String nome;
    private String tipo;
    private Date vencimento;

    private long tempo;

    public Medicamento() {
    }

    public Medicamento(String nome, String tipo, Date vencimento) {
        this.nome = nome;
        this.tipo = tipo;
        this.vencimento = vencimento;
        idClass += 1;
        this.setId(idClass);
        listaMed.add(this);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getVencimento() {
        return vencimento;
    }
    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public long getTempo() {
        return tempo;
    }
    public void setTempo(long tempo) {
        this.tempo = tempo;
    }

    public List<Medicamento> getListaMed() {
        return listaMed;
    }

}
