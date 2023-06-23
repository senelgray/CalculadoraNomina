package ej_nomina;

public class SueldoNeto {

			
			private double deducion;
			
			public SueldoNeto() {
			}
			
			public void setdeducion(double deducion){
				this.deducion = deducion;
			}
			
			
			public double calcNeto() {
				if(deducion <= 2000) {
					return deducion *0.16;
			}else {
				return deducion*0.18;
			}
		
		}
}