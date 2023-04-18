package java_primeros_pasos;

public class EjemploCaracteres {
	public static void main(String[] args) {
		// Tipos de datos de cadena, alfanumericos o caracteres 
		System.out.println("\n Tipos de datos Caracteres \n");
		
		char caracter = 'a';
		System.out.println("Valor de la variable Caracter es: "+caracter);
		
		caracter = 65; //Toma el valor de la tabla ASCII
		System.out.println("Valor de la variable Caracter es: "+caracter);
		
		caracter = 65 +1;
		System.out.println("Valor de la variable Caracter es: "+caracter);
		
		caracter = 66+1;
		char segundoCaracter = (char) (caracter+1);
		System.out.println("Valor de la variable segundoCaracter es: "+segundoCaracter);
		
		String palabra = "Alura Cursos Online";
		System.out.println("Valor de la variable palabra es: "+palabra);
		
		palabra = palabra + " 2023";
		System.out.println("Valor de la variable palabra es: "+palabra);
	}

}
