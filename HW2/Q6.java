
public class Q6 {
	public String convert(int value) {
		return value.toString();
		// int veri tipinistringe �evirirken String.valueOf(value) �eklinde kullan�lmal�yd�
	}

	public String convert(Integer value) {
		return value.toString();
	}

	public String convert(Object value) {
		return value.toString();
	}
}
