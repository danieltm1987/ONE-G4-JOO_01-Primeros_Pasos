package java_primeros_pasos;

public class EjemploCondicionales {

	public static void main(String[] args) {
		System.out.println("¡¡ CONDICIONALES!!\n");
		
		int edad = 27;
		int cantidad = 1;
		if (edad >= 18) {
			System.out.println("Usted puede ingresar su edad es "+edad);
		}else {
			if (cantidad >=2) {
				System.out.println("Usted es menor de edad pero su ingreso esta permitido"
						+ "por estar acompañado");				
			}else {
				System.out.println("Usted no puede ingresar su edad es "+edad);
			}			
		}
		
		System.out.println("Fin..."); //Quinto Commit
	}
}
