package ua.com.reactive.gr_403_reactive.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.gr_403_reactive.entity.Recipe;
import ua.com.reactive.gr_403_reactive.service.RecipeService;

@RestController
@RequestMapping("/recipes")
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService service;

    @GetMapping
    public Flux<Recipe> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Mono<Recipe> get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public Mono<Recipe> create(@RequestBody Recipe recipe) {
        return service.create(recipe);
    }

    @PutMapping("/{id}")
    public Mono<Recipe> update(@PathVariable Long id,
                               @RequestBody Recipe recipe) {
        return service.update(id, recipe);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
