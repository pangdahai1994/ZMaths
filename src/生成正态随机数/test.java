package 生成正态随机数;
import ZMaths.normality_random;
public class test {
	public static boolean yongyou[]=new boolean[100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=1000;i++){
			int haicha=3;
			for (int j=0;j<=haicha-1;j++){
				yongyou[j]=false;
			}
		int count=haicha;
		int cishu=0;
		while (count>0){
			int l=(int)(Math.random()*9000);
			cishu++;
			if((0<=l)&&(l<=(haicha-1))){
				//System.out.println(l);
				if (yongyou[l]==false){
					yongyou[l]=true;
					count--;
				}
			}
			
		}
		System.out.println("第"+i+"人刷齐剩下"+haicha+"件要:"+cishu/47+"天");
		}

	}

}
