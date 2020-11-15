import connector.SisterTaoTao;
import connector.Zhangyu;

public class SceneMain {
    public static void main(String[] args) {
        //场景A，涛涛学姐叫张裕学姐买杯咖啡
        System.out.println("场景A，涛涛学姐叫张裕学姐买杯咖啡");
        Zhangyu zhangyu=new Zhangyu();//初始化张裕
        SisterTaoTao sisterTaoTao=new SisterTaoTao();//初始化涛涛学姐
        sisterTaoTao.LetSomeBodyBuyCoffee(zhangyu);//涛涛学姐要求张裕去买咖啡
    }
}
