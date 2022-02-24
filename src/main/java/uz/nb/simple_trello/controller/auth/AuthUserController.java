package uz.nb.simple_trello.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uz.nb.simple_trello.controller.base.AbstractController;
import uz.nb.simple_trello.dto.auth.AuthUserCreateDto;
import uz.nb.simple_trello.services.auth.AuthUserService;

@Controller
@RequestMapping("/auth/*")
public class AuthUserController extends AbstractController<AuthUserService> {
    public AuthUserController(AuthUserService service) {
        super(service);
    }

    @RequestMapping(value = "create/", method = RequestMethod.GET)
    public String createPage() {
        return "auth/register";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String create(@ModelAttribute AuthUserCreateDto dto) {
        service.create(dto);
        return "redirect:/index/index";
    }

}
