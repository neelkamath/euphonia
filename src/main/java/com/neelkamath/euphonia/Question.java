package com.neelkamath.euphonia;

import java.util.Set;

public class Question {
    private String question;
    /**
     * Four options, of which one is the correct answer.
     */
    private Set<String> options;
    private String answer;

    public Question(String question, Set<String> options, String answer) {
        if (options.size() != 4) throw new Error("There must be four options");
        if (!options.contains(answer)) throw new Error("One of the options must be the answer");
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public Set<String> getOptions() {
        return options;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return String.format("Question: %s, Options: %s, Answer: %s", question, options, answer);
    }
}
