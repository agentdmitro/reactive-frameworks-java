package ua.com.reactive.gr_403_reactive.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.gr_403_reactive.entity.CoffeeDrink;
import ua.com.reactive.gr_403_reactive.service.CoffeeDrinkService;

@RestController
@RequestMapping("/drinks")
@RequiredArgsConstructor
public class CoffeeDrinkController {

    private final CoffeeDrinkService service;

    @GetMapping
    public Flux<CoffeeDrink> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Mono<CoffeeDrink> get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public Mono<CoffeeDrink> create(@RequestBody CoffeeDrink drink) {
        return service.create(drink);
    }

    @PutMapping("/{id}")
    public Mono<CoffeeDrink> update(@PathVariable Long id,
                                    @RequestBody CoffeeDrink drink) {
        return service.update(id, drink);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
