//author zhuhaichao 2017/3/6
//�������������̬�ֲ�������
package ZMaths;

public class normality_random {
	public static double generate(){//Ĭ�Ͼ�ֵΪ0����׼��Ϊ1
		return generate(0,1);
	}
	public static double generate(double a,double b){//a����ֵ bΪ��׼��
		double u1=Math.random();
		double u2=Math.random();
		double result=a+b*Math.sqrt(-2*Math.log(u1))*Math.cos(2*Math.PI*u2);
		return result;
	}
}
