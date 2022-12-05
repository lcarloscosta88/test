package com.clever.test.service;

import com.clever.test.dto.StationDTO;
import com.clever.test.mock.MockHelper;
import com.clever.test.model.Station;
import com.clever.test.repository.StationRepository;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DataJpaTest
@RunWith(SpringRunner.class)
class StationServiceTest {

    @Mock
    StationRepository stationRepository;

    @InjectMocks
    StationService stationService;

    MockHelper mockHelper = new MockHelper();


    @Test
    @DisplayName("Simple String Test")
    void shouldReturnStationsWithLi() {

        when(stationRepository.findAll()).thenReturn(mockHelper.stationMock());

        StationDTO stationDTO = new StationDTO("li");
        stationService.stationSearch(stationDTO);
    }
}