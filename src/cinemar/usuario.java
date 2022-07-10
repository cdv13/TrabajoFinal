package cinemar;

import java.sql.Date;

public class usuario {
	private Integer id_us;
	private String nombre;
	private String apellido;
	private Integer dni;
	private Integer telefono;
	private String email;
	private domicilio id_dom;
	private String sexo;
	private Date fecha_nacimiento;
	private Rol id_rol;
	private String usuario;
	private String contraseña;
	
	public usuario () {
	}

	public usuario (Integer id_us,String nombre, String apellido, Integer dni, Integer telefono, String email,
			domicilio id_dom, String sexo, Date fecha_nacimiento, Rol id_rol, String usuario,
			String contraseña) {
		
		this.id_us = id_us;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
		this.id_dom = id_dom;
		this.sexo = sexo;
		this.fecha_nacimiento = fecha_nacimiento;
		this.id_rol = id_rol;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public usuario (String nombre, String apellido, Integer dni, Integer telefono, String email,
			domicilio id_dom, String sexo, Date fecha_nacimiento, Integer id_rol, String usuario,
			String contraseña) {
	}

	public usuario(String string, String string2, int i, int j, String string3, domicilio d, String string4, int k,
			int l, String string5, String string6) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "usuario [id_us=" + id_us + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", telefono=" + telefono + ", email=" + email + ", id_dom=" + id_dom + ", sexo=" + sexo
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", id_rol=" + id_rol + ", usuario=" + usuario
				+ ", contraseña=" + contraseña + "]";
	}

	public domicilio getId_dom() {
		return id_dom;
	}

	public void setId_dom(domicilio id_dom) {
		this.id_dom = id_dom;
	}

	public Rol getId_rol() {
		return id_rol;
	}

	public void setId_rol(Rol id_rol) {
		this.id_rol = id_rol;
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
