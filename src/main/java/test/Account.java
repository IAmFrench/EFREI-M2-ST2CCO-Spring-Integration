package test;

public class Account {
	
	public String create(String name) {
		System.out.println("----------- create receives: " + name);
		return "Account created for " + name;
	}

}
