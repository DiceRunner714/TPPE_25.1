package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    
    private String nome;
    private List<Biblioteca> filiais;

    public Empresa(String nome) {
        this.nome = nome;
        this.filiais = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Biblioteca> getFiliais() {
        return filiais;
    }

    public void adicionarBiblioteca(Biblioteca filial) {
        this.filiais.add(filial);
    }

    public void removerBiblioteca(int id) {
        Biblioteca biblioteca = null;

        for(Biblioteca filial : filiais) {
            if(filial.getId() == id){
                biblioteca = filial;
            }
        }

        if(biblioteca != null) {
            this.filiais.remove(biblioteca);
        } 

    }

    public Biblioteca buscarBiblioteca(int id){
        for(Biblioteca filial : filiais){
            if(filial.getId() == id){
                return filial;
            }
        }
        System.out.println("ERRO!!! Biblioteca NÃO encontrada.");
        return null;
    }

    public void atualizarBiblioteca(int id, String nome, String local){
        for(Biblioteca filial : filiais){
            if(filial.getId() == id){
                filial.setNome(nome);
                filial.setLocal(local);
            }
        }
    }

    public void listarBibliotecas() {
        if (filiais.isEmpty()) {
            System.out.println("ERRO!!! Nenhuma biblioteca cadastrada.");
        } else {
            System.out.println("=== Bibliotecas da Empresa ===");
            for (Biblioteca biblioteca : filiais) {
                System.out.println(biblioteca);
            }
        }
    }

}
