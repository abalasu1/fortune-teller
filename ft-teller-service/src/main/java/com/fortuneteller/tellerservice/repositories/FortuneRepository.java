package com.fortuneteller.tellerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import com.fortuneteller.tellerservice.domain.Fortune;

import java.util.List;


public interface FortuneRepository extends PagingAndSortingRepository<Fortune, Integer> {

    @Query("select fortune from Fortune fortune order by RAND()")
    public List<Fortune> randomFortunes(Pageable pageable);
}
