
package ua.ho.andro.imageserch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("contextLink")
    @Expose
    private String contextLink;
    @SerializedName("height")
    @Expose
    private int height;
    @SerializedName("width")
    @Expose
    private int width;
    @SerializedName("byteSize")
    @Expose
    private int byteSize;
    @SerializedName("thumbnailLink")
    @Expose
    private String thumbnailLink;
    @SerializedName("thumbnailHeight")
    @Expose
    private int thumbnailHeight;
    @SerializedName("thumbnailWidth")
    @Expose
    private int thumbnailWidth;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param height
     * @param thumbnailLink
     * @param byteSize
     * @param width
     * @param thumbnailWidth
     * @param thumbnailHeight
     * @param contextLink
     */
    public Image(String contextLink, int height, int width, int byteSize, String thumbnailLink, int thumbnailHeight, int thumbnailWidth) {
        this.contextLink = contextLink;
        this.height = height;
        this.width = width;
        this.byteSize = byteSize;
        this.thumbnailLink = thumbnailLink;
        this.thumbnailHeight = thumbnailHeight;
        this.thumbnailWidth = thumbnailWidth;
    }

    /**
     * 
     * @return
     *     The contextLink
     */
    public String getContextLink() {
        return contextLink;
    }

    /**
     * 
     * @param contextLink
     *     The contextLink
     */
    public void setContextLink(String contextLink) {
        this.contextLink = contextLink;
    }

    public Image withContextLink(String contextLink) {
        this.contextLink = contextLink;
        return this;
    }

    /**
     * 
     * @return
     *     The height
     */
    public int getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    public Image withHeight(int height) {
        this.height = height;
        return this;
    }

    /**
     * 
     * @return
     *     The width
     */
    public int getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    public Image withWidth(int width) {
        this.width = width;
        return this;
    }

    /**
     * 
     * @return
     *     The byteSize
     */
    public int getByteSize() {
        return byteSize;
    }

    /**
     * 
     * @param byteSize
     *     The byteSize
     */
    public void setByteSize(int byteSize) {
        this.byteSize = byteSize;
    }

    public Image withByteSize(int byteSize) {
        this.byteSize = byteSize;
        return this;
    }

    /**
     * 
     * @return
     *     The thumbnailLink
     */
    public String getThumbnailLink() {
        return thumbnailLink;
    }

    /**
     * 
     * @param thumbnailLink
     *     The thumbnailLink
     */
    public void setThumbnailLink(String thumbnailLink) {
        this.thumbnailLink = thumbnailLink;
    }

    public Image withThumbnailLink(String thumbnailLink) {
        this.thumbnailLink = thumbnailLink;
        return this;
    }

    /**
     * 
     * @return
     *     The thumbnailHeight
     */
    public int getThumbnailHeight() {
        return thumbnailHeight;
    }

    /**
     * 
     * @param thumbnailHeight
     *     The thumbnailHeight
     */
    public void setThumbnailHeight(int thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
    }

    public Image withThumbnailHeight(int thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
        return this;
    }

    /**
     * 
     * @return
     *     The thumbnailWidth
     */
    public int getThumbnailWidth() {
        return thumbnailWidth;
    }

    /**
     * 
     * @param thumbnailWidth
     *     The thumbnailWidth
     */
    public void setThumbnailWidth(int thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
    }

    public Image withThumbnailWidth(int thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
        return this;
    }

}
