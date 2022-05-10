package goDevs.api.Repository;

import goDevs.api.Entity.Contrato;
import goDevs.api.Entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioContrato extends JpaRepository<Contrato,Integer> {
}
