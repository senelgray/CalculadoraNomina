package ej_nomina;

import java.util.Scanner;


public class empleado_main {

public static void  main(String[]args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Ingrese el nombre del empleado: " );
		String emplnom = input.nextLine();
		
		System.out.println("Ingrese el puesto del empleado: ");
		String puesto= input.nextLine();
		
		SueldoBruto sueldonor = new SueldoBruto();
		
		System.out.println("Ingrese las horas trabajadas:"  );
		sueldonor.setjornada(input.nextDouble());
		
		System.out.println("Ingrese las horas ext trabajadas:"  );
		sueldonor.setextra(input.nextDouble());
		
		double nett= sueldonor.calcNeto();
		
		SueldoNeto sueldoneto = new SueldoNeto();
		sueldoneto.setdeducion(nett);

		System.out.println("El nombre del empleado es: "+emplnom);

		System.out.println("Tiene el puesto de: "+puesto);
	
		System.out.println("El sueldo bruto obtenido es de: "+sueldonor.calcNeto());

		System.out.println("El sueldo neto es de: "+sueldoneto.calcNeto());


	}
}