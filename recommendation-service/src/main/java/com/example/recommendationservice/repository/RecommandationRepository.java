package com.example.recommendationservice.repository;

import com.example.recommendationservice.model.Recommandation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommandationRepository extends JpaRepository<Recommandation, Long> {
}
