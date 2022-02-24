package uz.nb.simple_trello.controller.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/task/*")
public class TaskController {

    @RequestMapping(value = "task" , method = RequestMethod.GET)
    public String taskPage(){
        return "index/index3";
    }

    @RequestMapping(value = "list")
    public String homePage(Model model) {
        return "index/index";
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String createPage() {
        return "task/create";
    }

}
