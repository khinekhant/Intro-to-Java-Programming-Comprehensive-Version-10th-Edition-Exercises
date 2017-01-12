package exercise7_23;

public class Exercise7_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean[] state=new boolean[100];

for(int student=0;student<100;student++){
	if(student==0){
		for(int j=0;j<state.length;j++)
			state[j]=true;
	}
	if(student==1){
		for(int j=1;j<state.length;j++)
			state[j]=!state[j];
	}
		changeState(state,student);
	
}

int count=0;
for(int i=0;i<state.length;i++){
	if(state[i]) {
		System.out.print(i+" ");
		count++;
	}
	}
System.out.println();
System.out.println("Total of "+count+" lockers are open");
}
	

	private static void changeState(boolean[] lState, int student) {
		// TODO Auto-generated method stub
		for(int i=student;i<lState.length;i+=student+1){
			 lState[i]=!lState[i];
			
		}
		
	}
	/* public static void main(String[] args) {

	        boolean[] lockers = new boolean[100];

	        for (int student = 1; student <= 100; student++) {
	            shuffle(lockers, student);
	        }
	        display(lockers);
	    }

	    public static void shuffle(boolean[] lockersOpenState,  int start) {

	        int nextLocker = start;
	        for (int i = start - 1; i < lockersOpenState.length; i += nextLocker) {
	                lockersOpenState[i] = !lockersOpenState[i];

	        }
	    }


	    public static void display(boolean[] lockers) {

	        int lockerCount = 0;
	        for (int i = 0; i < lockers.length; i++) {

	            if (lockers[i]) {
	                System.out.printf("L%d ", i+1);
	                lockerCount++;
	                if (lockerCount % 10 == 0) System.out.println("");
	            }


	        }

	    }
	
		
	
	public static void main(String[] args) {
		String[] lockers = new String[100];

		// Close all the lockers
		closeAllLockers(lockers);

		// Invoke the stuentLockerChanges method
		studentLockerChanges(lockers);
		
		// Display all open lock numbers
		print(lockers);
	}

	
	public static boolean isOpen(String l) {
		return l == "OPEN";
	}

	// closeAllLockers fills the array with the string "CLOSED" 
	public static void closeAllLockers(String[] lockers) {
		for (int i = 0; i < lockers.length; i++) {
			lockers[i] = "CLOSED";
		}
	}

	// studentLockerChanges changes the string in each 
	*   element from "CLOSED" to "OPEN" or Vice versa 
	public static void studentLockerChanges(String[] lockers) {
		int start = 0; // Locker student begins with

		for (int s = 1; s <= lockers.length; s++) {
			for (int l = 0; l < lockers.length; l += s) {
				if (isOpen(lockers[l]))
					lockers[l] = "CLOSED";
				else
					lockers[l] = "OPEN";
			}
			start++;
		}
	}

	//print displays all open locker numbers separated by exactly one space 
	public static void print(String[] lockers) {
		for (int i = 0; i < lockers.length; i++) {
			if (isOpen(lockers[i])) {
				System.out.print("L" + (i + 1) + " ");
			}
		}
		System.out.println();
	}
	
*/
		


}
