import inherit.AndroidDeveloper;

public class RayleighZ extends AndroidDeveloper {
    public RayleighZ(String []programs,int age){//因为是张裕类所以名字是确定的，就不需要继承name参数
        super("RayleighZ",programs,age);
    }
    //添加独有的方法
    public void lickSisterTaoTao(){
        System.out.println("御姐喜欢涛姐姐");
    }
    //覆写父类中的方法
    @Override//自动在父类中简写这种方法
    public void code(){
        //Tip：这里不能通过this直接访问父类的私有域，必须通过父类提供的get和set的接口获取
        System.out.println(this.getName()+"在划水");//如果没有进行覆写那么就会输出张裕在写代码
    }
    //不覆写吃饭的方法（调用父类的方法）
    //在原有的基础上拓展sleep方法
    @Override
    public void sleep(){
        System.out.println("睡前听六个小时的摇滚");//①
        super.sleep();//②可在这之前或之后写出来
    }
}
