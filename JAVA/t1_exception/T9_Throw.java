package _03_28.t1_exception;

public class T9_Throw {
    public static void main(String[] args) throws ClassNotFoundException {

        try{
            findMethod();
            System.out.println("클래스파일이 존재합니다.");
        }catch (ClassNotFoundException e){
            System.out.println("클래스 파일이 존재하지 않습니다.");
            System.out.println("오류:"+e.getMessage());
        }finally {
            System.out.println("클래스 작업끝");
        }
        System.out.println("작업종료");
    }

    static void findMethod() throws ClassNotFoundException {
        //Class.forName("java.lang.String");
        Class.forName("java.lang.String22");
        System.out.println("findMethod() 안입니다.");
    }
}
