package com.example.shop.Shop.demo.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.shop.Shop.demo.model.ShopAddress;
import com.example.shop.Shop.demo.model.ShopModel;
import com.example.shop.Shop.demo.service.ShopService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/shops")
public class ShopRestController {

	
	@Autowired
	private ShopService shopService;
	
@GetMapping("/shopDetails")
public ResponseEntity<List<ShopModel>>  getAllShopDetails()
 {
	  List<ShopModel> shops  =  shopService.getAllShopsList();
	  return new ResponseEntity<List<ShopModel>>(shops,HttpStatus.OK);
	 
 }



@GetMapping("/shopDetailsByName")
public ResponseEntity<List<ShopModel>>  getAllShopDetailsByName(@RequestParam("shopName") String shopName)
 {
	  List<ShopModel> shops  =  shopService.getShopsListByName(shopName);
	    if(shops==null)
	    {
	       throw ShopNotFoundException(); 	
	    	
	    }
	  
	  
      return new ResponseEntity<List<ShopModel>>(shops,HttpStatus.OK);
	 
 }


@PostMapping("/addShopDetails")
public ResponseEntity<Integer>  addShopDetails(@RequestBody  ShopModel shopModel)
{
	
	shopModel.getShopId();
	
    ShopAddress address	=shopModel.getShopAddress();

   System.out.println(shopModel.getShopId()+ " "+shopModel.getOwnerName() + " "+address.getLatitude());

	
	  ShopModel shops  =  shopService.createShopDetails(shopModel);
      return new ResponseEntity<Integer>(shops.getShopId(),HttpStatus.OK);
	 
}
}







