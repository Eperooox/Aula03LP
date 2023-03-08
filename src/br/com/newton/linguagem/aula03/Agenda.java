package br.com.newton.linguagem.aula03;

import com.sun.org.apache.xerces.internal.parsers.XMLGrammarCachingConfiguration;

public class Agenda
{
    public static void main(String[] args)
    {
        // Criando um objeto "Telefone" usando um construtor sem parâmetro padrão
        Telefone telefone1 = new Telefone();
        Contato contato1 = new Contato();
        contato1.nome = "Rafaela";
        contato1.numero ="123456";

        telefone1.contato = contato1;

        System.out.println(telefone1.contato.nome + " " + telefone1.contato.numero);

        // o mesmo caso
        telefone1.marca = "Iphone";
        telefone1.cor = "Branco";

        Contato contato2 = new Contato();

        telefone1.contatoA = contato2;

        contato2.nome = "Jão";
        contato2.numero = "318989952";

        System.out.println(telefone1.contatoA.nome +", " + telefone1.contatoA.numero + ", " + telefone1.marca);

        // incluindo o método tocar
        telefone1.Tocar("Pagode");

    }
}
