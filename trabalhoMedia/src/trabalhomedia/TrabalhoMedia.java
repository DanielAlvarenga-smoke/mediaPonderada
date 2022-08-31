
import java.util.Scanner;

class MediaPonderada {
    public static void main (String args[]){
            Scanner entrada = new Scanner(System.in);      
 
        float nota1, nota2, media;
         
         
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();
         
     
 
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();
         
         
 
        media = ((nota1*2) +(nota2*3)) /5;
 
        System.out.printf("A media do aluno e: %10.2f", media);
         
    }
}