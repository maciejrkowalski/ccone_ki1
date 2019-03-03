package pl.zlapkontakt.ccone_1.ccone_ki1.Entity;

public class Customer {

    private int id;
    private String company;
    private String city;
    private String street;
    private String postcode;
    private String tel1;
    private String tel2;
    private String tel3;
    private String tel4;
    private String tel5;
    private String email;
    private String www;

    public Customer() {
    }

    public Customer(int id, String company, String city, String street, String postcode, String tel1, String tel2, String tel3, String tel4, String tel5, String email, String www) {
        this.id = id;
        this.company = company;
        this.city = city;
        this.street = street;
        this.postcode = postcode;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.tel3 = tel3;
        this.tel4 = tel4;
        this.tel5 = tel5;
        this.email = email;
        this.www = www;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getTel3() {
        return tel3;
    }

    public void setTel3(String tel3) {
        this.tel3 = tel3;
    }

    public String getTel4() {
        return tel4;
    }

    public void setTel4(String tel4) {
        this.tel4 = tel4;
    }

    public String getTel5() {
        return tel5;
    }

    public void setTel5(String tel5) {
        this.tel5 = tel5;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }
}
