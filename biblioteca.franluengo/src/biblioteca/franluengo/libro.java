package biblioteca.franluengo;


/*CLASE PADRE
 * @autor Francisco Luengo 
 */


public class libro {
	 private String titulo;
	    private String autor;
	    private String genero;
	    private int añoPublicacion;
	    
	    //CONSTRUCTOR

	    public libro(String titulo, String autor, String genero, int añoPublicacion) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.genero = genero;
	        this.añoPublicacion = añoPublicacion;
	    }

	    //GETTERS AND SETTERS

		public String getTitulo() {
			return titulo;
		}



		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}



		public String getAutor() {
			return autor;
		}



		public void setAutor(String autor) {
			this.autor = autor;
		}



		public String getGenero() {
			return genero;
		}



		public void setGenero(String genero) {
			this.genero = genero;
		}



		public int getAñoPublicacion() {
			return añoPublicacion;
		}



		public void setAñoPublicacion(int añoPublicacion) {
			this.añoPublicacion = añoPublicacion;
		}

		
	
}
