package entity;

import base.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserAccount extends BaseEntity<Long> {
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;
    @Column(length = 10,name = "national_code")
    private String nationalCode;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

}
