package goDevs.api.EntityPk;

import goDevs.api.Entity.Contratante;
import goDevs.api.Entity.Dev;
import goDevs.api.Entity.Projeto;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class ContratoPk implements Serializable {
    private static final long serialVersionUID = 6243114494375482005L;

    @ManyToOne
    private Dev fk_;

    @ManyToOne
    private Projeto fk;

    @ManyToOne
    private Contratante fk__;


    public ContratoPk() {
    }

    public Dev getDev() {
        return fk_;
    }

    public void setDev(Dev fk_) {
        this.fk_ = fk_;
    }

    public Projeto getProjeto() {
        return fk;
    }

    public void setProjeto(Projeto fk) {
        this.fk = fk;
    }

    public Contratante getContratante() {
        return fk__;
    }

    public void setContratante(Contratante fk__) {
        this.fk__ = fk__;
    }
}
