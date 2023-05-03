package OraganicStore;

import java.util.Scanner;

public class Oraganic
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("========== Welcome to Organic Store =========");
		displayProducts();
	}

	public static void displayProducts()
	{
		System.out.println("--------------------------------\n" + "Available products in the store");
		String prod[] = { "1) Fruits", "2) Vegetables", "3) Cosmetics", "4) Masala Powders" };
		for (int i = 0; i < prod.length; i++) {
			System.out.println(prod[i]);
		}
		prod();
	}

	public static void displayFruits()
	{
		String fruit[]={"--------------------------------------" , "125 ----- Mangoes ------1 kg is 50"
				, "126----- Apples ------1 kg is 100" , "127 ----- Bananans ------1 kg is 25"
				, "128 ----- Papaya ------1 kg is 44" , "129 ----- Grapes ------1 kg is 60"
				, "130 ----- Oranges ------1 kg is 50"};
		for (int i = 0; i < fruit.length; i++)
		{
			System.out.println(fruit[i]);
		}
	}

	public static void displayVegetables()
	{
		String veg[]={"---------------------------------" , "225 ----- Potato ------1 kg is 41"
				, "226----- Brinjal ------1 kg is 35" , "227 ----- Carrots ------1 kg is 60"
				, "228 ----- Beetroot ------1 kg is 44" , "229 ----- Drumstick ------1 kg is 60"
				, "230 ----- Mushroom ------1 kg is 50"};
		for (int i = 0; i < veg.length; i++) 
		{
			System.out.println(veg[i]);
		}
	}
	
	public static void displaycosmetics()
	{
		String cosmetics[]={"---------------------------------" , "325 ----- Perfumes ------250 ml is 250"
				, "326----- Lipstick ------1 product is 149" , "327 ----- Shampoos ------100 ml is 120"
				, "328 ----- ToothPastes ------100 g is 165" , "329 ----- DeoDrants ------150 ml is 142"
				, "330 ----- Lotations ------100 ml is 194"};
		for (int i = 0; i < cosmetics.length; i++) 
		{
			System.out.println(cosmetics[i]);
		}
	}
	
	public static void displayMasalaPowders()
	{
		String masala[]={"---------------------------------" , "425 ----- Garam Masala ------100 g is 81"
				, "426----- Chaat Masala ------100 g is 70" , "427 ----- Sambar Masala ------100 g is 140"
				, "428 -----  Dhaniya Powder ------100 g is 52" , "429 -----  Chana Masala ------100 g is 60"
				, "430 -----  Maggi Masala ------100 g is 100"};
		for (int i = 0; i < masala.length; i++) 
		{
			System.out.println(masala[i]);
		}
	}

	public static void choice()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("if you want to continue with shopping press 1 otherwise press 2 for exist !");
		int choice = sc.nextInt();
		if (1 == choice)
		{
			displayProducts();
		}
		if (2 == choice)
		{
			total();
			return;
		}
	}

	public static void prod()
	{
		System.out.println("Please enter your choice ?");
		System.out.println("--------------------------------------");
		for (;;) 
		{
			int choice = sc.nextInt();
			switch (choice)
			{
					case 1:
					{
						displayFruits();
						System.out.println("please choose your product code : ");
						System.out.println("--------------------------------------");
						int code = sc.nextInt();
						int prodcode[] = { 125, 126, 127, 128, 129, 130 };
						int price[] = { 50, 100, 25, 44, 60, 50 };
						String fruit[] = { "Mangoes", "Apples", "Bananas", "Papaya", "Grapes", "Orange" };
						for (int i = 0; i < prodcode.length; i++)
						{
							if (prodcode[i] == code)
							{
								System.out.println(fruit[i] + " is a good choice How many kgs you need ?");
								double size = sc.nextDouble();
								double bill = price[i] * size;
								total += bill;
								choice();
								return;
							}
						}
						System.out.println("Invalid product code entered !");
						break;
					}
	
					case 2:
					{
						displayVegetables();
						System.out.println("please choose your product code : ");
						System.out.println("--------------------------------------");
						int code = sc.nextInt();
						int prodcode[] = { 225, 226, 227, 228, 229, 230 };
						int price[] = { 41, 35, 60, 44, 60, 50 };
						String fruit[] = { "Potato", "Brinjal", "Carrots", "Beatroot", "DrumStick", "Mushroom" };
						for (int i = 0; i < prodcode.length; i++)
						{
							if (prodcode[i] == code)
							{
								System.out.println(fruit[i] + " is a good choice How many kgs you need ?");
								double size = sc.nextDouble();
								double bill = price[i] * size;
								total += bill;
								choice();
								return;
							}
						}
						System.out.println("Invalid product code entered !");
						break;
					}
					
					case 3:
					{
						displaycosmetics();
						System.out.println("please choose your product code : ");
						System.out.println("--------------------------------------");
						int code = sc.nextInt();
						int prodcode[] = { 325, 326, 327, 328, 329, 330 };
						int price[] = { 250, 149, 120, 165, 142, 194 };
						String cosmetics[] = { "Perfumes", "Lipsticks", "Shampoos", "Toothpastes", "Deodrants", "Lotations" };
						for (int i = 0; i < prodcode.length; i++)
						{
							if (prodcode[i] == code)
							{
								System.out.println(cosmetics[i] + " is a good choice How many products you need ?");
								double size = sc.nextDouble();
								double bill = price[i] * size;
								total += bill;
								choice();
								return;
							}
						}
						System.out.println("Invalid product code entered !");
						break;
					}
					
					case 4:
					{
						displayMasalaPowders();
						System.out.println("please choose your product code : ");
						System.out.println("--------------------------------------");
						int code = sc.nextInt();
						int prodcode[] = { 425, 426, 427, 428, 429, 430 };
						int price[] = { 81, 70, 140, 52, 60, 100 };
						String masala[] = { "Garam Masala", "Chaat Masala", "Sambar Masala", "Dhaniya Powder", "Chana Masala", "Maggi Masala" };
						for (int i = 0; i < prodcode.length; i++)
						{
							if (prodcode[i] == code)
							{
								System.out.println(masala[i] + " is a good choice How many products you need ?");
								double size = sc.nextDouble();
								double bill = price[i] * size;
								total += bill;
								choice();
								return;
							}
						}
						System.out.println("Invalid product code entered !");
						break;
					}
				}
		}
	}
	
	static double total;
	static double discount;
	static double temp;

	public static void total()
	{
		if (total > 500)
		{
			discount = (total * 5) / 100;
			temp = total - discount;
		} 
		else
		{
			temp = total;
		}

		System.out.println("=========================================================\n"
				+ "=============== Welcome to Organic Store ================\n"
				+ "Total bill of your purchased items is : " 
				+ total
				+ "\n"
				+ "You received a discout of 5% : "
				+ discount
				+ "\n"
				+ "Final bill is : "
				+ temp
				+ "\n"
				+ "========== Thank you for shopping you saved "
				+ discount
				+ " =======\n"
				+ "=========================================================");
	}
}
