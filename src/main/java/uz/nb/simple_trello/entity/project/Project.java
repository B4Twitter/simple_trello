package uz.nb.simple_trello.entity.project;

import lombok.Getter;
import lombok.Setter;
import uz.nb.simple_trello.entity.base.Auditable;
import uz.nb.simple_trello.entity.organization.Organization;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "project", schema = "etm_b4")
public class Project extends Auditable {

    @Column(name = "name")
    private String name;

    private String description;

    private Long organizationId;

    @Column(name = "closed")
    private Boolean closed;

}