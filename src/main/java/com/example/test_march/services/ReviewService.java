//package com.example.test_march.services;
//
//
//import com.example.test_march.dao.EstablishmentDao;
//import com.example.test_march.dao.ReviewDao;
//import com.example.test_march.dao.UserDao;
//import com.example.test_march.dto.ReviewDto;
//import com.example.test_march.entity.Establishment;
//import com.example.test_march.entity.Review;
//import com.example.test_march.entity.User;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import javax.persistence.EntityNotFoundException;
//import java.util.List;
//
//@Service
//@AllArgsConstructor
//@NoArgsConstructor
//public class ReviewService {
//
//    private  ReviewDao reviewDao;
//    private  EstablishmentDao establishmentDao;
//    private  UserDao userDao;
//
//
//    public ReviewService(ReviewDao reviewDao,UserDao userDao, EstablishmentDao establishmentDao) {
//        this.reviewDao = reviewDao;
//        this.userDao = userDao;
//        this.establishmentDao = establishmentDao;
//    }
//
//    public Review create(ReviewDto reviewDto) {
//        Review review = new Review();
//        User user = userDao.getById(reviewDto.getUserId());
//        Establishment establishment = establishmentDao.getById(reviewDto.getEstablishmentId());
//        review.setUser(user);
//        review.setEstablishment(establishment);
//        review.setRating(reviewDto.getRating());
//        review.setComments(reviewDto.getComment());
//        review.setAverageCheck(reviewDto.getAverageCheck());
//        return reviewDao.save(review);
//    }
//
////    public Review getById(int id) {
////        return reviewDao.findById(id).orElseThrow(() -> new EntityNotFoundException("Review not found with id " + id));
////    }
//    public Review getById(int id) {
//        Review review = reviewDao.findById(id);
//        if (review == null) {
//            throw new EntityNotFoundException("User not found with id " + id);
//        }
//        return review;
//    }
//
//    public List<Review> getByUserId(int userId) {
//        return reviewDao.findByUserId(userId);
//    }
//
//    public List<Review> getByEstablishmentId(int establishmentId) {
//        return reviewDao.findByEstablishmentId(establishmentId);
//    }
//
//    public Review update(int id, ReviewDto reviewDto) {
//        Review review = getById(id);
//        review.setRating(reviewDto.getRating());
//        review.setComments(reviewDto.getComment());
//        review.setAverageCheck(reviewDto.getAverageCheck());
//        return reviewDao.save(review);
//    }
//
//    public void delete(int id) {
//        Review review = getById(id);
//        reviewDao.delete(review);
//    }
//}