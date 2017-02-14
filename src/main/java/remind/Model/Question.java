package remind.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	@GeneratedValue
	int q_id;
	
	@Column(name="q_user", nullable=false)
	String q_user;
	
	@Column(name="title", nullable=false)
	String title;
	
	@Column(name="content", nullable=false)
	String content;
	
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	
	public void setQ_user(String q_user) {
		this.q_user = q_user;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
}
