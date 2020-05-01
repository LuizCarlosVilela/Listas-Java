/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadelistas;

import java.util.ArrayList;
import java.util.Scanner;


public class AtividadeListas {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       ArrayList lista1 = new ArrayList();
       ArrayList lista2 = new ArrayList();
       ArrayList lista3 = new ArrayList();
       ArrayList lista4 = new ArrayList();
       System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
       System.out.println("Seja bem vind@ a lista\n");
       System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
       while(true){
           System.out.println("1 - Criar uma lista L1. \n2 - Inserir um elemento na lista L1. \n3 - Remover elemento da lista L1. \n4 - Mostrar lista L1. \n5 - Verificar se um númer está na lista L1. \n6 - Copiar uma lista L1 para uma lista L2. \n7 - Criar uma lista L3 contendo 10 números pares. \n8 - Criar uma lista L4 contendo 10 números ímpares. \n9 - Concatenar uma lista L1 com uma lista L2. \n10 - Intercalar L4 e L3. \n11 - Encerra o programa!");
           int op = teclado.nextInt();
           
           if (op == 1){
               System.out.println("\nLista L1 foi criada com sucesso!\n");
           }
           
           if (op == 2){
               System.out.println("\nDigite o número que gostaria de colocar na lista(L1)!");
               int n1 = teclado.nextInt();
               lista1.add(n1);
               System.out.println("Item colocado na lista!\n");
           }
           if (op == 3){
               System.out.println("\nDigite o número que gostaria de remover da lista(L1)!");
               Object n1 = teclado.nextInt();
               lista1.remove(n1);
               System.out.println("Item removido!\n");
           }
           if (op == 4){
               System.out.println("\nA lista L1 tem: "+lista1+"\n");
           }
           if (op == 5){
               System.out.println("\nDigite o número que gostaria de ver se está na lista(L1)!");
               int n1 = teclado.nextInt();
               if (lista1.contains(n1) == true){
                   System.out.println("\nO número digitado está na lista!\n");
               }
               else{
                   System.out.println("\nO número digitado não está na lista!\n");
               }
           }
           if (op == 6){
               lista2 = (ArrayList) lista1.clone();
               System.out.println("\nVocê copiou a lista L1 para a L2!\n");
           }
           if (op == 7){
               for (int n  = 1; n <= 20; n++){
                   if(n%2 == 0){
                       lista3.add(n);
                   }
               }
               System.out.println("\nLista3: "+lista3+"\n");
           }
          if (op == 8){
              for (int n = 1; n <= 20; n++){
                  if (n%2 != 0){
                      lista4.add(n);
                  }
              }
              System.out.println("\nLista4: "+lista4+"\n");
          }
          if (op == 9){
              lista2.addAll(lista1);
              System.out.println("\nA concatenização da lista L1 mais L2, é igual ha: "+ lista2+"\n");
          }
          if (op == 10){
              ArrayList lista = new ArrayList();
              for (int n  = 0; n < 10; n++){
                  lista.add(lista4.get(n));
                  lista.add(lista3.get(n));
              }
              System.out.println("\n"+lista+"\n");
          }
          if(op == 11){
              System.out.println("\nPrograma encerrado!");
              break;
          }
       }
    }
    
}
