package prog3;

public class main {

	//メソッド（関数）について
	//他の言語で関数と呼ばれているものをJavaではメソッドと呼んでいる
	//プログラムの中で確実に使うものがmainメソッドであり、プログラムを実行したときに
	//一番最初に動くメソッドとなっている↓
	/*
	public static void main(String[] args) {
		
	}
	*/

	//メソッドの書き方
	//メソッドは
	//条件 出力する値の型　名前（引数）｛
	//｝
	//になっている。簡単に下記の足し算を行うメソッドの例から見て見る
	public static int plus(int a, int b) {
		return a + b;
	}

	//まず、メソッドの書き方の条件は　public static　の部分にあたる
	//ここの説明は先で行う。今は考えずに書く

	//出力する値の型　int　の部分にあたる
	//これはメソッドを使ったとき、どの型の値になるかを示す
	//簡単に言うと、入れる値によって変化する変数みたいなものである
	//今回は箱に二つの数字をいれると、足した値になるint型の変数みたいなものだ
	//メソッド専用の型として、voidがあるこれは、どの型にもならず、ただメソッドに書かれた
	//プログラムを実行するだけという意味になっている。

	//次に、名前　plus　の部分にあたる
	//これは何の名前でもいい、今回はplusにしたが、Aでもなんでもいい
	//しかし、mainなどのようにすでに使っている名前もあるので注意

	//最後に引数　int a,int b　の部分にあたる
	//ここの書き方は　型 変数の名前 , 型 変数の名前 , ・・・・
	//のように、いくつか指定できる
	//ここに入れるのは、主に、ここのメソッドで使う変数で、メソッド外にあるものである
	//ここでは、二つの数を足すメソッドであるので、必要なのは二つの数字であるが、
	//このメソッドにはないので、外からの入力が必要であるので、int型の変数を受け付けている
	//int a,int b のaとbは、このメソッド内での識別するための仮の名前であるため
	//どんな名前でも良い

	//メソッドの条件として、中に、return文を書かなければならない
	//今回でいうと、return a+b;にあたる
	//ここでは、なんの値に最終的になるのかを示している
	//今回は、aとbを足した値にメソッドがなるようなものだ
	//前も示したように、voidのときは、必要がない
	
	public static void sample() {
	}
	
	public static void main(String[] args) {
		
		//メソッドを使うときは、
		plus(1,1);
		//のように、メソッドの名前と()内に入れたい値（変数可）をいれて宣言する
		//上記のような状態だとただ足しただけの状態であるので、
		//足した値を受け止めるようにする必要がある
		int sum=plus(1,1);
		//このようにしないと意味がなくなってしまう
		
		//voidの場合は、どの型にも変化しないので、そのままでも使える
		sample();
		
		//またこのようにも使える
		System.out.println(plus(100,24));
		
		
		//変数宣言についてpart2
		//変数や関数宣言する際にpublicやprivateがつくことがある
		//簡単な付け分け方法
		//何もつけないとき・・・メソッド内でしかその変数を使わないとき
		//privateの時・・・クラスの中でしか使わないとき
		//publicの時・・・他のクラスなどどこでも使うとき
		//これが主な付け比べについて
		
		
		System.out.println("ここから下は問題の答え");
		
		//問題１解答↓
		
		
		
		//問題２解答↓
		
		
	}
	//----------------------------------------------------------------
	//問題１　下記のメソッドを動かし、結果が表示されるように、上の記入部分にかけ
	
	public static double Keisan(int value) {
		double answer=15/value;
		
		return answer;
	}
	
	
	//問題２　文字列変数を入れると別の文字列が足されて返ってくるメソッドを作成し、上で出力されるようにしろ
	//例　test("よろしくお願いします")と実行すると　"こんにちは、よろしくお願いします"と返ってくるようにする
	
	
	
	
	//問題３　問題２で作成したメソッドで返ってくる文字列を入力すると、文字が表示されるvoid型のメソッドを作成し、実行しろ
	
	
	
	
}
