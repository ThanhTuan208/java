/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap.java;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nguyen Thanh Tuan
 */
public class BaitapJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in );
        int num = sc.nextInt();
        
// soChanLe(num); // bai3 
// heNhiPhan(num); // bai4a
// heBatPhan(num); //4b
//heThapLucPhan(num); //4c
//soNgauNhien(num); // bai5
// tuoiAmLich(num); // bai7
//ungDungTL(num); //bai8
    }
    // bai 3 
//    public static int soChanLe(int num)
//    {
//        int total =0;
//        if(num % 2 == 0 )
//        {
//            for(int i = 2; i <= num; i+=2)
//            {
//                 total += i;
//            }
//            System.out.println("tong so chan:  "+ total);
//        }
//        else
//        {
//            for(int i = 1; i <= num; i+=2)
//            {
//                 total += i;
//            }
//            System.out.println("tong so le:  "+ total);
//        }
//    
//        return total;
//    }
    // bai 4
//    public static void heNhiPhan(int num)
//    {
//         System.out.println("gia tri nhi phan cua "+ num+ " la:" );
//        System.out.println(Integer.toBinaryString(num));
//    }
   
//    public static void heBatPhan(int num)
//    {
//        String octal = Integer.toOctalString(num);
//          System.out.println("gia tri bat phan  cua "+ num+ " la:" );
//        System.out.println(octal);
//    }
//    public static void heThapLucPhan( int num)
//    {
//        System.out.println("gia tri thap luc phan cua "+ num+ " la:");
//        System.out.println(Integer.toHexString(num));
//    }
    //bai 5
//    public static int  soNgauNhien(int num)
//    {
//        //        Random rd = new Random();
////       System.out.println(rd.nextInt(5,25));
//        
//        int max = 20;
//        int min = 16;
//        int ranDom = (int) (Math.random() * (max - min +1) + min);
//        System.out.println(ranDom);
//      
//        return ranDom;             
//    }
    // bai 7
//    public static void tuoiAmLich(int num)
//    {
//        int namSinh= num;
//        System.out.println("ban sinh nam: "+ num);
//       int namHT = Calendar.getInstance().get(Calendar.YEAR);
//       int tuoi = namHT -  namSinh;
//       String[] Can ={"Giap", "At", "Binh", "Dinh", "Mau", "Ky," ,"Canh", "Tan", "Nham","Quy"};
//       String[] Chi = {"Ty", "Suu", "Dan", "Mao", "Thin", "Ty"," Ngo"," Mui", "Than", "Dau", "Tuat" ,"Hoi"};
//       
//       int indexCan = (namSinh -1864) % 10;
//       int indexChi = (namSinh - 1864) % 12;
//       
//       String CanChi = Can[indexCan] + ""+Chi[indexChi];
//       System.out.println("nam nay ban "+ tuoi+"\nban tuoi " + CanChi);
//       
//    }
    // bai 8 
//    public static void ungDungTL(int num)
//    {
//        int  num1, num2;
//        Scanner sc = new Scanner(System.in );     
//        System.out.print("num 1 = ");
//        num1 = sc.nextInt();
//        System.out.print("num 2 = ");
//        num2 = sc.nextInt();
//        int total = num1 + num2;      
//                
//       int temp = sc.nextInt();
//        if(total <= num) // num <= 10
//        {
//            System.out.println(total +"<="+ num);            
//           switch(temp)
//           {
//               case 1:System.out.println("Verry good"); break;
//               case 2: System.out.println("Excellent"); break;
//               case 3: System.out.println("Nice work");break;
//               case 4: System.out.println("Keep up the good work"); break;
//           }
//        }
//        else 
//        {
//             System.out.println(total +">="+ num);            
//           switch(temp)
//           {
//               case 1:System.out.println("No, please try again"); break;
//               case 2: System.out.println("Wrong, try one more"); break;
//               case 3: System.out.println("don't give up");break;
//               case 4: System.out.println("Wrong, keep trying"); break;
//           }
//        }
//    public static int phanSo(int num)
//    {
//        
//    }
        
           
        
//    }
}
