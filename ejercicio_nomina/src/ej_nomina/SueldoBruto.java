package ej_nomina;

public class SueldoBruto {

		
		private double jornada;
		private double extra;
		
		public sueldonor () {
		}
		
		public void setjornada(double jornada){
			this.jornada = jornada;
		}
		public void setextra(double extra){
			this.extra = extra;
		}
		public double calcNeto() {
			return (jornada*72.87)+(extra*25.96) ;
		}
	
	}