package uz.nb.simple_trello.exceptions.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.nb.simple_trello.dto.column.ColumnCreateDto;
import uz.nb.simple_trello.dto.column.ColumnDto;
import uz.nb.simple_trello.dto.column.ColumnUpdateDto;
import uz.nb.simple_trello.entity.column.Column;


@Component
@Mapper(componentModel = "spring")
public interface ColumnMapper extends BaseMapper<
        Column,
        ColumnDto,
        ColumnCreateDto,
        ColumnUpdateDto> {
}
