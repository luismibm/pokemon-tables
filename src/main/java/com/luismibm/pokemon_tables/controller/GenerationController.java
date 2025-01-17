package com.luismibm.pokemon_tables.controller;

import com.luismibm.pokemon_tables.model.Generation;
import com.luismibm.pokemon_tables.model.GenerationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/generations")
public class GenerationController {

    @Autowired
    GenerationRepository generationRepository;

    @GetMapping
    public List<Generation> getGenerations() {
        return (List<Generation>) generationRepository.findAll();
    }

    @GetMapping("/{generationNum}")
    public ResponseEntity<Generation> getGenerationByNum(@PathVariable(value = "generationNum") Long generationNum) {
        Optional<Generation> generation = generationRepository.findById(generationNum);
        if (generation.isPresent()) {
            return ResponseEntity.ok().body(generation.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Generation createCity(@RequestBody Generation generation) {
        return generationRepository.save(generation);
    }

    @PutMapping("/{generationNum}")
    public ResponseEntity<Generation> updateGeneration(@PathVariable Long generationNum, @RequestBody Generation updatedGeneration) {
        Optional<Generation> optionalGeneration = generationRepository.findById(generationNum);
        if (optionalGeneration.isPresent()) {
            Generation generation = optionalGeneration.get();
            generation.setGenerationNum(updatedGeneration.getGenerationNum());
            generation.setGenerationName(updatedGeneration.getGenerationName());
            return ResponseEntity.ok().body(generationRepository.save(generation));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{generationNum}")
    public void deleteGeneration(@PathVariable Long generationNum) {
        generationRepository.deleteById(generationNum);
    }

}