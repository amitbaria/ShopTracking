package com.example.shop.Shop.demo.model;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="SHOPDETAILS")
public class ShopModel {

	
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer shopId;
	@Column(name="SHOPNAME")
    private String shopName;
	@Column(name="OWNERNAME")
	private String ownerName;
	@Column(name="SHOPCATEGORY")
	private String shopCategory;
	
	
	@OneToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "shopmodel"
    )
    
	private  ShopAddress  shopAddress; 
	
     
	
	 public ShopAddress getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(ShopAddress shopAddress) {
		this.shopAddress = shopAddress;
	}
	public	ShopModel()
	   {}
    public ShopModel(String shopName,  String ownerName,String shopCategory,ShopAddress shopAddress)
    {
  	  this.shopName=shopName;
  	  this.ownerName=ownerName;
  	  this.shopCategory=shopCategory;
  	  this.shopAddress=shopAddress;
  	  
    }
	
    public ShopModel(String shopName,  String ownerName,String shopCategory)
    {
  	  this.shopName=shopName;
  	  this.ownerName=ownerName;
  	  this.shopCategory=shopCategory;
  	
  	  
    }
    
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	
	
	
}
