package br.com.newton.linguagem.aula03;

public class Telefone
{
    public String marca;
    public String marca2;
    public String cor;
    public String cor2;
    Contato contato;
    Contato contatoA;
    Contato contatoB;
    Contato contatoC;

    public void Tocar(String estiloMusical)
    {

        System.out.println("Tocando" + estiloMusical);

    }

    public void Ligar (Contato contato)
    {
        if (cor2.equals("Preto"))
        {
            if (contato.nome.equals("Juliana"))
                System.out.println("Ligando para Juliana");
        }
    }


}