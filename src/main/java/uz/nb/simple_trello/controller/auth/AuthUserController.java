package uz.nb.simple_trello.controller.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uz.nb.simple_trello.controller.base.AbstractController;
import uz.nb.simple_trello.dto.auth.AuthUserCreateDto;
import uz.nb.simple_trello.dto.auth.AuthUserUpdateDto;
import uz.nb.simple_trello.dto.auth.LoginDto;
import uz.nb.simple_trello.services.auth.AuthUserService;

@Controller
@RequestMapping("/auth/*")
public class AuthUserController extends AbstractController<AuthUserService> {


    public AuthUserController(AuthUserService service) {
        super(service);
    }



    @PreAuthorize("hasRole('SUPER_USER')")
    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String createPage() {
        return "auth/register";
    }


    @Autowired
    PasswordEncoder passwordEncoder;

    @PreAuthorize("hasRole('SUPER_USER')")
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String create(@ModelAttribute AuthUserCreateDto dto) {
        service.create(dto);
        return "redirect:/";
    }


    @RequestMapping(value = "update", method = RequestMethod.GET)
    public String updatePage() {
        return "auth/update";
    }


    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(@ModelAttribute AuthUserUpdateDto dto) {
        service.update(dto);
        return "redirect:/";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage() {
        return "auth/login";
    }


    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@ModelAttribute LoginDto dto) {
        service.login(dto);
        return "redirect:/";
    }



}
