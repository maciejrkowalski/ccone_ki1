package pl.zlapkontakt.ccone_1.ccone_ki1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.zlapkontakt.ccone_1.ccone_ki1.Dao.CustomerDao;
import pl.zlapkontakt.ccone_1.ccone_ki1.Entity.Customer;

import java.util.Collection;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public Collection<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    public Customer getCustomerById(String id) {

        return this.customerDao.getCustomerById(id);
    }
}
