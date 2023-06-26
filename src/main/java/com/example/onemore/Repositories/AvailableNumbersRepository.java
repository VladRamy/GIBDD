package com.example.onemore.Repositories;


import com.example.onemore.models.AvailableNumbers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailableNumbersRepository extends CrudRepository<AvailableNumbers, Integer> {
}
