/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufccombate;

import java.util.Random;

/**
 *
 * @author robso
 */
public class Luta {
    //Atributos 
    private Lutador desafiado;  // tipo abstrato de dados
    private Lutador desafiante; // Desafiado e desafiante não são caracteres! nesse caso eles_ 
    private int round;          // são instancias da class Lutador.
    private boolean aprovada; 
    
   //Metodos 
   public void marcarLuta(Lutador l1, Lutador l2){ // Pasar os parametros Lutador l1, Lutador l2.
       if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
           this.aprovada = true;
           this.desafiante = l1;
           this.desafiado = l2;
       }else{
           this.aprovada = false;
           this.desafiado = null;
           this.desafiante = null;
       }
   } 
   
   // Metodo Luatar(); ao invocar esse metodo na classs principal, todo o bloco abaixo sera executado.
   public void lutar(){
       if(this.aprovada){
           System.out.println("######## DESAFIANTE ########");
           this.desafiante.apresenta();
            System.out.println("######## DESAFIADO ########");
           this.desafiado.apresenta();
           
           System.out.println("===================== RESULTADO =========================");
           Random aleatorio = new Random(); // Estrutura para chamar a biblioteca RANDOM
           int vencedor = aleatorio.nextInt(3); // O sistema vai gerar um numero aleatório entre 0,1,2.
           
          // Usar o SWITCH para mostar o resultado da luta em três situações hipotéticas.
          switch(vencedor){
              case 0 -> {
                  // empate
                  System.out.println("EMPATE!");
                  this.desafiado.empatarLuta();
                  this.desafiante.empatarLuta();
               }
               
              case 1 -> {
                  // desafiante vence
                  System.out.println("VITORIA DO DESAFIANTE: " + this.desafiante.getNome());
                  this.desafiante.ganharLuta();
                  this.desafiado.perderLuta();
               }
               
               case 2 -> {
                   // Desafiado vence
                   System.out.println("VITORIA DO DESAFIADO: " + this.desafiado.getNome());
                   this.desafiado.ganharLuta();
                   this.desafiante.perderLuta();
                   
               }
             
          }
          
       }else{
           System.out.println("A luta nao pode acontecer");
       }
   }
    
    //Metodos especiais 
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
