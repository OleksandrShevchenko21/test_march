package com.example.test_march.dao;

import com.example.test_march.dto.EstablishmentDto;
//import com.example.test_march.entity.Booking;
import com.example.test_march.entity.Establishment;
import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface EstablishmentDao extends JpaRepository<Establishment, Integer> {

    //    @Query("select e from Establishment e where e.name =:name")
//    List<Establishment> getByName(@Param("name")String name);

    List<Establishment>findCustomerByName(String name);

    Establishment create(EstablishmentDto establishmentDto);
//
    Establishment getById(int id);
//
    List<Establishment> getAll();
//
//    List<Establishment> getByType(String type);
//
//    List<Establishment> getByTags(List<String> tags);
//
//    List<Establishment> getByAverageCheck(BigDecimal averageCheck);
//
//    Establishment update(int id, EstablishmentDto establishmentDto);
//
//    void delete(int id);
}
