package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {

    private String name;
    private int weight;
    private String color;
    protected boolean memoryLoss;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    String status() {
        return name + ", weight: " + weight + ", color: " + color + ", short term memory loss: " + memoryLoss;
    }

    abstract void feed();

    public void addGram(int gram) {
        this.weight += gram;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }
}
