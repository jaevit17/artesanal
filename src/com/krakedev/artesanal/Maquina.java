package com.krakedev.artesanal;

public class Maquina {
	//ATRIBUTOS
	private String nombreCerveza;
	private String descripcion;
	private double precioPorMl;
	private double capacidadMaxima;
	private double cantidadActual;
	private String codigo;
	//CONSTRUCTOR
	public Maquina(String nombreCerveza,String descripcion,String codigo,double precioPorMl,double capacidadMaxima) {
		this.nombreCerveza=nombreCerveza;
		this.descripcion=descripcion;
		this.codigo=codigo;
		this.precioPorMl=precioPorMl;
		this.capacidadMaxima=capacidadMaxima;
		this.cantidadActual=0;
	}
	public Maquina(String nombreCerveza,String descripcion,String codigo,double precioPorMl) {
		this.nombreCerveza=nombreCerveza;
		this.descripcion=descripcion;
		this.codigo=codigo;
		this.precioPorMl=precioPorMl;
		this.capacidadMaxima=10000;
		this.cantidadActual=0;
	}
	
	
	//GETTERS-SETTERS
	public String getNombre() {
		return nombreCerveza;
	}
	public void setNombre(String nombre) {
		this.nombreCerveza = nombre;
	}
	//--------------
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	//--------------
	public double getPrecioPorMl() {
		return precioPorMl;
	}
	public void setPrecioPorMl(double precioPorMl) {
		this.precioPorMl = precioPorMl;
	}
	//---------------
	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}
	//---------------
	public double getCantidadActual() {
		return cantidadActual;
	}
	//---------------
	public String getCodigo() {
		return codigo;
	}
	//METODOS
	public void imprimir() {
		String mensaje="Nombre de cerveza "+ nombreCerveza
				+ ", Descripcion: "+ descripcion
				+ ", Codigo: "+ codigo
				+ ", Precio por ml: "+ precioPorMl
				+ ", Capacidad Maxima: "+ capacidadMaxima
				+ ", Cantidad Actual: "+cantidadActual;
		System.out.println(mensaje);
	}
	public void llenarMaquina() {
		this.cantidadActual=this.capacidadMaxima-100;
	}
	public boolean recargarCerveza(double cantidad) {
		double limitePermitido=capacidadMaxima-100;
		if ((cantidadActual+cantidad)<limitePermitido) {
			cantidadActual+=cantidad;
			return true;
		}else {
			return false;
		}
	}
	public double servirCerveza(double cantidad) {
		if(cantidadActual>=cantidad) {
			cantidadActual-=cantidad;
			double valor=cantidad*precioPorMl;
			return valor; 
		}else {
			return 0;
		}
	}
}
