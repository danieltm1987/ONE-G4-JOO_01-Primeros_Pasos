package java_primeros_pasos;

public class EjercicioMatriz {

	public static void main(String[] args) {
		System.out.println("Matriz Triangular 1\n");
		
		for (int fila = 0; fila <=10; fila++) {
			for (int columna = 0; columna <=10; columna++) {
				
				if (columna > fila) {
					break;					
				}				
				System.out.print("*");				
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("\nMatriz Triangular 2\n");
		
		for (int fila = 0; fila <=10; fila++) {
			for (int columna = 0; columna < fila; columna++) {			
				
				System.out.print("*");				
				System.out.print(" ");
			}
			System.out.println("Que paso");
		}

	}

}
