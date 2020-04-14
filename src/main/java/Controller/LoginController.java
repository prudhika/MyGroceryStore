package Controller;
import Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    LoginService service;

    @GetMapping("/login")
    public void login(){
        service.loginService();
        System.out.println("Welcome to grocery store");
    }
}
