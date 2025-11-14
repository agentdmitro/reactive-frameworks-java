package ua.com.reactive.gr_403_reactive.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.gr_403_reactive.entity.CoffeeDrink;
import ua.com.reactive.gr_403_reactive.repository.CoffeeDrinkRepository;

@Service
@RequiredArgsConstructor
public class CoffeeDrinkService {

    private final CoffeeDrinkRepository repo;

    public Flux<CoffeeDrink> list() {
        return repo.findAll();
    }

    public Mono<CoffeeDrink> get(Long id) {
        return repo.findById(id);
    }

    public Mono<CoffeeDrink> create(CoffeeDrink drink) {
        return repo.save(drink);
    }

    public Mono<CoffeeDrink> update(Long id, CoffeeDrink drink) {
        drink.setId(id);
        return repo.save(drink);
    }

    public Mono<Void> delete(Long id) {
        return repo.deleteById(id);
    }
}
