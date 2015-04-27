package no.bouvet.solid.lsp;

import java.util.Arrays;
import java.util.List;

public class BirdService {

    private List<Bird> allBirds() {
        return Arrays.asList(new Duck(), new Penguin(), new Crow());
    }

    public void feedThemAll() {
        allBirds().forEach(bird -> bird.eat());
    }

    public void letThemGo() {
        for (Bird bird : allBirds()) {
            if (bird instanceof Penguin) {
                return;
            }
            bird.fly();
        }
    }
}
