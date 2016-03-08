package cuadrado;

public class cuadrado {
	 public static void main(String[]args) {
		 int resultado;
		 char letra;
		 //se suma al numero de letras el valor de ascii
		 resultado = (int) (Math.random()*26+88);
		 letra = (char) resultado;
		 System.out.println("Letra: " + letra);

		}
	 
}

