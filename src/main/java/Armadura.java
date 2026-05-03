package main.java;

public class Armadura extends PersonagemDecorator {

    public Armadura(Personagem personagem) {
        super(personagem);
    }

    public float getBonusVida() {
        return 30.0f;
    }

    public String getNomeItem() {
        return "Armadura";
    }
}
