/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufccombate;

/**
 *
 * @author robso
 */
public class Lutador {
    //Atributos do Lutador
     private String nome;
     private String nacional;
     private int idade;
     private float altura;
     private float peso;
     private String categoria;
     private int vitorias;
     private int derrotas; 
     private int empates;
    private int vitoria;
     
     //Metodods publicos
     public void apresenta(){
         System.out.println("========================================================");
         System.out.println("CHEGOU A HORAAAAA! Apresentando o nosso participante...");
         System.out.println("Ele que vem diretamente d' " + this.getNacional());
         System.out.println("Trazendo consigo " + this.getVitorias() + " Vitorias, " + this.getDerrotas()
                 + " Derrotas " + this.getEmpates() + " empates ");
         System.out.println("Pesando " + this.getPeso());
         System.out.println("Recebam eleeeeeeeeeeee... " + this.getNome());
         System.out.println("=========================================================");
     }
     
     public void status(){
         System.out.println("==========================STATUS DOS LUTADOR================");
         System.out.println("NOME: " + this.getNome());
         System.out.println("CATEGORIA: " + this.getCategoria());
         System.out.println("Altur: " + this.getAltura());
         System.out.println("PESO: " + this.getPeso());
         System.out.println("VITORIAS: " + this.getVitorias());
         System.out.println("EMPATES: " + this.getEmpates());
         System.out.println("DERROTAS: " + this.getDerrotas());
         System.out.println("============================================================");
     }
     //Ao ganhar, perder ou empatar uma luta, devera ser adicionado + 1 ao placar do lutador.
     public void ganharLuta(){
         this.setVitorias(this.getVitorias() + 1);
     }
     
     public void  perderLuta(){
         this.setDerrotas(this.getDerrotas() + 1);
     }
     
     public void empatarLuta(){
         this.setEmpates(this.getEmpates() + 1);
     }
     
    //Constructor 
    public Lutador(String no, String na, int id, float al, float pe, int vi , int de, int em) {
        this.nome = no;
        this.nacional = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    //Metods especiais 
    public String getNome() {
        return nome;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacional() {
        return nacional;
    }

    public void setNacional(String nacional) {
        this.nacional = nacional;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public final void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "invalido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Medio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
