/**
 * 
 */
package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Owner
 *
 */
public class Sec3 {

	/**
	 * 
	 */
	public Sec3() {
		
	}
	public List<String> shin(){
		List<String> list = new ArrayList<String>();
		String shinshsin= "ばーか";
		list.add(shinshsin);
		return list;
		
	}    
	/**
	 * name,age,gender
	 */
	public List<Shin2Data> shin2(){
		Shin2Data shin2data = new Shin2Data();
		shin2data.setName("おの");
		shin2data.setAge(30);
		shin2data.setGender(1);
		String shin3 = shin2data.getName();
		List<Shin2Data> shin2DataList = new ArrayList<Shin2Data>();
		shin2DataList.add(shin2data);
		return shin2DataList;
		
	}
	
	/**
	 * name,age,gender
	 */
	public List<Shin2Data> shin3(){
		List<Shin2Data> result = new ArrayList<Shin2Data>();
		
		
		Shin2Data shin2data = new Shin2Data();
		shin2data.setName("おの");
		shin2data.setAge(30);
		shin2data.setGender(1);
		Shin2Data shin2data2 = new Shin2Data();
		shin2data2.setName("田中");
		shin2data2.setAge(29);
		shin2data2.setGender(0);
		
		List<Shin2Data> shin2DataList = new ArrayList<Shin2Data>();
		shin2DataList.add(shin2data);
		shin2DataList.add(shin2data2);
		
		/**初期値;ループが終わる条件；変化式**/
		/**sizeはlistの行数をint型で返す**/
		/**I++=iの値を1増やす**/
		for(int i = 0; i < shin2DataList.size(); i++) {
			Shin2Data data = new Shin2Data();
			data.setName(shin2DataList.get(i).getName());
			if(shin2DataList.get(i).getGender() == 0) {
				shin2data.setGenderStr("女");
			} else if(shin2DataList.get(i).getGender() == 1) {
				shin2data.setGenderStr("男");
			}
		
		}
		
		
		
		return result;
		
		
		
		
		
		
		
		
		
		
		
	}
}

