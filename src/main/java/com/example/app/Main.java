package com.example.app;

import static java.lang.Math.*;
import java.util.ArrayList;
import com.example.utils.Helper;
import static com.example.utils.Utility.greet;;

public class Main {

	public static void main(String[] args) {
		Helper h = new Helper();
		//h.showMessage();

		ArrayList<String> arr = new ArrayList<>();
		arr.add("あ");
		arr.add("い");
		arr.add("う");

		System.out.println(arr);

		double r = 3.5;
		double area = PI * r * r;
		System.out.println("半径は" + r + "の円形は面積は" + area);

	}
}
