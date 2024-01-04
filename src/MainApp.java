
/**
 * Plantilla para implementar los retos.
 * Todos los retos devuelven un valor numérico.
 * Cada método devuelve el resultado. Se han generado variables para utilizar los datos
 * de ejemplo que permitirán depurar el código. Una vez depurado, utilizar la variable
 * que contiene los datos propuestos para el reto.
 * 
 * Como todos los métodos son estáticos, si se precisan métodos auxiliares se deberán
 * declarar también como estáticos.
 * 04/01/2024 -- Retos 1,2 y 3 completos
 * @author root
 *
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainApp {

	public static final Data datos = new Data(); // Instanciamos la clase data para poder acceder a los datos
	public static void main(String[] args) {
		
		System.out.println("Reto 1, valor = " + reto1());
		System.out.println("Reto 2, valor = " + reto2());
		System.out.println("Reto 3, valor = " + reto3());
		//System.out.println("Reto 4, valor = " + reto4());
		
	} // main
	
	public static int reto1() {
		int resultado = 0;

		int[] r1e = datos.reto1y2Ejemplo; // Datos de ejemplo 
		int[] r1 = datos.reto1y2;		  // Datos para superar el reto
		int[] rdata;					 // Array a procesar
		// escribe el código aquí y transfiere el resutlado del mismo a
		// la variable resultado que lo retornará al método main
		int result = 0;
		int max_cal0 = 0;
		int max_cal1 = 0;
		int max_cal2 = 0;
		int elf_cal = 0;
		int count =0;
		int dato = 0;
		int index = 0; 			// índice para el array de datos
		
		rdata = r1;
		// Procesar calorías desde el principio del array
		do {
			result = rdata[index]; // Toma el siguiente valor
			if (result>=0)		   //  ¿Alimentos en saco?
			{
				dato = result;
				//System.out.println("elfo #" + count + " :"+ dato);
				elf_cal += dato;
			} // Calorías en saco
			else	// Fin del saco (result = -1)
			{
				if (elf_cal > max_cal0) max_cal0 = elf_cal;
				count ++;
				elf_cal = 0;
			}
			index ++;
		} while (index<rdata.length);

		
		resultado= max_cal0+max_cal1+max_cal2;
		
		return resultado;

	}
	
	
	public static int reto2() {
		int resultado = 0;

		int[] r2e = datos.reto1y2Ejemplo;// Datos de ejemplo 
		int[] r2 = datos.reto1y2;        // Datos para superar el reto
		int[] rdata;					 // Array a procesar
		// escribe el código aquí y transfiere el resutlado del mismo a
		// la variable resultado que lo retornará al método main
		int result = 0;
		int max_cal0 = 0;
		int max_cal1 = 0;
		int max_cal2 = 0;
		int elf_cal = 0;
		int count =0;
		int dato = 0;
		int index = 0; 			// índice para el array de datos
		
		rdata = r2;
		// Procesar calorías desde el principio del array
		do {
			result = rdata[index]; // Toma el siguiente valor
			if (result>=0)		   //  ¿Alimentos en saco?
			{
				dato = result;
				//System.out.println("elfo #" + count + " :"+ dato);
				elf_cal += dato;
			} // Calorías en saco
			else	// Fin del saco (result = -1)
			{
				//if (elf_cal > max_cal0) max_cal0 = elf_cal;
				if (elf_cal > max_cal0) {
					
					max_cal2 = max_cal1;	// desplazamiento en lista
					max_cal1 = max_cal0;
					max_cal0 = elf_cal;
					}
				else if (elf_cal > max_cal1) {
					
					max_cal2 = max_cal1;	// desplazamiento en lista
					max_cal1 = elf_cal;
					}
				else if (elf_cal > max_cal2) {
					
					max_cal2 = elf_cal;
					}
				
				count ++;
				elf_cal = 0;
			} // Fin del saco			
			index ++;
		} while (index<rdata.length);
		// parte 1 :return max_cal0;
		
		resultado= max_cal0+max_cal1+max_cal2;
//		System.out.println(" MAX1 " + max_cal0);
//		System.out.println(" MAX2 " + max_cal1);
//		System.out.println(" MAX3 " + max_cal2);
		return resultado;
	}
	
	public static int reto3() {
		int resultado = 0;
		
		String[] r3e = datos.reto3Ejemplo;// Datos de ejemplo 
		String[] r3 = datos.reto3;        // Datos para superar el reto
		
		String[] rdata;
		int suma=0;
		rdata = r3;
		int dato;
		System.out.println("<Datos a procesar> : " + rdata.length);
		for (int i=0;i<rdata.length;i++) {
			dato = Integer.parseInt(buscaNumeros(rdata[i]));
			if (i<10) System.out.println (dato);
			suma = suma+ dato;
		}
		
		resultado = suma;
		return resultado;
	}
	
	public static String buscaNumeros(String cadena) {
		
		String snum="";
			// Solución conocimientos 1eva
		
		for (int j=0;j<cadena.length();j++) {
			char c = cadena.charAt(j);
			if (Character.isDigit(c)) {
				snum=snum+c;
				break;
			}
		}
		
		for (int k=cadena.length()-1;k>=0;k--) {
			char c = cadena.charAt(k);
			if (Character.isDigit(c)) {
				snum=snum+c;
				break;
			}
			
		}
		
		return snum;
	}
	
	public static int reto4() {
		int resultado = 0;

		String[] r4e = datos.reto4Ejemplo;// Datos de ejemplo 
		String[] r4 = datos.reto4;        // Datos para superar el reto
		// escribe el código aquí y transfiere el resutlado del mismo a
		// la variable resultado que lo retornará al método main
		return resultado;
	}
} // MainApp
