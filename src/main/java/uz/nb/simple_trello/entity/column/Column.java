package uz.nb.simple_trello.entity.column;

import lombok.Getter;
import lombok.Setter;
import uz.nb.simple_trello.entity.Auditable;
import uz.nb.simple_trello.entity.project.Project;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
public class Column extends Auditable {

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    private Integer order;

    private String icon;

    private boolean is_active;
}
