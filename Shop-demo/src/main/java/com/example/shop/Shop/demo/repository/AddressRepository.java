package com.example.shop.Shop.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shop.Shop.demo.model.ShopAddress;

public interface AddressRepository  extends  JpaRepository<ShopAddress,Integer> {

}
