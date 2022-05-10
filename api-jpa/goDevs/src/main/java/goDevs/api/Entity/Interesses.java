package goDevs.api.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import goDevs.api.EntityPk.InteressesPk;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Interesses {

    @EmbeddedId
    private InteressesPk id = new InteressesPk();
    private int situacao;


    public Interesses() {
    }

    public Interesses(Projeto projeto, Dev dev, int situacao) {
        id.setProjeto(projeto);
        id.setDev(dev);
        this.situacao = situacao;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }


    public  Projeto getProjeto(){
        return  id.getProjeto();
    }
    public  void  setProduct(Projeto projeto){
        id.setProjeto(projeto);
    }

    @JsonIgnore
    public  Dev getDev(){
        return  id.getDev();
    }
    public  void  setDev(Dev dev){
        id.setDev(dev);
    }



}
