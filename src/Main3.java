
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector2D vA = new Vector2D();
		Vector2D vB = new Vector2D(5.0, 7.0);
		Vector2D vC = new Vector2D(vB);
		vA.add(vB);
		vA.print();
		vA.sub(vC);
		vA.print();
		System.out.println(vB.length());
		vC.scale(1.5);
		vC.print();
		vC.normalized();
		System.out.println(vC.length());
		vC.scale(2);
		System.out.println(vA.dotProduct(vB));
		System.out.println(Vector2D.count);
	}

}
