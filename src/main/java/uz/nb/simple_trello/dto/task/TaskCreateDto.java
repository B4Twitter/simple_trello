package uz.nb.simple_trello.dto.task;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.nb.simple_trello.dto.Dto;

import java.time.Instant;

@Getter
@Setter
@Builder
public class TaskCreateDto implements Dto {
    private String name;
    private String description;
    private String level;
    private Instant deadline;
    private String priority;
    private Long project_id;
    private Long column_id;

    public TaskCreateDto(String name, String description, String level, Instant deadline, String priority, Long projectId, Long column) {
        this.name = name;
        this.description = description;
        this.level = level;
        this.deadline = deadline;
        this.priority = priority;
        this.project_id = projectId;
        this.column_id = column;
    }
}
