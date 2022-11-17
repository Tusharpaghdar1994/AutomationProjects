package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagEx {
	@Test(priority = 2)
	public void z() {
		Reporter.log("z method",true);
	}
	@Test
	public void e() {
		Reporter.log("e method",true);
	}
	@Test(priority = 1)
	public void x() {
		Reporter.log("x method",true);
	}
	@Test(priority = 2)
	public void b() {
		Reporter.log("b method",true);
	}
	@Test
	public void d() {
		Reporter.log("d method",true);
	}
	@Test(priority = 0)
	public void c() {
		Reporter.log("c method",true);
	}
	@Test
	public void y() {
		Reporter.log("y method",true);
	}
	@Test
	public void a() {
		Reporter.log("a method",true);
	}
	@Test(priority = 0)
	public void f() {
		Reporter.log("f method",true);
	}
	@Test(priority = 1)
	public void w() {
		Reporter.log("w method",true);
	}
}
