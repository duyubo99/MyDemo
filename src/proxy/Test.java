package proxy;

public class Test {
	public static void main(String[] args) {
		// ����
		// ����ģʽ
		Girl girl = new Girl();
		girl.name = "����";
		Proxy proxy = new Proxy(girl);
		proxy.giveDolls();
		proxy.giveFlowers();
		proxy.giveChocolate();
	}
}
