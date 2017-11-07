
package ua.ho.andro.imageserch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchInformation {

    @SerializedName("searchTime")
    @Expose
    private double searchTime;
    @SerializedName("formattedSearchTime")
    @Expose
    private String formattedSearchTime;
    @SerializedName("totalResults")
    @Expose
    private String totalResults;
    @SerializedName("formattedTotalResults")
    @Expose
    private String formattedTotalResults;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SearchInformation() {
    }

    /**
     * 
     * @param totalResults
     * @param formattedSearchTime
     * @param searchTime
     * @param formattedTotalResults
     */
    public SearchInformation(double searchTime, String formattedSearchTime, String totalResults, String formattedTotalResults) {
        this.searchTime = searchTime;
        this.formattedSearchTime = formattedSearchTime;
        this.totalResults = totalResults;
        this.formattedTotalResults = formattedTotalResults;
    }

    /**
     * 
     * @return
     *     The searchTime
     */
    public double getSearchTime() {
        return searchTime;
    }

    /**
     * 
     * @param searchTime
     *     The searchTime
     */
    public void setSearchTime(double searchTime) {
        this.searchTime = searchTime;
    }

    public SearchInformation withSearchTime(double searchTime) {
        this.searchTime = searchTime;
        return this;
    }

    /**
     * 
     * @return
     *     The formattedSearchTime
     */
    public String getFormattedSearchTime() {
        return formattedSearchTime;
    }

    /**
     * 
     * @param formattedSearchTime
     *     The formattedSearchTime
     */
    public void setFormattedSearchTime(String formattedSearchTime) {
        this.formattedSearchTime = formattedSearchTime;
    }

    public SearchInformation withFormattedSearchTime(String formattedSearchTime) {
        this.formattedSearchTime = formattedSearchTime;
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

    public SearchInformation withTotalResults(String totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    /**
     * 
     * @return
     *     The formattedTotalResults
     */
    public String getFormattedTotalResults() {
        return formattedTotalResults;
    }

    /**
     * 
     * @param formattedTotalResults
     *     The formattedTotalResults
     */
    public void setFormattedTotalResults(String formattedTotalResults) {
        this.formattedTotalResults = formattedTotalResults;
    }

    public SearchInformation withFormattedTotalResults(String formattedTotalResults) {
        this.formattedTotalResults = formattedTotalResults;
        return this;
    }

}
