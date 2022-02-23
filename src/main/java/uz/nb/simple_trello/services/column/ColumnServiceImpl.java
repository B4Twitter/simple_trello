package uz.nb.simple_trello.services.column;


import org.springframework.stereotype.Service;
import uz.nb.simple_trello.criteria.GenericCriteria;
import uz.nb.simple_trello.dto.column.ColumnCreateDto;
import uz.nb.simple_trello.dto.column.ColumnDto;
import uz.nb.simple_trello.dto.column.ColumnUpdateDto;
import uz.nb.simple_trello.entity.column.Column;
import uz.nb.simple_trello.exceptions.mapper.ColumnMapper;
import uz.nb.simple_trello.reposiroty.ColumnRepository;
import uz.nb.simple_trello.services.AbstractService;
import uz.nb.simple_trello.utils.BaseUtils;
import uz.nb.simple_trello.utils.validators.column.ColumnValidator;

import java.util.List;

@Service
public class ColumnServiceImpl extends AbstractService<ColumnRepository, ColumnMapper, ColumnValidator> implements ColumnService{

    protected ColumnServiceImpl(ColumnRepository repository, ColumnMapper mapper, ColumnValidator validator, BaseUtils baseUtils) {
        super(repository, mapper, validator, baseUtils);
    }

    @Override
    public Long create(ColumnCreateDto createDto) {
        Column column = mapper.fromCreateDto(createDto);
        repository.save(column);
        return column.getId();
    }

    @Override
    public Void delete(Long id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public Void update(ColumnUpdateDto updateDto) {
        return null;
    }

    @Override
    public List<ColumnDto> getAll(GenericCriteria criteria) {
        return null;
    }

    @Override
    public ColumnDto get(Long id) {
        return null;
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }
}
