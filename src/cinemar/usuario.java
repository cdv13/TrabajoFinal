package cinemar;

import java.sql.Date;

public class usuario {
	private Integer id_us;
	private String nombre;
	private String apellido;
	private Integer dni;
	private Integer telefono;
	private String email;
	private domicilio domicilio;
	private String sexo;
	private Date fecha_nacimiento;
	private Rol rol;
	private String usuario;
	private String contraseña;
	
	public usuario () {
	}

	public usuario(Integer id_us, String nombre, String apellido, Integer dni, Integer telefono, String email,
			cinemar.domicilio domicilio, String sexo, Date fecha_nacimiento, Rol rol, String usuario,
			String contraseña) {
		
		this.id_us = id_us;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
		this.domicilio = domicilio;
		this.sexo = sexo;
		this.fecha_nacimiento = fecha_nacimiento;
		this.rol = rol;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public Integer getId_us() {
		return id_us;
	}

	public void setId_us(Integer id_us) {
		this.id_us = id_us;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
}
