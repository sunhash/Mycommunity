package life.jason.community1.community1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloContrller {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="name",defaultValue="hello") String name, Model model ){
        model.addAttribute("name",name);
        return "hello";
    }

}
