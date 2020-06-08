import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Airline {
    private Plane[] planes;

    public Airline(Plane[] planes) {
        this.planes = planes;
    }

    @Override
    public String toString() {
        return "Airline:" + Arrays.toString(planes);
    }

    public void sortByFlightRange() {
        List<Plane> planeList = Arrays.asList(planes);
        planeList.sort(Comparator.comparing(Plane::getFlightRange));
        System.out.println("\nСортування літаків компанії за дальністю польоту:");
        System.out.println(planeList);
    }

    public void sumOfLoadCapacity(){
        int sum = 0;
        for (Plane plane : planes) {
            sum = sum + plane.getLoadCapacity();
        }
        System.out.println("\nЗагальна вантажопідйомність авіакомпанії:");
        System.out.println(sum);
    }

    public void sumOfRoominess(){
        int sum = 0;
        for (Plane plane : planes) {
            sum = sum + plane.getRoominess();
        }
        System.out.println("\nЗагальна місткість авіакомпанії:");
        System.out.println(sum);
    }

    public void fuel(){
        System.out.println("\nДіапазон споживання пального:");
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("Від:");
        int left = MyScanner.nextInt();
        System.out.println("До:");
        int right = MyScanner.nextInt();
        System.out.println("Літак у компанії, що відповідає заданому діапазону споживання пального:");
        for (Plane plane: planes) {
            if ((plane.getFuelConsumption() >= left) && (plane.getFuelConsumption() <= right)) {
                System.out.println(plane.getName());
            }
        }
    }
}
