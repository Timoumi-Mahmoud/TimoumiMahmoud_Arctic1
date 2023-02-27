package tn.mahmoud.timoumi_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.mahmoud.timoumi_1.entity.Moniteur;


public interface MonitorRepository extends JpaRepository<Moniteur, Long> {
}
