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

    private String priority;
    private Long parent_id;
    private boolean completed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "column_id")
    private uz.nb.simple_trello.entity.column.Column column;

    @Convert(disableConversion = true)
    @Column(name = "createdat")
    private Instant createdat;

    @Column(name = "createby", nullable = false)
    private Long createby;

    @Convert(disableConversion = true)
    @Column(name = "updatedat")
    private Instant updatedat;

    @Column(name = "updateby")
    private Long updateby;

    public Task(Long id, String name, String description, String level, Instant deadline, String priority, Long parent_id, boolean completed, Project project, uz.nb.simple_trello.entity.column.Column column, Instant createdat, Long createby) {
        super(id);
        this.name = name;
        this.description = description;
        this.level = level;
        this.deadline = deadline;
        this.priority = priority;
        this.parent_id = parent_id;
        this.completed = completed;
        this.project = project;
        this.column = column;
        this.createdat = createdat;
        this.createby = createby;
    }

}
