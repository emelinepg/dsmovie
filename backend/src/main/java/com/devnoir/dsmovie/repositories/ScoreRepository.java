package com.devnoir.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnoir.dsmovie.entities.Score;
import com.devnoir.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
