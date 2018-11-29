package Modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ClasseNaturezaJuridica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int IdClasseNaturezaJuridica;	
	private String ClasseNaturezaJuridica;
	

	public void setClasseNaturezaJuridica(String classeNaturezaJuridica) {
		ClasseNaturezaJuridica = classeNaturezaJuridica;
	}

	public int getIdClasseNaturezaJuridica() {
		return IdClasseNaturezaJuridica;
	}

	public String getClasseNaturezaJuridica() {
		return ClasseNaturezaJuridica;
	}

	
	
	

}
