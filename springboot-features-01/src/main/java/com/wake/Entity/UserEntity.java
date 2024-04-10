package com.wake.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Doug
 * @Date: 2024-04-10 16:25
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    private String name;
    private String pwd;
}