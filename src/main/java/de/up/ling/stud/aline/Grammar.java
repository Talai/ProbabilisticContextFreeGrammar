package de.up.ling.stud.aline;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Aline Castendiek on 06.12.15.
 * Class for a generic grammar class. Saves all rules in a hash set
 * and prints out all rules after adding them.
 */
// Grammar can only be used with Rule related classes.
public class Grammar <RuleType extends Rule> {
    private final Set<RuleType> rules;

    public Grammar() {
        this.rules = new HashSet<>();
    }

    public void addRule(RuleType rule) {
        rules.add(rule);
    }

    @Override
    public String toString() {
        // Using '+' for concatenating strings is not very efficient.
        // StringBuilder saves strings and concatenates them at the end.
        StringBuilder sb = new StringBuilder();
        rules.forEach(rule -> sb.append(rule).append("\n"));
        return sb.toString();
    }
}
