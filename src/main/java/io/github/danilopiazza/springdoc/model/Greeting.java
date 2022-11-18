package io.github.danilopiazza.springdoc.model;

public class Greeting {
    private final Tone tone;
    private final String message;

    public static Greeting formal(String name) {
        return new Greeting(Tone.FORMAL, "Good day, " + name);
    }

    public static Greeting casual(String name) {
        return new Greeting(Tone.CASUAL, "Hi, " + name);
    }

    private Greeting(Tone tone, String message) {
        this.tone = tone;
        this.message = message;
    }

    public Tone getTone() {
        return tone;
    }

    public String getMessage() {
        return message;
    }
}
