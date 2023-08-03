package com.example.demo.Queries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueriesService {
    @Autowired
    private final QueriesRepository queriesRepository;
    public QueriesService(QueriesRepository queriesRepository) {
        this.queriesRepository = queriesRepository;
    }
    public List<Queries> getAllDatas() {
        return queriesRepository.findAllDatas();
    }
}
