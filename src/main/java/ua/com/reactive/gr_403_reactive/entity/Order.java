package ua.com.reactive.gr_403_reactive.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("orders")
public class Order {
    @Id
    private Long id;

    @Column("drink_id")
    private Long drinkId;

    @Column("sugar_level")
    private int sugarLevel;

    @Column("status")
    private String status;   // наприклад: "NEW", "DONE", "CANCELLED"
}
