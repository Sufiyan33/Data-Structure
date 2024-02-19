package map;

import java.util.Arrays;

public class CustomHashMap {

	private Entity[] entities;

	public CustomHashMap() {
		entities = new Entity[3]; // you can increase map size as per your choice.
	}

	public void put(String key, String value) {
		int hash = Math.abs(key.hashCode() % entities.length);
		entities[hash] = new Entity(key, value);
	}

	public String get(String key) {
		int hash = Math.abs(key.hashCode() % entities.length);
		if (entities[hash] != null && entities[hash].key.equals(key)) {
			return entities[hash].value;
		}
		return null;
	}

	public void remove(String key) {
		int hash = Math.abs(key.hashCode() % entities.length);
		if (entities[hash] != null && entities[hash].key.equals(key)) {
			entities[hash] = null;
		}
	}

	@Override
	public String toString() {
		return "CustomHashMap [entities=" + Arrays.toString(entities) + "]";
	}

}

class Entity {
	String key;
	String value;

	public Entity(String key, String value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Entity [key=" + key + ", value=" + value + "]";
	}
}