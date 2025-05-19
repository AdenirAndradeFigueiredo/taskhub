package Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name='projeto')

public class projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    private int id;

    private String name;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataPrevistaFim;

    public projeto(int projeto, String name, String descricao, LocalDate dataInicio, LocalDate dataPrevistaFim) {
        this.projeto = projeto;
        this.name = name;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataPrevistaFim = dataPrevistaFim;
    }


}
