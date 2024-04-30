package ru.itimur;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .id(100)
                .name("Timur")
                .role(Role.ADMIN)
                .password("12345")
                .build();


    }
}