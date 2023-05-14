package com.example.test_march.services;

//import com.example.test_march.utils.EstablishmentMapper;
import com.example.test_march.dao.EstablishmentDao;
import com.example.test_march.dto.EstablishmentDto;
import com.example.test_march.entity.Establishment;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
//@AllArgsConstructor
@NoArgsConstructor
public class EstablishmentService {

    private EstablishmentDao establishmentDao;


    public EstablishmentService(EstablishmentDao establishmentDao) {
        this.establishmentDao = establishmentDao;
    }


    //    public Establishment createEstablishment(EstablishmentDto establishmentDto) {
//        return establishmentDao.create(establishmentDto);
//    }
//    public EstablishmentDto createEstablishment(EstablishmentDto establishmentDto) {
//        Establishment establishment = EstablishmentMapper.toEntity(establishmentDto);
//        establishmentDao.save(establishment);
//        return EstablishmentMapper.toDto(establishment);
//    }


    public Establishment getById(int id) {
        return establishmentDao.getById(id);
    }


    public List<Establishment> getAll() {
        return establishmentDao.getAll();
    }

//
//    public List<Establishment> getByType(String type) {
//        return establishmentDao.getByType(type);
//    }
//
//    public List<Establishment> getByTags(List<String> tags) {
//        return establishmentDao.getByTags(tags);
//    }
//
//
//    public List<Establishment> getByAverageCheck(BigDecimal averageCheck) {
//        return establishmentDao.getByAverageCheck(averageCheck);
//    }


//    public Establishment update(int id, EstablishmentDto establishmentDto) {
//        return establishmentDao.update(id, establishmentDto);
//    }


    public void deleteEstablishment(int id) {

        establishmentDao.deleteById(id);
    }
}
