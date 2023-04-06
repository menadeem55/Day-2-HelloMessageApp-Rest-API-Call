package com.bridgelabz.spring.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    //UC-1
    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello from Bridgelbaz";
    }
    @RequestMapping(value = "/nadeem")
    public String message(){
        return "Hello from Nadeem";
    }
    //UC-2
        @RequestMapping(value = "/query",method = RequestMethod.GET)
    public String sayHelloAgain (@RequestParam(value = "name")String name){
        return "Hello " + name + "From Bridgelabz";
    }
    //UC-3 //PathVariable
    @RequestMapping(value = "/path/{name}",method = RequestMethod.GET)
    public String passName(@PathVariable ("name") String name){
        return "Hello "+name+ "!!";
    }
}
