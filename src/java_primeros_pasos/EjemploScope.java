package java_primeros_pasos;

public class EjemploScope {

	public static void main(String[] args) {
		System.out.println("¡¡ CONDICIONALES II!!\n");
		
		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja;
		
		if(cantidadPersonas >1) {
			esPareja = true;
		}else {
			esPareja = false;
		}
		
		
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		if (puedeEntrar) {			
			System.out.println("Ustedes 2 pueden ingresar");				
		}else {
			System.out.println("Ustedes no pueden ingresar");						
		}
		
		
	}

}
