package com.klu.jfsd.lab;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    private List<Customer> customerList = new ArrayList<>();

    @GetMapping("/demo1")
    public int demo1() {
        return 42;
    }

    @GetMapping("/demo2")
    public double demo2() {
        return 3.14159;
    }

    @GetMapping("/demo3")
    public String demo3() {
        return "<h1>Hello, this is a formatted HTML string!</h1>";
    }

    @GetMapping("/demo4")
    public String demo4() {
        String university = "KLEF";
        return "I Study at " + university;
    }

    @GetMapping("/demo5/{id}")
    public String demo5(@PathVariable int id) {
        return "Path variable received: " + id;
    }

    @GetMapping("/demo6/{a}/{b}")
    public String demo6(@PathVariable int a, @PathVariable int b) {
        int sum = a + b;
        return "Sum: " + sum;
    }

    @GetMapping("/demo7")
    public String demo7(@RequestParam("id") int id) {
        return "Request parameter received: " + id;
    }

    @GetMapping("/demo8/{name}")
    public String demo8(@PathVariable String name) {
        return "Name received: " + name;
    }

    @PostMapping("/addcustomer")
    public String addCustomer(@RequestBody Customer customer) {
        customerList.add(customer);
        return "Customer Added Successfully";
    }

    @GetMapping("/viewcustomer")
    public List<Customer> viewCustomer() {
        return customerList;
    }
}