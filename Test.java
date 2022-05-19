
public class Test {
public static void main(String[] args) {
	//#1차원 배열의 생성 및 값 대입
	//방법1.
	int[] a= new int[3];
	a[0]=3;
	a[1]=4;
	a[2]=5;
	//방법2.
	int[] b = new int[] {3,4,5};
	//방법3.
	int[] c = {3,4,5};
	//방법2: 선언과 값의 대입 분리 가능
	//방법3: 선언과 값의 대입 분리 불가능
	
	///참조자료형의 배열의 특징
	//기본자료형의 변수 복사-> 값을 복사
	int e = 3;
	int f = e;
	e=7;
	System.out.println(e);//3
	System.out.println(f);//7
	//참조자료형의 변수 복사->의치(번지) 복사
	int[] g = {5,6,7};
	int[] h=g;
	g[0]=9;
	System.out.println(g[0]);//9
	System.out.println(h[0]);//9
	
	
	
}
}
