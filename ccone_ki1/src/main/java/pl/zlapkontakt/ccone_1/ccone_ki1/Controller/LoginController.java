package pl.zlapkontakt.ccone_1.ccone_ki1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.zlapkontakt.ccone_1.ccone_ki1.Entity.Consultant;
import pl.zlapkontakt.ccone_1.ccone_ki1.Entity.LoginForm;
import pl.zlapkontakt.ccone_1.ccone_ki1.Repository.ConsultantRepository;

import java.util.List;
import java.util.stream.Collectors;

@Controller

public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginForm() {
        return "login";

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute(name = "loginForm") LoginForm loginForm, Model model) {
        String login = loginForm.getLogin();
        String password = loginForm.getPassword();
//        System.out.println(login + " " + password);

        List<Consultant> consultants = ConsultantRepository.getAllConsultants();
        boolean validCredentails = false;

        List<Consultant> validCredentialsConsultants = consultants.stream().filter(consultant -> (consultant.getLogin().equals(login)) && (consultant.getPassword().equals(password))).collect(Collectors.toList());
        if (validCredentialsConsultants.size() > 0) {
            Consultant currentConsultant = validCredentialsConsultants.get(0);
            validCredentails = true;
            return "2AYETlLbdDZ98wBSSltlX8pjxM9QmIvcLA2SUYJTEVofsyTA7BWbrbceMxQta4SdG38S5F2iPBRVpXuMtBqFuzZw6nwwGqfQggjlsazlE2TSze3bw";
        } else {
            model.addAttribute("invalidCredentials", true);
            return "loginerror";
        }


        //        for (int i = 0; i < consultants.size(); i++) {
//            if (consultants.get(i).getLogin().equals(login) && (consultants.get(i).getLogin().equals(password))) {
//                validCredentails = true;
//            }
//
//        }

//
//        if ("kowal_ps2".equals(login) && ("123qwe".equals(password))) {
//
//            return "zBT0OwP9adJdq5G9sjCqo";
//        }
//
//        model.addAttribute("invalidCredentials", true);
//        return "loginerror";
    }

}
