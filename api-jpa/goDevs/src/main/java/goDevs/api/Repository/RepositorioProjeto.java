package goDevs.api.Repository;

import goDevs.api.Entity.Dev;
import goDevs.api.Entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioProjeto extends JpaRepository<Projeto,Integer> {
}
