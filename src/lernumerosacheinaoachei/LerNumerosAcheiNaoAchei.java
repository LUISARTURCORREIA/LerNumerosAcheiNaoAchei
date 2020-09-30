package lernumerosacheinaoachei;

import java.util.Scanner;

public class LerNumerosAcheiNaoAchei {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int pessoas = 5;
        String[] nomes = new String[pessoas];
       
       for(int i = 0; i < pessoas; i++){
           System.out.println("Informe um nome: ");
           nomes[i] = leia.next();
       if(i >= 4){
           System.out.println("Escreva o último nome: ");
           String buscaNome = leia.next();
       for(int j = 0; j < nomes.length; j++){
          while(true){
              if(buscaNome.equals(nomes[j])){
                  System.out.println("Achei"+nomes[j]);
                   break;
              }
              else{
              System.out.println("Não Achei...");
              break;
          }
          }
       }
       }
       
       }
    }
    
}
