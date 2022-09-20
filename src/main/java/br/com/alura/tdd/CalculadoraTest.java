package br.com.alura.tdd;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void somarDoisNumerosPositivos(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3,7);

        Assert.assertEquals(10, soma); // Verifica se o primeiro parametro corresponde ao segundo parametro que foi passado no método.

    }
}
