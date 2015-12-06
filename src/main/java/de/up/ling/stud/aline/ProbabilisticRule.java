package de.up.ling.stud.aline;

import java.util.List;

/**
 * Created by Aline Castendiek on 06.12.15.
 * Class for a generic probabilistic grammar rule.
 * Inherits all variables and methods from Rule class and
 * additionally implements probability.
 */
// with 'extends', inherit all variables and methods from Rule.
public class ProbabilisticRule<Symbol> extends Rule<Symbol> {
    private final double prob;

    public ProbabilisticRule(Symbol lhs, List<Symbol> rhs, double prob) {
        // 'super' uses constructor from inherited class.
        super(lhs, rhs);
        this.prob = prob;
    }

    public double getProb() {
        return prob;
    }

    @Override
    // toString method is used to print out stuff.
    public String toString() {
        return super.toString() + " [" + getProb() + "]";
    }

/*  // IntelliJ generated hash function. Works incorrectly (does not check lhs and rhs!).
    @Override
    public boolean equals(Object o) {
        // Compare address of objects
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        // Typecast from Object to Probabilistic Rule
        ProbabilisticRule<?> that = (ProbabilisticRule<?>) o;

        // Double method 'compare' returns 0 if both arguments are equal
        return Double.compare(that.prob, prob) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(prob);
        return (int) (temp ^ (temp >>> 32));
    }*/
}
