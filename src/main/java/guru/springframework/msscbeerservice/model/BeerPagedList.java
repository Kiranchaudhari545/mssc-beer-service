package guru.springframework.msscbeerservice.model;


import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BeerPagedList extends PageImpl<beerDto> {


    public BeerPagedList(List<beerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagedList(List<beerDto> content) {
        super(content);
    }
}
