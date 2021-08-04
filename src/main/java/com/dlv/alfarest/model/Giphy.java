package com.dlv.alfarest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Giphy {

    public Giphy() {
    }

    public Giphy(Giphy data, Images images) {
        this.data = data;
        this.images = images;
    }

    @Override
    public String toString() {
        return "Giphy{" +
                "data=" + data +
                ", images=" + images +
                '}';
    }

    private Giphy data;

    private Images images;

    public Giphy getData() {
        return data;
    }

    public void setData(Giphy data) {
        this.data = data;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public class Images {

        public Images() {
        }

        public Images(HashMap<String, String> original) {
            this.original = original;
        }

        private HashMap<String, String> original;

        public HashMap<String, String> getOriginal() {
            return original;
        }

        public void setOriginal(HashMap<String, String> original) {
            this.original = original;
        }

        @Override
        public String toString() {
            return "Images{" +
                    "hashMapImages=" + original +
                    '}';
        }

    }
}