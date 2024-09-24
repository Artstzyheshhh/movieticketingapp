package movie_ticketing;

import java.util.Scanner;

public class MOVIE_TICKETING {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     String cont;
     int choice;
     
     do{
            System.out.print("1. movie details"+"\n2. buy tickets"+"\n3. sales "+"\n4. report"+"\n5. exit");
            System.out.printf("\n-------------------------------------------------------------------------------\n");
            System.out.print("Enter choice : ");
            choice = sc.nextInt();
           
    while(choice> 5){ 
            System.out.println("try again : ");
            choice = sc.nextInt();
        }  
    switch (choice){   
        case 1:
            movies mv = new movies();
            mv.moviedetails();
        break;
        case 2:
        
        break; 
        case 3:
        
        break; 
        case 4:
            reports rp = new reports();
            rp.viewreport();
        break; 
        case 5:
        
        break;
      }  
     
       
            System.out.print("\nWant to continue(yes/no)?: ");
            cont = sc.next();
    }while(cont.equals("yes") || cont.equals("YES"));
     
   
       
    }
    
}
