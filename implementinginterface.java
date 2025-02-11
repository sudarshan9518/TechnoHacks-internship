interface Ccar{
    void name();
    void wheel();
    void brand();

}
class CCarrrrrr implements  Ccar{
    @Override
    public void name() {
        System.out.println("bicycle");
    }

    @Override
    public void brand() {
        System.out.println("avon");
    }

    @Override
    public void wheel() {
        System.out.println("two");
    }
}


public class implementinginterface {
    public static void main(String[] args) {

        CCarrrrrr cc= new CCarrrrrr();
        cc.brand();
        cc.name();
        cc.wheel();

    }
}
