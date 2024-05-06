package ono;

import java.util.ArrayList;
import java.util.List;

public class ListService {

	public List<String> listMake() {
		List <String> list = new ArrayList<String>();
		list.add("あ");
		list.add("あ");
		list.add("い");
		list.add("い");
		list.add("お");
		return list;
	}
	public List<String> listMakeTwo() {
		List <String> list = new ArrayList<String>();
		list.add("あ");
		list.add("い");
		list.add("う");
		list.add("え");
		return list;
	}

}
