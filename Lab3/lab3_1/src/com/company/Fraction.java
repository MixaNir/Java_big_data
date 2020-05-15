package com.company;

public class Fraction {
    private int[] frac;
    private int sign;
    public  Fraction(){}
    public  Fraction(int num, int denum){
        frac = new int[2];
        frac[0] = num;
        frac[1] = Math.abs(denum);
        if (num >= 0){
            sign = 1;
        } else{
            sign = -1;
        }
    }
    public  Fraction(int[] num){this.frac = num;}

    public int get_sign(){return sign;}
    public String get_fraction(){return Integer.toString(frac[0])+"/"+Integer.toString(frac[1]);}
    public Fraction Sum (Fraction first, Fraction second){
        int temp_denominator;
        int temp_numerator;
        if(first.frac[1] == second.frac[1]){
            temp_denominator = first.frac[1];
            temp_numerator = first.frac[0] * first.sign + second.frac[0] * second.sign;
        } else{
            temp_denominator = first.frac[1] * second.frac[1];
            temp_numerator = first.frac[0] * second.frac[1]  * first.sign + second.frac[0] * first.frac[1] * second.sign;
        }
        if (temp_numerator >= 0){
            sign = 1;
        } else {
            sign = -1;
        }
        int gcd = Get_GCD(temp_numerator, temp_denominator);
        frac[0] = (temp_numerator / gcd);
        frac[1] = (temp_denominator / gcd);
        return this;
    }

    public Fraction Subtraction(Fraction first, Fraction second){
        int temp_denominator;
        int temp_numerator;
        if(first.frac[1] == second.frac[1]){
            temp_denominator = first.frac[1];
            temp_numerator = first.frac[0] * first.sign - second.frac[0] * second.sign;
        } else{
            temp_denominator = first.frac[1] * second.frac[1];
            temp_numerator = first.frac[0] * second.frac[1]  * first.sign - second.frac[0] * first.frac[1] * second.sign;
        }
        if (temp_numerator >= 0){
            sign = 1;
        } else {
            sign = -1;
        }
        int gcd = Get_GCD(temp_numerator, temp_denominator);
        frac[0] = temp_numerator / gcd;
        frac[1] = temp_denominator / gcd;
        return this;
    }

    public Fraction Multiplication(Fraction first, Fraction second){
        int temp_denominator = first.frac[1] * second.frac[1];
        int temp_numerator = first.frac[0] * first.sign * second.frac[0] * second.sign;
        if (temp_numerator >= 0){
            sign = 1;
        } else {
            sign = -1;
        }
        int gcd = Get_GCD(temp_numerator, temp_denominator);
        frac[0] = temp_numerator / gcd;
        frac[1] = temp_denominator / gcd;
        return this;
    }

    public Fraction Division(Fraction first, Fraction second){
        int temp_denominator = first.frac[1] * second.frac[0];
        int temp_numerator = first.frac[0] * first.sign * second.frac[1] * second.sign;
        if (temp_numerator >= 0){
            sign = 1;
        } else {
            sign = -1;
        }
        int gcd = this.Get_GCD(temp_numerator, temp_denominator);
        frac[0] = temp_numerator / gcd;
        frac[1] = temp_denominator / gcd;
        return this;
    }

    public int Get_GCD(int first, int second){
        while (first != second){
            if (first > second){
                first = first - second;
            } else {
                second = second - first;
            }
        }
        return (first);
    }

    public Fraction[] ChangeFraction(Fraction[] frac){
        for (int i = 0; i < frac.length; i += 2){
            if (i+1 < frac.length){
                frac[i] = frac[i].Sum(frac[i], frac[i+1]);
            }
        }
        return frac;
    }
}
