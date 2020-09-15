//default modifier
class Que49AccModi 
{
	void display() 
	{ 
		System.out.println("Hello World!"); 
	}
}

//private modifier
class A 
{ 
	private void display() 
	{ 
		System.out.println("Hello World."); 
	} 
} 
//private class can't be accessible outside the class 
class B 
{ 
	public static void main(String args[]) 
	{ 
		A obj = new A(); 

		obj.display();	// Giving error using private class 

	}
}
