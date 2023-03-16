package ir.home.spring.booking.model.utils;

import ir.home.spring.booking.model.EstateAttribute;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Converter
public class EstateAttributeConverter implements AttributeConverter<List<EstateAttribute>, String> {
    public String convertToDatabaseColumn(List<EstateAttribute> properties) {
        return properties.stream().map(EstateAttribute::name).collect(Collectors.joining(","));
    }

    public List<EstateAttribute> convertToEntityAttribute(String s) {
        return Arrays.stream(s.split(",")).map(EstateAttribute::valueOf).toList();
    }
}
