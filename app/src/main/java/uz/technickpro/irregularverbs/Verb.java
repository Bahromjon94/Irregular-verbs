package uz.technickpro.irregularverbs;

public class Verb {

    private String word;
    private String v1, v2, v3;
    private String pronV1, pronV2, pronV3;
    private String description;


    public Verb(String word, String v1, String v2, String v3, String pronV1, String pronV2, String pronV3, String description) {
        this.word = word;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.pronV1 = pronV1;
        this.pronV2 = pronV2;
        this.pronV3 = pronV3;
        this.description = description;
    }

    public Verb(String word, String v1, String v2, String v3) {
        this.word = word;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Verb(String v1, String v2, String v3, String pronV1, String pronV2, String pronV3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.pronV1 = pronV1;
        this.pronV2 = pronV2;
        this.pronV3 = pronV3;
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

    public String getPronV1() {
        return pronV1;
    }

    public void setPronV1(String pronV1) {
        this.pronV1 = pronV1;
    }

    public String getPronV2() {
        return pronV2;
    }

    public void setPronV2(String pronV2) {
        this.pronV2 = pronV2;
    }

    public String getPronV3() {
        return pronV3;
    }

    public void setPronV3(String pronV3) {
        this.pronV3 = pronV3;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
