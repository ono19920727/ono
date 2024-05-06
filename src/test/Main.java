/**
 * 
 */
package test;

import java.util.List;

/**
 * @author Owner
 *
 */
public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		Sec obj = new Sec();
		String nop = obj.klm;
		System.out.println(nop);
		
		//これをベースに覚える//
		int efg = obj.sec1();
		System.out.println(efg);
	 
		String arg = "出身だ";
		String abcde = obj.sec2("北海道",arg);
		System.out.println(abcde);
		
		
		Sec2 sec2 = new Sec2();
		List<String> sec2ono = sec2.ono();
		System.out.println(sec2ono);
	 
		Sec2 sec27 = new Sec2();
		List <String> sec27ono = sec27.ono27();
		System.out.println(sec27ono);		
		
		Sec3 sec3 = new Sec3();
		List <String> sec3ono = sec3.shin();
		System.out.println(sec3ono);
		
		
		List <Shin2Data> shin2data = sec3.shin2();
		System.out.println(shin2data.get(0).getName());
		
	}
	}


