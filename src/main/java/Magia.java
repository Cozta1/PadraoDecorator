package main.java;

public class Magia extends PersonagemDecorator {

    public Magia(Personagem personagem) {
        super(personagem);
    }

    public float getBonusVida() {
        return 20.0f;
    }

    public String getNomeItem() {
        return "Magia";
    }
}
