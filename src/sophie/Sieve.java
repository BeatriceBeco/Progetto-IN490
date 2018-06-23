package primes.sophie;

import java.math.BigInteger;
import primes.erathostenes;

public class Sieve extends primes.Sieve<Token> {

		//constructors
	public Sieve(String[] args) {
		super(args, new Counter()) ;
		System.out.println("new erathostenes Sieve with string args");
		
		this.mainloop();
		this.print();
	}
		//setters

		//getters
	public	boolean testloop(Token token) {
		return ( token.value().compareTo(this.getmax()) != 1) ;
	}
		
	public void mainloop() {
		Token token;
		
		token = next.get();
		
		while (testloop(token)) {
			this.seteuler();
			this.set(new Filter(this.next, token.value()));
			token = this.next.get();
		}
	}
		
	public Token get() {
		return null;
	}
}
