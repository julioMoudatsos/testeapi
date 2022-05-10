package goDevs.api.EntityPk;

import goDevs.api.Entity.Contratante;
import goDevs.api.Entity.Dev;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class AvaliacaoPk implements Serializable {
    private  static  final  long serialVersionUID = 1L;

    @ManyToOne
    private Dev fk_;

    @ManyToOne
    private Contratante fk__;



    public AvaliacaoPk() {
    }

    public Dev getDev() {
        return fk_;
    }

    public void setDev(Dev fk_) {
        this.fk_ = fk_;
    }

    public Contratante getContratante() {
        return fk__;
    }

    public void setContratante(Contratante fk__) {
        this.fk__ = fk__;
    }
}
