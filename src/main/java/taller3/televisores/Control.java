package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar (TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	public TV getTV () {
		return this.tv;
	}
	
	public void setTv (TV tv) {
		this.tv = tv;
	}
	
	
//se llaman los atributos de la clase TV: turnOn y turnOff, canalUp y canalDown, volumenUp y volumenDown y toca hacerles set
	
	public void turnOn() {
		this.tv.turnOn();
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}
	
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	public void volumenDown() {
		this.tv.volumenDown();
	}
	
	public void setCanal (int canal) {
		this.tv.setCanal(canal);
	}
	
	public void setVolumen (int volumen) {
		this.tv.setVolumen(volumen);
	}
	
}
