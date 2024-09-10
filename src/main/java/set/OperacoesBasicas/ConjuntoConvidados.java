package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //criação dos métodos

    //Metodo para adicionar o convidado
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    //Metodo para remover o convidado
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    //Metodo para contar a quantidade total de convidados
    public int contarConvidados() {
        return convidadoSet.size();
    }

    //Metodo para exibir os convidados do conjunto
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        //instanciou um novo objeto
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");


        conjuntoConvidados.adicionarConvidado("Convidado 1" , 1234);

        conjuntoConvidados.adicionarConvidado("Convidado 2" , 1235);

        conjuntoConvidados.adicionarConvidado("Convidado 3" , 1236);

        conjuntoConvidados.adicionarConvidado("Convidado 4" , 1237);


        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();



    }
}
