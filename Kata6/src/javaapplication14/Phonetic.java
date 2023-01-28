package javaapplication14;

import com.google.gson.annotations.SerializedName;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


// POJO
@XmlRootElement
public class Phonetic {
    @SerializedName(value = "text") @XmlElement(name = "xxx")
    private String txt;
    public String audio;
    public String sourceURL;
    public License license;

    @Override
    public String toString() {
        return "Phonetic{" + "text=" + txt + ", audio=" + audio + ", sourceURL=" + sourceURL + ", license=" + license + '}';
    }
    
    public static class License {
        public String name;
        public String url;
    }
}
