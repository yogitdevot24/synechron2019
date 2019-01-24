import java.util.ArrayList;
import java.util.List;

public class Helper {
	public Helper() {
		System.out.println("in Helper Constructor ..");
	}
	public void m1(){
		System.out.print(".");
		
		List<String> list = new ArrayList<>();
		for(int i = 0; i< 5000;i++)
			list.add("aaa"+i);
		}
	}

