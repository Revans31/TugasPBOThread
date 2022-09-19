/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

/**
 *

 * @author USER
 */
import static java.lang.Thread.sleep;
    public class cobathread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread celana1 = new Thread(new Celana("Celana-1"));
        Thread celana2 = new Thread(new Celana("Celana-2"));
        celana1.start();
        celana2.start();
    }
}

class Celana implements Runnable {

    String nama;
// konstruktor
    public Celana(String id) {
        nama = id;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("Terinterupsi");
            }
            System.out.println("Thread " + nama + ":Posisi" + i);
        }
    }}