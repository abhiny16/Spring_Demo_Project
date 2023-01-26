package com;

public class MyTest {
	public static void main(String[] args) {
		String str = "WDAMP-ADS-ADCOTE-545S-";
        if(!(str==null)&& (!str.startsWith("R-") || str.startsWith("WDAMP")))
        	System.out.println("Yes");
        else
        	System.out.println("no");
	}
}
