import java.util.ArrayList;
import java.util.Random;

public class Group_member extends User {
    public Group_member(){
        //super();
    }

    public Group_member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从红包中随便抽一个给自己
        //随机获取一个集合党总的索引编号
        int index = new Random().nextInt(list.size());
        //根据索引，从集合当中删除，并且得到被删除的红包，给自己
        int delat = list.remove(index);
        //当前成员自己本来有多少钱；
        int money = super.getMoney();
        //加法，并重新设置回去
        super.setMoney(money + delat);
    }


}
