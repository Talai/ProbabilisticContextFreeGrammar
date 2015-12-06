package de.up.ling.stud.aline;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aline Castendiek on 06.12.15.
 * Class for testing grammar and rule implementations.
 */
public class App {
    public static void main( String[] args ) {
        // Creating grammar for probabilistic rules
        Grammar<ProbabilisticRule<String>> testGrammar = new Grammar<>();
        List<String> rhs = new ArrayList<>();
        rhs.add("NP");
        rhs.add("VP");
        ProbabilisticRule<String> testRule = new ProbabilisticRule<>("S",rhs,0.9);
        ProbabilisticRule<String> testRule2 = new ProbabilisticRule<>("XP",rhs,0.2);
        testGrammar.addRule(testRule);
        testGrammar.addRule(testRule2);
        System.out.println("PCFG:");
        System.out.println(testGrammar);

        // Creating grammar without probabilities
        Grammar<Rule<String>> testGrammar2 = new Grammar<>();
        List<String> rhs2 = new ArrayList<>();
        rhs2.add("Det");
        rhs2.add("N");
        Rule<String> testRule3 = new Rule<>("NP",rhs2);
        Rule<String> testRule4 = new Rule<>("XP",rhs2);
        testGrammar2.addRule(testRule3);
        testGrammar2.addRule(testRule4);
        System.out.println("CFG:");
        System.out.println(testGrammar2);
    }
}
