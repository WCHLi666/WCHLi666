class Triangle extends Shape{
	Triangle(){
		super(3);
	}
	
	public static void main(String[] args) {
		Shape sq = new Shape(4);
		Triangle tri = new Triangle();
		System.out.println(sq.numSides);
		System.out.println(tri.numSides);
	}
}