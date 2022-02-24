package uz.nb.simple_trello.entity.project;


import uz.nb.simple_trello.entity.Auditable;

import javax.persistence.*;

@Entity
@Table(name = "project_member", schema = "etm_b4")
public class ProjectMember extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "is_lead")
    private Boolean isLead;


    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}