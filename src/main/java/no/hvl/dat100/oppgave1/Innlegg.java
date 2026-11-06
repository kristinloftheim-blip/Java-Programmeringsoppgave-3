package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	private int id;
	private int likes;
	private String bruker;
	private String dato;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		// TODO 
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		likes=0;
		throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.likes=likes;
		throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}
	
	public String getBruker() {
		return bruker;
		throw new UnsupportedOperationException(TODO.method());

	}

	public void setBruker(String bruker) {
		this.bruker=bruker;
		throw new UnsupportedOperationException(TODO.method());
	}

	public String getDato() {
		return dato;
		throw new UnsupportedOperationException(TODO.method());
		
	}

	public void setDato(String dato) {
		this.dato=dato;
		throw new UnsupportedOperationException(TODO.method());
	}

	public int getId() {
		return id;
		throw new UnsupportedOperationException(TODO.method());

	}

	public void setId(int id){
		this.id=id;
		throw new UnsupportedOperationException(TODO.method());
	}

	public int getLikes() {
		return likes;
		throw new UnsupportedOperationException(TODO.method());

	}
	
	public void doLike () {
		likes++;
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean erLik(Innlegg innlegg) {
		return id == innlegg.getId();
		throw new UnsupportedOperationException(TODO.method());

	}
	
	@Override
	public String toString() {
		return id + "\n" + bruke + "\n" + dato + "\n" + likes + "\n" ;
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
