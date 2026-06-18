package com.Demo;

public class Homepage {

	public static void main(String[] args) {
		
		String st="Nidhi";
		String rev="";
		String temp=st;
		for(int i=st.length()-1;i>=0;i--) {
		    rev=rev+st.charAt(i);	
			
		}
			System.out.println(rev);
			if(temp.equals(rev))
			{
				System.out.println("palindrome String");
			}
			else
			{
				System.out.println("not palindrome string");
			}
		
			int a=10, b=2,c=0;
			c=a/b;
			System.out.println("the value of c is:"+c);

}
}