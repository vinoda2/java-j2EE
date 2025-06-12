package com.xworkz.things;

import com.xworkz.constant.Colour;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Mobile {

    private String brandName;
    private String version;
    private Colour colour;
    private double price;

    //DateTime API
    private LocalDate releaseDate;
    private LocalTime releaseTime;





}
