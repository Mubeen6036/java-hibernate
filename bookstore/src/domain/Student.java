package domain;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="guide_id")
	private Guide guide;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Guide getGuide() {
		return guide;
	}
	public void setGuide(Guide guide) {
		this.guide = guide;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==this) return true;
		if(obj == null) return false;
		if(!(obj instanceof Student)) return false;
		Student s = (Student)obj;
		if(Objects.equals(s.getId(), this.getId()))return true;
		return false;
	}
	
	/*@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hashCode(this.id);
	}*/
	
	
}
