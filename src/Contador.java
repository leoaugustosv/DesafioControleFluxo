import java.util.Scanner;

public class Contador{
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int firstNum = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int secondNum = sc.nextInt();

        try {
        

        imprimirNumeros(firstNum, secondNum);


    } catch (ParametrosInvalidosException e) {
        System.out.println("\n---ERRO: O primeiro número deve ser menor que o segundo!!!");
    }
    finally{
        sc.close();
    }

    }


    static void imprimirNumeros(int num1, int num2) throws ParametrosInvalidosException{
        if (num1 > num2) {
            throw new ParametrosInvalidosException(); 
        }
        else{

        int contador = num2 - num1;

        System.out.println("Primeiro número digitado: "+num1);
        System.out.println("Segundo número digitado: "+num2);
        System.out.println("Parâmetro: "+ contador +" ("+num2+"-"+num1+")");
        
        System.out.printf("\nIniciando impressão do parâmetro [%s] abaixo...........\n",contador);

        for (int i = 0; i < contador; i++) {
            System.out.println("Imprimindo o número "+(i+1));
        }
            System.out.println("\nFIM! :)");
        }
    }

}
