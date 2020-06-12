
public class Q20 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("radical ");
		sb =  new StringBuilder("radical ").insert(7, "robots");
		System.out.print(sb);
		// new StringBuilder("radical ").append("robots")------radical robots 
		// new StringBuilder("radical ").delete(1, 100).append("obots").insert(1, "adical r")------radical robots 
		// new StringBuilder("radical ").insert(7, "robots")  -------- radicalrobots 
		// new StringBuilder("radical ").insert(sb.length(), "robots")------radical robots 
	}
}
