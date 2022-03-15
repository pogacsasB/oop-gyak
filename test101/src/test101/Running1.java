package test101;

import java.util.Random;

public class Running1 {

	public static void main(String[] args) {
		int size = 10;
		Testing1[] test = new Testing1[size];
		Random num = new Random();
		
		for (int i = 0; i < size; i++) {
			test[i] = new Testing1(num.nextInt(9) + 1, num.nextInt(9) + 1, num.nextInt(9) + 1);
			System.out.println(i + ".indexed rectangle :" + test[i]);
		}

	}

}
