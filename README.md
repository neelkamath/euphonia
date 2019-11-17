# Euphonia

This is my UE18CS208C project. It's a trivia application for music.

## Installation

1. Install a [Java JDK or JRE](http://www.oracle.com/technetwork/java/javase/downloads/index.html) version 8 or higher.
1. Clone the repository using one of the following methods.
    - SSH: `git clone git@github.com:neelkamath/euphonia.git`
    - HTTPS: `git clone https://github.com/neelkamath/euphonia.git`
1. `cd euphonia`
1. Build the project.
    - Windows: `gradlew.bat shadowJar`
    - Other: `./gradlew shadowJar`
1. Copy the `build/libs/euphonia-all.jar` JAR to the project you'd like to use it in.

## Usage

We are using the Musixmatch API to retrieve music data. Since there is a lot of missing metadata, you might be unable to generate quizzes on most artists. The artist `Skrillex` has been tested and is known to successfully generate quizzes. 

There are two APIs you should use.

The first API, `Api.searchArtists()`, retrieves artist metadata. This is used for finding the exact artist to generate a quiz on. For example, there are multiple artists named `U2`. Using this API, you can select the one you have in mind. 

The second API, `Quizmaster.getQuiz()`, gets a quiz on a specified artist. The quiz will contain questions such as one which asks which country an artist is from. Simply pass an artist you selected using the `Api.searchArtists()` API to the `Quizmaster` API.

Here's an example of the two APIs we discussed.
```java
List<ArtistMetadata> artists = new Api().searchArtists("Skrillex"); // The first API.
System.out.println(new Quizmaster(artists.get(0)).getQuiz()); // The second API.
```

## Contributing

The subpackages in `com.neelkamath.api` (e.g., `com.neelkamath.api.artist_albums_get`) contain generated code. The package is named according to the Musixmatch API method it stores POJOs for (e.g., the URL `http://api.musixmatch.com/ws/1.1/artist.albums.get` would have its POJOs stored in the `com.neelkamath.api.artists_albums_get` package). The POJOs are generated using the [jsonschema2pojo](http://www.jsonschema2pojo.org/) website.

## License

This project is under the [MIT License](LICENSE).