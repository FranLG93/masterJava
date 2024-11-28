package biblioteca.franluengo;

public class libroFisico extends libro {
    private int numeroPaginas;
    private String editorial;
    
    //CONSTRUCTOR SUPER PARA QUE HEREDE DE LIBRO

    public libroFisico(String titulo, String autor, String genero, int añoPublicacion, int numeroPaginas, String editorial) {
        super(titulo, autor, genero, añoPublicacion);
        this.numeroPaginas = numeroPaginas;
        this.editorial = editorial;
    }

    //GETTERS AND SETTERS

	public int getNumeroPaginas() {
		return numeroPaginas;
	}



	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}



	public String getEditorial() {
		return editorial;
	}



	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	/*CREAMOS UN TOSTRING PARA IMPRIMIR 
	  * A LA HORA DE INSTANCIAR 
	  * NUESTRO OBJETO
	  */

	@Override
	public String toString() {
		return "libroFisico\n " + "NumeroPaginas =  "
				+ getNumeroPaginas() + " Editoria = " + getEditorial() + " Titulo = " + getTitulo()
				+ " Autor = " + getAutor() + " Genero = " + getGenero() + " AñoPublicacion = " 
				+ getAñoPublicacion();
	}

	

}
