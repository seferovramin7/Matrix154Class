package org.lessons.Lesson_14;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Circle {

    public static double radius;

    public static final double PI = 3.14;

    public static final String DB_NAME = "";

    public String reng;
    private String forma;



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Circle circle = (Circle) o;

        return new EqualsBuilder()
                .append(radius, circle.radius)
                .append(reng, circle.reng)
                .append(forma, circle.forma).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(radius).append(reng).append(forma).toHashCode();
    }
}
