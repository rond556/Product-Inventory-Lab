package models;

public class Comic {

    private Integer id;
    private String title;
    private String publisher;
    private String series;
    private Integer issueNumber;
    private Integer qty;
    private Float price;

    public Comic(){

    }

    public Comic(Integer id, String title, String publisher, String series, Integer issueNumber, Integer qty, Float price) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.series = series;
        this.issueNumber = issueNumber;
        this.qty = qty;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Integer getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(Integer issueNumber) {
        this.issueNumber = issueNumber;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
