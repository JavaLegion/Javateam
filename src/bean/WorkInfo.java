package bean;

public class WorkInfo {
	String workid;
	String workname;
	String worktime;
	String sworkdate;
	String fworkdate;
	String worksalary;
	String workreq;
	public String getWorkid() {
		return workid;
	}
	public void setWorkid(String workid) {
		this.workid = workid;
	}
	public String getWorkname() {
		return workname;
	}
	public void setWorkname(String workname) {
		this.workname = workname;
	}
	public String getWorktime() {
		return worktime;
	}
	public void setWorktime(String worktime) {
		this.worktime = worktime;
	}
	public String getSworkdate() {
		return sworkdate;
	}
	public void setSworkdate(String sworkdate) {
		this.sworkdate = sworkdate;
	}
	public String getFworkdate() {
		return fworkdate;
	}
	public void setFworkdate(String fworkdate) {
		this.fworkdate = fworkdate;
	}
	public String getWorksalary() {
		return worksalary;
	}
	public void setWorksalary(String worksalary) {
		this.worksalary = worksalary;
	}
	public String getWorkreq() {
		return workreq;
	}
	public void setWorkreq(String workreq) {
		this.workreq = workreq;
	}
	public WorkInfo(String workid, String workname, String worktime, String sworkdate, String fworkdate,
			String worksalary, String workreq) {
		super();
		this.workid = workid;
		this.workname = workname;
		this.worktime = worktime;
		this.sworkdate = sworkdate;
		this.fworkdate = fworkdate;
		this.worksalary = worksalary;
		this.workreq = workreq;
	}
	
}
