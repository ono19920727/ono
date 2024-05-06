package ono;

import java.util.ArrayList;
import java.util.List;

public class onoPractice {
	public static void main(String[] args) {
		ListService listService = new ListService();
		List <String> practiceList = listService.listMake();
		List <String> confirmList = new ArrayList<String>();

		for(int i = 0; i < practiceList.size(); i++){
			String value = practiceList.get(i);
			if(i == 0) {
				confirmList.add(value);
			}
			for(int j= 0; j<confirmList.size(); j++){
				String valueOK = confirmList.get(j);
				if( value.equals(confirmList)) {
					confirmList.add(value);
				}
			}
		}
		System.out.println(confirmList);
	}
}
