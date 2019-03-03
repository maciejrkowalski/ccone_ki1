package pl.zlapkontakt.ccone_1.ccone_ki1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zlapkontakt.ccone_1.ccone_ki1.Repository.ConsultantRepository;

@RestController
@RequestMapping(path = "/consultant")
public class ConsultantController {
    @Autowired
    ConsultantRepository consultantRepository;


    @GetMapping
    public String check() {
        return "coś tan";
    }

//    @GetMapping(path = "/getconsultants")
//    public List<String> getAllConsultantNames() {
//        return consultantRepository.getAllConsultantNames();
//    }
}
