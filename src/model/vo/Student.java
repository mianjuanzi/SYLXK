package model.vo;

public class Student {
	private String sid;
	private String pwd;
	private String name;
	private String sex;
	private String major;
	private String stuclass;
	private String mail;
	private String qq;
	private String tel;
	public Student(String sid, String pwd, String name, String sex,
			String major, String stuclass, String mail, String qq, String tel) {
		super();
		this.sid = sid;
		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.major = major;
		this.stuclass = stuclass;
		this.mail = mail;
		this.qq = qq;
		this.tel = tel;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String cid) {
		this.sid = cid;
	}
	public String getPwd() {
		return pwd;
	}
	public Student() {
		super();
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
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getStuclass() {
		return stuclass;
	}
	public void setStuclass(String stuclass) {
		this.stuclass = stuclass;
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
	@Override
	public String toString() {
		return "Student [cid=" + sid + ", pwd=" + pwd + ", name=" + name
				+ ", sex=" + sex + ", major=" + major + ", stuclass="
				+ stuclass + ", mail=" + mail + ", qq=" + qq + ", tel=" + tel
				+ "]";
	}

	

}
