public abstract class Transport {
    private int wheelsCount;
    private int weight;
    private int maxWeight;
    private int id;
    private int loadCapacity;

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
