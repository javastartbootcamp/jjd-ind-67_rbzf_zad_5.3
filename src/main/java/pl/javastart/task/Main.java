package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Wesola matematyka", "Podrecznik do matematyki, klasa III", 32.5, "ksiazki");
        Product product2 = new Product("Miraculum", "Krem na dzien", 12, "kosmetyki");
        Product product3 = new Product("Pilka", "pilka plazowa", 9.5, "zabawki");
        Product product4 = new Product("Zeszyt", "zeszyt A4 w kratke 60 kartowy", 4);

        VatCalculator vatCalculator = new VatCalculator();
        String format = "%s, cenna netto = %.2f, cena brutto = %.2f";
        System.out.println(format.formatted(product1.getName(), product1.getNetPrice(), vatCalculator.vatCalculate(product1)));
        System.out.println(format.formatted(product2.getName(), product2.getNetPrice(), vatCalculator.vatCalculate(product2)));
        System.out.println(format.formatted(product3.getName(), product3.getNetPrice(), vatCalculator.vatCalculate(product3)));
        System.out.println(format.formatted(product4.getName(), product4.getNetPrice(), vatCalculator.vatCalculate(product4)));
    }
}



