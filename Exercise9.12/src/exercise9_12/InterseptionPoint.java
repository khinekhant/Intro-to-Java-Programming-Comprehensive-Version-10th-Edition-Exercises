package exercise9_12;

public class InterseptionPoint {
	  private double a;
	    private double b;
	    private double c;
	    private double d;
	    private double e;
	    private double f;

	    public InterseptionPoint(double a, double b, double c, double d, double e, double f) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	        this.d = d;
	        this.e = e;
	        this.f = f;
	    }

	    public double getA() {
	        return a;
	    }

	    public void setA(double a) {
	        this.a = a;
	    }

	    public double getB() {
	        return b;
	    }

	    public void setB(double b) {
	        this.b = b;
	    }

	    public double getC() {
	        return c;
	    }

	    public void setC(double c) {
	        this.c = c;
	    }

	    public double getD() {
	        return d;
	    }

	    public void setD(double d) {
	        this.d = d;
	    }

	    public double getE() {
	        return e;
	    }

	    public void setE(double e) {
	        this.e = e;
	    }

	    public double getF() {
	        return f;
	    }

	    public void setF(double f) {
	        this.f = f;
	    }

	    public double getX() {
	        return (e * d - b * f) / ab_Minus_bc();
	    }


	    public double getY() {
	        return (a * f - e * c) / ab_Minus_bc();
	    }


	    /** If there is no solution the lines are parallel **/
	    public boolean isSolvable(){
	        return ab_Minus_bc() != 0;
	    }

	    private double ab_Minus_bc(){
	        return a * d - b * c;
	    }
}
