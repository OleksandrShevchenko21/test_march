package com.example.test_march.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "establishment")
public class Establishment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

//    @Column(name = "main_photo")
//    private String mainPhoto;
//
//    @Column(nullable = false)
//    private String address;
//
//    private String scheduleOfWork;
//
//    private String contacts;
//
//    private String news;
//
//    @Column(name = "views", columnDefinition = "int default 0")
//    private int statisticsOfViews;
//
//    @Column(nullable = false)
//    private String type;
//
//    @ElementCollection(fetch = FetchType.EAGER)
//    private Set<String> tags = new HashSet<>();
//
//    @Column(name = "avg_check")
//    private Double averageCheck;
//
//    @Column(name = "created_at", nullable = false, updatable = false, columnDefinition = "timestamp default current_timestamp")
//    private LocalDateTime createdAt;


}
