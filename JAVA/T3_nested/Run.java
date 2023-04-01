package _03_28.T3_nested;

public class Run {
    public static void main(String[] args){
        Aa aa = new Aa();
        System.out.println("a객체의 suA : "+aa.suA);
        aa.methodAa();
        System.out.println();

        //Bb bb = new Bb();

        Aa.Bb bb = new Aa.Bb();
        System.out.println("B객체의 suB : "+bb.suB);
        bb.methodBb();
        bb.methodB2();  // 메모리 비효율 적으로 사용 에러는 아님
        Aa.Bb.methodB2();
    }
}
