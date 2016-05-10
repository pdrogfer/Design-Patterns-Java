import java.util.*;

abstract class Creator {
	abstract MyObject factoryMethod();
}

class SubCreator extends Creator {
	public MyObject factoryMethod() {
		return new MySubObject();	
	}	
}

class OtherSubCreator extends Creator {
	public MyObject factoryMethod() {
		return new MyOtherSubObject();
	}
}

interface MyObject {
	public void methodInObject();
}

class MySubObject implements MyObject {
	public void methodInObject() {
		System.out.println("inside method in sub-object");
	}
}

class MyOtherSubObject implements MyObject {
	public void methodInObject() {
		System.out.println("inside method in other-sub-object");
	}
}
public class Main {	
	public static void main(String args[]) {

		Creator creator;
		Creator otherCreator;
		MyObject mySubObject;
		MyObject myOtherSubObject;

		creator = new SubCreator();
		otherCreator = new OtherSubCreator();

		mySubObject = creator.factoryMethod();
		myOtherSubObject = otherCreator.factoryMethod();

		mySubObject.methodInObject();
		myOtherSubObject.methodInObject();
	}
}
