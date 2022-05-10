package goDevs.api.Repository;

import goDevs.api.Entity.Dev;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioDev extends JpaRepository<Dev,Integer> {
}
