package com.clever.test.repository;


import com.clever.test.model.Station;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StationRepository extends CrudRepository<Station,Long> {
    List<Station> findAll();
}
