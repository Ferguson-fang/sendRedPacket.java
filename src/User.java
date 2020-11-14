public class User {

    private String name;     //姓名
    private int money;       //余额

    public User(){

    }

    public User(String name,int money){
        this.name = name;
        this.money = money;
    }

    //展示用户有多少钱
    public void show(){
        System.out.println("我叫"+name+",我有"+money+"元");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
