package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //Adicionar contato
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    //Exibir contato
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    //Pesquisar contato
    // public retornando um Set contato
    public Set<Contato> pesquisarPorNome(String nome) {
        //Cria um Set vazio para agrupar os nomes
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            //startsWith é um metodo que ganha utilizando string, todo contato que comeca com o nome Camila por exemplo
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    //Atualizar o número de telefone do contato específico
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111111);
        agendaContatos.adicionarContato("Camila DIO", 598765);
        agendaContatos.adicionarContato("Maria Silva", 1111111111);

        agendaContatos.exibirContatos();
//
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
//
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 555555555));

        agendaContatos.exibirContatos();
    }


}
