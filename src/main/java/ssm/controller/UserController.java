package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/login")
    public ModelAndView login() throws Exception {
        ModelAndView ModelAndView = new ModelAndView();
        return ModelAndView;
    }

}
