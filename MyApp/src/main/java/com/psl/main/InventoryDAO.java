package com.psl.main;

import java.sql.Statement;
import java.util.ArrayList;

public class InventoryDAO {

	public static ArrayList InvLogic() {

		InventoryBean l_ref = new InventoryBean();
		ArrayList list = new ArrayList();

		l_ref.setManufacturer("Tata");
		l_ref.setCarName("Nano");
		l_ref.setColorsAvailable("Red, White");
		l_ref.setPrice("2,00,000");

		list.add(0, l_ref);
		System.out.println(list.get(0));

		InventoryBean l_ref_1 = new InventoryBean();

		l_ref_1.setManufacturer("Maruti Suzuki");
		l_ref_1.setCarName("Alto");
		l_ref_1.setColorsAvailable("Red, White");
		l_ref_1.setPrice("3,40,000");

		list.add(1, l_ref_1);

		InventoryBean l_ref_2 = new InventoryBean();

		l_ref_2.setManufacturer("Hyundai");
		l_ref_2.setCarName("i10");
		l_ref_2.setColorsAvailable("Red, White");
		l_ref_2.setPrice("4,00,000");

		list.add(2, l_ref_2);

		InventoryBean l_ref_3 = new InventoryBean();

		l_ref_3.setManufacturer("Ford");
		l_ref_3.setCarName("Figo");
		l_ref_3.setColorsAvailable("Red, White");
		l_ref_3.setPrice("4,20,000");

		list.add(3, l_ref_3);

		InventoryBean l_ref_4 = new InventoryBean();

		l_ref_4.setManufacturer("Volkswagen");
		l_ref_4.setCarName("Polo");
		l_ref_4.setColorsAvailable("Red, White");
		l_ref_4.setPrice("5,00,000");

		list.add(4, l_ref_4);

		return list;

	}

}
