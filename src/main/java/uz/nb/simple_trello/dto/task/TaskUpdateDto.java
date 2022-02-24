package uz.nb.simple_trello.dto.task;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.nb.simple_trello.dto.GenericDto;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
public class TaskUpdateDto extends GenericDto {
    private String name;
    private String description;
    private String level;
    private Instant deadline;
    private boolean completed;
    private Long project_id;
    private Long column_id;
}
