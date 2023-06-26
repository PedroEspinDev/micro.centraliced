package com.micro.centraliced.dto;


import com.micro.centraliced.client.enums.Breeds;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDTO {

    private String id;
    private String inventoryId;
    private String name;
    private Integer level;
    private Integer lifePoints;
    private Integer skillPoints;
    private Breeds breeds;
}