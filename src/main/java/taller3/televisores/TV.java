package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		
		TV.numTV ++;		
	}
	
	public static int getNumTV () {
		return TV.numTV;
	}
	
	public static void setNumTV (int numTV) {
		TV.numTV = numTV;
	}
	
//marca
	public Marca getMarca() {
		return this.marca;
	}
	public void setMarca (Marca marca) {
		this.marca = marca;
	}
	
//precio ; malditas mayusculas
	public int getPrecio () {
		return this.precio;
		
	}
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	
	
	//Metodo para encendido o apagado de los TV
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	
	
	//Subir o bajar canales y volumen
	public void canalUp() {
		this.setCanal(this.canal + 1);
	}
	
	public void canalDown() {
		this.setCanal(this.canal -1);
	}
	
	public void volumenUp() {
		this.setVolumen(this.volumen +1);
	}
	
	public void volumenDown () {
		this.setVolumen(this.volumen -1);
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public void setCanal (int canal) {
		if (this.estado && canal>=1 && canal<=120)
			this.canal = canal;
	}
	
	public void setVolumen (int volumen) {
		if (this.estado && volumen>=1 && volumen<=7)
			this.volumen = volumen;
	}
	
	
//lo del control (preguntar en asesoria)
	public Control getControl () {
		return this.control;
	}
	
	public void setControl (Control control) {
		this.control = control;
	}
	
	
}
