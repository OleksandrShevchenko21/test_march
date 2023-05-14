package com.example.test_march.contollers;

import com.example.test_march.dto.EstablishmentDto;
import com.example.test_march.entity.Establishment;
import com.example.test_march.services.EstablishmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/establishments")
public class EstablishmentController {

    private final EstablishmentService establishmentService;

    public EstablishmentController(EstablishmentService establishmentService) {
        this.establishmentService = establishmentService;
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
//    public Establishment create(@RequestBody @Valid EstablishmentDto establishmentDto) {
//        return establishmentService.create(establishmentDto);
//    }
//    public ResponseEntity<EstablishmentDto> createEstablishment(@RequestBody EstablishmentDto establishmentDto) {
//        EstablishmentDto savedEstablishmentDto = establishmentService.createEstablishment(establishmentDto);
//        return ResponseEntity.ok(savedEstablishmentDto);
//    }

    @GetMapping("/{id}")
    public Establishment getById(@PathVariable int id) {
        return establishmentService.getById(id);
    }

    @GetMapping
    public List<Establishment> getAll() {
        return establishmentService.getAll();
    }

//    @GetMapping(params = "type")
//    public List<Establishment> getByType(@RequestParam String type) {
//        return establishmentService.getByType(type);
//    }
//
//    @GetMapping(params = "tags")
//    public List<Establishment> getByTags(@RequestParam List<String> tags) {
//        return establishmentService.getByTags(tags);
//    }
//
//    @GetMapping(params = "averageCheck")
//    public List<Establishment> getByAverageCheck(@RequestParam BigDecimal averageCheck) {
//        return establishmentService.getByAverageCheck(averageCheck);
//    }
//
//    @PutMapping("/{id}")
//    public Establishment update(@PathVariable int id, @RequestBody @Valid EstablishmentDto establishmentDto) {
//        return establishmentService.update(id, establishmentDto);
//    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        establishmentService.deleteEstablishment(id);
    }
}