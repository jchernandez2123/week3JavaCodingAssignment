package javaWeek3Assignment;



public class javaWeek3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//part 1 create an array of int called ages
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};//this creates the int array
        double average = 0;// this variable was created to help calculate the average

		System.out.println("This is part 1:");	
		System.out.println(ages[ages.length - 1]- ages[0]);//part 1a this subtracts the first element from the last element without using [7]
		
		int [] newAges = new int[1] ;// part 1b
            newAges [0]= 32;
            System.out.println(ages[ages.length - 1] + newAges[newAges.length-1]- ages[0]);//This adds a new age to the first element and then subtracts it from the element
            
		for (int i = 0; i < ages.length; i++) {// part 1c will create a for loop to iterate through and calculate the average age.
			average += ages[i];
		}
		System.out.println(average/ages.length);//This prints the result to the console
		
		
		System.out.println( "This is part 2:");
		// part 2 create an array of strings called names
	    String[] names = {"Sam ", "Tommy ", "Tim ", "Sally ", "Buck ", "Bob "};// this creates the array of string
        
	    int totalNumberOfLetters=0;//part 2a was created to help provide average number of letters 
	    for (String name: names) {
		totalNumberOfLetters += name.length();
	}
	   System.out.println(totalNumberOfLetters/names.length);// this prints out the average number of letters
    
    	//2b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
        for (int i = 0; i < names.length; i++) {// this for loop will help us iterate through the array 
        	
        	System.out.print(names[i]);// this will concatenate all the names in the array and print them out in one line
        }
        System.out.println();
        
        // part 3 
        System.out.println("This is part 3:");
        System.out.println ("By using the (arrayname[arrayname.length - 1]); you can access the last element");
        
        //part 4 
        System.out.println("This is part 4:");
        System.out.println("By using the array name and [0] you access the last element");
        
        
        //part 5
        	
        System.out.println("This is part 5:");
        int[] nameLengths = new int [names.length];//Creates a new array of int called nameLengths
          for (int i = 0; i < names.length; i++ ) {//Writes a loop to iterate over the previously created names array
        	nameLengths [i] = names[i].length();// this set i equal to 0 so it can pass through the loop and adds the length of each name
        }
         
        // part 6  
          System.out.println("This is part 6: ");
          int sumOfElements = 0;// this creates a variable to insert the sum of the array
          for (int i = 0; i < nameLengths.length; i++) {// this is created to iterate over the nameLengths of the array
        	  sumOfElements += nameLengths[i];// this will give the sum of the elements in the array
          }
          System.out.println("This prints the result : " + sumOfElements);// this prints out the result to the console
        
        System.out.println();
        
       //part 7
	    System.out.println ("This is part 7:");
        System.out.println(completeWord("Hello",3));	//this will print out part 7 it will print out hello 3 times together
	
	
	//part 8 Write a method that takes two Strings, firstName and lastName, 
		System.out.println("This is part 8:");
		String first = "Tommy";
		String last = "Oliver";
		String allNames;// this is created to help get the result of a full name 
		
		allNames = fullName(first, last);
		System.out.println("My full Name is: " + allNames);// this prints out the full name
	
	
		System.out.println("This is part 9:");
		//part9
		int [] numberArray = {29,52,123};
		boolean greaterThan100 = checkSumIsGreater(numberArray);
		
		System.out.println("yes it is: " + greaterThan100);
		
		
		System.out.println("This is Part 10:");
		//part 10. 
		double [] doubles = {1 ,12, 24, 32, 21};
		
		System.out.println(averageOfElements(doubles)) ;
		
		System.out.println("This is part 11:");
		//part 11
		double [] doubles2 = {1.0, 2.2,5.5,4.5,7.5}; //second array created for part 11
	System.out.println(doubleArray(doubles, doubles2));// this returns a true statement because the first array is greater than the second array

	// part 12 
	System.out.println("This is part 12:");
        double balanceInPocket = 11.50;
	    boolean hot = true;
	
	System.out.println(willBuyDrink (hot, balanceInPocket));
	
	//part 13 
	System.out.println("This is part 13");
	String ownSignature = "";
	System.out.println(signature(ownSignature));
	}



//part 7 method
    public static String completeWord(String word, int n) {//this method takes a string and an int as arguments and returns a concatenated value   
	String completeWord = "";
	for (int i = 0; i < n; i++) {// this iterates through the loop
		completeWord += word;
	}
	return "It returns this: " + completeWord;//this will return whatever you put in the string
     }

//part 8 method
    public static String fullName(String firstName, String lastName) {// this method is created to pull two strings together and concatenate together everytime it is called
	String completeName = firstName +" "+ lastName;
	return completeName;// this returns a complete method 
	
}

// part 9 method
	public static boolean checkSumIsGreater(int[] numberArray)// this creates the method of an array of int and returns true if its greater than 100
	{
		for (int array: numberArray) {
		if (array > 100) {
			return true;}
		}return false;
	
	}
	//part 10 method
	public static double averageOfElements(double[] elements) {// This creates a method that takes an array of double and averages the elements
		double sum = 0;
		for (double number : elements) {
			sum += number;
		}
			return sum / elements.length;// this gives the average of the elements
	
		
		}
	
	// part 11 method
	public static boolean doubleArray (double[] array1, double[] array2) {// this takes two arrays of double to return a true
      return averageOfElements(array1) > averageOfElements(array2);		// i used the previous method created to help get the average of two doubles
	}
	
	//part 12 method
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {// this creates a method that if true it will print out will buy a drink
		if( isHotOutside = true && moneyInPocket> 10.50) {// this uses && statement to make sure both are true in order to print
			return true;
		}return false;
}
	// part 13 method
	public static String signature(String s) {
		String myDesignedName = s + "This Code Was Created By: Juan Hernandez";// I created this to give a signature and credit to the creater of the code
		return myDesignedName;                                                 //    I just thought it was a unique situation when you would use this method
	}
}
	

	
	




	
	

	
	
	
	

