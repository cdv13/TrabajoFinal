package cinemar;

public class pelicula {

	private Integer id;
	private String nombre;
	private String director;
	private Integer duracion;
	private String genero;
	private String idioma;
	private sala sala;
	
	public pelicula () {
	}

	public pelicula(Integer id, String nombre, String director, Integer duracion, String genero, String idioma,
			cinemar.sala sala) {
		
		this.id = id;
		this.nombre = nombre;
		this.director = director;
		this.duracion = duracion;
		this.genero = genero;
		this.idioma = idioma;
		this.sala = sala;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public sala getSala() {
		return sala;
	}

	public void setSala(sala sala) {
		this.sala = sala;
	}
	
	
	
}
