/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.de.tarefas.guilherme;

import java.util.Scanner;

/**
 *
 * @author Aluno19
 */
public class usuario {
    static String Nome;
      static String Email;
      static String Senha;
      
      
      static String pedirNome (){
        
       Scanner Scanner = new Scanner(System.in);
       
       System.out.print("pedir Nome = ");
       Nome = Scanner.nextLine();
          return Nome;   
      }
      static String pedirEmail(){
           Scanner Scanner = new Scanner(System.in);
       
       System.out.print("pedir Email = ");
       Email = Scanner.nextLine();
          
      return Email; 
      }
      static String pedirSenha(){
           Scanner Scanner = new Scanner(System.in);
       
       System.out.print("pedir Senha = ");
       Senha = Scanner.nextLine();
      return Senha;    
      }
      static void mostrarNome(){
          System.out.println("Nome = " + Nome);
      }
      static void mostrarEmail(){
          System.out.println("Email = " + Email);
      }
      static void mostrarSenha(){
          System.out.println("Senha = " + Senha);
      }
      
      
      
    
}
