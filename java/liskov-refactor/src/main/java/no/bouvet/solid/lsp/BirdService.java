package no.bouvet.solid.lsp;

import java.util.List;

public class BirdService {

    public void feedThemAll(List<Bird> birds) {
        birds.forEach(bird -> bird.eat());
    }

    public void letThemGo(List<FlyingBird> flyingBirds) {
        flyingBirds.forEach(bird -> bird.fly());
    }
}
