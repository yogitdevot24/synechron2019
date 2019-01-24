package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DeptManager {

	public static void main(String[] args) {
		DeptManager mgr = new DeptManager();
		for (int i = 1; i < 10; i++) {
			Dept d = new Dept();
			d.setDeptno(i);
			d.setDname("DName" + i);
			if ((i % 2) == 0)
				d.setLoc("Hyd");
			else
				d.setLoc("Blr");
			mgr.create(d);
		}
		Dept d = new Dept();
		d.setDeptno(2);
		d.setDname("HR");
		d.setLoc("Pnq");
		mgr.list.forEach(System.out::println);
		mgr.update(d);
		System.out.println("Delete of 4 " + mgr.delete((dept) -> dept.getDeptno() == 4));
		System.out.println("Delete of 40 " + mgr.delete((dept) -> dept.getDeptno() == 4));
		System.out.println("Delete all for Hyd" + mgr.delete((dept) -> dept.getLoc().equals("Hyd")));
		System.out.println("Delete all for HR" + mgr.delete((dept) -> dept.getDname().equals("HR")));
		System.out.println("Delete all for deptno>5 and loc is Blr" 
				+ mgr.delete((dept) -> dept.getDeptno() > 5 && dept.getLoc().equals("Blr")));
		
		mgr.list.forEach(System.out::println);
		// printl ->mgr.list

	}

	private List<Dept> list = new ArrayList<>();

	public void create(Dept d) {
		list.add(d);
	}

	public List<Dept> list() {
		return list;
	}

	public boolean delete(Predicate<Dept> pred){
		return list.removeIf(pred);
}

	/*public boolean delete(int deptno) {
		return list.removeIf((d) -> d.getDeptno() == deptno);
		}
		*/
	

	public boolean update(Dept dept) {
		list.replaceAll((d) ->{
			if (d.getDeptno() == dept.getDeptno())
				return dept;
			else
				return d;
		});
		return true;
	}

}
