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
        while(mvs > 10){
            System.out.println("maximum limit is 10, try again: ");
            mvs = sc.nextInt();
        }
    
    for(int i=0; i<mvs; i++){
        
        System.out.printf("-------------------------------------------------------------------------------\n");
        System.out.print("Enter details of movie "+(i+1)+": \n");
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        if(duplicateVerify(id, i)){
                i--;
                continue;
            }
        System.out.print("name: ");
        String name = sc.next();
        System.out.print("price: ");
        int price = sc.nextInt();
        System.out.print("duration: ");
        int duration = sc.nextInt();
        System.out.print("schedule: ");
        String schedule = sc.next();
        rp[i] = new reports();
        rp[i].movie(id, name, price, duration,schedule);
    }
        break;
        case 2:
            System.out.println("Enter ID of movie: ");
                int idin = sc.nextInt();

                for (int i = 0; i < mvs; i++) {
                    if (rp[i].id == idin) {
                        System.out.print("Movie name: "+rp[i].name);
                        System.out.print("\nNew movie price: ");
                        int price= sc.nextInt();
                        System.out.print("New movie duration: ");
                        int dur = sc.nextInt();
                        System.out.print("New movie schedule: ");
                        String Schd = sc.next();
                        rp[i].editmovie(idin,price,dur,Schd);
                        break;
                    }
                    else {
                        System.out.println("ID not found!");
                    }
                }
                
                
        break; 
        case 3:
        
        break; 
        case 4:
            System.out.printf(" %-10s | %-10s | %-10s | %-10s | %-10s ",
                    "ID","NAME","PRICE","DURATION","SCHEDULE");
            for(int i=0; i<mvs; i++){
            rp[i].viewreport();   
    }
        break; 
        case 5:
        
        break;
      }  
     
         System.out.printf("\n-------------------------------------------------------------------------------\n");          
         System.out.print("Do another option(yes/no)?: ");
            cont = sc.next();
        }while(cont.equals("yes") || cont.equals("YES"));
        
        
    
    }
    
      private boolean duplicateVerify(int Id, int index){
        for(int j = 0; j < index; j++){
            if(Id==rp[j].id){
                System.out.println("\nInput invalid, must not match an existing ID.");
                return true;
            } 
        }
        return false;
    } 
    
}
