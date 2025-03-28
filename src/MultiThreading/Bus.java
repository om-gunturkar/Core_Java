package MultiThreading;

public class Bus {
    int avaliable_seats=20;
    void Bookseats(String PassengerName,int numofseats){
        if(avaliable_seats>=numofseats)
        {
            System.out.println("Seat Booked Successfully "+PassengerName);
            avaliable_seats-=numofseats;
        }else{
            System.out.println("Sorry Seat is not avaliable");
        }
        System.out.println("Remaining Seats are "+avaliable_seats);
    }
}
