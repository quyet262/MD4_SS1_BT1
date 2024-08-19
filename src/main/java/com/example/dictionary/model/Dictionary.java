package com.example.dictionary.model;



public class Dictionary {
    private int id;
    private String english;
    private String vietnamese;

    public Dictionary() {
    }

    public Dictionary(int id, String english, String vietnamese) {
        this.id = id;
        this.english = english;
        this.vietnamese = vietnamese;
    }

    public Dictionary( String vietnamese) {
        this.vietnamese = vietnamese;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getVietnamese() {
        return vietnamese;
    }

    public void setVietnamese(String vietnamese) {
        this.vietnamese = vietnamese;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "id=" + id +
                ", english='" + english + '\'' +
                ", vietnamese='" + vietnamese + '\'' +
                '}';
    }
}
