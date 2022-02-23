package uz.nb.simple_trello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uz.nb.simple_trello.dto.column.ColumnCreateDto;
import uz.nb.simple_trello.services.column.ColumnService;

@Controller
@RequestMapping(value = "/column/*")
public class ColumnController extends AbstractController<ColumnService>{

    @Autowired
    public ColumnController(ColumnService service) {
        super(service);
    }


    @RequestMapping(value = "create/", method = RequestMethod.GET)
    public String createPage() {
        return "column/create";
    }


    @RequestMapping(value = "create/", method = RequestMethod.POST)
    public String create(@ModelAttribute ColumnCreateDto dto) {
        service.create(dto);
        return "redirect:/";
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String deletePage(Model model, @PathVariable(name = "id") Long id) {
        model.addAttribute("column", service.get(id));
        return "column/delete";
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public String delete(@PathVariable(name = "id") Long id) {
        service.delete(id);
        return "redirect:/";
    }
}
