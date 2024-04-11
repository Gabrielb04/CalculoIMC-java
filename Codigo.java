import java.util.Scanner;
public class CalculadoraIMC {

	public static void main(String[] args) {


		  
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Calculadora de IMC");
		        System.out.println("Digite sua altura (em metros): ");
		        double altura = scanner.nextDouble();

		        System.out.println("Digite seu peso (em quilogramas): ");
		        double peso = scanner.nextDouble();

		       
		        double imc = calcularIMC(altura, peso);

		 
		        String interpretacao = interpretarIMC(imc);

		       
		        System.out.println("Seu IMC é: " + imc);
		        System.out.println("Interpretação: " + interpretacao);

		        scanner.close();
		    }

		  
		    public static double calcularIMC(double altura, double peso) {
		        return peso / (altura * altura);
		    }

		    public static String interpretarIMC(double imc) {
		        if (imc < 18.5) {
		            return "Abaixo do peso";
		        } else if (imc < 25) {
		            return "Peso normal";
		        } else if (imc < 30) {
		            return "Sobrepeso";
		        } else {
		            return "Obesidade";
		        }

	}

}
