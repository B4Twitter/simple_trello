package uz.nb.simple_trello.controller.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import uz.nb.simple_trello.controller.base.AbstractController;
import uz.nb.simple_trello.services.project.ProjectColumnService;

@Controller
public class ProjectColumnController extends AbstractController<ProjectColumnService> {

    @Autowired
    public ProjectColumnController(ProjectColumnService service) {
        super(service);
    }


}
