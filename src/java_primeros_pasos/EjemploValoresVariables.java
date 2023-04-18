package java_primeros_pasos;

public class EjemploValoresVariables {

	public static void main(String[] args) {
		
		int numero1=5;
		int numero2=9;
		System.out.println("Valor numero1 es: "+numero1);		
		System.out.println("Valor numero2 es: "+numero2);
		
		numero2 = numero1;
		
		System.out.println("Nuevo valor numero2 es: "+numero2);
		
		numero1= 88;
		System.out.println("Nuevo valor numero1 es: "+numero1);
		System.out.println("numero2 sigue valiendo : "+numero2);

	}

}
