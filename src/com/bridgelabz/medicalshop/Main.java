package com.bridgelabz.medicalshop;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.bridgelabz.medicalshop.Medicine.MedicineType;

public class Main {
	Scanner scn = new Scanner(System.in);
	MedicalStore medicalStore = new MedicalStore();
	
	public void handleUserSelection(int choice) {
		
		UserInterface userInterface = new UserInterface();
		
		switch(choice) {
		case 1:
			addMedicine();
			System.out.println("Medicines added Successfully");
			break;
		case 2:
			String userSelection = userInterface.selectMedicine();
			Medicine medicine = medicalStore.getMedicine(userSelection);
			System.out.println("Medicine = "+medicine);
			medicalStore.getMedicineList().remove(medicine);
			System.out.println("Medicine Removed Successfully");
			System.out.println(medicalStore.getMedicineList());
			break;
		case 3:
			System.out.println("The Medicine List is ");
			userInterface.print(medicalStore.getMedicineList());
			break;
		case 4:
			updateMedicine();
			System.out.println("Medicine details are updated Successfully");
			break;
		case 5:
			System.out.println("Exited the main menu");
			break;

		}
	
	}
	
	private MedicineType setMedicineType() {
		UserInterface userInterface = new UserInterface();
		int medicineTypeChoice = userInterface.showMedicineTypeUpdateMenu();
		Medicine medicine = new Medicine();
		switch(medicineTypeChoice) {
		case 1 : 
			medicine.type = MedicineType.AYURVEDIC;
			break;
		case 2:
			medicine.type = MedicineType.ALLOPATHIC;
			break;
		case 3: 
			medicine.type = MedicineType.HOMEOPATHIC;
			break;
		}
		
		return medicine.type;
	}
	
	private void updateMedicine() {
		UserInterface userInterface = new UserInterface();
		String medicineName = userInterface.selectMedicine();
		
		Medicine medicineForUpdate = medicalStore.getMedicine(medicineName);
		System.out.println(medicineForUpdate);
		
		int updateChoice = userInterface.showUpdateMenu();
		
		switch (updateChoice) {
		case 1:
			System.out.println("Current Name is : " + medicineForUpdate.name 
					+ ". Enter your new name :");
			String newName = scn.next();
			medicineForUpdate.name = newName;
			break;
		case 2:
			System.out.println("Current Brand Name is : " 
					+ medicineForUpdate.brandName + ". Enter your new Brand Name :");
			medicineForUpdate.brandName = scn.next();
			break;
		case 3:
			System.out.println("Current Type is : " + medicineForUpdate.type );
			MedicineType newMedicineType = setMedicineType();
			break;
		case 4:
			System.out.println("Current price is : " 
					+ medicineForUpdate.price + ". Enter your new price :");
			medicineForUpdate.price = scn.nextInt();
			break;
		}
	}

	public void addMedicine() {
		
//		MedicalStore medicalStore = new MedicalStore();
				
		Vicks vicks = new Vicks();		
		vicks.price = 3; 
		Azithromycin azithromycin = new Azithromycin();
		azithromycin.price = 4.5;
		BTrim btrim = new BTrim();
		btrim.price = 5.8;
		Paracetmol paracetmol = new Paracetmol();
		paracetmol.price = 5.2;
		Chawanprash chawanprash = new Chawanprash();
		chawanprash.price = 4;
		
		medicalStore.add(azithromycin);
		medicalStore.add(btrim);
		medicalStore.add(chawanprash);
		medicalStore.add(paracetmol);
		medicalStore.add(vicks);
		
//		medicalStore.setMedicineList(medicalStore.getMedicineList());
		System.out.println(medicalStore.getMedicineList());
				
	}
	
	
	public static void main(String[] args) {
		
/*		
		UserInterface userinterface = new UserInterface();
		
		userinterface.print(medicalstore.getMedicineList());
		
		medicalstore.remove(azithromycin);

		System.out.println("After removing Azhithromycin");
		userinterface.print(medicalstore.getMedicineList());
*/
		UserInterface userInterface = new UserInterface();
		Main main = new Main();
		
//		int choice = userInterface.showMainMenu();
//		main.handleUserSelection(choice);
		
		

		int choice = 0;
		while(choice != 5) {
			choice = userInterface.showMainMenu();
			main.handleUserSelection(choice);
		}
				
	}
}

