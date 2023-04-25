package com.example.mysql.AnimalsData;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Animals")
public class AnimalsData {
	@Id
	@Column(name="alifespan")
	public int    alifespan;
		public String aspecification;
		public String aquantity;
		public String aorgin;
		
		public String hybrid;
		public String aclassification;
		public String afood;
		public String abloodtype;
		public String arptiles;
		public String amamals;
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
		public int getAlifespan() {
			return alifespan;
		}
		public void setAlifespan(int alifespan) {
			this.alifespan = alifespan;
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
		@Override
		public String toString() {
			return "AnimalsData [aspecification=" + aspecification + ", aquantity=" + aquantity + ", aorgin=" + aorgin
					+ ", alifespan=" + alifespan + ", hybrid=" + hybrid + ", aclassification=" + aclassification
					+ ", afood=" + afood + ", abloodtype=" + abloodtype + ", arptiles=" + arptiles + ", amamals="
					+ amamals + "]";
		}
		
	}


