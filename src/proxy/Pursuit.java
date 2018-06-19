package proxy;
//追求者
public class Pursuit implements GiveGift{
	private Girl mm;
    public Pursuit(Girl girl){
        this.mm = girl;
    }
    @Override
    public void giveDolls() {
        System.out.println("追求者送洋娃娃给" + mm.name);
    }

    @Override
    public void giveFlowers() {
        System.out.println("追求者送鲜花给" + mm.name);
    }

    @Override
    public void giveChocolate() {
        System.out.println("追求者巧克力给" + mm.name);
    }
}