package Practice1;

/*4. Static and NonStatic Block
a. Create a Class
b. Create two Static blocks
c. Create two NonStatic blocks
d. Create a main functions and call the NonStatic blocks*/

class StaticAndNonStatic_Blocks {
	
	static {
		System.out.println("Static Block 1");
	}
	
	static {
		System.out.println("Static Block 2");
	}
	
	{
		System.out.println("NonStatic Block 1");
	}
	
	{
		System.out.println("NonStatic Block 2");
	}

	public static void main(String[] args) {
		
		StaticAndNonStatic_Blocks obj1 = new StaticAndNonStatic_Blocks();
		
	}

}
