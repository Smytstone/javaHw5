import ru.netology.services.JavaHw5.services.vacationCalcService;

public class Main {

    public static void main(String[] args) {
        vacationCalcService service = new vacationCalcService();
        System.out.println(service.vacationCalc(100_000, 60_000, 150_000));

    }

}
