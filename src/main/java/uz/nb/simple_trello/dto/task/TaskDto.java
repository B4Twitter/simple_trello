package uz.nb.simple_trello.dto.task;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.nb.simple_trello.dto.GenericDto;

import java.time.Instant;

@Getter
@Setter
public class TaskDto extends GenericDto {
    private String name;
    private String description;
    private String level;
    private Instant deadline;
    private String priority;
    private Long project_id;
    private Long column_id;

    @Builder(builderMethodName = "childBuilder")
    public TaskDto(Long id, String name, String description, String level, Instant deadline, String priority, Long project_id, Long column_id) {
        super(id);
        this.name = name;
        this.description = description;
        this.level = level;
        this.deadline = deadline;
        this.priority = priority;
        this.project_id = project_id;
        this.column_id = column_id;
    }
}
