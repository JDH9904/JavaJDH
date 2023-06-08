//package test;
//
//public class Test7 {
//    public static void main(String[] args) {
//
//        character cr = new character();
//        cr.name = "김춘홍";
//        cr.hp = 100;
//        cr.mp = 100;
//        cr.at = 10;
//        cr.df = 10;
//        cr.lv = 1;
//        cr.exp = 0;
//
//
//        monster mt = new monster();
//        mt.mname = "쟈그라스";
//        mt.mhp = 30;
//        mt.mat = 3;
//        mt.mdf = 2;
//        mt.mexp = 15;
//        //전사 키우기
//
//
//
//    }
//}
//class character {
//    String name;
//    int hp;
//    int mp;
//    int exp;
//    int at;
//    int df;
//    int lv;
//
//    int dmhp;
//
//    int dhp;
//    void aaa () {
//        System.out.printf("%s의 공격으로%s가 %d의 데미지를 입혔습니다.\n",this.name,this.mname,this.dmhp );
//    }
//}
//class Lvup extends character{
//    void lvup(){
//        if(exp >= 100){
//            lv ++;
//        }
//    }
//}
//
//class atsum extends monster{
//    void atta(){
//        dmhp = mhp - (at - mdf);
//    }
//    void dffd(){
//        dhp = hp - (mat - df);
//    }
//}
//
//
//
//class monster extends character{
//    String mname;
//    int mhp;
//    int mat;
//    int mdf;
//    int mexp;
//}