package uz.nb.simple_trello.entity.project;


import uz.nb.simple_trello.entity.Auditable;
import uz.nb.simple_trello.entity.organization.Organization;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "project", schema = "etm_b4")
public class Project extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Lob
    @Column(name = "name")
    private String name;

    @Column
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @Column(name = "closed")
    private Boolean closed;

}