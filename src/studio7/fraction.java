package studio7;

public class fraction {
private int numer;
private int denom;

public fraction(int n, int d) {
	n=numer;
	d=denom;
}

public String add(fraction f){
	numer = this.numer*f.denom;
	denom = this.denom*f.numer;
	return simplify();
}

public String reciprocal() {
	return (denom+"/"+numer);
}

public String multiply(fraction f) {
	numer = this.numer*f.numer;
	denom = this.denom*f.denom;
	return (numer+"/"+denom);
}

public int gcd() {
	int greaterV = Math.max(numer, denom);
	for (int i=greaterV; i>=2; i--) {
		if (numer%i==0&&denom%i==0){
			return i;
		}
	}
	return 1;
}

public String simplify() {
	denom = this.denom/gcd();
	numer = this.numer/gcd();
	return (denom+"/"+numer);
}
}
