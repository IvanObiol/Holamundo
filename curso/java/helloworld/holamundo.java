package curso.java.helloworld;

import org.joda.time.*;

public class holamundo{

/*	public static void main(String[] args){

		System.out.println("Hola mundo");
		if(args.length > 0){
			String nombre=args[0];
			System.out.println(nombre);
		}
		else{
			System.out.println("Anonimo");
		}

	}
	*/
	public static void main(String[] args){
		DateTime ahora = new DateTime(); //clase de joda.time
		DateTime ayer = ahora.plusDays(-1);

		Long t_ini = System.currentTimeMillis();
		String nombre = System.getProperty("NOMBRE");
		String path = System.getProperty("PATH");

		System.out.println("PATH = " + path);
		System.out.println("NOMBRE = " + nombre.toUpperCase());

		System.setProperty("NOMBRE","pepe");
		System.out.println("Nuevo nombre = " + System.getProperty("NOMBRE"));

		Long t_fin = System.currentTimeMillis();
		Long time = t_fin - t_ini;
		System.out.println("Tiempo ejecucion = " + time );

		java.sql.Date fecha = new java.sql.Date(t_fin);
		System.out.println("Fecha actual: " + fecha.toString());

		System.out.println("Fecha de ayer con joda.time: " + ayer);


	}
}