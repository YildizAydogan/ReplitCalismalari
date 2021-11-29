package replitsorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class list4 {

	public static void main(String[] args) {
		
	
		System.out.println("list1= { \"Ali\", \"Veli\", \"Ayse\",\"Fatma\",\"Omer\" }");
			
			List<String>str=new ArrayList<>();
		str.add("Ali");
		str.add("Veli");
		str.add("Ayse");
		str.add("Fatma");
		str.add("Omer");
		
         String silinecekharf="A";
         String silinecekharf1="a";     
       for (int i = 0; i < str.size(); i++) {
			
    	   if (str.get(i).contains(silinecekharf)||str.get(i).contains(silinecekharf1)) {
				
				str.remove(i);
				
				i--;
	
				
			
	}
   
	}             int yeniArray[]= new int[str.size()];
				
				for (int i = 0; i < yeniArray.length; i++) {
					
					yeniArray[i]= yeniArray.replaceAll("\\S","");
					
				} System.out.println(str);
	
		}}
