package model;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    
    private String nome;
    private String local;
    private int id;
    private List<Item> itens;

    public Biblioteca(String nome, String local, int id) {
        this.nome = nome;
        this.local = local;
        this.id = id;
    }
    
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
        
    public String getLocal(){
        return local;
    }

    public void setLocal(String local){
        this.local = local;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public List<Item> getItens(){
        return this.itens;
    }

    public void addItens(Item item){
        this.itens.add(item);
    }

}