package main.java;

public class Escudo extends PersonagemDecorator {

    public Escudo(Personagem personagem) {
        super(personagem);
    }

    public float getBonusVida() {
        return 15.0f;
    }

    public String getNomeItem() {
        return "Escudo";
    }
}
