package loki.love2code.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InsturnctorDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column (name="youtube_channel")
	private String youtubechannal;
	
	@Column(name="hobby")
	private String hobby;

	@OneToOne(mappedBy = "insturnctorDetails",cascade = {CascadeType.DETACH,
			CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Instructor instructor;
	
	
	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public InsturnctorDetails() {
		
	}
	
	@Override
	public String toString() {
		return "InsturnctorDetails [id=" + id + ", youtubechannal=" + youtubechannal + ", hobby=" + hobby + "]";
	}

	public InsturnctorDetails(String youtubechannal, String hobby) {
		super();
		this.youtubechannal = youtubechannal;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutubechannal() {
		return youtubechannal;
	}

	public void setYoutubechannal(String youtubechannal) {
		this.youtubechannal = youtubechannal;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	
	
}
