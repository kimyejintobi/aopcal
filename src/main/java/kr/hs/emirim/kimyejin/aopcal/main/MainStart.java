package kr.hs.emirim.kimyejin.aopcal.main;

import kr.hs.emirim.kimyejin.aopcal.cal.Calculator;
import kr.hs.emirim.kimyejin.aopcal.cal.ImpCalculator;
import kr.hs.emirim.kimyejin.aopcal.cal.RecCalculator;

public class MainStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal1=new ImpCalculator();
		long f1=cal1.factorial(4);
		System.out.println("Imp 4 : "+ f1);
		
		Calculator cal2=new RecCalculator();
		long f2=cal2.factorial(4);
		System.out.println("Rec 4 : "+ f2);
	}

}
