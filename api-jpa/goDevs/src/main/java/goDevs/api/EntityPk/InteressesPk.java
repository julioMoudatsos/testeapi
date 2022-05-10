package goDevs.api.EntityPk;

import goDevs.api.Entity.Dev;
import goDevs.api.Entity.Projeto;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class InteressesPk implements Serializable {
    private static final long serialVersionUID = 6243114494375482005L;

    @ManyToOne
    private Dev fk_;

    @ManyToOne
    private Projeto fk__;


    public InteressesPk() {
    }

    public Dev getDev() {
        return fk_;
    }

    public void setDev(Dev dev) {
        this.fk_ = dev;
    }

    public Projeto getProjeto() {
        return fk__;
    }

    public void setProjeto(Projeto projeto) {
        this.fk__ = projeto;
    }
}
