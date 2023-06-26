package com.micro.centraliced.dto;


import com.micro.centraliced.client.enums.ItemRarity;
import com.micro.centraliced.client.enums.WeaponType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDTO {
    private Long itemId ;
    private String name;
    private String description;
    private ItemRarity itemRarity;
    private WeaponType weaponType;
    private InventoryDTO inventoryDto;
}
