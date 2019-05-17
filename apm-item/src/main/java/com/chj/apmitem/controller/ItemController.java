package com.chj.apmitem.controller;

import com.chj.apmmodel.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {

    @PutMapping
    public Item put() {
        return new Item(0, "car", 10000.0);
    }

    @GetMapping
    public Item get() {
        return new Item(0, "car", 10000.0);
    }
}
