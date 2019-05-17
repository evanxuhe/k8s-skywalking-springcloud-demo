package com.chj.apmorder;

import com.chj.apmmodel.Item;
import com.chj.apmmodel.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTemplateTest {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Item> item = restTemplate.getForEntity("http://localhost:8082/item",Item.class);
        System.out.println(item);
    }
}
