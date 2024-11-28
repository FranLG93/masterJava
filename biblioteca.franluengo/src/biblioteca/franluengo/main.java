package biblioteca.franluengo;

public class main {

	public static void main(String[] args) {
		
		/*CREAMOS UN OBJETO E 
		*INSTANCIAMOS LOS TIPOS 
		*DE LIBRO EN NUESTRO MAIN
		*/

		libroFisico libroFisico = new libroFisico("El Señor de los Anillos \n", "J.R.R. Tolkien\n", "Fantasía\n", 1954, 1000, "Editorial Planeta\n");
		
		//IMPRIMIMOS LOS DATOS 
		
		System.out.println(libroFisico);
		
		//SALTO DE LINEA ENTRE TIPOS DE LIBROS
		System.out.println("\n");

		libroDigital libroDigital = new libroDigital("El Alquimista \n", "Paulo Coelho \n", "Ficción \n", 1988, "EPUB \n", 500);
		System.out.println(libroDigital);

		
		// TODO Auto-generated method stub

	}

}
