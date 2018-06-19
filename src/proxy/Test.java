package proxy;

public class Test {
	public static void main(String[] args) {
		// 测试
		// 代理模式
		Girl girl = new Girl();
		girl.name = "娇娇";
		Proxy proxy = new Proxy(girl);
		proxy.giveDolls();
		proxy.giveFlowers();
		proxy.giveChocolate();
	}
}
