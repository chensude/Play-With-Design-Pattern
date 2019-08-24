package com.yt.factory;

public enum  HumanEnum {
    WhiteHumanWomen("com.yt.factory.md.WhiteHumanWomen");

    private String value;
    HumanEnum(String value) {
        this.value =value;
    }

    public String getValue() {
        return this.value;
    }
}
