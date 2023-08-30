
public class TestAlphaBeta {
public static void main(String[] args) {
	Alpha a = new Alpha();
	a.demo();
//	Beta bt = (Beta) a;
	
	Beta b = new Beta();
	b.test();
	b.demo();
	
	Alpha ab = b; //Upcasting (implicit)
	ab.demo();
//	ab.test(); // It will give error
	Beta ba = (Beta) ab; // Down-casting( Explicit)
	ba.demo();
	ba.test();
	
	
}
}
