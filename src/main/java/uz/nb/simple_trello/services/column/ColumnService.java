package uz.nb.simple_trello.services.column;


import uz.nb.simple_trello.criteria.GenericCriteria;
import uz.nb.simple_trello.dto.column.ColumnCreateDto;
import uz.nb.simple_trello.dto.column.ColumnDto;
import uz.nb.simple_trello.dto.column.ColumnUpdateDto;
import uz.nb.simple_trello.entity.column.Column;
import uz.nb.simple_trello.services.GenericCrudService;

public interface ColumnService  extends GenericCrudService<
        Column,
        ColumnDto,
        ColumnCreateDto,
        ColumnUpdateDto,
        GenericCriteria,
        Long> {
}
