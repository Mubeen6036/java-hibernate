package domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class Cat extends Animal{

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("CAT");
	}
	
}
