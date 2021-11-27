/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.javaloops;

import java.util.Scanner;

/**
 *
 * @author cubesofficemacair
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        
        //IF PETLJA
        
            // 0-2 beba
            // 3-10 dete
            // 12-17 tinejdžer
            // 18+ odrasla
  //        System.out.println("Loops");

  //        int age = 22;
  //        
  //        if (age >= 18) {
  //            System.out.println("Punoletan je");
  //        }else {
  //            System.out.println("Nije punoletan");
  //        }
//        

//        
        //IF ELSE
         
//        System.out.println("Koliko imate godina?");
         
//        Scanner in = new Scanner(System.in);
//        int age2 = in.nextInt();
//        
//        System.out.println("Uneli ste broj: " + age2);
        
//        if (age2 <= 2 && age2 >= 0) {
//        System.out.println("Ti si beba");
//        } else if(age2 <= 10 && age2 >= 3) {
//        System.out.println("Ti si dete");
//        } else if(age2 <= 17 && age2 >= 12) {
//        System.out.println("Ti si tinejdžer");

//        } else if( age2 >= 18) {
//        System.out.println("Ti si odrasla osoba");
//        } else {
//        System.out.println("Nije validan broj.");
//        }

//        if (age2 <= 2 && age2 >= 0) {
//            System.out.println("Ti si beba");
//           } else if(age2 <= 10) {
//            System.out.println("Ti si dete");
//           } else if(age2 <= 17) {
//            System.out.println("Ti si tinejdžer");
//            } else if( age2 >= 18) {
//           System.out.println("Ti si odrasla osoba");
//            } else {
//           System.out.println("Nije validan broj.");
//            }
//        
//         System.out.println("_________________________________________________");
//         System.out.print("Unesite redni broj dana u nedelji (1 - 7)");
//         Scanner in2 = new Scanner(System.in);
//         int dayNumber = in2.nextInt();
//        
////       System.out.println("Uneli ste broj" + dayNumber);

        //SWITCH

    //         String day = "";
    //        
    //         switch (dayNumber) {
    //             case 1:
    //                day = "Ponedeljak";
    //                break;
    //             case 2:
    //                day = "Utorak";
    //                break;
    //             case 3:
    //                day = "Sreda";
    //                break;
    //             case 4:
    //                day = "Četvrtak";
    //                break;
    //             case 5:
    //                day = "Petak";
    //                break;
    //             case 6:
    //                day = "Subota";
    //                break;
    //             case 7:
    //                day = "Nedelja";
    //                break;
    //             default:
    //                day = "nepoznato";
    //                break;
    //                
    //        }
//        
//          System.out.println("Dan je" + day);

//        SWITCH VARIJANTA 2    
            int number;
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Unesite redni broj meseca");
            
            number = scanner.nextInt();
            
            switch(number){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Mesec ima 31 dan.");
                    break;
                case 2:
                    System.out.println("Mesec ima 28/29 dana.");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Mesec ima 30 dana.");
                    break;
            }
            
        
        //WHILE LOOP
//        
//            System.out.print("While loop example");
//
//            int x = 5;
//            while (x < 10) {
//                System.out.println(x);
//                x = x + 1;
//            }
//
//            while (x > 0){
//                System.out.println(x);
//                x--;
//            }
//
//            while (x > 5) {
//                System.out.println(x);
//                x--;
//            }
//Objašnjenje:
// Prvi zahtev ispisuje 5,6,7,8,9
        
//Kombinacija prvog i drugog zahteva ispisuje:
//izvršava zahtev iz prve petlje (dodaje 1) i onda ulazi u drugu petlju
// i izvršava njene uslove, ispisujući: 10 (jer je poslednji ispis prethodnog zahteva 9 + 1) 
// 9, 8, 7, 6, 5, 4, 3, 2 i 1
        
//Kombinacija prvog drugog i trećeg
//Ispisuje sve za prvu i drugu petlju: 5,6,7,8,9,10,9,8,7,6,5,4,3,2,1
// kako je x=1 na kraju, ceo proces započinje tim brojem, dodaje se 1 (1.zahtev), 
//pa se oduzima 1 (drugi zahtev), pa ponovo oduzima 1 (treći zahtev)
// sada je x = 0
// Kako uslov x>5 nije zadovoljen petlja se ne izvršava i ne ispisuje se ništa
        
        
        // DO WHILE
        
//        System.out.println("Do while loop example");
//        
//        int y = 45;
//        do {
//            System.out.println(y);
//            y = y + 2;
//        } while (y < 40);
        
// Objašnjenje: U odnosu na prethodnu while petlju, do - while će ispisati
// jedan uslov a nakon toga će ustanoviti da zahtev nije ispunjen i završava se
// Tako bi za prethodni primer, sa 3 uslova bio ispisan samo broj 0 
// izvršiće se samo jednom a zatim, ukoliko je zahtev zadovoljen
        
        
        // FOR PETLJA
        
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);            
//        }
//i = 0 je inicijalna vrednost
//i < 10 uslov
//i++ i+1 inkrementovanje

//            for (int i = 0; i < 10; i++) {
//                System.out.println("*");            
//            }
// ispisuje zvezdicu onoliko puta koliko se uslov izvršava

//            for (int i = 99; i > 90; i--) {
//                System.out.println("*");            
//            }
// i-- dekrementovanje

// Primer
//            for (int i = 1; i <= 10; i++) {
//                for (int j = 1; j <= 10; j++) {
//                    System.out.println(i + "," + j);   
//                }           
//            }


// Primer 2 ispisivanje koordinata  1,1 1,2 1,3 1,4 1,5
//                                  2,1 2,2 2,3 2,4 2,5
//                                  3,1 3,2 3,3 3,4 3,5
//                                  4,1 4,2 4,3 4,4 4,5
//                                  5,1 5,2 5,3 5,4 5,5

//varijanta koja samo meni ne radi - ne znam gde je greška
//            for (int i = 1; i < 6; i++) {
//                for (int j = 1; j < 6; j++) {
//                    if (j < 6 )  {
//                        System.out.print(i + "," + j + " ");
//                    } else {
//                        System.out.println(i + "," + j);
//                    }
//                       
//                }           
//            }

//varijanta 2 - lepša i kraća
//            for (int i = 1; i < 6; i++) {
//                for (int j = 1; j < 6; j++) {
//                	System.out.print(i + "," + j + " ");       
//                } 
//                System.out.println();
//                
//            }

//Vezba 
//*
//**
//***
//****
//*****
//               for (int i = 0; i < 6; i++) {
//                    for (int j = 0; j < i; j++) {
//                        System.out.print("*");
//                    }
//                System.out.println("");
//                }
               




            
    }
    
}
