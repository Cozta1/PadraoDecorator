package main.java;

import main.java.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonagemTest {

    private Personagem personagem;

    @Before
    public void setUp() {
        personagem = new PersonagemBase(100.0f);
    }


    @Test
    public void testPersonagemBaseVida() {
        Assert.assertEquals(100.0f, personagem.vidaTotal(), 0.0f);
    }

    @Test
    public void testPersonagemBaseNome() {
        Assert.assertEquals("Personagem", personagem.getNome());
    }


    @Test
    public void testArmaVida() {
        Personagem comArma = new Arma(personagem);
        Assert.assertEquals(150.0f, comArma.vidaTotal(), 0.0f);
    }

    @Test
    public void testArmaNome() {
        Personagem comArma = new Arma(personagem);
        Assert.assertEquals("Personagem/Arma", comArma.getNome());
    }


    @Test
    public void testArmaduraVida() {
        Personagem comArmadura = new Armadura(personagem);
        Assert.assertEquals(130.0f, comArmadura.vidaTotal(), 0.0f);
    }

    @Test
    public void testArmaduraNome() {
        Personagem comArmadura = new Armadura(personagem);
        Assert.assertEquals("Personagem/Armadura", comArmadura.getNome());
    }


    @Test
    public void testMagiaVida() {
        Personagem comMagia = new Magia(personagem);
        Assert.assertEquals(120.0f, comMagia.vidaTotal(), 0.0f);
    }

    @Test
    public void testMagiaNome() {
        Personagem comMagia = new Magia(personagem);
        Assert.assertEquals("Personagem/Magia", comMagia.getNome());
    }


    @Test
    public void testEscudoVida() {
        Personagem comEscudo = new Escudo(personagem);
        Assert.assertEquals(115.0f, comEscudo.vidaTotal(), 0.0f);
    }

    @Test
    public void testEscudoNome() {
        Personagem comEscudo = new Escudo(personagem);
        Assert.assertEquals("Personagem/Escudo", comEscudo.getNome());
    }


    @Test
    public void testArmaArmaduraVida() {
        Personagem comArmaArmadura = new Armadura(new Arma(personagem));
        Assert.assertEquals(180.0f, comArmaArmadura.vidaTotal(), 0.0f);
    }

    @Test
    public void testArmaArmaduraNome() {
        Personagem comArmaArmadura = new Armadura(new Arma(personagem));
        Assert.assertEquals("Personagem/Arma/Armadura", comArmaArmadura.getNome());
    }

    @Test
    public void testArmaMagiaVida() {
        Personagem comArmaMagia = new Magia(new Arma(personagem));
        Assert.assertEquals(170.0f, comArmaMagia.vidaTotal(), 0.0f);
    }

    @Test
    public void testArmaMagiaNome() {
        Personagem comArmaMagia = new Magia(new Arma(personagem));
        Assert.assertEquals("Personagem/Arma/Magia", comArmaMagia.getNome());
    }


    @Test
    public void testTodosItensVida() {
        Personagem completo = new Escudo(new Magia(new Armadura(new Arma(personagem))));
        Assert.assertEquals(215.0f, completo.vidaTotal(), 0.0f);
    }

    @Test
    public void testTodosItensNome() {
        Personagem completo = new Escudo(new Magia(new Armadura(new Arma(personagem))));
        Assert.assertEquals("Personagem/Arma/Armadura/Magia/Escudo", completo.getNome());
    }
}
