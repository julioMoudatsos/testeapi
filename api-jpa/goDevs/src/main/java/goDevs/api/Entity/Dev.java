package goDevs.api.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.*;

@Entity
public class Dev {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Integer usuario_id;

    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private Date nascimento;
    private String cargo;
    private String foto;
    private String senha;


    @OneToMany(mappedBy = "id.fk_" )
    private Set<Interesses> projetosDev = new HashSet<>();

    @OneToMany(mappedBy = "id.fk_")
    private Set<Avaliacao>  notasAtribuidas = new HashSet<>();

    @OneToMany(mappedBy = "fk_")
    private List<Medalhas> medalhas = new ArrayList<>();

    public List<Medalhas> getMedalhas() {
        return medalhas;
    }

    public Set<Avaliacao> getNotasAtribuidas () {
        return notasAtribuidas;
    }

    public Set<Interesses> ProjetosDev() {
        return projetosDev;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
