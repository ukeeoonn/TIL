package t2_ArrayList;

public class T5_SungjukVo {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	//private int[] jumsu;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	@Override
	public String toString() {
		return "T5_SungjukVo [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
}
