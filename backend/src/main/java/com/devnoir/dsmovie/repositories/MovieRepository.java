package com.devnoir.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnoir.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
