package com.example.shop.Shop.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="SHOPADDRESS")
public class ShopAddress {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer addressid;
	public Integer getAddressid() {
		return addressid;
	}

	public void setAddressid(Integer addressid) {
		this.addressid = addressid;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	@Column(name="LATITUDE")
	private double latitude;
	@Column(name="LONGITUDE")
	private double longitude;
	
	
	@OneToOne(fetch=FetchType.LAZY)	
    @JoinColumn(name = "shopId", nullable = false)
    private ShopModel shopmodel;
	
  /*public ShopModel getShopmodel() {
		return shopmodel;
	}*/

	public void setShopmodel(ShopModel shopmodel) {
		this.shopmodel = shopmodel;
	}

public ShopAddress()
	{}
  
	public ShopAddress(double latitude,double longitude)
	{
		  this.latitude=latitude;
		  this.longitude=longitude;
		  //this.shopmodel=shopmodel;
	}
	
	

}



