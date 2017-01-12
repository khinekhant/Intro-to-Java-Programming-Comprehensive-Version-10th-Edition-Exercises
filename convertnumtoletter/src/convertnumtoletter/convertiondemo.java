package convertnumtoletter;


import javax.swing.JOptionPane;

public class convertiondemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		          //Defining variables q is quotient, r is remainder

		          int len, q=0, r=0;
		          String ltr = " ";
		          String Str = "Rupees";
		          constNumToLetter n = new constNumToLetter();
		          String input=JOptionPane.showInputDialog("Enter the number");
		          int num = Integer.parseInt(input);
		         			
		  					
		
		  			
		  		
		  		
		  		String date=JOptionPane.showInputDialog("Please enter the date: ");
		  		
		  		String name=JOptionPane.showInputDialog("Please enter the payee name: ");
		  		
		  	
		  		// Test the payee name
		  		// Get amount of check from user
		  		
		  		// Test the amount of the check
		  		// Append values to the object
		  		StringBuilder str = new StringBuilder();
		  		str.append("Date: "+date+"\n");					// Append date
				str.append("Pay to the Order of: "+name+"\n");	// Append payee
				str.append("$ "+num+"\n");						// Append amount
								// Append word amount
				// Display output of check  
				System.out.println(str);

		         
		          if (num <= 0) {
		        	  
		        	  System.out.println("Zero or Negative number not for conversion");
		          }
		          while (num>0)
		          {

		             len = n.numberCount(num);

		             //Take the length of the number and do letter conversion

		             switch (len)

		             {
		                  case 8:
		                          q=num/10000000;
		                          r=num%10000000;
		                          ltr = n.twonum(q);
		                          Str = Str+ltr+n.digit[4];
		                          num = r;
		                          break;

		                  case 7:
		                  case 6:
		                          q=num/100000;
		                          r=num%100000;
		                          ltr = n.twonum(q);
		                          Str = Str+ltr+n.digit[3];
		                          num = r;
		                          break;

		                  case 5:
		                  case 4:

		                           q=num/1000;
		                           r=num%1000;
		                           ltr = n.twonum(q);
		                           Str= Str+ltr+n.digit[2];
		                           num = r;
		                           break;

		                  case 3:


		                            if (len == 3)
		                                r = num;
		                            ltr = n.threenum(r);
		                            Str = Str + ltr;
		                            num = 0;
		                            break;

		                  case 2:

		                           ltr = n.twonum(num);
		                           Str = Str + ltr;
		                           num=0;
		                           break;

		                  case 1:
		                           Str = Str + n.unitdo[num];
		                           num=0;
		                           break;
		                  default:

		                          num=0;
		                          System.out.println("Exceeding Crore....No conversion");
		                          System.exit(0);


		              }
		                          if (num==0)
		                          System.out.println(Str+" Only");
		            }
	}

}
