package com.n3o.springrestdocs.web.mapper;

import com.n3o.springrestdocs.domain.Beer;
import com.n3o.springrestdocs.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto beerDto);
}
