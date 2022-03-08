package abstractEs1;

public abstract class Figura {
	
	private int area, h, volume;
	
	public void calcolaVolume(int area, int h) {
		volume = area*h;
	}
	
	public abstract void stampaVolume();
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	
	
}
