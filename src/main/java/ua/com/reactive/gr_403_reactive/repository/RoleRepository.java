package ua.com.reactive.gr_403_reactive.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import ua.com.reactive.gr_403_reactive.entity.Role;

@Repository
public interface RoleRepository extends ReactiveCrudRepository<Role, Long> {

    @Query("""
        SELECT r.id, r.name 
        FROM roles r 
        JOIN roles_has_users rh ON r.id = rh.role_id 
        WHERE rh.user_id = :userId
    """)
    Flux<Role> findRolesByUserId(Long userId);
}
