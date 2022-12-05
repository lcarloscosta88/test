package com.clever.test.service;

import com.clever.test.dto.StationDTO;
import com.clever.test.model.Station;
import com.clever.test.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class StationService {

    @Autowired
    StationRepository stationRepository;

    public List<StationDTO> stationSearch(StationDTO stationDTO){

        List<StationDTO> stationDTOS =new ArrayList<>();

        List<Station> stations = stationRepository.findAll();

        if(Objects.nonNull(stationDTO)){
            stations.stream().filter(s -> s.getName().matches("(?i).*" + stationDTO.getName() + ".*")).forEach(st -> {
                StationDTO station = new StationDTO(st.getName());
                stationDTOS.add(station);
            });
            return stationDTOS;
        } else{
            return Collections.emptyList();
        }

    }
}
