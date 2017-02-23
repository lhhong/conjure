package test.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import javax.annotation.Generated;

@JsonDeserialize(
        builder = PrimitiveOptionalsExample.Builder.class
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@Generated("com.palantir.conjure.gen.java.types.BeanGenerator")
public final class PrimitiveOptionalsExample {
    private final OptionalDouble num;

    private final Optional<Boolean> bool;

    private final OptionalInt integer;

    private PrimitiveOptionalsExample(@JsonProperty("num") OptionalDouble num, @JsonProperty("bool") Optional<Boolean> bool, @JsonProperty("integer") OptionalInt integer) {
        validateFields(num, bool, integer);
        this.num = num;
        this.bool = bool;
        this.integer = integer;
    }

    @JsonProperty("num")
    public OptionalDouble getNum() {
        return this.num;
    }

    @JsonProperty("bool")
    public Optional<Boolean> getBool() {
        return this.bool;
    }

    @JsonProperty("integer")
    public OptionalInt getInteger() {
        return this.integer;
    }

    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof PrimitiveOptionalsExample && equalTo((PrimitiveOptionalsExample) other));
    }

    private boolean equalTo(PrimitiveOptionalsExample other) {
        return this.num.equals(other.num) && this.bool.equals(other.bool) && this.integer.equals(other.integer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, bool, integer);
    }

    @Override
    public String toString() {
        return new StringBuilder("PrimitiveOptionalsExample").append("{")
                .append("num").append(": ").append(num)
                .append(", ").append("bool").append(": ").append(bool)
                .append(", ").append("integer").append(": ").append(integer)
            .append("}")
            .toString();
    }

    public static PrimitiveOptionalsExample of(OptionalDouble num, Boolean bool, OptionalInt integer) {
        return builder()
            .num(num)
            .bool(Optional.of(bool))
            .integer(integer)
            .build();
    }

    private static void validateFields(OptionalDouble num, Optional<Boolean> bool, OptionalInt integer) {
        List<String> missingFields = null;
        missingFields = addFieldIfMissing(missingFields, num, "num");
        missingFields = addFieldIfMissing(missingFields, bool, "bool");
        missingFields = addFieldIfMissing(missingFields, integer, "integer");
        if (missingFields != null) {
            throw new IllegalStateException("Some required fields have not been set: " + missingFields);
        }
    }

    private static List<String> addFieldIfMissing(List<String> prev, Object fieldValue, String fieldName) {
        List<String> missingFields = prev;
        if (fieldValue == null) {
            if (missingFields == null) {
                missingFields = new ArrayList<>(3);
            }
            missingFields.add(fieldName);
        }
        return missingFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private OptionalDouble num = OptionalDouble.empty();

        private Optional<Boolean> bool = Optional.empty();

        private OptionalInt integer = OptionalInt.empty();

        private Builder() {
        }

        public Builder from(PrimitiveOptionalsExample other) {
            num(other.getNum());
            bool(other.getBool());
            integer(other.getInteger());
            return this;
        }

        @JsonSetter("num")
        public Builder num(OptionalDouble num) {
            this.num = Objects.requireNonNull(num, "num cannot be null");
            return this;
        }

        public Builder num(double num) {
            this.num = OptionalDouble.of(num);
            return this;
        }

        @JsonSetter("bool")
        public Builder bool(Optional<Boolean> bool) {
            this.bool = Objects.requireNonNull(bool, "bool cannot be null");
            return this;
        }

        public Builder bool(boolean bool) {
            this.bool = Optional.of(bool);
            return this;
        }

        @JsonSetter("integer")
        public Builder integer(OptionalInt integer) {
            this.integer = Objects.requireNonNull(integer, "integer cannot be null");
            return this;
        }

        public Builder integer(int integer) {
            this.integer = OptionalInt.of(integer);
            return this;
        }

        public PrimitiveOptionalsExample build() {
            return new PrimitiveOptionalsExample(num, bool, integer);
        }
    }
}