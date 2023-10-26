import java.math.BigDecimal;

public class Task5 {
    public static void main(String[] args) {

        BigDecimal cost = new BigDecimal("9.99");
        BigDecimal rate = new BigDecimal("0.23");

        BigDecimal grossValue = cost.multiply(BigDecimal.ONE.add(rate));

        BigDecimal valueWithoutVAT = rate.multiply(new BigDecimal("10000"));

        System.out.println("Net Price: " + rate);
        System.out.println("VAT Rate: " + rate);
        System.out.println("Gross Value: " + grossValue);
        System.out.println("Total Value for 10,000 pieces (without VAT): " + valueWithoutVAT);
    }
}
