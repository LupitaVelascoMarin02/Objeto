package cuatroObjeto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		String var = "palabra para prueba: ppp";
		
		int var1 = 4;
		
		double var2 = 4.4;
		
		long var3 = 444444;
		
		boolean var4 = true;
		
		char var5 = 'D';
		
		ArrayList<String> var6 = new ArrayList<String>();
		var6.add("Calvillo");
		var6.add("Ags");
		var6.add("Mx");
		var6.add(".");	
		
		List<Integer> var7 = new ArrayList<Integer>();
		var7.add(1);
		var7.add(2);
		var7.add(2);
		var7.add(0);
		var7.add(2);
		var7.add(0);
		
			
		
		
		
		System.out.print(var + " tu _ ");imprimirTObjeto(var);
		
		System.out.print(var1 + " tu _ ");imprimirTObjeto(var1);
		
		System.out.print(var2 + " tu _ ");imprimirTObjeto(var2);
		
		System.out.print(var3 + " tu _ ");imprimirTObjeto(var3);
		
		System.out.print(var6 + " tu _ ");imprimirTObjeto(var6);
		
		System.out.print(var7 + " tu _ ");imprimirTObjeto(var7);
		
		System.out.print(var4 + " tu _ ");imprimirTObjeto(var4);
		
		System.out.print(var5 + " tu _ ");imprimirTObjeto(var5);
		
		
	}
	public static void imprimirTObjeto(Object objeto) {
		
		if(objeto.getClass() == String.class){
		
		System.out.println("Eres una palabra");
		
		
	 	}else if(objeto.getClass() == Integer.class || objeto.getClass() == Long.class || objeto.getClass() == Short.class || objeto.getClass() == Double.class) {
			
			System.out.println("eres un numero");
			
	
			
		}else if(objeto.getClass() == List.class || objeto.getClass() == Arrays.class || objeto.getClass() == ArrayList.class ){
			
			System.out.println("eres una lista");
			
		}else {
			
			System.out.println("Eres de otro tipo");
			
		}
	}
}

