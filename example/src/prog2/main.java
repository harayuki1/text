package prog2;

public class main {
	private static int a=10;
	private static String b="こんにちは";
	public static void main(String[] args) {
		//配列について
		//数字や文字を1つまとまりにしたいときに使うもの
		//下記のように宣言する
		int[] number= {2,3,6,2,13};
		String[] s= {"あ","う"};
		
		//呼び出したいときには配列の名前とほしい数字や文字の場所を指定する
		//配列は0番から始まるので注意
		System.out.println(number[0]);//２が表示される
		System.out.println(number[1]);//３が表示される
		System.out.println(s[1]);//うが表示される
		
		
		//if文
		//何かの条件によってプログラムの動作を変えたいときに使う
		
		if(a==1) {//もしaが1の時
			System.out.println("aは1です");
		}
		//選択肢がいくつもあるときは　else ifを使う
		else if(a<5) {//もしaが5より小さい時
			System.out.println("aは5より小さいです");
		}
		else if(a>=50) {//もしaが50以上の時
			System.out.println("aは50以上です");
		}
		//ifやelse ifで書いた以外の条件の時 elseを使う
		else {
			System.out.println("aは"+a+"でした");
		}
		
		//関係演算子は
		
		//switch文について
		
		//繰り返し文について
		//while文
		//while文は何回繰り返すか決まっていないときに使う。
		

	}

}
