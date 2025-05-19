package Model;

import jakarta.persistence.*;

@Entity
@Table(name="usuario")

public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public usuario(String nome, String email, String senha, int usuario) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.usuario = usuario;
    }

    private int id;

    private String nome;
    private String email;
    private String senha;


}
