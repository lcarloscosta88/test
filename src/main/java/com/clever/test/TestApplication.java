package com.clever.test;

import com.clever.test.model.Station;
import com.clever.test.repository.StationRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext =  SpringApplication.run(TestApplication.class, args);

        StationRepository stationRepository = configurableApplicationContext.getBean(StationRepository.class);

        List<Station> stationList = new ArrayList<>();

        stationList.add(new Station("Aveiro"));
        stationList.add(new Station("Avanca"));
        stationList.add(new Station("Avelada"));
        stationList.add(new Station("Caravela"));
        stationList.add(new Station("Alavares"));
        stationList.add(new Station("Marco de Canavesse"));
        stationList.add(new Station("Lisboa"));
        stationList.add(new Station("Porto"));
        stationList.add(new Station("Livracao"));
        stationList.add(new Station("Oliveira"));
        stationList.add(new Station("Oliveira do Bairro"));
        stationList.add(new Station("Braga"));
        stationList.add(new Station("Bragança"));

        stationRepository.saveAll(stationList);
    }

}
