package tn.mahmoud.timoumi_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.mahmoud.timoumi_1.entity.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long> {
}