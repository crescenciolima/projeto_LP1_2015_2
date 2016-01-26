/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholp1;

/**
 *
 * @author Bruno
 */
public class Main {

    public static void main(String[] args) {
       VooAbstrata c1 = new Voo ("243");
       
       System.out.println("Passageiros do Voo: " + c1.getNumeroV());
       c1.getPassageiros();
       System.out.println("Horario de partida: " + c1.getPartida());
       System.out.println("Horario de chegada: " + c1.getChegada());
    }
}
