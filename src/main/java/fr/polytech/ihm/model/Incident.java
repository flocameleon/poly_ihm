package fr.polytech.ihm.model;

public class Incident {
    private String category;
    private String titre;
    private String description;
    private String image;
    private String location;
    private String locationDetail;
    private int emergency;
    private String email;
    private String emailDomain;
    private String date;

    public Incident(String category, String titre, String description, String image, String location, String locationDetail, int emergency, String email, String emailDomain, String date) {
        this.category = category;
        this.titre = titre;
        this.description = description;
        this.image = image;
        this.location = location;
        this.locationDetail = locationDetail;
        this.emergency = emergency;
        this.email = email;
        this.emailDomain = emailDomain;
        this.date = date;
    }

    public int getEmergency() {
        return emergency;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getEmail() {
        return email;
    }

    public String getLocation() {
        return location;
    }

    public String getTitre() {
        return titre;
    }

    public String getImage() {
        return image;
    }

    public String getEmailDomain() {
        return emailDomain;
    }

    public String getDate() {
        return date;
    }

    public String getLocationDetail() {
        return locationDetail;
    }

    public boolean checkInput() {
        return !getTitre().equals("") && !getEmailDomain().equals("") && !getEmail().equals("");
    }
}
