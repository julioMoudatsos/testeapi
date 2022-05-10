package goDevs.api.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Projeto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projeto_id;

    private String nome_vaga ;
    private String descricao;
    private Date data_limite;
    private Date data_inicio;
    private Double valor ;
    private String categoria;

    private String foto ;
    private String senha ;
    private int disponivel;
    private int finalizado ;



    @JsonIgnore
    @ManyToOne()
    private Contratante fk_;


    @ManyToOne()
    private Equipe fk__;

    public Equipe getFk__() {
        return fk__;
    }

    public Contratante getFk_() {
        return fk_;
    }



    public void setFk_(Contratante fk_) {
        this.fk_ = fk_;
    }



    public Integer getProjeto_id() {
        return projeto_id;
    }

    public void setProjeto_id(Integer projeto_id) {
        this.projeto_id = projeto_id;
    }

    public String getNome_vaga() {
        return nome_vaga;
    }

    public void setNome_vaga(String nome_vaga) {
        this.nome_vaga = nome_vaga;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_limite() {
        return data_limite;
    }

    public void setData_limite(Date data_limite) {
        this.data_limite = data_limite;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public int getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(int disponivel) {
        this.disponivel = disponivel;
    }

    public int getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(int finalizado) {
        this.finalizado = finalizado;
    }
}
