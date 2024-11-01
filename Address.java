public class Address {
    private String zipCode;
    private String country;
    private String city;

    public Address(String zipCode, String country, String city) {
        this.zipCode = zipCode;
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "City: " + (city != null ? city : "N/A") +
                ", Country: " + (country != null ? country : "N/A") +
                ", Zip Code: " + (zipCode != null ? zipCode : "N/A");
    }
}
