package com.ResultSet;



import java.util.Scanner;

public class ProductRemove {

	public static void main(String[] args) {
		
		Product product = new Product(0, null, 0);
		Product service = new Product(0, null, 0);
		
		Scanner sc = new Scanner(System.in);
		
		//Product Add into Database
		/*
		System.out.println("Enter Product ID =");
		long pid = sc.nextLong();
		System.out.println("Enter Product Name=");
		String pname = sc.next();
		System.out.println("Enter Product price");
		double pprice = sc.nextDouble();
		product.setProductid(pid);
		product.setProductname(pname);
		product.setProductprice(pprice);
		
		service.addProduct(product);
		*/
		
		//Delete product from database
		
		System.out.println("**************Remove Product**************");
		System.out.println("Enter Product Id");
		long pid1 = sc.nextInt();
		service.delete(pid1);
		
		
		
		sc.close();
	}

}



