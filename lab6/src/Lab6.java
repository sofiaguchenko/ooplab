public class Lab6 {
    public static void main(String[] args) {
        Plane p1 = new Airliner( "Boeing747",16,370,12,12000);
        Plane p2 = new Airliner("AirbusA220",5,100,5,2000);
        Plane p3 = new Airfreighter("Cossack",250,80,15,16000);
        Plane p4 = new AirplanePremium("ChichesterMiles",2,4,3,240);

        Airline airline = new Airline(new Plane[]{p1, p2, p3, p4});
        System.out.println(airline);
        airline.sumOfRoominess();
        airline.sumOfLoadCapacity();
        airline.sortByFlightRange();
        airline.fuel();
    }
}
