package ua.com.reactive.gr_403_reactive.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "roles_has_users")
public class RolesHasUsers {

    @Id
    private Long id;

    @Column("role_id")
    private Long roleId;

    @Column("user_id")
    private Long userId;

    @Override
    public String toString() {
        return "RolesHasUsers{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", userId=" + userId +
                '}';
    }
}
