package test_knowledge;

import java.util.ArrayList;
import java.util.List;

public class CheckKnowledge {

	@SuppressWarnings("finally")
	List<Integer> knowledge() {
		List<Integer> list = new ArrayList<Integer>();
		try {
			list.add(2);
			return list;
		} finally {
			list.add(3);
			return list;
		}
	}

	public static void main(String[] args) {
		CheckKnowledge check = new CheckKnowledge();
		System.out.println(check.knowledge());
	}
}
