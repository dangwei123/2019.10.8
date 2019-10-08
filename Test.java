class Test{
	//2. 写代码实现: 给定三个 int 变量, 求其中的最大值和最小值
public static void main(String[] args){
	int a=10;
	int b=20;
	int c=30;
	if(a<b){
		int tmp=a;
		a=b;
		b=tmp;
	} if(a<c){
		int tmp=a;
		a=c;
		c=tmp;
	} if(b<c){
		int tmp=b;
		b=c;
		c=tmp;
	}
	System.out.println(a);
	System.out.println(c);
}
//1. 写代码实现: 给定两个 int 变量, 交换变量的值
public static void main1(String[] ards){
     int a=10;
	 int b=20;
	 a=a^b;
	 b=a^b;
	 a=a^b;
	 System.out.println("a="+a);
	 System.out.println("b="+b);
}
}