package uz.nb.simple_trello.controller;


import uz.nb.simple_trello.services.BaseService;

public abstract class AbstractController<S extends BaseService> {
    protected final S service;

    public AbstractController(S service) {
        this.service = service;
    }
}
