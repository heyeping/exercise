package com.hyp;
import java.io.*;
public class BRRead {
   public static void main (String args[])throws IOException{
	   char c;
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   System.out.println("Enter characters,'g' to quit.");
	   do{
		   c=(char) br.read();
		   System.out.println(c);
	   }while(c!='g');
   }
}
