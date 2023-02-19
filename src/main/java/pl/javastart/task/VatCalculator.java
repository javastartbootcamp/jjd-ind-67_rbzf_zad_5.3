package pl.javastart.task;

public class VatCalculator {
    double vatCalculate(Product product) {
        double priceGross;
        switch (product.getCategory()) {
            case "ksiazki":
                priceGross = product.getNetPrice() * (1 + 0.05);
                break;
            case "kosmetyki", null, default:
                priceGross = product.getNetPrice() * (1 + 0.23);
                break;
        }

        return priceGross;
    }
}
