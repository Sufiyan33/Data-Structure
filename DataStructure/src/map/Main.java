package map;

public class Main {

	public static void main(String[] args) {
		CustomHashMap map = new CustomHashMap();
		map.put("Apple", "A sweet red fruit");
		map.put("litchi", "My favourite fruites");
		map.put("Banana", "Best for gymer");

		System.out.println(map.get("Apple"));

		// To print all map value, we need toString method.
		System.out.println(map);
	}
}
