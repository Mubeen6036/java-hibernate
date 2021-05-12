package domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long Id;
	private String name;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	abstract void makeNoise();
}
