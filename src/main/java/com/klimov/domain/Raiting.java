package com.klimov.domain;

public enum Raiting {
    G("G"),
    PG("PG"),
    PG13("PG-13"),
    R("R"),
    NC17("NC-17");

    private final String value;

    Raiting(String value) {
        this.value = value;
    }
}
