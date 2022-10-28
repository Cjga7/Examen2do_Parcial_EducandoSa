import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Solicitud solicitud=new Solicitud("Cristian",13994274,25, Calendar.getInstance().getTime());
        System.out.println(solicitud);
        Bien bien=new Bien(3254,"mesa",2,400,10000,400000);
        System.out.println(bien);

    }
}
