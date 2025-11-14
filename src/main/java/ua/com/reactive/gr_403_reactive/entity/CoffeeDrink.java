package ua.com.reactive.gr_403_reactive.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("coffee_drink")
public class CoffeeDrink {

    @Id
    private Long id;

    private String name;
    private double price;
}
