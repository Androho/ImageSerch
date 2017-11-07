
package ua.ho.andro.imageserch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Context {

    @SerializedName("title")
    @Expose
    private String title;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Context() {
    }

    /**
     * 
     * @param title
     */
    public Context(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public Context withTitle(String title) {
        this.title = title;
        return this;
    }

}
