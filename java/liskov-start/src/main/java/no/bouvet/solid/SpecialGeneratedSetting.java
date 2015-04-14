package no.bouvet.solid;

public class SpecialGeneratedSetting implements Setting {

    @Override
    public String load() {
        return "Generated";
    }

    @Override
    public void save() {
        throw new UnsupportedOperationException("Generated properties are generated...");
    }

}
