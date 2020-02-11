package lotteryNumber;

 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
import java.util.Random;
import java.util.Scanner;

    public class Test {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); 
        int myArray[] = new int [7];
        int myArray2[] = new int [7];
        askNumbers(myArray);
        randomNumbers(myArray2);
        compareArrays(myArray,myArray2);
       // Test hello = new Test();
        //System.out.println(hello.findCommonElement(myArray, myArray2)); //another way to do it.
        printarray(myArray); 
        
        
    }
    /**
     * 
     * @param a
     * @param b
     * @return commonElements
     */
    public  List<Integer> findCommonElement(int[] a, int[] b) {

        List<Integer> commonElements = new ArrayList<Integer>();
        int round = 0;
        randomNumbers(b);
        while (commonElements.size()<6) {
        	 randomNumbers(b);
        for(int i = 0; i < a.length ;i++) {
            for(int j = 0; j< b.length ; j++) {
                    if(a[i] == b[j]) {  
                    //Check if the list already contains the common element
                        if(!commonElements.contains(a[i])) {
                            //add the common element into the list
                            commonElements.add(a[i]);
                        }
                    }
            }
        }
        randomNumbers(b);
        printarray(b);
		round++;
		System.out.println("Round N "+round);
		if(commonElements.size()<6) { 
			commonElements.clear();
        
       
    }
        }
        
        return commonElements;
    }
    public static void compareArrays(int [] array1, int [] arrayrand) {
		int compara = 0;
		int round =0;
		randomNumbers(arrayrand);
			while (compara<6) {
				randomNumbers(arrayrand);
				for (int i=0; i<array1.length;i++) {
					for (int j=0; j<array1.length;j++) {
						if (array1[i]==arrayrand[j]) {
							compara++;
							arrayrand[j]=0;
							break;
						}
					}
					
				}
				randomNumbers(arrayrand);
				round++;
				System.out.println(" Round N "+round);
				if(compara<6) { 
					compara=0;
				}
				}
				System.out.println("! YOU WIN ! in :"+round+"rounds");
	}
	
	public static void randomNumbers(int [] array) {
		Random random = new Random();
		for (int i=0; i<array.length;i++) {
			array[i] = (int) (Math.random() * ((39 - 1) + 1)) + 1;
		}
	}
	public static void printarray(int[]arra) {
		for (int i=0;i<arra.length;i++) {
			System.out.print(arra[i]+" ");
		}
	}

    
    public static void askNumbers(int [] numer) {
		for(int i=0; i<numer.length;i++)
		{	
			numer[i]= readInput("Inert Integer N: "+(i+1)+"  between 1 e 39");
			if (numer[i]<1||numer[i]>39) {
				do {
					
					
					numer[i]= readInput("Integer N: " +(i+1)+ " Is out of range, Try again plz");
			
					
					
				}while (numer[i]<1||numer[i]>39); 
				
			}
		}
	}
    
    public static int readInput(String text) {
        Scanner scanner = new Scanner(System.in);
        boolean ready = false;

        while (!ready) {
            try {
                System.out.println(text);
                String tmp = scanner.nextLine();
                return Integer.parseInt(tmp);
            } catch (Exception e) {
            }

        }
        return 0;
    }
    }