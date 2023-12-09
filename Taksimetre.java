import java.util.Scanner;

public class Taksimetre {
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int acilis = 20;
        int km;
        int perkm = 5;
        int mintutar = 70;
        
        System.out.println("Katedilen Mesafeyi Giriniz : ");
        km = scanner.nextInt();

        int tutar = km * perkm;

        if( tutar + acilis <= mintutar)
        {
            System.out.println("Ödemeniz Gereken Tutar : " + mintutar );
        }else{

            System.out.println("Ödemeniz Gereken Tutar : " + (tutar + acilis));
        }
    }
}
