package in.kamlesh.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Dtls")
public class UserDtls {

	@Id
	@Column(name="User_ID")
	private Integer userId;
	@Column(name="User_Name")
	private String username;
	@Column(name="User_Email")
	private String userEmail;
	@Column(name="User_Age")
	private Integer userAge;
	@Column(name="User_Count")
	private String userCount;

	
			
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getUserCount() {
		return userCount;
	}
	public void setUserCount(String userCount) {
		this.userCount = userCount;
	}
	@Override
	public String toString() {
		return "UserDtls [userId=" + userId + ", username=" + username + ", userEmail=" + userEmail + ", userAge="
				+ userAge + ", userCount=" + userCount + "]";
	}
	
	
		
}
