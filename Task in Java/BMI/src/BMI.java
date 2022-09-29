public class BMI {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double high = 170;
        double mass = 77;
        double result = service.calculate(mass, high);
        System.out.println(result);

    }
}
