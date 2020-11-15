public class AndroidDeveloper {
    private  String  name ;//开发者的名字
    private String []Programs;//会编程的语言
    private  int age ;//开发者的年龄
    //构造方法
    public AndroidDeveloper(String name,String []programs,int age){
        this.name=name;
        this.Programs=programs;
        this.age=age;
    }
    //共有的写代码的方法
public void code(){
    System.out.println(name+"正在写代码");
}
//共有的吃饭的方法
    public void eat(){
        System.out.println(name+"正在吃饭");
    }
    //共有的睡觉方法
    public void sleep(){
        System.out.println(name+"正在睡觉");
    }
    //get方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPrograms() {
        return Programs;
    }

    public void setPrograms(String[] programs) {
        Programs = programs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
