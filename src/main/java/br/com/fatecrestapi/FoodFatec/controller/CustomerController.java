package br.com.fatecrestapi.FoodFatec.controller;


import br.com.fatecrestapi.FoodFatec.entity.Customer;
import br.com.fatecrestapi.FoodFatec.repository.CustomerRepository;
import br.com.fatecrestapi.FoodFatec.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/customer")
@CrossOrigin(value = "*")
public class CustomerController {

@Autowired
    CustomerService customerService;

    @GetMapping(value = "/list")

    public ResponseEntity<Object> getInfoCustomer(){
        List<Customer> result = customerService.getInfoCustomers();
        return ResponseEntity.ok().body(result);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> saveCustomer(@RequestBody Customer customer) {
        Customer result = customerService.saveCustomer(customer);
        return ResponseEntity.ok().body(result);
    }


    }

