package com.Test_customer;
import com.customer.Customer;
import com.makecustomer.makecustomer;

public class Test {
	public static void main(String[] args) {
	
		makecustomer mm = new makecustomer();
		Customer ans = mm .makecustomer();
		System.out.println(ans.getId());
		System.out.println(ans.getName());
		System.out.println(ans.getGender());
		System.out.println(ans.getPhone_num());
		
		
	}
	

}
