package uz.nb.simple_trello.controller.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uz.nb.simple_trello.controller.base.AbstractController;
import uz.nb.simple_trello.services.project.ProjectColumnService;

@RestController
@RequestMapping("/projectColumn/*")
public class ProjectColumnController extends AbstractController<ProjectColumnService> {

    @Autowired
    public ProjectColumnController(ProjectColumnService service) {
        super(service);
    }

    @RequestMapping(value = "list")
    public String homePage(Model model) {
        return "index/index";
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String createPage() {
        return "project_column/create";
    }


    @RequestMapping(value = "project", method = RequestMethod.GET)
    public String projectPage() {
        return "index/project_column";
    }

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String indexPage() {
        return "index/index";
    }


}
