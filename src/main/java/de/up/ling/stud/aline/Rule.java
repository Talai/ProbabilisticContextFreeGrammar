package de.up.ling.stud.aline;

import java.util.List;

/**
 * Created by Aline Castendiek on 06.12.15.
 * Class for a generic grammar rule (without probabilities).
 */
// Generic template
public class Rule<Symbol> {
    private final Symbol lhs;
    private final List<Symbol> rhs;

    // Use 'this' to access global class variable
    public Rule(Symbol lhs, List<Symbol> rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public Symbol getLhs() {
        return lhs;
    }

    public List<Symbol> getRhs() {
        return rhs;
    }

    public int getArity() {
        return rhs.size();
    }

    @Override
    // toString method is used to print out stuff.
    public String toString() {
        return getLhs() + " -> " + getRhs();
    }
}
