import java.util.ArrayList;

public class Group_owner extends User{
    public Group_owner(){
        //super();
    }

    public Group_owner(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totallyMoney,int count){
        //首先需要一个集合，存储若干个红包的金额
        ArrayList<Integer> redPackage = new ArrayList<>();
        //首先看群主自己有多少钱
        int leftMoney = super.getMoney();
        if(totallyMoney > leftMoney)
        {
            System.out.println("余额不足");
            return redPackage;//返回空集合
        }
        //扣钱（本质为重新设置余额）
        super.setMoney(leftMoney - totallyMoney);

        //发红包，需要平均拆分为count分
        int avg = totallyMoney / count;
        int mod = totallyMoney % count;//mod为余数，与就是剩下的零头

        //剩下的零头，包在最后一个红包中
        //下面红包一个一个放在集合当中
        for (int i = 0; i < count -1; i++) {
            redPackage.add(avg);
        }
        //最后一个红包
        int last = avg + mod;
        redPackage.add(last);

        return redPackage;
    }



}
