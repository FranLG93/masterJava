package biblioteca.franluengo;

	/* 
	 * * @autor Francisco Luengo 
	 */

	public class libroDigital extends libro {
	    private String formato;
	    private int tamañoArchivo;
	    
	    //CONSTRUCTOR SUPER PARA QUE HEREDE DE LIBRO

	    public libroDigital(String titulo, String autor, String genero, int añoPublicacion, String formato, int tamañoArchivo) {
	        super(titulo, autor, genero, añoPublicacion);
	        this.formato = formato;
	        this.tamañoArchivo = tamañoArchivo;
	    }

	  //GETTERS AND SETTERS
	    
		public String getFormato() {
			return formato;
		}





		public void setFormato(String formato) {
			this.formato = formato;
		}





		public int getTamañoArchivo() {
			return tamañoArchivo;
		}





		public void setTamañoArchivo(int tamañoArchivo) {
			this.tamañoArchivo = tamañoArchivo;
		}



	 /*CREAMOS UN TOSTRING PARA IMPRIMIR 
	  * A LA HORA DE INSTANCIAR 
	  * NUESTRO OBJETO
	  */
		@Override
		public String toString() {
			return "libroDigital \n" + "Titulo = " + getTitulo()
					+ " Autor = " + getAutor() + " Genero = " + getGenero() + " AñoPublicacion = " 
					+ getAñoPublicacion();
		}
	}


