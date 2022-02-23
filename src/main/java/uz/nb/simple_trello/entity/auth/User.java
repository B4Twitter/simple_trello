package uz.nb.simple_trello.entity.auth;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.nb.simple_trello.entity.Auditable;
import uz.nb.simple_trello.entity.organization.Organization;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User extends Auditable {

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    private UserRole role;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Organization organization;

}
