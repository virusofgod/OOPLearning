package ru.virusofgod;

public class Fraction {
    int numerator;
    int denumerator = 1;

   public Fraction(int numerator, int denumerator){
          if(denumerator==0){
              System.out.println("denumerator can't be zero");
              return;
          }
          this.numerator = numerator;
          this.denumerator = denumerator;
  }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denumerator=" + denumerator +
                '}';
    }
}
