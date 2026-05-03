package main.java;

public class PersonagemBase implements Personagem {

    public float vida;

    public PersonagemBase() {
    }

    public PersonagemBase(float vida) {
        this.vida = vida;
    }

    public float vidaTotal() {
        return vida;
    }

    public String getNome() {
        return "Personagem";
    }
}
