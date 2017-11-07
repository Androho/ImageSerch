
package ua.ho.andro.imageserch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Url {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("template")
    @Expose
    private String template;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Url() {
    }

    /**
     * 
     * @param template
     * @param type
     */
    public Url(String type, String template) {
        this.type = type;
        this.template = template;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public Url withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The template
     */
    public String getTemplate() {
        return template;
    }

    /**
     * 
     * @param template
     *     The template
     */
    public void setTemplate(String template) {
        this.template = template;
    }

    public Url withTemplate(String template) {
        this.template = template;
        return this;
    }

}
