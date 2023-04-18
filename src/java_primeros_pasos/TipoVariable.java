package java_primeros_pasos;

public class TipoVariable {

	public static void main(String[] args) {
		System.out.println("Hola mundo Tipo Variables");
		
		int edad = 28;		
		System.out.println("La edad es:"+edad);
		
		edad = 47;
		System.out.println("La edad es:"+edad);
		
		edad = 46+88;
		System.out.println("La edad es:"+edad);
		
		double salario = 1250.56;		
		System.out.println("El valor del salario es: "+salario);
		
		double salarioMitad = salario/2;
		System.out.println("La mitad del valor del salario es: "+salarioMitad);
		
		int division = 1250/2;
		System.out.println("El Resultado de la division almacenado en un entero es : "+division+", Se pierden los decimales");
		
		//Convertir datos  --Casteo ()
		
		System.out.println("\n CASTING \n");
		
		double variable1 = 230.89;
		int variable1Entero = (int) variable1; //Cast
		System.out.println("Valor antes del casteo es: "+ variable1);
		System.out.println("Resultado del casteo es: "+ variable1Entero);
		
		int resultado = (int) variable1 + variable1Entero;
		
		System.out.println("Resultado de otro casteo es: "+ resultado);
		
		//Tipo de datos Long
		
		System.out.println("\n Otros Tipos de Datos Numericos\n");
		
		long 	pruebaLong = 122222222222222222L;
		short 	numeorPequeno = 1355;
		byte 	numeroAunMaspequeno = 15;
		float 	numeroDecimalPequeno = 2.5F;
		
		System.out.println("Tipó dato LONG: "+pruebaLong);
		System.out.println("Tipó dato SHORT: "+numeorPequeno);
		System.out.println("Tipó dato BYTE: "+numeroAunMaspequeno);
		System.out.println("Tipó dato FLOAT: "+numeroDecimalPequeno);
		
		System.out.println("Fin"); //Aca esta Tercer COmmit
		

	}

}
