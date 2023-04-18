package java_primeros_pasos;

public class EjemploCondicionalesII {

	public static void main(String[] args) {
		System.out.println("¡¡ CONDICIONALES II!!\n");
		
		int edad = 18;
		int cantidadPersonas = 2;
		
		//Usando || "OR"
		if (edad >= 18 ||cantidadPersonas >=2) {			
			System.out.println("Usted es menor de edad pero su ingreso esta permitido"
					+ " por estar acompañado");				
		}else {
			System.out.println("Usted no puede ingresar su edad es "+edad);						
		}
		
		// Usando && "AND"
		
		if (edad >= 18 && cantidadPersonas >=2) {			
			System.out.println("Ustedes 2 pueden ingresar");				
		}else {
			System.out.println("Ustedes no pueden ingresar");						
		}
		
		//Usando true; false; "Booleanos"
		
		boolean esPareja = true;
		
		if (edad >= 18 && esPareja) {			
			System.out.println("Ustedes 2 pueden ingresar");				
		}else {
			System.out.println("Ustedes no pueden ingresar");						
		}
		
		
		// Otra forma
		
		esPareja = cantidadPersonas >1;		
		System.out.println(cantidadPersonas>1);
		
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		if (puedeEntrar) {			
			System.out.println("Ustedes 2 pueden ingresar");				
		}else {
			System.out.println("Ustedes no pueden ingresar");						
		}
		
		
	}

}
