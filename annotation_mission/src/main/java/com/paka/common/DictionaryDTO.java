package com.paka.common;

public class DictionaryDTO {

    private int sequence;
    private String language;
    private String word;
    private String mean;


    public DictionaryDTO(int sequence, String language, String word, String mean) {
        this.sequence = sequence;
        this.language = language;
        this.word = word;
        this.mean = mean;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    @Override
    public String toString() {
        return "DictionaryDTO{" +
                "sequence=" + sequence +
                ", language='" + language + '\'' +
                ", word='" + word + '\'' +
                ", mean='" + mean + '\'' +
                '}';
    }
}
