package prog1;

//問題は↓

public class Prog1 {

	public static void main(String[] args) {
		//文字や数字などの出力は
		System.out.println("ここで文字が出力されます");
		System.out.println("文字の連結の仕方は" + "これでできる");
		System.out.println("数字とも連結できる（１＋１は" + 2 + ")");

		//改行しないの時は　print　になる
		System.out.print("こ");
		System.out.print("ん");
		System.out.print("に");
		System.out.print("ち");
		System.out.println("は");
		//↑↑↑↑最後の文字までprintにしてしまうと、次の文字列が改行されないので注意

		//四則演算の方法
		//加算:＋　　減算:ー　乗算:*　除算:/　乗除算:％
		System.out.println(3 + 1);
		System.out.println(3 - 1);
		System.out.println(3 * 1);
		System.out.println(3 / 1);
		System.out.println(3 % 1);

		//変数について

		//型　名前 = 値;　の形で宣言される
		int a = 1;//intは整数の型
		String b = "hello";//Stringは文字
		boolean c = true;//booleanはtrueかfalse
		char d = 'あ';//charは一文字
		double e = 13.25;//doubleは小数

		//変数の名前を()の中に入れることで使う
		System.out.println(b);
		System.out.println(a + a);

		//ーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーーー
		//よく使う方法

		//変数の型変換
		//したい型を()に入れて型変換をする
		//小数を整数にしたい
		int f = (int) 13.25;
		//変数でも型変換できる
		int g = (int) e;

		//文字に型変換したいとき
		String h = String.valueOf(a);
		String i = String.valueOf(c);

		//文字列を数字にしたいとき
		int j = Integer.parseInt("12");
		System.out.println(j * 3);

		//変数に数字を足したい引きたいときの簡略した書き方
		//変数に1足したいとき
		a++;
		++a;
		//↑ほぼ同じ意味

		//引きたいときも同様に
		a--;

		//変数に２以上の値を動かしたいとき
		//変数　演算子=数字　の形でできる
		a += 5;
		a -= 20;
		//掛け算、割り算もできる
		a *=2;
		a /=2;
		
		
		int k=100;
		//k++ と ++k　の違いについて
		k=100;
		System.out.println(k);
		k=100;
		k++;
		System.out.println(k);
		k=100;
		++k;
		System.out.println(k);
		//k++ と ++k　はどちらも同じように見える
		k=100;
		System.out.println(k++);
		k=100;
		System.out.println(++k);
		//中に直接いれると値が変わる
		
		//k++は先に変数の値を取り出して動作を終了した後に、足し算が実行される
		//++kは先に足し算を実行し、値が使われる
		
		k=100;
		//このように書くと、先に、値が使われるので、100+200が実行される
		int l=k++ + 200;
		System.out.println(l+"この値は300です");
		//k++が実行されているので、100+1がなされ、101になる。
		System.out.println(k);
		
		
		
		//------------------------------------
		System.out.println("ここから下は問題の答え");
		test();
	}
	public static void test() {
		//問題１　好きな文字を出力させろ
		
		
		
		
		//問題２　変数を使って　計算問題の答えを出力させろ
		//例　１＋１の答えは(←文字列型変数) 2(数値型変数)
		
		
		
		//問題３　下の問題の答えをanswer()の()の中に入れろ
		int number=50;
		//++number + number * 2
		test1.answer(0);
	}

}
