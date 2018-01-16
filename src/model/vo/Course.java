package model.vo;

public class Course {
	private String cid;
	private String name;
	private String tid;
	private String time;
	private String content;
	private String req;
	private String test;
	private String tag;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getContent() {
		return content;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", name=" + name + ", tid=" + tid
				+ ", time=" + time + ", content=" + content + ", req=" + req
				+ ", test=" + test + ", tag=" + tag + "]";
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReq() {
		return req;
	}
	public void setReq(String req) {
		this.req = req;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Course(String cid, String name, String tid, String time,
			String content, String req, String test, String tag) {
		super();
		this.cid = cid;
		this.name = name;
		this.tid = tid;
		this.time = time;
		this.content = content;
		this.req = req;
		this.test = test;
		this.tag = tag;
	}
	public Course() {
		super();
	}
	
}
