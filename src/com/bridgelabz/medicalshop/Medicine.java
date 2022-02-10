package com.bridgelabz.medicalshop;

public class Medicine {
	
	enum MedicineType {
		AYURVEDIC,ALLOPATHIC,HOMEOPATHIC;
		
	}
	
	String name;
	String brandName;
	double price;
	MedicineType type;
	
	@Override
	public String toString() {
		return "Medicine [name=" + name + ", brandName=" + brandName + ", price=" + price + ", type=" + type + "]";
	}
		
}

