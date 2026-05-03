package test.java;

import main.java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void deveRetornarVidaTotalPersonagem() {
        Personagem personagem = new PersonagemBase(100.0f);

        assertEquals(100.0f, personagem.vidaTotal());
    }

    @Test
    void deveRetornarVidaTotalPersonagemComArma() {
        Personagem personagem = new Arma(new PersonagemBase(100.0f));

        assertEquals(150.0f, personagem.vidaTotal());
    }

    @Test
    void deveRetornarVidaTotalPersonagemComArmadura() {
        Personagem personagem = new Armadura(new PersonagemBase(100.0f));

        assertEquals(130.0f, personagem.vidaTotal());
    }

    @Test
    void deveRetornarVidaTotalPersonagemComMagia() {
        Personagem personagem = new Magia(new PersonagemBase(100.0f));

        assertEquals(120.0f, personagem.vidaTotal());
    }

    @Test
    void deveRetornarVidaTotalPersonagemComEscudo() {
        Personagem personagem = new Escudo(new PersonagemBase(100.0f));

        assertEquals(115.0f, personagem.vidaTotal());
    }

    @Test
    void deveRetornarVidaTotalPersonagemComArmaMaisArmadura() {
        Personagem personagem = new Armadura(new Arma(new PersonagemBase(100.0f)));

        assertEquals(180.0f, personagem.vidaTotal());
    }

    @Test
    void deveRetornarVidaTotalPersonagemComArmaMaisMagia() {
        Personagem personagem = new Magia(new Arma(new PersonagemBase(100.0f)));

        assertEquals(170.0f, personagem.vidaTotal());
    }

    @Test
    void deveRetornarVidaTotalPersonagemComArmaMaisArmaduraMaisMagiaMaisEscudo() {
        Personagem personagem = new Escudo(new Magia(new Armadura(new Arma(new PersonagemBase(100.0f)))));

        assertEquals(215.0f, personagem.vidaTotal());
    }

    @Test
    void deveRetornarNomePersonagem() {
        Personagem personagem = new PersonagemBase();

        assertEquals("Personagem", personagem.getNome());
    }

    @Test
    void deveRetornarNomePersonagemComArma() {
        Personagem personagem = new Arma(new PersonagemBase());

        assertEquals("Personagem/Arma", personagem.getNome());
    }

    @Test
    void deveRetornarNomePersonagemComArmadura() {
        Personagem personagem = new Armadura(new PersonagemBase());

        assertEquals("Personagem/Armadura", personagem.getNome());
    }

    @Test
    void deveRetornarNomePersonagemComMagia() {
        Personagem personagem = new Magia(new PersonagemBase());

        assertEquals("Personagem/Magia", personagem.getNome());
    }

    @Test
    void deveRetornarNomePersonagemComEscudo() {
        Personagem personagem = new Escudo(new PersonagemBase());

        assertEquals("Personagem/Escudo", personagem.getNome());
    }

    @Test
    void deveRetornarNomePersonagemComArmaMaisArmadura() {
        Personagem personagem = new Armadura(new Arma(new PersonagemBase()));

        assertEquals("Personagem/Arma/Armadura", personagem.getNome());
    }

    @Test
    void deveRetornarNomePersonagemComArmaMaisMagia() {
        Personagem personagem = new Magia(new Arma(new PersonagemBase()));

        assertEquals("Personagem/Arma/Magia", personagem.getNome());
    }

    @Test
    void deveRetornarNomePersonagemComArmaMaisArmaduraMaisMagiaMaisEscudo() {
        Personagem personagem = new Escudo(new Magia(new Armadura(new Arma(new PersonagemBase()))));

        assertEquals("Personagem/Arma/Armadura/Magia/Escudo", personagem.getNome());
    }

}
