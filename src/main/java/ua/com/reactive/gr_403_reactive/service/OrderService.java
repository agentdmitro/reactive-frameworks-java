package ua.com.reactive.gr_403_reactive.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.gr_403_reactive.entity.Order;
import ua.com.reactive.gr_403_reactive.repository.OrderRepository;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repo;

    public Flux<Order> list() {
        return repo.findAll();
    }

    public Mono<Order> get(Long id) {
        return repo.findById(id);
    }

    public Mono<Order> create(Order order) {
        return repo.save(order);
    }

    public Mono<Order> update(Long id, Order order) {
        order.setId(id);
        return repo.save(order);
    }

    public Mono<Void> delete(Long id) {
        return repo.deleteById(id);
    }
}
