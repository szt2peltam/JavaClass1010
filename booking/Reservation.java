package booking;
import java.util.Random;
public class Reservation implements IReservation {

    public static void main(String[] args) {
        Reservation res = new Reservation();
        for (int i = 0; i < 8; i++) {
            
            System.out.println(res.BookingCode());
        }
    }

    @Override
    public String BookingCode() {

        return String.format("Booking# %8s for %3s", GenerateBookingCode(),GetRandomDay());

        
    }
    


    public static String GenerateBookingCode(){
        Random rand = new Random();
        String Chars ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        for (int i = 0; i < 8; i++) {
            int choice = rand.nextInt(2);
            if(choice == 0){
                int randIndex = rand.nextInt(Chars.length());
                result = result + Chars.charAt(randIndex);
            }else{
                result = result + rand.nextInt(10);
            }
        }

        return result;
    }

    public static String GetRandomDay(){
        Random rand = new Random();

        String[] Days = {"MON","TUE","WED","THU","FRI","SAT","SUN"};

        return Days[rand.nextInt(Days.length)];
    }
}
