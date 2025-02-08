package 복학1;

public class Cat {
	private int age;// Cat 인스턴스의 나이
	private String name;//Cat 인스턴스의 이름
	public void eat() {
		System.out.println("냠냠");
	}
	public void meow() {
		System.out.println("Meow~");
	}
	public void setage(int n) {
		age = n;//입력
	}
	public int getage() {
		return age;//출력
	}
	public void setname(String N) {
		name = N;
	}
	public String getname() {
		return name;
	}

}
