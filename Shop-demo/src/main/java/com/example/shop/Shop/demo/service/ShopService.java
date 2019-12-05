package com.example.shop.Shop.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shop.Shop.demo.model.ShopAddress;
import com.example.shop.Shop.demo.model.ShopModel;
import com.example.shop.Shop.demo.repository.ShopRepository;

@Service
public class ShopService {

	@Autowired
	private ShopRepository shopRepository;
	
	
	
	public  List<ShopModel> getAllShopsList()
	{
		
		//List<ShopModel> shops =shopRepository.findAll();
		List<ShopModel> shops=	shopRepository.findAll();
		return shops;
		
	}
	
	public  List<ShopModel> getShopsListByName(String name)
	{
		
		//List<ShopModel> shops =shopRepository.findAll();
		List<ShopModel> shops=	shopRepository.findByshopName(name);
		return shops;
		
	}
	
	
	public  ShopModel createShopDetails(ShopModel model )
	{
		
	    ShopAddress address	=model.getShopAddress();
	
	    address.setShopmodel(model);
		return shopRepository.save(model);
		
		
		      
        
        
        
		
		  
	}
	
	
	
	
	
}
