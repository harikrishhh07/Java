public class  kiloconversion{
    public static void main(String[] args) {
        float kilometers = 10.8;
        float conversionFactor = 1.6;
        float miles = kilometers / conversionFactor;
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}