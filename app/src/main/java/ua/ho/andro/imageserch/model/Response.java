
package ua.ho.andro.imageserch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Response implements Serializable {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("url")
    @Expose

    private Url url;
    @SerializedName("queries")
    @Expose

    private Queries queries;
    @SerializedName("context")
    @Expose

    private Context context;
    @SerializedName("searchInformation")
    @Expose

    private SearchInformation searchInformation;
    @SerializedName("items")
    @Expose

    private List<Item> items = new ArrayList<Item>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Response() {
    }

    /**
     * 
     * @param items
     * @param context
     * @param queries
     * @param searchInformation
     * @param url
     * @param kind
     */
    public Response(String kind, Url url, Queries queries, Context context, SearchInformation searchInformation, List<Item> items) {
        this.kind = kind;
        this.url = url;
        this.queries = queries;
        this.context = context;
        this.searchInformation = searchInformation;
        this.items = items;
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

    public Response withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 
     * @return
     *     The url
     */
    public Url getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(Url url) {
        this.url = url;
    }

    public Response withUrl(Url url) {
        this.url = url;
        return this;
    }

    /**
     * 
     * @return
     *     The queries
     */
    public Queries getQueries() {
        return queries;
    }

    /**
     * 
     * @param queries
     *     The queries
     */
    public void setQueries(Queries queries) {
        this.queries = queries;
    }

    public Response withQueries(Queries queries) {
        this.queries = queries;
        return this;
    }

    /**
     * 
     * @return
     *     The context
     */
    public Context getContext() {
        return context;
    }

    /**
     * 
     * @param context
     *     The context
     */
    public void setContext(Context context) {
        this.context = context;
    }

    public Response withContext(Context context) {
        this.context = context;
        return this;
    }

    /**
     * 
     * @return
     *     The searchInformation
     */
    public SearchInformation getSearchInformation() {
        return searchInformation;
    }

    /**
     * 
     * @param searchInformation
     *     The searchInformation
     */
    public void setSearchInformation(SearchInformation searchInformation) {
        this.searchInformation = searchInformation;
    }

    public Response withSearchInformation(SearchInformation searchInformation) {
        this.searchInformation = searchInformation;
        return this;
    }

    /**
     * 
     * @return
     *     The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Response withItems(List<Item> items) {
        this.items = items;
        return this;
    }

}
