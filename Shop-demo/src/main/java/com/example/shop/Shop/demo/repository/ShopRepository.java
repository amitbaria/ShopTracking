package com.example.shop.Shop.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shop.Shop.demo.model.ShopModel;

@Repository
public interface ShopRepository extends JpaRepository< ShopModel,Long> {

	public List<ShopModel> findByshopName(String name);
}
