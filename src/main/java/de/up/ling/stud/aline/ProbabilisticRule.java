package de.up.ling.stud.aline;

import java.util.List;

/**
 * Created by Aline Castendiek on 06.12.15.
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
}
