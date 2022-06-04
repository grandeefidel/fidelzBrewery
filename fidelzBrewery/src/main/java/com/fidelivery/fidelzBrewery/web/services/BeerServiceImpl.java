package com.fidelivery.fidelzBrewery.web.services;

import com.fidelivery.fidelzBrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(beerId)
                .beerName("Star Radler")
                .beerStyle("Lager")
                .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return beerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo: implement update beer
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Deleting beer with id: " + beerId);
    }
}
