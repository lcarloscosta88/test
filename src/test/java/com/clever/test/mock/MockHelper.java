package com.clever.test.mock;

import com.clever.test.dto.StationDTO;
import com.clever.test.model.Station;

import java.util.ArrayList;
import java.util.List;

public class MockHelper {

    public List<Station> stationMock(){
        List<Station> stationList = new ArrayList<>();

        stationList.add(new Station("Lisboa"));
        stationList.add(new Station("Limeira"));

        return stationList;
    }

    public List<StationDTO> stationDtoMock(){
        List<StationDTO> stationList = new ArrayList<>();

        stationList.add(new StationDTO("Lisboa"));
        stationList.add(new StationDTO("Limeira"));

        return stationList;
    }
}
