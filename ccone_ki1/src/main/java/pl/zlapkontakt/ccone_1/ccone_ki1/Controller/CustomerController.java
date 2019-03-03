package pl.zlapkontakt.ccone_1.ccone_ki1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.zlapkontakt.ccone_1.ccone_ki1.Entity.Customer;
import pl.zlapkontakt.ccone_1.ccone_ki1.Service.CustomerService;

import java.util.Collection;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

}
