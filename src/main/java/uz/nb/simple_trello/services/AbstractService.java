package uz.nb.simple_trello.services;


import uz.nb.simple_trello.mapper.Mapper;
import uz.nb.simple_trello.reposiroty.AbstractRepository;
import uz.nb.simple_trello.utils.BaseUtils;
import uz.nb.simple_trello.utils.validators.Validator;

/**
 * @param <R> repository
 * @param <M> mapper
 * @param <V> validator
 */
public abstract class AbstractService<
        R extends AbstractRepository,
        M extends Mapper,
        V extends Validator> {
    protected final R repository;
    protected final M mapper;
    protected final V validator;
    protected final BaseUtils baseUtils;

    protected AbstractService(R repository, M mapper, V validator, BaseUtils baseUtils) {
        this.repository = repository;
        this.mapper = mapper;
        this.validator = validator;
        this.baseUtils = baseUtils;
    }

}
