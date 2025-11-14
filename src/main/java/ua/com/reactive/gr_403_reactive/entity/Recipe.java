package ua.com.reactive.gr_403_reactive.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("recipes")
public class Recipe {

    @Id
    private Long id;

    @Column("drink_id")
    private Long drinkId;

    @Column("water")
    private int water;

    @Column("coffee")
    private int coffee;

    @Column("milk")
    private int milk;
}
