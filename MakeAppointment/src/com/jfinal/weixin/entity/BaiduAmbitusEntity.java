package com.jfinal.weixin.entity;

/**
 * @author Javen
 * @Email javenlife@126.com
 * 
 */
public class BaiduAmbitusEntity {
	private String name;
	private String lng;//经度
	private String lat; //纬度
	private String address;
	private String distance;//距离
	private String district;//区域 宝安区
	private String infName; //additionalInformation之后
	private String telephone;
	private String infAddress;
	private String price;
	private String tag;//龙华
	private String url;
	
	public BaiduAmbitusEntity() {
	}
	
	
	public BaiduAmbitusEntity(String name, String lng, String lat,String address, String distance, String district) {
		this.name = name;
		this.lng = lng;
		this.lat = lat;
		this.address = address;
		this.distance = distance;
		this.district = district;
	}


	public BaiduAmbitusEntity(String name, String lng, String lat,
			String address, String distance, String district, String infName,
			String telephone, String infAddress, String price, String tag,
			String url) {
		this.name = name;
		this.lng = lng;
		this.lat = lat;
		this.address = address;
		this.distance = distance;
		this.district = district;
		this.infName = infName;
		this.telephone = telephone;
		this.infAddress = infAddress;
		this.price = price;
		this.tag = tag;
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getInfName() {
		return infName;
	}
	public void setInfName(String infName) {
		this.infName = infName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getInfAddress() {
		return infAddress;
	}
	public void setInfAddress(String infAddress) {
		this.infAddress = infAddress;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}


	@Override
	public String toString() {
		return "BaiduAmbitusEntity [name=" + name + ", lng=" + lng + ", lat=" + lat + ", address=" + address
				+ ", distance=" + distance + ", district=" + district + ", infName=" + infName + ", telephone="
				+ telephone + ", infAddress=" + infAddress + ", price=" + price + ", tag=" + tag + ", url=" + url + "]";
	}
	
	
	
}
