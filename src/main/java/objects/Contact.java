package objects;

public class Contact {
    //Contact Information
    String salutation;
    String firstName;
    String lastName;
    String phone;
    String mobile;
    String accName;
    String title;
    String email;
    String reportsTo;
    //Address Information
    //Mailing Address
    String mailingStreet;
    String mailingCity;
    String mailingZip;
    String mailingState;
    String mailingCountry;
    //Other Address
    String otherStreet;
    String otherCity;
    String otherZip;
    String otherState;
    String otherCountry;
    //Additional Information
    String fax;
    String website;
    String homePhone;
    String otherPhone;
    String asstPhone;
    String assistant;
    String department;
    String leadSource;
    //Description Information
    String description;

    public Contact(String salutation, String firstName, String lastName, String phone, String mobile,
                   String accName, String title, String email, String reportsTo, String mailingStreet,
                   String mailingCity, String mailingZip, String mailingState, String mailingCountry,
                   String otherStreet, String otherCity, String otherZip, String otherState,
                   String otherCountry, String fax, String website, String homePhone, String otherPhone,
                   String asstPhone, String assistant, String department, String leadSource, String description) {
        //Account Information
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.mobile = mobile;
        this.accName = accName;
        this.title = title;
        this.email = email;
        this.reportsTo = reportsTo;

        this.mailingStreet = mailingStreet;
        this.mailingCity = mailingCity;
        this.mailingZip = mailingZip;
        this.mailingState = mailingState;
        this.mailingCountry = mailingCountry;

        this.otherStreet = otherStreet;
        this.otherCity = otherCity;
        this.otherZip = otherZip;
        this.otherState = otherState;
        this.otherCountry = otherCountry;
        this.fax = fax;
        this.website = website;
        this.homePhone = homePhone;
        this.otherPhone = otherPhone;
        this.asstPhone = asstPhone;
        this.assistant = assistant;
        this.department = department;
        this.leadSource = leadSource;
        this.description = description;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(String reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingZip() {
        return mailingZip;
    }

    public void setMailingZip(String mailingZip) {
        this.mailingZip = mailingZip;
    }

    public String getMailingState() {
        return mailingState;
    }

    public void setMailingState(String mailingState) {
        this.mailingState = mailingState;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public void setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet;
    }

    public String getOtherCity() {
        return otherCity;
    }

    public void setOtherCity(String otherCity) {
        this.otherCity = otherCity;
    }

    public String getOtherZip() {
        return otherZip;
    }

    public void setOtherZip(String otherZip) {
        this.otherZip = otherZip;
    }

    public String getOtherState() {
        return otherState;
    }

    public void setOtherState(String otherState) {
        this.otherState = otherState;
    }

    public String getOtherCountry() {
        return otherCountry;
    }

    public void setOtherCountry(String otherCountry) {
        this.otherCountry = otherCountry;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }

    public String getAsstPhone() {
        return asstPhone;
    }

    public void setAsstPhone(String asstPhone) {
        this.asstPhone = asstPhone;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
