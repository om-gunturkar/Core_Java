package P_multiThreading;

public class bus1 extends Thread{
    public static Bus bus;
    public String PassengerName;
    public int numofseats;

    public bus1(Bus bus,String PassengerName, int numofseats){
        this.bus=bus;
        this.PassengerName=PassengerName;
        this.numofseats=numofseats;
    }
    public void run(){
        bus.Bookseats(PassengerName,numofseats);

    }

    public static void main(String[] args) {
        Bus bus=new Bus();
        bus1 t1=new bus1(bus,"akanksha",1);
        bus1 t2=new bus1(bus,"rohit",1);
        t1.start();
        t2.start();
    }
}
