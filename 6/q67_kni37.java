class RealNumber {
    public double realValue;

    public RealNumber() {
        this(0.0);
    }

    public RealNumber(double realValue) {
        this.realValue = realValue;
    }

    @Override
    public String toString() {
        return "RealPart: " + realValue;
    }
}

public class q67_kni37 {
    public static void main(String[] args) {
        RealNumber rn1 = new RealNumber(2.69);
        System.out.println(rn1);
        System.out.println("----------------");
        ComplexNumber cn1 = new ComplexNumber();
        System.out.println(cn1);
        System.out.println("----------------");
        ComplexNumber cn2 = new ComplexNumber(5.0, 7.0);
        System.out.println(cn2);
    }
}

/*

Introducing: @override toString()

RealPart: 2.69
----------------
RealPart: 1.0
ImaginaryPart: 1.0
----------------
RealPart: 5.0
ImaginaryPart: 7.0

 */