package com.lin.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private String createTime;
}
