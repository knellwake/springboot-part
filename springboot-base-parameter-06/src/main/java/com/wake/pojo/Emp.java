package com.wake.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Doug
 * @Date: 2024-03-17 14:12
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    private String name;
    private Integer age;
    private String image;
    private String gender;
    private String job;
}