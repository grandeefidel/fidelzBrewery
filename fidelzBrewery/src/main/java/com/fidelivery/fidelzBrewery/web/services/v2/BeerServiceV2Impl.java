package com.fidelivery.fidelzBrewery.web.services.v2;

import com.fidelivery.fidelzBrewery.BeerStyleEnum;
import com.fidelivery.fidelzBrewery.web.model.v2.BeerDtoV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(beerId)
                .beerName("Star Radler")
                .beerStyle(BeerStyleEnum.LAGER)
                .build();
    }

    @Override
    public BeerDtoV2 saveBeer(BeerDtoV2 beerDto) {
        return beerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        //todo: implement update beer
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Deleting beer with id: " + beerId);
    }
}
