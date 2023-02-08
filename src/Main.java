import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String soz = scan.nextLine();


        Regions regions = Regions.valueOf(soz.toUpperCase());


        switch (regions) {
            case YSSYK_KOL -> System.out.println("Yssyk-kol");
            case OSH -> System.out.println("Sulaiman-too");
            case JALAL_ABAD -> System.out.println("Arslanbab");
            case CHUI -> System.out.println("Borbor");
            case BATKEN -> System.out.println("Aigul gul");

            case NARYN -> System.out.println("Naryn darya");
            case TALAS -> System.out.println("Manastyn kumbozu");

        }
    }
}
