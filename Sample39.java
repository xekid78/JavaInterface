/**
 *
 * @author xekid78
 *
 */
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
