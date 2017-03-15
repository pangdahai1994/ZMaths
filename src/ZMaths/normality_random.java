//author zhuhaichao 2017/3/6
//用来随机生成正态分布的数字
package ZMaths;

public class normality_random {
	public static double generate(){//默认均值为0，标准差为1
		return generate(0,1);
	}
	public static double generate(double a,double b){//a中心值 b为标准差
		double u1=Math.random();
		double u2=Math.random();
		double result=a+b*Math.sqrt(-2*Math.log(u1))*Math.cos(2*Math.PI*u2);
		return result;
	}
}
