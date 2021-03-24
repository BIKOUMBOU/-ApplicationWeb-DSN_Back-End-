package fr.difftech.suivi_installation_dsn.repository;

import fr.difftech.suivi_installation_dsn.entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteRepository extends JpaRepository<Site,Integer> {
}
