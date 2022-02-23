package uz.nb.simple_trello.utils.validators.column;


import org.springframework.stereotype.Component;
import uz.nb.simple_trello.dto.column.ColumnCreateDto;
import uz.nb.simple_trello.dto.column.ColumnUpdateDto;
import uz.nb.simple_trello.exceptions.ValidationException;
import uz.nb.simple_trello.utils.BaseUtils;
import uz.nb.simple_trello.utils.validators.AbstractValidator;

@Component
public class ColumnValidator  extends AbstractValidator<ColumnCreateDto, ColumnUpdateDto, Long> {
    protected ColumnValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(ColumnCreateDto columnCreateDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(ColumnUpdateDto cd) throws ValidationException {

    }
}
