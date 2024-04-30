package ru.itimur;

import java.util.Objects;

public class User {
    private final Integer id;

    private final String password;

    private final String name;

    private final Role role;

    private User(Builder builder) {
        this.id = Objects.requireNonNull(builder.id);
        this.password = Objects.requireNonNull(builder.password);
        this.name = builder.name;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer id;

        private String password;

        private String name;

        private Role role;

        private Builder(){}

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder role(Role role) {
            this.role = role;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
