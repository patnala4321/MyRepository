
package examples;


import java.lang.*;


class Box {
	
	private double width;
	private double heigth;
	private double depth;

	Box() {
		width = -1;
		heigth = -1;
		depth = -1;
	}

	Box(double len) {
		width = heigth = depth = len;
	}

	Box(double w, double h, double d) {
		width = w;
		heigth = h;
		depth = d;
	}

	Box(Box ob) {
		width = ob.width;
		heigth = ob.heigth;
		depth = ob.depth;
	}

	double volume() {
		return width * heigth * depth;
	}

}

class BoxWeight extends Box {

	double weight;

	public BoxWeight() {
		super();
		weight = -1;
	}

	BoxWeight(BoxWeight ob) {
		super(ob);
		weight = ob.weight;
	}

	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;

	}

	BoxWeight(double len, double m) {
		super(len);
		weight = m;
	}

}

public class SuperDemo {

	public static void main(String[] args) {

		BoxWeight mybox1 = new BoxWeight();
		BoxWeight mybox2 = new BoxWeight(10, 89);
		BoxWeight mybox3 = new BoxWeight(10.20, 15.5);
		BoxWeight mybox4 = new BoxWeight(10, 20, 15, 24.3);

		BoxWeight mybox5 = new BoxWeight(mybox1);

		double vol;
		vol = mybox1.volume();

		System.out.println("Volume of mybox1 is =" + vol);
		System.out.println("Weight of  mybox1 is =" + mybox1.weight);

		System.out.println();

		vol = mybox2.volume();

		System.out.println("Volume of mybox2 is =" + vol);
		System.out.println("Weight of  mybox2 is =" + mybox2.weight);

		System.out.println();

		vol = mybox3.volume();

		System.out.println("Volume of mybox3 is =" + vol);
		System.out.println("Weight of  mybox3 is =" + mybox3.weight);

		System.out.println();

		vol = mybox4.volume();

		System.out.println("Volume of mybox4 is =" + vol);
		System.out.println("Weight of  mybox4 is =" + mybox4.weight);

		System.out.println();

		vol = mybox5.volume();

		System.out.println("Volume of mybox5 is =" + vol);
		System.out.println("Weight of  mybox5 is =" + mybox5.weight);

		System.out.println();

	}

}
