/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import Business.FruitShop;
import com.sun.org.apache.bcel.internal.generic.FREM;
import entity.Fruit;
import java.util.Scanner;

/**
 *
 * @author ManhNga
 */
public class TestMain {

    static FruitShop fr = new FruitShop();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("id");
        String id = sc.nextLine();
        System.out.println("name fruit");
        String name = sc.nextLine();
        System.out.println("price");
        String price = sc.nextLine();
        System.out.println("quantity");
        String quantity = sc.nextLine();

        Fruit f = new Fruit(id, name, price, quantity);
        fr.addFruit(f);

        for (Fruit s : fr._listFruit) {
            System.out.println(s);
        }
    }
//comment 
}
