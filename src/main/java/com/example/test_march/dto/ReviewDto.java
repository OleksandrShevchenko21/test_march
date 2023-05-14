//package com.example.test_march.dto;
//
//import com.sun.istack.NotNull;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.validation.constraints.DecimalMax;
//import javax.validation.constraints.DecimalMin;
//import javax.validation.constraints.NotBlank;
//import java.math.BigDecimal;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class ReviewDto {
//    @NotBlank
//    private String comment;
//    @NotNull
//    @DecimalMax("5.0")
//    @DecimalMin("1.0")
//    private int rating;
//    @NotNull
//    private int userId;
//    @NotNull
//    private int establishmentId;
//    @NotNull
//    @DecimalMin(value = "0.0", inclusive = false)
//    private BigDecimal averageCheck;
//}
