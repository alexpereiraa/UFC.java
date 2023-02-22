/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ufccombate;

/**
 *
 * @author robso
 */
public class UfcCombate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciando objeto
        Lutador l[] = new Lutador[7]; // Vetor 
        
        l[0] = new Lutador("Alex", "Pernambuco", 35, 1.80f, 82, 
                10, 2, 1);
        l[1] = new Lutador("Felipe", "Sao paulo", 30, 1.82f, 85,
                8, 2, 3);
        l[2] = new Lutador("Luciano", "Jaragua do sul", 32, 1.80f, 90,
                10, 1, 3);
        l[3] = new Lutador("Lucas", "Jaragua do sul", 25, 1.75f, 75, 
                12, 3, 4);
        l[4] = new Lutador("Cristian", "Otacilio Costa", 29, 1.78f, 78, 
                10, 0, 2);
        l[5] = new Lutador("Josiel", "Mafra", 45, 1.79f, 82,
                4, 10, 10);
        l[6] = new Lutador("Matheus", "Schroeder", 21, 1.80f, 79, 
                4, 01, 1);
        
        //Chamada da classe Luta
        Luta UFC = new Luta();
        UFC.marcarLuta(l[6], l[0]);
        UFC.lutar();
        l[0].status();
        l[6].status();
        
        
                
       
    }
    
}
