//package com.example.test_march.entity;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "booking")
//public class Booking {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "establishment_id", nullable = false)
//    private Establishment establishment;
//
//    @Column(name = "booking_date_time", nullable = false)
//    private LocalDateTime reservationDateTime;
//
//    private String purpose;
//
//    private String writeToMe;
//
//    private boolean drink;
//
//    private String gender;
//
//    private int numPeople;
//
//    private String pays;
//
//    private BigDecimal desiredExpenses;
//
//}
