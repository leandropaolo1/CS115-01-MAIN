import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Lab1a {

	static ArrayList<Integer> validInteger(Scanner scanner, String message, ArrayList<Integer> int_list){
		boolean valid_response = false;
		String response = null;
		while(!valid_response){
			System.out.print(message);
			response = scanner.nextLine();
			if(response.length() == 0){
				if(int_list.size() != 0){
					return int_list;

				}
				else{
					if(int_list.size() != 0){
						valid_response = false; //break while loop
					}
					else{
						System.out.println("Your list cannot be empty. ");
					}
				}
			}
			else{
				try{
					int integer = Integer.parseInt(response);
					int_list.add(integer);
				}
				catch(Exception e){
					System.out.printf("Invalid response. %s is not a number. \n",response);
				}
			}


		}
		return null;
	}
	static Integer addNumbers(ArrayList<Integer> intList){
		int total = 0;
		for(int i = 0; i < intList.size(); i++){
			total += intList.get(i); //adds each number in list
		}
		return total;
	}

	static Integer largestNumber(ArrayList<Integer> intList){
		int largestNumber = intList.get(0); //largest number is the first one of the list
		for(int i = 0; i < intList.size(); i++){ //check each numbers (compares)
			if(intList.get(i) > largestNumber){
				largestNumber = intList.get(i);
			}
		}
		Collections.sort(intList);
		return largestNumber;
	}

	public static void main(String[] args) {
		System.out.println("In this program you will enter a list of numbers.");

		//variables
		ArrayList<Integer> intList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String message1 = "Please enter a number (or hit the <Enter> key to stop): ";
		intList = validInteger(scanner, message1,intList);
		System.out.print("");
		
		int total = addNumbers(intList);
		int largestNumber = largestNumber(intList);
		System.out.print("\n");
		System.out.printf("The total of the list of numbers is: %d. \n", total);
		System.out.printf("The biggest number in the list is: %d. \n", largestNumber);
		
		scanner.close();
	}//end of main()

	
}//end of class FinalExam2
