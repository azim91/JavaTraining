
public class Q6 {
	public String convert(int value) {
		return value.toString();
		// int veri tipinistringe çevirirken String.valueOf(value) şeklinde kullanılmalıydı
	}

	public String convert(Integer value) {
		return value.toString();
	}

	public String convert(Object value) {
		return value.toString();
	}
}
