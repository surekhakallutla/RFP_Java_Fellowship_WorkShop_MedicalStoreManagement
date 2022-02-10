package com.bridgelabz.medicalshop;

import java.util.*;

public class MedicalStore {

	private ArrayList <Medicine> medicineList = new ArrayList <Medicine> ();
	
	public ArrayList <Medicine> getMedicineList() 
	{
		return medicineList;
	}
	
	public void add(Medicine medicine)
	{
		medicineList.add(medicine);		
	}
		
	public void remove(Medicine medicine)
	{
		medicineList.remove(medicine);	
	}
		
	public Medicine getMedicine(String name) {
		for(Medicine medicine : medicineList) {
			if(name.equalsIgnoreCase(medicine.name)) {
				return medicine;
			}
		}
		return null;
	}
	
}

