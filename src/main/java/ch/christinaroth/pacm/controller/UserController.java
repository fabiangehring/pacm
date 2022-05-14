package ch.christinaroth.pacm.controller;

import org.springframework.stereotype.Controller;
import ch.christinaroth.pacm.model.User;
import ch.christinaroth.pacm.model.UserRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;


@Controller
public class UserController {

    private final UserRepository repository;

    UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/user/createAccount")
    public String userForm(Model model) {
        model.addAttribute("user", new User());
        return "createAccount";
    }

    @PostMapping("/user/createAccount")
    public String createAccount(@ModelAttribute User user, Model model) {
        repository.save(user);
        model.addAttribute("user", user);
        return "createAccount";
    }

    @GetMapping("/user/usernameIsAvailable")
    @ResponseBody
    public boolean usernameIsAvailable(@RequestParam String username) {
        return !repository.existsById(username);
    }
}
