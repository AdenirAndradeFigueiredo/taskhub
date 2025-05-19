package Model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tarefa")


public class tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public tarefa(int id, String nome, String descricao, String prioridade, LocalDate dataVencimento, String status, LocalDate dataConclusao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.dataVencimento = dataVencimento;
        this.status = status;
        this.dataConclusao = dataConclusao;
    }

    private String nome;
    private String descricao;
    private String prioridade;
    private LocalDate dataVencimento;
    private String status;
    private LocalDate dataConclusao;

}
