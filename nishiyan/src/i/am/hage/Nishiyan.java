package i.am.hage;

import java.util.ArrayList;
import java.util.List;

public class Nishiyan {

	List<Hair> hairs = new ArrayList<Hair>();

	public Nishiyan() {
	}

	public void setHage() {
		hairs.clear();
		System.out.println("mou ke nai...");
	}

	public void setFusafusa() {
		for (int i = 0; i < 100; i++) {
			hairs.add(new HairNegaNega());
		}
	}
}
