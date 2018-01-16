package model.vo;

public class Teacher {
	public Teacher() {
		super();
	}
	private String tid;
	private String pwd;
	private String name;
	private String sex;
	private String age;
	private String major;
	private String level;
	private String mail;
	private String qq;
	private String tel;
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Teacher(String tid, String pwd, String name, String sex, String age,
			String major, String level, String mail, String qq, String tel) {
		super();
		this.tid = tid;
		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.major = major;
		this.level = level;
		this.mail = mail;
		this.qq = qq;
		this.tel = tel;
	}
	
}
