
package _03_28.t4_Generic;
public class TestRun {
    public static void main(String[] args) {
        //TestVO vo = new TestVO();

        //정수 숫자
        TestVO<Integer> intVo = new TestVO<Integer>();  //제네릭 기본형
        intVo.setObject(100);  // 100  넣음
        int intSu = intVo.getObject();  // 값을 꺼낼
        System.out.println("intSu :"+intSu); // 출력
        System.out.println();

        //실수 숫자
        TestVO<Double> dblVo = new TestVO<Double>();
        dblVo.setObject(3.14);
        double dblsu = dblVo.getObject();
        System.out.println("dblSu :" +dblsu);
        System.out.println();

        //문자
        TestVO<String> strVo = new TestVO<String>();
        strVo.setObject("홍길동");
        String str = strVo.getObject();
        System.out.println("strSu :" +str);
        System.out.println();

        //객체
        TestVO<Atom> atomVo = new TestVO<Atom>();
        atomVo.setObject(new Atom());
        Atom atom = atomVo.getObject();
        atom.aa();

        System.out.println(atom.name);
        System.out.println(atom.su1);
        System.out.println(atom.su2);

    }
}
