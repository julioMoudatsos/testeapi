package goDevs.api.Repository;

import goDevs.api.Entity.Equipe;
import goDevs.api.Entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEquipe extends JpaRepository<Equipe,Integer> {
}
