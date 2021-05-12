package domain;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
@Entity
public class Friend {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Set<String> getNicknames() {
		return nicknames;
	}

	public void setNicknames(Set<String> nicknames) {
		this.nicknames = nicknames;
	}

	@ElementCollection
	@CollectionTable(name="friend_nicknames", joinColumns=@JoinColumn(name="friend_id"))
	@Column(name="nick_name")
	private Set<String> nicknames = new HashSet<>();
	
	
}
