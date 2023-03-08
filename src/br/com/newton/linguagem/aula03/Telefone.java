package br.com.newton.linguagem.aula03;

public class Telefone
{
    public String marca;
    public String cor;
    Contato contato;
    Contato contatoA;


    public void Tocar(String estiloMusical)
    {
        System.out.println("Tocando " + estiloMusical);
    }
}
