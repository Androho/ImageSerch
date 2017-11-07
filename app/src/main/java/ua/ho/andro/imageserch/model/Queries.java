
package ua.ho.andro.imageserch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Queries {

    @SerializedName("request")
    @Expose
    private List<Request> request = new ArrayList<Request>();
    @SerializedName("nextPage")
    @Expose
    private List<NextPage> nextPage = new ArrayList<NextPage>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Queries() {
    }

    /**
     * 
     * @param nextPage
     * @param request
     */
    public Queries(List<Request> request, List<NextPage> nextPage) {
        this.request = request;
        this.nextPage = nextPage;
    }

    /**
     * 
     * @return
     *     The request
     */
    public List<Request> getRequest() {
        return request;
    }

    /**
     * 
     * @param request
     *     The request
     */
    public void setRequest(List<Request> request) {
        this.request = request;
    }

    public Queries withRequest(List<Request> request) {
        this.request = request;
        return this;
    }

    /**
     * 
     * @return
     *     The nextPage
     */
    public List<NextPage> getNextPage() {
        return nextPage;
    }

    /**
     * 
     * @param nextPage
     *     The nextPage
     */
    public void setNextPage(List<NextPage> nextPage) {
        this.nextPage = nextPage;
    }

    public Queries withNextPage(List<NextPage> nextPage) {
        this.nextPage = nextPage;
        return this;
    }

}
