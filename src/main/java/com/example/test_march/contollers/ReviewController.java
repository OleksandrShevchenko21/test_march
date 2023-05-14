//package com.example.test_march.contollers;
//
//import com.example.test_march.dto.ReviewDto;
//import com.example.test_march.entity.Review;
//import com.example.test_march.services.ReviewService;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.List;
//
@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Review create(@RequestBody @Valid ReviewDto reviewDto) {
        return reviewService.create(reviewDto);
    }

    @GetMapping("/{id}")
    public Review getById(@PathVariable int id) {
        return reviewService.getById(id);
    }

    @GetMapping(params = "establishmentId")
    public List<Review> getByRestaurantId(@RequestParam int establishmentId) {
        return reviewService.getByEstablishmentId(establishmentId);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        reviewService.delete(id);
    }
}