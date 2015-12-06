package de.up.ling.stud.aline;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Aline Castendiek on 06.12.15.
 * Class for a generic grammar class. Saves all rules in a hash set
 * and prints out all rules after adding them.
 */
public class Grammar <Symbol> {
    private final Set<ProbabilisticRule<Symbol>> rules;

    public Grammar() {
        this.rules = new HashSet<>();
    }

    public void addRule(ProbabilisticRule<Symbol> rule) {
        rules.add(rule);
        System.out.println(rules);
    }
}
