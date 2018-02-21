# JavaInterface
インターフェース

## 処理
インタフェースに定数を設定して、足し算を行います。

## コード
```
public class Sample39 {

	public static void main(String[] args) {
		Add add = new Add();
		add.method1();
		add.method2();

	}

}

interface Calc {
	public String STR = "足し算";
	public int A = 7;
	public int B = 8;

	void method1();
	void method2();
}

class Add implements Calc {
	public void method1() {
        System.out.println(STR + "をします");
    }

    public void method2() {
        System.out.println(A + " + " + B + " は " + (A + B) + " です。");
    }
}
```

## 出力結果  
```
足し算をします
7 + 8 は 15 です。
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
