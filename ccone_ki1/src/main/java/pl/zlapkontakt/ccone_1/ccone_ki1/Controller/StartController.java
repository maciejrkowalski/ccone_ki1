package pl.zlapkontakt.ccone_1.ccone_ki1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class StartController {

    @GetMapping("/")

    public String start(ModelMap modelMap) {
//        modelMap.put("hello","witaj świecie");
        return "start";
    }

}
