package test;

import java.util.Scanner;

public class ReverseNumberFindMax {

	public static void main(String args[])
	   {
		String num="";
		boolean flag= false;
		int L=0;
		int R=0;
		System.out.println("Input your number and press enter: ");
		Scanner in = new Scanner(System.in);
		num = in.nextLine();
		if(!num.isEmpty()){
			flag = true;
			
			try{
				String sp[]=num.split(" ",2);
				if(sp!=null){
					L = sp[0]!=null?Integer.parseInt(sp[0]):0;
				    R = sp[1]!=null?Integer.parseInt(sp[1].trim()):0;
				    if(!(L>=0 && L<=1000000000 && R>=0 && R<=1000000000)){
				    	flag=false;
				    }
				   
				} 
			}catch(NumberFormatException e){
				System.out.println("number format exception");
			}
			
		} else{
			System.out.println("string is empty");
		}
		System.out.print("Reverse of the input number is:");
		if(flag){
			System.out.println(Math.max(reverseMethod(L), reverseMethod(R)));
	    }
		
	   }
	public static int reverseMethod(int num) {
		int reversenum =0;
	      while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }
	      return reversenum;
	}
}
