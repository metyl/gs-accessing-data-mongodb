package hello;

import lombok.ToString;
import org.springframework.data.annotation.Id;

@ToString
public class Customer {

    @Id
    private String id;
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
