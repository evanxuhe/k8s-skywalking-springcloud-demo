package com.chj.apmordercenter.controller;

import com.chj.apmmodel.Item;
import com.chj.apmmodel.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public Order create() {
        Item item = restTemplate.getForEntity("http://localhost:8082/item",Item.class).getBody();
        return new Order(1, item);
    }
}
