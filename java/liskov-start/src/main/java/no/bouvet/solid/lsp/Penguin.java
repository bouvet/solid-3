package no.bouvet.solid.lsp;

public class Penguin implements Bird {

    @Override
    public void eat() {
        // eating
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Nope!");

    }
}
