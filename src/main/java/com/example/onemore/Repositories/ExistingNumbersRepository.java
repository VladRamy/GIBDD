package com.example.onemore.Repositories;


import com.example.onemore.models.ExistingNumbers;
import org.springframework.data.repository.CrudRepository;

public interface ExistingNumbersRepository extends CrudRepository<ExistingNumbers, Integer> {
}
