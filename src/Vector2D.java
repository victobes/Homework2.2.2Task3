import java.util.Locale;

public class Vector2D {
	public double vX;
	public double vY;
	public static int count = 0;
	public Vector2D() {
		vX = 1;
		vY = 1;
		count ++;
	}
	public Vector2D(double vX ,double vY) {
		this.vX = vX;
		this.vY = vY;
		count ++;
	}
	public Vector2D(Vector2D v) {
		this(v.getvX(), v.getvY());
		
	}
	
	
	public double getvX() {
		return vX;
	}
	public void setvX(double vX) {
		this.vX = vX;
	}
	public double getvY() {
		return vY;
	}
	public void setvY(double vY) {
		this.vY = vY;
	}
	
	public void add(Vector2D v) {
		 vX += v.vX;
		 vY += v.vY;
	}
	public void sub(Vector2D v) {
		 vX -= v.vX;
		 vY -= v.vY;
	}
	public void scale(double scaleFactor) {
		vX = scaleFactor*vX;
		vY = scaleFactor*vY;
	}
	public double length() {
		return (Math.sqrt(getvX()*getvX() + getvY()*getvY()));
	}
	public void normalized() {
		double inv = 1/length();
		vX *= inv;
		vY *= inv;
	}
	public double dotProduct(Vector2D v) {
		return vX * v.vX+ vY * v.vY;
	}
	public void print() {
		System.out.println("(" + String.format(Locale.US,"%.2f", vX) + ", " + String.format(Locale.US,"%.2f", vY) + ")");
	}
}
