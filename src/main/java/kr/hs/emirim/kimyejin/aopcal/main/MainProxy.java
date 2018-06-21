package kr.hs.emirim.kimyejin.aopcal.main;

import kr.hs.emirim.kimyejin.aopcal.cal.ExeTimeCalculator;
import kr.hs.emirim.kimyejin.aopcal.cal.ImpCalculator;
import kr.hs.emirim.kimyejin.aopcal.cal.RecCalculator;

public class MainProxy {
	public static void main(String[] args) {
		int num=20;
		ExeTimeCalculator ttcal1= new ExeTimeCalculator(new ImpCalculator());
		System.out.println(ttcal1.factorial(num));
		
		ExeTimeCalculator ttcal2= new ExeTimeCalculator(new RecCalculator());
		System.out.println(ttcal1.factorial(num));
	}

}
