/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thanhtuanwriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class ThanhtuanWriter { 
    public static void main(String[] args) {
        String s = "test.txt";
        Writer(s);       
        Reader(s);
        
    }
    public static void Cau3(String fileName)
    {
        try
        {
            File NumText = new File()
        }
    }
    public static void Writer(String fileName)
    {
        try
        {
            File f = new File(fileName);
            FileWriter fw = new FileWriter(f);
            
            fw.write("Dieu Huong la con cho ");
            fw.close();
        }catch(IOException e)
        {
            System.out.println("du lieu ko dc nhap vao" + e);
        }
    }
    public static void Reader(String fileName)
    {
        fileName = "test.txt";
        try
        {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            while((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
            fr.close();
            br.close();
        }
        catch(IOException e)
        {
           System.err.println("loi ko thuc hien duoc"+e.getMessage()); 
        }
    }
    
}
