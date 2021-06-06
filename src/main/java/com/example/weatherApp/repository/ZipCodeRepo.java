package com.example.weatherApp.repository;

import com.example.weatherApp.model.ZipCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipCodeRepo extends CrudRepository<ZipCode, Long> {

}
