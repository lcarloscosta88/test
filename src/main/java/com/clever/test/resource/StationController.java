package com.clever.test.resource;


import com.clever.test.dto.StationDTO;
import com.clever.test.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/stations")
public class StationController {

    @Autowired
    StationService stationService;

    @PostMapping
    public ResponseEntity<List<StationDTO>> listStations(@RequestBody StationDTO stationDTO){
        return ok(stationService.stationSearch(stationDTO));
    }
}
