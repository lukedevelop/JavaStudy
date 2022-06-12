package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MemberDTO {
	Integer id;
	Date birth;
	String tell;
	Double height;
	Date reg_date;
	String name;
	Integer friend;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public MemberDTO() {
		
	}
	
	public MemberDTO(Integer id, String name, String birth,
			       String tell, Double height,  Integer friend) {
		super();
		this.id = id;
		this.name = name;
		try {
			this.birth = sdf.parse(birth);
		} catch (ParseException e) {
			// TODO: handle exception
		}
		this.tell = tell;
		this.height = height;
		this.friend = friend;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public Date getBirth() {
		return birth;
	}

	
	public String getBirthStr() {
		return sdf.format(birth);
	}


	public void setBirth(Date birth) {
		this.birth = birth;
	}




	public String getTell() {
		return tell;
	}




	public void setTell(String tell) {
		this.tell = tell;
	}




	public Double getHeight() {
		return height;
	}




	public void setHeight(Double height) {
		this.height = height;
	}




	public Date getReg_date() {
		return reg_date;
	}




	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Integer getFriend() {
		return friend;
	}




	public void setFriend(Integer friend) {
		this.friend = friend;
	}




	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", name=" + name + ", birth=" + birth + ", tell=" + tell + ", height=" + height
				+ ", reg_date=" + reg_date + ", friend=" + friend + "]";
	}


}
