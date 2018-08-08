package homework0808;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        funkcija(5, 5.99);
    }

    private static void funkcija(int kiekis, double kaina) {
        double suma;
        suma = kiekis * kaina;
        BigDecimal sumaSuPVM = new BigDecimal(suma + ((suma * 21) / 100));
        BigDecimal sumaBePVM = new BigDecimal(suma - ((suma * 21) / 100));
        BigDecimal prekesBePVM = new BigDecimal((suma - ((suma * 21) / 100)) / kiekis);
        BigDecimal sumaPVM = new BigDecimal((suma + ((suma * 21) / 100)) - (suma - ((suma * 21) / 100)));

        System.out.println("Vienos prekes kaina be pvm : " + prekesBePVM.setScale(2, RoundingMode.CEILING) + " eurai ");
        System.out.println("Prekiu kiekis : " + kiekis + " prekes ");
        System.out.println("Suma be PVM : " + sumaBePVM.setScale(2, RoundingMode.CEILING) + " eurai ");
        System.out.println("PVM suma : " + sumaPVM.setScale(2, RoundingMode.CEILING) + " eurai ");
        System.out.println("Suma su PVM : " + sumaSuPVM.setScale(2, RoundingMode.CEILING) + " eurai ");


    }
}
