
package com.mycompany.harffrekansibulma;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HarfFrekansiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cumle giriniz :");
        String cumle = scanner.nextLine();
        cumle = cumle.toLowerCase();
        
        Map<Character,Integer> harfler = new TreeMap<>();
        
        for(int i = 0 ; i < cumle.length() ; i++ ) {
            char harf = cumle.charAt(i);
            
            
            if(harfler.containsKey(harf)){
                harfler.replace(harf, harfler.get(harf) + 1);
            }
            else{
                harfler.put(harf, 1);
            }
        }
        
        for (Map.Entry<Character, Integer> entry : harfler.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() + " tane geciyor");
        }
    }
}
