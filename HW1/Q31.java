package HW1;

public class Q31 {

	public String convert(int value) { 
		//int is a primitive, you cannot call instance methods on it because primitives do not ýnsance method
		return value.toString();
	}

	public String convert(Integer value) {
		//Integer have instance methods
		return value.toString();
	}

	public String convert(Object value) {  
		//Objects have instance methods
		return value.toString();
	}

}

