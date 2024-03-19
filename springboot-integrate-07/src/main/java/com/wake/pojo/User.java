package com.wake.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName user
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String name;

    private Integer age;

    private Integer gender;

    private String phone;

    private static final long serialVersionUID = 1L;
}