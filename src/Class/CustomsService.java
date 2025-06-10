package Class;

public class CustomsService {
    public static int calculateCustoms (int cost,int weight) {
        double tax = cost * 0.01 + weight * 100;
        return (int)(tax);
    }
}
