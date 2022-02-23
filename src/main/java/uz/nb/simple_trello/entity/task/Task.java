package uz.nb.simple_trello.entity.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.nb.simple_trello.entity.Auditable;
import uz.nb.simple_trello.entity.project.Project;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Task extends Auditable {

    private String name;
    private String description;

    private String level;

    @Convert(disableConversion = true)
    @Column(name = "deadline")
    private Instant deadline;

    private boolean completed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "column_id")
    private uz.nb.simple_trello.entity.column.Column column;

}
