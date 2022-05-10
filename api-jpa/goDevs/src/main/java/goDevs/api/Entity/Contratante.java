package goDevs.api.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Contratante implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "contratante_id")
    private Integer contratante;

    private String nome;

    private String email;

    private String telefone;

    private String cpf_cnpj;

    private String negocio;

    private String funcao;

    private String foto;

    private String senha;


    @OneToMany(mappedBy = "fk_")
    private List<Projeto> prod = new ArrayList<>();

    public List<Projeto> Prod() {
        return prod;
    }

    @OneToMany(mappedBy = "fk__")
    private List<Equipe> equipe = new ArrayList<>();

    public List<Equipe> Equipe() {
        return equipe;
    }

    public Integer getContratante_id() {
        return contratante;
    }

    public void setContratante_id(Integer contratante_id) {
        this.contratante = contratante_id;
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

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getNegocio() {
        return negocio;
    }

    public void setNegocio(String negocio) {
        this.negocio = negocio;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
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
