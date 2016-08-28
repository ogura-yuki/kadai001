public class Work{
	public static void main(String[] args){
		System.out.println("-------------------------------------");
		System.out.println("3Lのバケツと5Lのバケツで4Lを量る方法");
		System.out.println("3Lをｘ、5Lをｙとして計算する");
		System.out.println("-------------------------------------");
		
		//3Lのバケツ
		int x = 0;
		//5Lのバケツ
		int y = 0;
		//バケツを空にするときに使う変数
		int z = 0;
		
		//3Lの水
		int a = 3;
		//5Lの水
		int b = 5;
		
		System.out.println("-------------------------------------");
		System.out.println("まずは5Lのバケツに満杯になるまで水を入れる");
			y = b;
		System.out.print("y＝");
		System.out.print(y);
		System.out.println("L");
		System.out.println("-------------------------------------");
		
		System.out.println("-------------------------------------");
		System.out.println("yの中身の水をxが満杯になるまで入れる");
			x = y;
				if(x > a ){
				x = a;
				}
			y = y - x;
		
		System.out.print("y＝");
		System.out.print(y);
		System.out.println("L");
		
		System.out.print("x＝");
		System.out.print(x);
		System.out.println("L");
		System.out.println("-------------------------------------");
		
				System.out.println("-------------------------------------");
		System.out.println("xの中身を捨てる");
			x = z;
		System.out.print("y＝");
		System.out.print(y);
		System.out.println("L");
		
		System.out.print("x＝");
		System.out.print(x);
		System.out.println("L");
		System.out.println("-------------------------------------");
		
		System.out.println("-------------------------------------");
		System.out.println("yの中身の水をすべてxにいれる");
			x = y;
				if(x >a ){
				x = a;
				}
			y = y - x;
		
		System.out.print("y＝");
		System.out.print(y);
		System.out.println("L");
		
		System.out.print("x＝");
		System.out.print(x);
		System.out.println("L");
		System.out.println("-------------------------------------");
		
		System.out.println("-------------------------------------");
		System.out.println("yのバケツに満杯になるまで水を入れる");
			y = b;
		System.out.print("y＝");
		System.out.print(y);
		System.out.println("L");
		
		System.out.print("x＝");
		System.out.print(x);
		System.out.println("L");
		System.out.println("-------------------------------------");
		
		System.out.println("-------------------------------------");
		System.out.println("yの中身の水をxが満杯になるまで入れる");
			//xのバケツの最大数を表す変数
			int max_x = 3;
			y = y - (max_x - x) ;
			x = x + (max_x - x);
		System.out.print("y＝");
		System.out.print(y);
		System.out.println("L");
		
		System.out.print("x＝");
		System.out.print(x);
		System.out.println("L");
		System.out.println("------------------------------------");
		
		
	}
}