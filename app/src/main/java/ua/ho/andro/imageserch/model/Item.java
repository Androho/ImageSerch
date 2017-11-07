
package ua.ho.andro.imageserch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("htmlTitle")
    @Expose
    private String htmlTitle;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("displayLink")
    @Expose
    private String displayLink;
    @SerializedName("snippet")
    @Expose
    private String snippet;
    @SerializedName("htmlSnippet")
    @Expose
    private String htmlSnippet;
    @SerializedName("mime")
    @Expose
    private String mime;
    @SerializedName("image")
    @Expose
    private Image image;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param displayLink
     * @param title
     * @param link
     * @param image
     * @param htmlTitle
     * @param mime
     * @param snippet
     * @param htmlSnippet
     * @param kind
     */
    public Item(String kind, String title, String htmlTitle, String link, String displayLink, String snippet, String htmlSnippet, String mime, Image image) {
        this.kind = kind;
        this.title = title;
        this.htmlTitle = htmlTitle;
        this.link = link;
        this.displayLink = displayLink;
        this.snippet = snippet;
        this.htmlSnippet = htmlSnippet;
        this.mime = mime;
        this.image = image;
    }

    /**
     * 
     * @return
     *     The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    public Item withKind(String kind) {
        this.kind = kind;
        return this;
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

    public Item withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The htmlTitle
     */
    public String getHtmlTitle() {
        return htmlTitle;
    }

    /**
     * 
     * @param htmlTitle
     *     The htmlTitle
     */
    public void setHtmlTitle(String htmlTitle) {
        this.htmlTitle = htmlTitle;
    }

    public Item withHtmlTitle(String htmlTitle) {
        this.htmlTitle = htmlTitle;
        return this;
    }

    /**
     * 
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    public Item withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * 
     * @return
     *     The displayLink
     */
    public String getDisplayLink() {
        return displayLink;
    }

    /**
     * 
     * @param displayLink
     *     The displayLink
     */
    public void setDisplayLink(String displayLink) {
        this.displayLink = displayLink;
    }

    public Item withDisplayLink(String displayLink) {
        this.displayLink = displayLink;
        return this;
    }

    /**
     * 
     * @return
     *     The snippet
     */
    public String getSnippet() {
        return snippet;
    }

    /**
     * 
     * @param snippet
     *     The snippet
     */
    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public Item withSnippet(String snippet) {
        this.snippet = snippet;
        return this;
    }

    /**
     * 
     * @return
     *     The htmlSnippet
     */
    public String getHtmlSnippet() {
        return htmlSnippet;
    }

    /**
     * 
     * @param htmlSnippet
     *     The htmlSnippet
     */
    public void setHtmlSnippet(String htmlSnippet) {
        this.htmlSnippet = htmlSnippet;
    }

    public Item withHtmlSnippet(String htmlSnippet) {
        this.htmlSnippet = htmlSnippet;
        return this;
    }

    /**
     * 
     * @return
     *     The mime
     */
    public String getMime() {
        return mime;
    }

    /**
     * 
     * @param mime
     *     The mime
     */
    public void setMime(String mime) {
        this.mime = mime;
    }

    public Item withMime(String mime) {
        this.mime = mime;
        return this;
    }

    /**
     * 
     * @return
     *     The image
     */
    public Image getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(Image image) {
        this.image = image;
    }

    public Item withImage(Image image) {
        this.image = image;
        return this;
    }

}
