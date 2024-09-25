package movie_ticketing;

public class reports {
 int id, price, duration;
 String name, schedule;
 public void movie(int mid ,String mname, int mprice, int mdura, String sched){
     this.id = mid;
     this.name = mname;
     this.price = mprice; 
     this.duration = mdura;
     this.schedule = sched;
 }
 public void viewreport(){
     System.out.printf("\n %-10d | %-10s | %-10d | %-10d | %-10s ",
             this.id,this.name,this.price, this.duration,this.schedule );
 
 }   
 public void editmovie(int eid, int prc, int Dura,String Sched){
     if(this.id == eid){
         this.price = prc;
         this.duration = Dura;
         this.schedule = Sched;
     }
 
 }
}
