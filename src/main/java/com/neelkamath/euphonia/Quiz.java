package com.neelkamath.euphonia;

/**
 * A quiz on an artist.
 */
public class Quiz {
    /**
     * A question on which genre a particular track belongs to.
     */
    private Question genreQuestion;
    /**
     * A question on when an album was released.
     */
    private Question releasedQuestion;
    /**
     * A question on which country the artist is from.
     */
    private Question countryQuestion;

    public Quiz(Question genreQuestion, Question releasedQuestion, Question countryQuestion) {
        this.genreQuestion = genreQuestion;
        this.releasedQuestion = releasedQuestion;
        this.countryQuestion = countryQuestion;
    }

    public Question getGenreQuestion() {
        return genreQuestion;
    }

    public Question getReleasedQuestion() {
        return releasedQuestion;
    }

    public Question getCountryQuestion() {
        return countryQuestion;
    }

    @Override
    public String toString() {
        return String.format(
                "Genre Question: %s\nReleasedQuestion: %s\nCountry Question: %s\n",
                genreQuestion,
                releasedQuestion,
                countryQuestion
        );
    }
}
