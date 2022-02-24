package uz.nb.simple_trello.entity.organization;

import lombok.Getter;
import lombok.Setter;
import uz.nb.simple_trello.entity.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;


@Getter
@Setter
@Entity
public class Organization extends Auditable {

    @Column(nullable = false, length = 100)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String code;

    @Column(nullable = false)
    private String address;
}
