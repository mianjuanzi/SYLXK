package model.vo;

public class Select {
	@Override
	public String toString() {
		return "Select [cid=" + cid + ", cname=" + cname + ", sid=" + sid
				+ ", sname=" + sname + "]";
	}
	private String cid;
	private String cname;
	private String sid;
	private String sname;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Select(String cid, String cname, String sid, String sname) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.sid = sid;
		this.sname = sname;
	}
	public Select() {
		// TODO Auto-generated constructor stub
	}
}
