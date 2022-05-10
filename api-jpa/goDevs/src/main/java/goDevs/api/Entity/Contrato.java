package goDevs.api.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import goDevs.api.EntityPk.ContratoPk;
import goDevs.api.EntityPk.InteressesPk;

import javax.persistence.*;

@Entity
public class Contrato {

   private Integer contrato_id;

    @EmbeddedId
    private ContratoPk id = new ContratoPk();

    public Contrato() {
    }

    public Contrato(Projeto projeto, Dev dev, Contratante contratante) {
        id.setProjeto(projeto);
        id.setDev(dev);
        id.setContratante(contratante);
    }

    public Integer getContrato_id() {
        return contrato_id;
    }

    public void setContrato_id(Integer contrato_id) {
        this.contrato_id = contrato_id;
    }

    public  Projeto getProjeto(){
        return  id.getProjeto();
    }
    public  void  setProduct(Projeto projeto){
        id.setProjeto(projeto);
    }

    public  Contratante getContratante(){
        return  id.getContratante();
    }
    public  void  setContratante(Contratante contratante){
        id.setContratante(contratante);
    }

    public  Dev getDev(){
        return  id.getDev();
    }
    public  void  setDev(Dev dev){
        id.setDev(dev);
    }

}
