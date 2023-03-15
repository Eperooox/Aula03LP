package br.com.newton.linguagem.aula03;

import com.sun.org.apache.xerces.internal.parsers.XMLGrammarCachingConfiguration;

public class Agenda
{
    public static void main(String[] args)
    {
        // Criando um objeto "Telefone" usando um construtor sem parâmetro padrão
        Telefone telefone = new Telefone();

        Contato contato1 = new Contato();
        Contato contato2 = new Contato();
        Contato contato3 = new Contato();
        Contato contato4 = new Contato();

        contato1.nome = "Rafaela";
        contato1.numero = "123456";
        telefone.cor = "Vermelho";
        telefone.cor2 = "Preto";
        contato2.nome = "João";
        contato2.numero = "318989952";
        contato3.nome = "Carmen";
        contato3.numero = "3189871147";
        contato4.nome = "Juliana";

        telefone.marca = "Iphone";
        telefone.marca2 = "S20";

        telefone.contato = contato1;
        telefone.contatoA = contato2;
        telefone.contatoB = contato3;
        telefone.contatoC = contato4;

        telefone.Tocar(" Pagode");


        System.out.println(telefone.contato.nome);
        System.out.println(telefone.contatoA.nome + ", " + telefone.marca + ", " + telefone.contatoA.numero);
        System.out.println(telefone.contatoB.nome + ", " + telefone.marca2 + ", " + telefone.contatoB.numero);
