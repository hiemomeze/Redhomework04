package connector;

public class SisterTaoTao {
    //这个方法描述的是张涛学姐请别人给他买一杯我咖啡
    //他需要一个实现了BuyCoffee
    //所以这里需要的参数是一个实现了BuyCoffee的对象的接口（toolsMan工具人)
    public void LetSomeBodyBuyCoffee(BuyCoffee toolsMan){
        //表示工具人为了涛涛学姐买了一杯咖啡
        toolsMan.buycoffee();
    }
}
