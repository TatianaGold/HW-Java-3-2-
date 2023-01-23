public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMass = 60;
        double height = 1.70;
        double bodyMassIndex = service.calculate(bodyMass, height);

        System.out.println("ИМТ = " + Math.round(bodyMassIndex));
    }
}