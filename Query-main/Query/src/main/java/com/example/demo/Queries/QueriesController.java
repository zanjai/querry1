package com.example.demo.Queries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class QueriesController {
    @Autowired
    private final QueriesService queriesService;
    public QueriesController(QueriesService queriesService) {
        this.queriesService = queriesService;
    }
    @GetMapping
    public List<Queries> getDatas() {
        return queriesService.getAllDatas();
    }
}
