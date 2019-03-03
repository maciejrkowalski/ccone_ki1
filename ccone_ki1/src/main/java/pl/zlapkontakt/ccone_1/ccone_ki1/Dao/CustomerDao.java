package pl.zlapkontakt.ccone_1.ccone_ki1.Dao;

import org.springframework.stereotype.Repository;
import pl.zlapkontakt.ccone_1.ccone_ki1.Entity.Customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerDao {

    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<Integer, Customer>() {

            {
                put(1, new Customer(1, "Warszawa", "Wojciechowskiego", "02-492", "888985885", "", "", "", "", "", "maciej.r.kowalski@gmail.com", "www.zlapkontakt.pl"));
            }

        };
    }

    public Collection<Customer> getAllCustomers() {
        return this.customers.values();
    }

    public Customer getCustomerById(String id) {

        return this.customers.get(id);
    }

}
