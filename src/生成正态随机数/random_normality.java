package 生成正态随机数;
import ZMaths.normality_random;
public class random_normality {
	public static int fenbu[]=new int[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		int count=0;
		for (int i=1;i<=5000;i++){
			double z=normality_random.generate(20, 0.5);
			if (z<10) fenbu[0]++;
			if ((z>10)&&(z<12)) fenbu[1]++;
			if ((z>12)&&(z<14)) fenbu[2]++;
			if ((z>14)&&(z<16)) fenbu[3]++;
			if ((z>16)&&(z<18)) fenbu[4]++;
			if ((z>18)&&(z<20)) fenbu[5]++;
			if ((z>20)&&(z<22)) fenbu[6]++;
			if ((z>22)&&(z<24)) fenbu[7]++;
			if ((z>24)&&(z<26)) fenbu[8]++;
			if ((z>26)&&(z<28)) fenbu[9]++;
			sum+=(z-20)*(z-20);
		}
		System.out.println("结果"+sum/5000+" "+count);
		for (int i=0;i<10;i++){
			//System.out.println("结果"+i+" "+"z"+Math.cos(45)+fenbu[i]);
		}
	}

}
