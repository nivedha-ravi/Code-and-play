/*
In a car parking area, N cars are parked. The maximum number of cars that can be parked in the area is M. Each car must be parked at the next available position of the last car parked. The program must accept the registration numbers of the N cars and the value of M as the input. The program also accepts Q queries as the input. Each query contains an integer representing the option X and a string representing the registration number R of a car. - Option X = 1: The program must add the registration number R to the already parked cars and print the string value "Car parked at position:" followed by the position of the newly parked car. If the parking area is full, the program must print the string value "No space for parking" as the output. - Option X = 2: The program must search the given registration number R among the parked cars. If it is found, the program must print the string value "Car position:" followed by the position of the car. If the registration number R is not found, the program must print the string value "Car does not exists" as the output. - For any other options, the program must print the string value "Invalid" as the output.

 Input:
 5
 TN6548 MH1247 KA3057 KL2154 TN6999
 7
 6
 1 KA1200
 2 KL2154
 4 JK9842
 1 MH0055
 1 KA5555
 2 TK1872
 Output:
 Car parked at position: 6
 Car position: 4
 Invalid
 Car parked at position: 7
 No space for parking
 Car does not exists
 Explanation:
 Here Q=6.
 Query 1: The given option is 1 and the maximum cars that can be parked is 7. Here only 5 cars are parked, so the car KA1200 is parked at the position 6.
 Query 2: The given option is 2 and the registration number is KL2154. The car with the registration number KL2154 is already parked at the position 4.
 Query 3: The given option is 4, the options other than 1 and 2 are Invalid.
 Query 4: The given option is 1 and the maximum cars that can be parked is 7. Here only 6 cars are parked, so the car MH0055 is parked at the position 7.
 Query 5: The given option is 1 and the number of cars parked is 7. Now the parking area is full, so no space for parking.
Query 6: The given option is 2 and the registration number is TK1872. There is no car with the registration number TK1872, so the car does not exists.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<String> reg=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
		    reg.add(in.next());
		}
        int max=in.nextInt();
        int query=in.nextInt();
        for(int i=0;i<query;i++)
        {
            int option=in.nextInt();
            String carnum=in.next();
            if(option==1)
            {
                if(reg.size()==max)
                {
                    System.out.println("No space for parking");
                }
                else if(reg.size()<max)
                {
                    reg.add(carnum);
                    System.out.println("Car parked at position: "+reg.size());
                }
            }
            else if(option==2)
            {
                if(reg.indexOf(carnum)>=0)
                {
                    System.out.println("Car position: "+(reg.indexOf(carnum)+1));
                }
                else
                {
                    System.out.println("Car does not exists");
                }
            }
            else
            {
                System.out.println("Invalid");
            }

        }

	}
}
