package entity;

import base.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Address extends BaseEntity<Long> {
    private String plaque;
    private String alley;
    private String street;
}
