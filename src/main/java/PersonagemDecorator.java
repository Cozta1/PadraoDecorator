package main.java;

public abstract class PersonagemDecorator implements Personagem {

    private Personagem personagem;

    public PersonagemDecorator(Personagem personagem) {
        this.personagem = personagem;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public abstract float getBonusVida();

    public float vidaTotal() {
        return this.personagem.vidaTotal() + this.getBonusVida();
    }

    public abstract String getNomeItem();

    public String getNome() {
        return this.personagem.getNome() + "/" + this.getNomeItem();
    }
}
