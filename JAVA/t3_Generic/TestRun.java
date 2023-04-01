package _03_28.t3_Generic;

public class TestRun {
    public static void main(String[] args) {
        String[] strArr = new String[4];
        strArr[0] = "mbc";
        strArr[1] = "kbs";
        strArr[2] = "sbs";
        strArr[3] = "cjb";

        for(int i=0; i<strArr.length; i++){
            System.out.print("strArr["+i+"]:"+strArr[i]+"/");
        }
        System.out.println();

        String[] strArr2 = {"mbc" , "kbs", "sbs" , "cjb"};
        for(String str : strArr2){
            System.out.print(str+" / ");
        }
        System.out.println();

        int[] intArr = {10,20,30,40,50};
        for(int arr : intArr){
            System.out.print(arr+" / ");
        }
        System.out.println();

        double[] dblArr = {10.1,20.2,30.3,40.4,50.5};
        for(double arr: dblArr){
            System.out.print(arr+" / ");
        }
        System.out.println();

      /*  Aa1 a1 = new Aa1();
        Aa2 a2 = new Aa2();
        Aa3 a3 = new Aa3();*/

        Atom a1 = new Aa1();
        Atom a2 = new Aa2();
        Atom a3 = new Aa3();
        a1.aa();
        a2.aa();
        a3.aa();
        System.out.println();

        Atom[] atoms = {a1, a2, a3};
        for(int i=0; i< atoms.length; i++){
            atoms[i].aa();
        }
    }
}

class Aa2 extends Atom{
    @Override
    void aa() {
        System.out.println("이곳은 Aa2클래스의 aa 메소드 입니다.");
    }
}

class Aa3 extends Atom{
    @Override
    void aa() {
        System.out.println("이곳은 Aa3클래스의 aa 메소드 입니다.");
    }
}

