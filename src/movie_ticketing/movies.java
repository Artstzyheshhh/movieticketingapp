package movie_ticketing;
import java.util.Scanner;

public class movies {
  Scanner sc = new Scanner(System.in);  
  reports[] rp = new reports[100];
  
    public void moviedetails(){
        String cont;
        int choice, mvs = 0;
        do{
            System.out.printf("-------------------------------------------------------------------------------\n");
            System.out.print("MOVIES\n");
            System.out.printf("-------------------------------------------------------------------------------\n");

            System.out.printf("1. add movie"+"\n2. edit movie"+"\n3. delete movie "+"\n4. view reports"+"\n5. exit");
            System.out.printf("\n-------------------------------------------------------------------------------\n");
            System.out.print("Enter choice : ");
            choice = sc.nextInt();
           
    while(choice> 5){ 
            System.out.println("try again : ");
            choice = sc.nextInt();
        }  
    switch (choice){   
        case 1:
        System.out.print("Enter no movies: ");
        mvs = sc.nextInt();
    
    for(int i=0; i<mvs; i++){
        
        System.out.printf("-------------------------------------------------------------------------------\n");
        System.out.print("Enter details of movie "+(i+1)+": \n");
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("name: ");
        String name = sc.next();
        System.out.print("price: ");
        int price = sc.nextInt();
        System.out.print("duration: ");
        int duration = sc.nextInt();
        rp[i] = new reports();
        rp[i].movie(id, name, price, duration);
    }
        break;
        case 2:
            System.out.println("Enter ID of movie: ");
                int idin = sc.nextInt();

                for (int i = 0; i < mvs; i++) {
                    if (rp[i].id == idin) {
                        System.out.print("New movie price: ");
                        int price= sc.nextInt();
                        
                        
                        break;
                    }
                }
        break; 
        case 3:
        
        break; 
        case 4:
            for(int i=0; i<mvs; i++){
            rp[i].viewreport();   
    }
        break; 
        case 5:
        
        break;
      }  
     
         System.out.printf("-------------------------------------------------------------------------------\n");          
         System.out.print("Do another option(yes/no)?: ");
            cont = sc.next();
        }while(cont.equals("yes") || cont.equals("YES"));
        
        
    
    }
    
    
    
}
