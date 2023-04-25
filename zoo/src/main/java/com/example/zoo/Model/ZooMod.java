package com.example.zoo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Animal")
public class ZooMod {
	@Id
	@Column(name="aid")
	private int aid;
	private String aspecification;
	private String aquantity;
	private String aorgin;
	
	private String hybrid;
	private String aclassification;
	private String afood;
	private String abloodtype;
	private String arptiles;
	private String amamals;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAspecification() {
		return aspecification;
	}
	public void setAspecification(String aspecification) {
		this.aspecification = aspecification;
	}
	public String getAquantity() {
		return aquantity;
	}
	public void setAquantity(String aquantity) {
		this.aquantity = aquantity;
	}
	public String getAorgin() {
		return aorgin;
	}
	public void setAorgin(String aorgin) {
		this.aorgin = aorgin;
	}
	public String getHybrid() {
		return hybrid;
	}
	public void setHybrid(String hybrid) {
		this.hybrid = hybrid;
	}
	public String getAclassification() {
		return aclassification;
	}
	public void setAclassification(String aclassification) {
		this.aclassification = aclassification;
	}
	public String getAfood() {
		return afood;
	}
	public void setAfood(String afood) {
		this.afood = afood;
	}
	public String getAbloodtype() {
		return abloodtype;
	}
	public void setAbloodtype(String abloodtype) {
		this.abloodtype = abloodtype;
	}
	public String getArptiles() {
		return arptiles;
	}
	public void setArptiles(String arptiles) {
		this.arptiles = arptiles;
	}
	public String getAmamals() {
		return amamals;
	}
	public void setAmamals(String amamals) {
		this.amamals = amamals;
	}

}
