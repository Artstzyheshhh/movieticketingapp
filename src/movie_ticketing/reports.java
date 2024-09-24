package movie_ticketing;

public class reports {
 int id, price, duration;
 String name;
 public void movie(int mid ,String mname, int mprice, int mdura){
     this.id = mid;
     this.name = mname;
     this.price = mprice; 
     this.duration = mdura;
 }
 public void viewreport(){
     System.out.printf("\n %-10d | %-10s | %-10d | %-10d ",
             this.id,this.name,this.price, this.duration );
 
 }   
 public void editmovie(int eid){
     if(this.id == eid){
     
     }
 
 }
}
