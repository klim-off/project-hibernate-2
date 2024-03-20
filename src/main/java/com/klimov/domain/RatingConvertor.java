package com.klimov.domain;

import jakarta.persistence.AttributeConverter;

public class RatingConvertor implements AttributeConverter<Rating,String> {

    @Override
    public String convertToDatabaseColumn(Rating attribute) {

        return attribute.getValue();
    }

    @Override
    public Rating convertToEntityAttribute(String dbData) {
        Rating[] ratings = Rating.values();
        for (Rating rating : ratings) {
            if (rating.getValue().equals(dbData)){
                return rating;
            }
        }
        return null;
    }
}
