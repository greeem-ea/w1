package 복학1;

public class CatTest {
	public static void main(String[] args) {	
	Cat 뽀삐, ea;
	뽀삐 = new Cat();
	ea = new Cat();
	
	
	뽀삐.eat();
	뽀삐.meow();
	뽀삐.setage(3);
	뽀삐.setname("뽀삐");	;//이것들은 쓴것 읽히진않음
	System.out.println(뽀삐.getage());
	System.out.println(뽀삐.getname());
	System.out.println();
	
	ea.eat();
	ea.meow();
	ea.setage(9);
	ea.setname("에아");
	System.out.println(ea.getage());
	System.out.println(ea.getname());	//print 하는 것이 필요함. 왜냐면 print에서 호풀한게 아니기때문.
	}

}
