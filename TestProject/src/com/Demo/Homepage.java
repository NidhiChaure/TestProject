package com.Demo;

public class Homepage {

	public static void main(String[] args) {
		
		String st="Nidhi";
		String rev="";
		for(int i=st.length()-1;i>=0;i--) {
		    rev=rev+st.charAt(i);	
			
		}
			System.out.println(rev);
		

}
}