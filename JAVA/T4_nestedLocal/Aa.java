package _03_28.T4_nestedLocal;

public class Aa {
    int suA = 100;

    public Aa(){
        System.out.println("이곳은 Aa클래스 입니다.");
    }

    /*
    *  methodA1 , methodA2 -> 메소드 사용하고 버림
    *
    *
    * */

    public void methodA1(){
        System.out.println("이곳은 Aa클래스의 methodAa()입니다.");
        System.out.println();
        class Bb { //
            int suB = 700;

            public Bb() {
                System.out.println("이곳은 Bb클래스 입니다.");
            }
            public void methodB() {
                System.out.println("이곳은 Bb클래스 methodB() 입니다.");
            }
        }
    }

    public void methodA2(){
        System.out.println("이곳은 Aa클래스의 methodAa()입니다.");
        class Bb { //
            int suB = 700;

            public Bb() {
                System.out.println("이곳은 Bb클래스 입니다.");
            }
            public void methodB() {
                System.out.println("이곳은 Bb클래스 methodB() 입니다.");
            }
        }
        Bb bb = new Bb();
        System.out.println("Aa객체 안의 methodA1()입니다.");
        System.out.println("bb.suB."+bb.suB);
        bb.methodB();
    }
}
