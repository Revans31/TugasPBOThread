/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class thread1 {
    class MyThread1 extends Thread {   public void run() {
    try {
      for (int i=0; i<10; i++) {
        System.out.println("Thread pertama: detik ke-" +
(i+1));         if (i != 9) {           sleep(1000);
        } else {
          System.out.println("Thread pertama selesai...\n");
        }
      }
    } catch (InterruptedException ie) {
      System.out.println(ie.getMessage());
    }
  }
}
class MyThread2 extends Thread {   public void run() {
    try {
      for (int i=0; i<5; i++) {
        System.out.println("Thread kedua: detik ke-" +
(i+1));
        if (i != 4) {           System.out.println();           sleep(1000);
        } else {
          System.out.println("Thread kedua selesai...\n");
        }
      }
    } catch (InterruptedException ie) {
      System.out.println(ie.getMessage());
    }
  }
}
class DemoMultipleThread {
  public static void main(String[] args) {

    MyThread1 t1 = new MyThread1();     t1.start();

    MyThread2 t2 = new MyThread2();     t2.start();
  }
}
}
