package proxy;
//׷����
public class Pursuit implements GiveGift{
    private Girl mm;
    public Pursuit(Girl girl){
        this.mm = girl;
    }
    @Override
    public void giveDolls() {
        System.out.println("׷�����������޸�" + mm.name);
    }

    @Override
    public void giveFlowers() {
        System.out.println("׷�������ʻ���" + mm.name);
    }

    @Override
    public void giveChocolate() {
        System.out.println("׷�����ɿ�����" + mm.name);
    }
}