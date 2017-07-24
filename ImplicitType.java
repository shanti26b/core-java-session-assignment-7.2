package assignment7;

	/*here we are showing that the implementing of implicit type of promotion 
	   
	  any smaller data type  when put into a bigger data type then it is automatically
	  converted and is known as implicit conversion
	*/
	

	public class ImplicitType { //here we are taking a class implicit type

		public static void main(String[] args) {// here i have taking the main method
			
	             byte firstnumber= 20;                             //we are taking byte data type and initialized the variable as 15
	             int secondnumber = 150;                          //and another variable of integer data type which is greater than byte data type
	             System.out.println("firstnumber : " +firstnumber+ "\n secondnumber :" +secondnumber );       
	             
	             firstnumber=(byte)secondnumber;
	             
	             System.out.println("int to byte  : " +firstnumber ); 
	             secondnumber= firstnumber ;
	             System.out.println("byte to int  : " +secondnumber );
	             
	             int thirdnumber= 250;                     // we are taking byte data type and initialized the variable as 150
	             float fourthnumber = thirdnumber;                    
	             System.out.println("int to float : " +fourthnumber );
		       short fifthnumber =(short)fourthnumber;
		       System.out.println("float to short  : " +fifthnumber );
		        
		}

	}


