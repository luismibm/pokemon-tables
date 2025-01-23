package com.luismibm.pokemon_tables.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarterRepository extends CrudRepository<Starter, Long> { }