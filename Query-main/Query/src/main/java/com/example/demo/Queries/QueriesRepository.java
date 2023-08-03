package com.example.demo.Queries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface QueriesRepository extends JpaRepository<Queries, Long> {
    @Query("select q from queries q")
    List<Queries> findAllDatas();
}
