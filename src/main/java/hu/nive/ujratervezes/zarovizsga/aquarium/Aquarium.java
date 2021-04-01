package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Fish> fishes = new ArrayList<>();

    public void  addFish(Fish fish) {
        fishes.add(fish);
    }

    public void feed() {
        for(Fish actualFish : fishes) {
            actualFish.feed();
        }
    }

    public void removeFish() {
        List<Fish> fishToRemove = new ArrayList<>();
        for (Fish actualFish : fishes) {
            if (actualFish.getWeight() >= 11) {
                fishToRemove.add(actualFish);
            }
        }
        fishes.removeAll(fishToRemove);
    }

    public List<String> getStatus() {
        List<String> fishStatus = new ArrayList<>();
        for(Fish actualFish : fishes) {
            fishStatus.add(actualFish.status());
        }
        return fishStatus;
    }

}
