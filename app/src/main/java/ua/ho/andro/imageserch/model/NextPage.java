
package ua.ho.andro.imageserch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NextPage {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("totalResults")
    @Expose
    private String totalResults;
    @SerializedName("searchTerms")
    @Expose
    private String searchTerms;
    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("startIndex")
    @Expose
    private int startIndex;
    @SerializedName("inputEncoding")
    @Expose
    private String inputEncoding;
    @SerializedName("outputEncoding")
    @Expose
    private String outputEncoding;
    @SerializedName("safe")
    @Expose
    private String safe;
    @SerializedName("cx")
    @Expose
    private String cx;
    @SerializedName("searchType")
    @Expose
    private String searchType;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NextPage() {
    }

    /**
     * 
     * @param safe
     * @param title
     * @param startIndex
     * @param count
     * @param searchTerms
     * @param totalResults
     * @param inputEncoding
     * @param cx
     * @param searchType
     * @param outputEncoding
     */
    public NextPage(String title, String totalResults, String searchTerms, int count, int startIndex, String inputEncoding, String outputEncoding, String safe, String cx, String searchType) {
        this.title = title;
        this.totalResults = totalResults;
        this.searchTerms = searchTerms;
        this.count = count;
        this.startIndex = startIndex;
        this.inputEncoding = inputEncoding;
        this.outputEncoding = outputEncoding;
        this.safe = safe;
        this.cx = cx;
        this.searchType = searchType;
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

    public NextPage withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The totalResults
     */
    public String getTotalResults() {
        return totalResults;
    }

    /**
     * 
     * @param totalResults
     *     The totalResults
     */
    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public NextPage withTotalResults(String totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    /**
     * 
     * @return
     *     The searchTerms
     */
    public String getSearchTerms() {
        return searchTerms;
    }

    /**
     * 
     * @param searchTerms
     *     The searchTerms
     */
    public void setSearchTerms(String searchTerms) {
        this.searchTerms = searchTerms;
    }

    public NextPage withSearchTerms(String searchTerms) {
        this.searchTerms = searchTerms;
        return this;
    }

    /**
     * 
     * @return
     *     The count
     */
    public int getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(int count) {
        this.count = count;
    }

    public NextPage withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * 
     * @return
     *     The startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 
     * @param startIndex
     *     The startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public NextPage withStartIndex(int startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    /**
     * 
     * @return
     *     The inputEncoding
     */
    public String getInputEncoding() {
        return inputEncoding;
    }

    /**
     * 
     * @param inputEncoding
     *     The inputEncoding
     */
    public void setInputEncoding(String inputEncoding) {
        this.inputEncoding = inputEncoding;
    }

    public NextPage withInputEncoding(String inputEncoding) {
        this.inputEncoding = inputEncoding;
        return this;
    }

    /**
     * 
     * @return
     *     The outputEncoding
     */
    public String getOutputEncoding() {
        return outputEncoding;
    }

    /**
     * 
     * @param outputEncoding
     *     The outputEncoding
     */
    public void setOutputEncoding(String outputEncoding) {
        this.outputEncoding = outputEncoding;
    }

    public NextPage withOutputEncoding(String outputEncoding) {
        this.outputEncoding = outputEncoding;
        return this;
    }

    /**
     * 
     * @return
     *     The safe
     */
    public String getSafe() {
        return safe;
    }

    /**
     * 
     * @param safe
     *     The safe
     */
    public void setSafe(String safe) {
        this.safe = safe;
    }

    public NextPage withSafe(String safe) {
        this.safe = safe;
        return this;
    }

    /**
     * 
     * @return
     *     The cx
     */
    public String getCx() {
        return cx;
    }

    /**
     * 
     * @param cx
     *     The cx
     */
    public void setCx(String cx) {
        this.cx = cx;
    }

    public NextPage withCx(String cx) {
        this.cx = cx;
        return this;
    }

    /**
     * 
     * @return
     *     The searchType
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * 
     * @param searchType
     *     The searchType
     */
    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public NextPage withSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }

}
