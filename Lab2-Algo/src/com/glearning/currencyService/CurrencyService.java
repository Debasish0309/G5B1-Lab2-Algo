package com.glearning.currencyService;

import java.util.ArrayList;
import java.util.List;

public class CurrencyService {
	
	public void denominationService(int[]denominations,double amount) {
		boolean flag=true;
     List<String> result=new ArrayList<>();
     while(flag) {
    	 for (int i = 0; i < denominations.length; i++) {
    		 int numberOfDenominator=0;
    		 while(amount>=denominations[i]) {
    			 amount=amount-denominations[i];
    			 numberOfDenominator ++;
    			 
    		 }
    		 if(numberOfDenominator !=0) {
			result.add("number of denominators:: "+numberOfDenominator + " Currency:: "+denominations[i]);
    		 }
		}
    	 flag=false;
     }
     System.out.println(result);
	}

}
