package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @Autowired
    ApplicationProperties applicationProperties;

    @RequestMapping("/customer")
    Customer customer(@RequestParam(value = "name", required = false) String name) {
        return repository.findByFirstName(name != null ? name : applicationProperties.getDefaultName());
    }
}