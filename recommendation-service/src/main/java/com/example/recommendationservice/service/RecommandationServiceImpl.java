package com.example.recommendationservice.service;

import com.example.recommendationservice.model.Recommandation;
import com.example.recommendationservice.repository.RecommandationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class RecommandationServiceImpl implements RecommandationService{

    private final RecommandationRepository recommandationRepository;
    @Override
    public Recommandation saveRecommandation(Recommandation recommandation) {
        return recommandationRepository.save(recommandation);
    }

    @Override
    public Recommandation getRecommandation(Long id) {
        return recommandationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Recommandation> getAllRecommandations() {
        return recommandationRepository.findAll();
    }

    @Override
    public void deleteRecommandation(Long id) {
        recommandationRepository.deleteById(id);
    }
}
