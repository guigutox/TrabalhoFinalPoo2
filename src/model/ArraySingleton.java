/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class ArraySingleton {
    
private ArrayList<Passagem> arrayList;

private static ArraySingleton instance;

private ArraySingleton(){
    arrayList = new ArrayList<Passagem>();
}

public static ArraySingleton getInstance(){
    if (instance == null){
        instance = new ArraySingleton();
    }
return instance;
}

public ArrayList<Passagem> getArrayList() {
   return arrayList;
}

    
}
