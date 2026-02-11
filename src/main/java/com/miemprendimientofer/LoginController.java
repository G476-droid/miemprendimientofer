package com.miemprendimientofer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
  @GetMapping("/")
  public String index() {
    return "redirect:/login";
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  public String handleLogin(@RequestParam String usuario, @RequestParam String clave, Model model) {
    model.addAttribute("usuario", usuario);
    model.addAttribute("mensaje", "Inicio de sesión registrado para " + usuario + ".");
    return "login";
  }
}
