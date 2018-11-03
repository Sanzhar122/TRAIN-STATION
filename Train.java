import java.util.List;

public class Train extends Transport {
    private FuelType fuelType;
    private int speed;
    private List<Carriage> carriages;

    public void addCarriage(Carriage carriage){

        if (getMaxWeight() - (getWeight() + carriage.getWeight()) >= 0){
            carriages.add(carriage);
            setWeight(getWeight() + carriage.getWeight());
        } else {
            System.out.println("Can not add carriage. Overweight!");
        }
    }
}
