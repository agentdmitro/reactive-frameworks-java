package ua.com.reactive.gr_403_reactive.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.gr_403_reactive.entity.Recipe;
import ua.com.reactive.gr_403_reactive.repository.RecipeRepository;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private final RecipeRepository repo;

    public Flux<Recipe> list() {
        return repo.findAll();
    }

    public Mono<Recipe> get(Long id) {
        return repo.findById(id);
    }

    public Mono<Recipe> create(Recipe recipe) {
        return repo.save(recipe);
    }

    public Mono<Recipe> update(Long id, Recipe recipe) {
        recipe.setId(id);
        return repo.save(recipe);
    }

    public Mono<Void> delete(Long id) {
        return repo.deleteById(id);
    }
}
