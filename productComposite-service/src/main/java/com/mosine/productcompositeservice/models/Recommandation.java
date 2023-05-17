package com.mosine.productcompositeservice.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Recommandation {
    private Long idrecommandation;
    private String author;

    private String content;

    private String subject;

    private int   rate;
}
