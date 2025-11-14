package ua.com.reactive.gr_403_reactive.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long id;
    private Long drinkId;
    private int sugarLevel;   // 0–3
    private String status;    // NEW, MAKING, READY, ERROR
}
