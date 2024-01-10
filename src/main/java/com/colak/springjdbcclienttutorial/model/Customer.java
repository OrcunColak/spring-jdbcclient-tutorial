package com.colak.springjdbcclienttutorial.model;


import java.time.LocalDate;

public record Customer(int id, String name, String lastname, LocalDate birthday) {
}
