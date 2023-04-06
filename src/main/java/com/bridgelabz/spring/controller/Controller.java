package com.bridgelabz.spring.controller;

import com.bridgelabz.spring.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    //UC-1
    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello from Bridgelbaz";
    }

    @RequestMapping(value = "/nadeem")
    public String message() {
        return "Hello from Nadeem";
    }

    //UC-2
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String sayHelloAgain(@RequestParam(value = "name") String name) {
        return "Hello " + name + "From Bridgelabz";
    }

    //UC-3 //PathVariable
    @RequestMapping(value = "/path/{name}", method = RequestMethod.GET)
    public String passName(@PathVariable("name") String name) {
        return "Hello " + name + "!!";
    }

    //UC-4 Passing FirstName and LastName In Body
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String details(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " My MobleNumber is: " + user.getMobileNumber() + " Address : " + user.getAddress();

    }

    //UC-5 Passing firstName in PathVariable and lastName in Query Param
    @RequestMapping(value = "/path2/{firstName}", method = RequestMethod.PUT)
    public String detail(@PathVariable("firstName") String firstName, @RequestParam(value = "lastName") String lastName) {
        return "hello " + firstName + " " + lastName + " From BridgeLabz";
    }
}
