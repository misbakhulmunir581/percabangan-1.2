/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

/**
 *
 * @author HP
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("======== if ========");
        int a = 34;
        int b = 22;
        if (a > b)
            System.out.println("a lebih besar dari pada b");
        
        
        
        System.out.println("======== if else ========");
        int number = 23;
        if (number < 13){
            System.out.println("goog morning");
        }else {
            System.out.println("goog night");
            
        System.out.println("======== if else season 2 ========");
        int i = 3;
        if (i == 2){
            System.out.println("close");
        } else {
            System.out.println("open");
        }
            
            
            
            
        System.out.println("======== else if ========");
        int x = 2;
        if(x==2){
            System.out.println("nilai x = 100");
        }else if (x==3){
            System.out.println("nilai x = 90");
        }else if (x==4){
            System.out.println("nilai x = 80");
        }else{
            System.out.println("nilai x tidak diketahui");
        }
        
        
        
        System.out.println("======== switch-case ========");
        int time = 1;
        switch (time){
        case 1:
            System.out.println("good morning");
            break;
        case 2:
            System.out.println("good evening");
            break;
        case 3:
            System.out.println("good night");
            break;
        default :
            System.out.println("goof bye");
        }
            
        }
    }
    
}
