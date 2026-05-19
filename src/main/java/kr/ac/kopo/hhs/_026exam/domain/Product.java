package kr.ac.kopo.hhs._026exam.domain;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Product {
    @NotEmpty
    @Size(min = 4, max = 10)
    private String name;

    @Min(value = 0)
    private int price;
}
