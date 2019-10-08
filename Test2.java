import java.util.Scanner;
class Test2{
	//9. 求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的
	//立方和确好等于该数本身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)
public static void main9(String[] args){
	int tmp=0;
	int i=0;
	for(i=0;i<1000;i++){
	   int count=0;
	   int sum=0;
	   tmp=i;
	while(tmp!=0){
		count++;
		tmp/=10;
	}tmp=i;
	while(tmp!=0){
		sum+=Math.pow((tmp%10),count);
		tmp/=10;
	}
	if(i==sum){
		System.out.println(i);
	}
	
	}
}
	//8. 编写程序数一下 1到 100 的所有整数中出现多少个数字9
public static void main8(String[] args){
	int count=0;
	for(int i=1;i<=100;i++){
		if(i/10==9){
			count++;
		}if(i%10==9){
			count++;
		}
		
	}
	System.out.println(count);
}
	//7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
public static void main7(String[] args){
	double sum=0.0;
	double a=1.0;
	for(int i=1;i<=100;i++){
		sum+=(a)/i;
		a*=(-1);
	}
	System.out.println(sum);
}
	//6. 求两个正整数的最大公约数
public static void main6(String[] args){
	int a=18;
	int b=24;
	while(a!=0){
		int c=b%a;
		b=a;
		a=c;
	}
	System.out.println(b);
}
	//5. 输出乘法口诀表
public static void main5(String[] args){
	for(int i=1;i<=9;i++){
		for(int j=1;j<=i;j++){
			System.out.printf("%d*%d=%d  ",j,i,i*j);
		}
		System.out.println();
	}
}
	//4. 输出 1000 - 2000 之间所有的闰年
public static void main4(String[] args){
	for(int i=1000;i<=2000;i++){
		if(i%400==0||(i%4==0&&i%100!=0)){
			System.out.println(i);
		}
	}
}
	//3. 打印 1 - 100 之间所有的素数
public static void main3(String[] args){
	for(int i=1;i<=100;i++){
		int j=0;
		for( j=2;j<i;j++){
			if(i%j==0){
				break;
			}
		}
		if(j==i){
			System.out.println(i);
		}
	}
}
	//2. 判定一个数字是否是素数
public static void main2(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入数字：");
	int num=sc.nextInt();
	int i=0;
	for( i=2;i<num;i++){
		if(num%i==0){
			break;
		}
	}
	if(i==num){
		System.out.println("是素数");
	}else{
		System.out.println("不是素数");
	}
	sc.close();
}
	
	//1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 
	//老年(56以上)
public static void main1(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入年龄：");
	int age=sc.nextInt();
	if(age<=18){
		System.out.println("少年");
	}if(age>=19&&age<=28){
		System.out.println("青年");
	}if(age>=29&&age<=55){
		System.out.println("中年");
	}else{
		System.out.println("老年");
	}
	sc.close();

}
}

	 

	 






