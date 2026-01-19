package com.banco.app;

public class CuentaCorriente {
	private double saldo;
	private double limite;
	public String nombre;
	protected String dni;
	private Banco banco;
	private String nombreBanco;
	
	public CuentaCorriente(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = 0;
		this.limite = -50;
	}
	
	public CuentaCorriente(String nombre, String dni, double saldo ) {
		this.saldo = saldo;
		this.limite = 0;
	}
	
	
	
	public boolean Sacar(double cantidad) {
		boolean sacado;
		if (saldo - cantidad >= limite) {
			saldo = (int) (saldo - cantidad);
			sacado = true;
		}else {
			System.out.println("");
			sacado = false;
		}
		return sacado;
	}
	
	public void Ingresar(double cantidad) {
		if(saldo < 1) {
			System.out.println("No puedes meter dinero en negativo");
		}else{
		saldo = (int) (saldo + cantidad);	
		}
	}
	
	public double getSaldo() {
		return getSaldo();
	}
	
	public String mostrarInformacion() {
		return "La cuenta es " + nombre + "con un DNi de " + dni + "con un  saldo " + saldo;
	}
	
	
}
