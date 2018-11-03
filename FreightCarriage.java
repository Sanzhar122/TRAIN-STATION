public class FreightCarriage extends Carriage{
    private FreightCarriageCategory freightCarriageCategory;

    public void loadCarriage(int weight) {
        if (getMaxWeight() - (getWeight() + weight) >= 0){
            setWeight(getWeight() + weight);
        } else {
            System.out.println("Can not load carriage. Overload!");
        }
    }
}
