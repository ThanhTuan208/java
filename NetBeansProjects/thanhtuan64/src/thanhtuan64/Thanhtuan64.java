/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thanhtuan64;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class Thanhtuan64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String s = "test.txt";
       try
       {
         FileReader fr = new FileReader(s);
         
         BufferedReader br = new BufferedReader(fr);
         String line;
         while((line = br.readLine()) != null)
             System.out.println(line);
        
         br.close();
         fr.close();
     
       }
        catch (IOException ex)
       {
         System.out.println("loi ko xuat ra duoc data"+ex);
       }                
    }
    
}
