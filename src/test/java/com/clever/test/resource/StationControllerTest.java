package com.clever.test.resource;

import com.clever.test.dto.StationDTO;
import com.clever.test.mock.MockHelper;
import com.clever.test.service.StationService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@WebMvcTest(StationController.class)
class StationControllerTest {

    @MockBean
    StationService stationService;

    ObjectMapper objectMapper = new ObjectMapper();

    MockHelper mockHelper = new MockHelper();

    @Autowired
    private MockMvc mockMvc;

    String endpoint = "/stations";

    @Test
    public void shouldReturnStations() throws Exception {

        StationDTO stationDTO = new StationDTO("li");

        when(stationService.stationSearch(stationDTO)).thenReturn(mockHelper.stationDtoMock());

        mockMvc.perform(post(endpoint).content(objectMapper.writeValueAsString(stationDTO)).
                contentType(MediaType.APPLICATION_JSON)).
                andExpect(MockMvcResultMatchers.status().isOk());
    }

}