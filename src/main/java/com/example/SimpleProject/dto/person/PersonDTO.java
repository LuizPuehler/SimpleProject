package com.example.SimpleProject.dto.person;

import java.util.List;

public record PersonDTO(Long id, String name, String lastName, String colorFavourite, Double height, List<Long> idAddress) {}