package pl.zlapkontakt.ccone_1.ccone_ki1.Entity;

public class SurveyForm {

    String NIP;
    String company;
    String contactPersonFname;
    String contactPersonLname;
    String tel;
    String email;
    String document;
    String obligationValue;
    String payDate;
    String contactDate;
    String objections;
    String additionalContent;
    String consultantName;


    public SurveyForm() {
        super();
    }

//    public SurveyForm(String NIP, String company, String contactPersonFname, String contactPersonLname, String tel, String email, String document, String obligationValue, String payDate, String contactDate, String objections, String additionalContent, String consultantName) {
//        this.NIP = NIP;
//        this.company = company;
//        this.contactPersonFname = contactPersonFname;
//        this.contactPersonLname = contactPersonLname;
//        this.tel = tel;
//        this.email = email;
//        this.document = document;
//        this.obligationValue = obligationValue;
//        this.payDate = payDate;
//        this.contactDate = contactDate;
//        this.objections = objections;
//        this.additionalContent = additionalContent;
//        this.consultantName = consultantName;
//    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContactPersonFname() {
        return contactPersonFname;
    }

    public void setContactPersonFname(String contactPersonFname) {
        this.contactPersonFname = contactPersonFname;
    }

    public String getContactPersonLname() {
        return contactPersonLname;
    }

    public void setContactPersonLname(String contactPersonLname) {
        this.contactPersonLname = contactPersonLname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObligationValue() {
        return obligationValue;
    }

    public void setObligationValue(String obligationValue) {
        this.obligationValue = obligationValue;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getContactDate() {
        return contactDate;
    }

    public void setContactDate(String contactDate) {
        this.contactDate = contactDate;
    }

    public String getObjections() {
        return objections;
    }

    public void setObjections(String objections) {
        this.objections = objections;
    }

    public String getAdditionalContent() {
        return additionalContent;
    }

    public void setAdditionalContent(String additionalContent) {
        this.additionalContent = additionalContent;
    }

    public String getConsultantName() {
        return consultantName;
    }

    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
