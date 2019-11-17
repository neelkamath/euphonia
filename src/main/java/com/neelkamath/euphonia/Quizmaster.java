package com.neelkamath.euphonia;

import com.neelkamath.euphonia.api.Api;
import com.neelkamath.euphonia.api.ArtistMetadata;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Quizmaster {
    private ArtistMetadata metadata;
    private Quiz quiz;
    private Api api;

    public Quizmaster(ArtistMetadata metadata) throws IOException {
        this.metadata = metadata;
        this.api = new Api();
        this.quiz = new Quiz(createGenreQuestion(), createReleasedQuestion(), createCountryQuestion());
    }

    public Quiz getQuiz() {
        return quiz;
    }

    private Question createGenreQuestion() throws IOException {
        String answer = api.getTrackMetadata(metadata.getArtist()).getGenre();
        Set<String> options = new HashSet<>();
        options.add(answer);
        options.add("Pop");
        options.add("EDM");
        options.add("Classical");
        if (options.size() < 4) options.add("Rock"); // One of the hardcoded options might be the same as the answer.
        return new Question("Which genre does this track belong to?", options, answer);
    }

    private Question createReleasedQuestion() throws IOException {
        String answer = Integer.toString(api.getAlbumMetadata(metadata.getId()).getReleased());
        Set<String> options = new HashSet<>();
        options.add(answer);
        options.add(getRandomYear());
        options.add(getRandomYear());
        options.add(getRandomYear());
        if (options.size() < 4)
            options.add(getRandomYear()); // One of the hardcoded options might be the same as the answer.
        return new Question("In which year was this album released in?", options, answer);
    }

    /**
     * @return Random year between 1979 and 2020.
     */
    private String getRandomYear() {
        return Integer.toString(ThreadLocalRandom.current().nextInt(1980, 2020));
    }

    private Question createCountryQuestion() throws IOException {
        String answer = api.getArtistsCountry(metadata.getId());
        Set<String> options = new HashSet<>();
        options.add(answer);
        options.add("US");
        options.add("France");
        options.add("India");
        if (options.size() < 4) options.add("Canada"); // One of the hardcoded options might be the same as the answer.
        return new Question("Which country is this artist from?", options, answer);
    }
}
