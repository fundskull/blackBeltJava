package lambda;

import java.util.ArrayList;

public class MineTest1 {
    String name;
    int age;
    int skill;
    char sex;

    public MineTest1(String name, int age, int skill, char sex) {
        this.name = name;
        this.age = age;
        this.skill = skill;
        this.sex = sex;
    }
}

class MineTestInfo {
    public static void main(String[] args) {
        MineTest1 mineTest1 = new MineTest1("Ivan", 31, 7, 'm');
        MineTest1 mineTest2 = new MineTest1("Vova", 26, 10, 'm');
        MineTest1 mineTest3 = new MineTest1("Sasha", 29, 8, 'm');
        MineTest1 mineTest4 = new MineTest1("Ksusha", 31, 5, 'f');
        ArrayList<MineTest1> mineTestList = new ArrayList<>();
        MineTestInfo mineTestInfo = new MineTestInfo();
        mineTestInfo.gettingInfo(mineTestList, m -> m.age > 27);
    }

    void gettingInfo(ArrayList<MineTest1> list, FixInfo fixInfo) {
        for (MineTest1 m : list) {
            if (fixInfo.giveInfo(m)) {
                System.out.println(m);
            }
        }
    }
}

interface FixInfo {
    abstract boolean giveInfo(MineTest1 m);
}