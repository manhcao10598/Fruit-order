/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import entity.Fruit;
import java.util.ArrayList;

/**
 *
 * @author ManhNga
 */
public class FruitShop {
    
    public ArrayList<Fruit> _listFruit ;

    public FruitShop() {
        _listFruit = new ArrayList<>();
    }
    
    
    
    public void addFruit(Fruit f){
        
        //add fruit to list
        _listFruit.add(f);
        
    }
    
    
}
