package listmap;
 import java.util.*;
public class Employee {
	private int id;
	private String empNa;
	private List<String> subemp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpNa() {
		return empNa;
	}
	public void setEmpNa(String empNa) {
		this.empNa = empNa;
	}
	public List<String> getSubemp() {
		return subemp;
	}
	public void setSubemp(List<String> subemp) {
		this.subemp = subemp;
	}

}
