package kr.hs.emirim.kimyejin.aopcal.main;

import kr.hs.emirim.kimyejin.aopcal.cal.Calculator;
import kr.hs.emirim.kimyejin.aopcal.cal.ImpCalculator;
import kr.hs.emirim.kimyejin.aopcal.cal.RecCalculator;

public class MainNano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				long num=10000;
				long start = System.nanoTime();
				Calculator cal1=new ImpCalculator();
				long f1=cal1.factorial(num);
				long end=System.nanoTime();		
				System.out.printf("Imp factorial(%d); 실행 시간 = %d",num,(end-start));
				
				System.out.println();
				
				long start1 = System.nanoTime();
				Calculator cal2=new RecCalculator();
				long f2=cal2.factorial(num);
				System.out.println("Rec 4 : "+ f2);
				long end2=System.nanoTime();	
				System.out.printf("Imp factorial(%d); 실행 시간 = %d",num,(end-start));
			}

	}

}
