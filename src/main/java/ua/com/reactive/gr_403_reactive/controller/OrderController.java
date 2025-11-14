package ua.com.reactive.gr_403_reactive.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.gr_403_reactive.entity.Order;
import ua.com.reactive.gr_403_reactive.service.OrderService;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @GetMapping
    public Flux<Order> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Mono<Order> get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public Mono<Order> create(@RequestBody Order order) {
        return service.create(order);
    }

    @PutMapping("/{id}")
    public Mono<Order> update(@PathVariable Long id,
                              @RequestBody Order order) {
        return service.update(id, order);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}
