package ro.ase.csie.cts.g1092.lab6.dp.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// PROTOTYPE
		
		Tree3DModel tree1 = new Tree3DModel("Green", 200);
		// Tree3DModel tree2 = new Tree3DModel("Red", 150);
		// Tree3DModel tree3 = new Tree3DModel("Green", 200);

		// shallow copy: it is not a new object, just a reference pointing to tree1
		Tree3DModel tree4 = tree1;
				
		// deep copy
		Tree3DModel tree5 = (Tree3DModel) tree1.clone();
		Tree3DModel tree6 = (Tree3DModel) tree1.clone();
		Tree3DModel tree7 = (Tree3DModel) tree1.clone();

		System.out.println("The end");	

	}

}
