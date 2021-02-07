package uz.technickpro.irregularverbs;

public class Verb {

    private String word;
    private String v1, v2, v3;
    private String propV1, propV2, propV3;
    private String description;


    public Verb(String word, String v1, String v2, String v3, String propV1, String propV2, String propV3, String description) {
        this.word = word;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.propV1 = propV1;
        this.propV2 = propV2;
        this.propV3 = propV3;
        this.description = description;
    }

    public Verb(String word, String v1, String v2, String v3) {
        this.word = word;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getV1() {
        return v1;
    }

    public void setV1(String v1) {
        this.v1 = v1;
    }

    public String getV2() {
        return v2;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }

    public String getV3() {
        return v3;
    }

    public void setV3(String v3) {
        this.v3 = v3;
    }

    public String getPropV1() {
        return propV1;
    }

    public void setPropV1(String propV1) {
        this.propV1 = propV1;
    }

    public String getPropV2() {
        return propV2;
    }

    public void setPropV2(String propV2) {
        this.propV2 = propV2;
    }

    public String getPropV3() {
        return propV3;
    }

    public void setPropV3(String propV3) {
        this.propV3 = propV3;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
