package com.bridgelabz.medicalshop;

import java.util.*;

public class UserInterface {
	
	Scanner scn = new Scanner(System.in);
/*	
	public int showTypeMenu() {
		System.out.println("Select \n1.AYURVEDIC \n2.ALLOPATHIC \n3.HOMEOPATHIC");
		int choice = scn.nextInt();
		return choice;
	}
*/	
	public void print(ArrayList<Medicine> medicineList) {
		for(Object medicine : medicineList) {
			System.out.println(medicine);
		}
	}
	
	public int showMainMenu() {
		System.out.println("Select \n 1.Add Medicine\n 2.Remove Medicine\n "
				+ "3.Print Medicine\n 4.Update medicine\n 5.Exit");
		int choice = scn.nextInt();
		return choice;
	}
	
	public String selectMedicine() {
		System.out.println("Enter the name of medicine :");
		String userSelection = scn.next();
		return userSelection;
	}
	
	public int showUpdateMenu() {
		System.out.println("Select \n1. Update Name \n2. Update Brandname "
				+ "\n3. Update Type \n4. Update Price \n5. Exit");
		int updateChoice = scn.nextInt();
		return updateChoice;
	}
	
	public int showMedicineTypeUpdateMenu() {
		System.out.println("Select Medicine Type \n1.AYURVEDIC \n2.ALLOPATHIC "
				+ "\n3.HOMEOPATHIC");
		int medicineTypeChoice = scn.nextInt();
		return medicineTypeChoice;
	}
	
}
