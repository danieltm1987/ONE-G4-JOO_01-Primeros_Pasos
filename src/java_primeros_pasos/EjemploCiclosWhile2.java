package java_primeros_pasos;

public class EjemploCiclosWhile2 {

	public static void main(String[] args) {
		System.out.println("¡¡CICLOS WHILE 2!!\n");
		
		int contador = 0;
		int total = 0;
		
		while(contador <=10) {
			
			total = total+contador;
			
			contador++;			
		}
		
		System.out.println(total);
		
	}

}
