package main.java;

public class Arma extends PersonagemDecorator {

    public Arma(Personagem personagem) {
        super(personagem);
    }

    public float getBonusVida() {
        return 50.0f;
    }

    public String getNomeItem() {
        return "Arma";
    }
}
