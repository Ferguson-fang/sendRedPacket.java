import java.util.ArrayList;

public class MainRedPacket {

    public static void main(String[] args) {



            Group_owner Ferguson = new Group_owner("群主方辰垓", 100);
            Group_member a = new Group_member("成员贺俊乔", 0);
            Group_member b = new Group_member("成员邓博文", 0);
            Group_member c = new Group_member("成员张振江", 0);

            Ferguson.show();
            a.show();
            b.show();
            c.show();
            System.out.println("==============================================");


            ArrayList<Integer> redList = Ferguson.send(20, 3);
            //三个普通成员收红包
            a.receive(redList);
            b.receive(redList);
            c.receive(redList);

            Ferguson.show();
            a.show();
            b.show();
            c.show();




    }
}