package pl.zlapkontakt.ccone_1.ccone_ki1.Repository;

import org.springframework.stereotype.Repository;
import pl.zlapkontakt.ccone_1.ccone_ki1.Entity.Consultant;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ConsultantRepository {

//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//
//    public List<String> getAllConsultantNames() {
//        List<String> consultantNameList = new ArrayList<>();
//        consultantNameList.addAll(jdbcTemplate.queryForList("SELECT login FROM ccone_ki.consultants;", String.class));
//        return consultantNameList;
//    }

    public static List<Consultant> getAllConsultants() {
        List<Consultant> consultants = new ArrayList<>();
        consultants.add(new Consultant("kowal_ps2","123qwe","Maciej Kowalski"));
        //tutaj dodaję kolejnych konsultantów

        consultants.add(new Consultant("zenek","gienek","zenek"));

     return consultants;
    }




}
