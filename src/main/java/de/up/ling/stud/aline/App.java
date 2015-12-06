package de.up.ling.stud.aline;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aline Castendiek on 06.12.15.
 * Class for testing grammar and rule implementations.
 */
public class App {
    public static void main( String[] args ) {
        Grammar<String> testGrammar = new Grammar<>();
        List<String> rhs = new ArrayList<>();
        rhs.add("NP");
        rhs.add("VP");
        ProbabilisticRule<String> testRule = new ProbabilisticRule<>("S",rhs,0.9);
        ProbabilisticRule<String> testRule2 = new ProbabilisticRule<>("XP",rhs,0.2);
        testGrammar.addRule(testRule);
        testGrammar.addRule(testRule2);
    }
}
