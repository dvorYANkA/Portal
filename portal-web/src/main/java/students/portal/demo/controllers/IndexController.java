package students.portal.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"","/","index", "index.html"})
    private String Index(){
     return "index";
    }
}
