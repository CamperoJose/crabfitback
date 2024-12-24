package dto;

public class PersonDTO {

    private Long personId;
    private String name;
    private String username;
    private String mail;
    private String secret;


    public PersonDTO(Long personId, String name, String username, String mail, String secret) {
        this.personId = personId;
        this.name = name;
        this.username = username;
        this.mail = mail;
        this.secret = secret;
    }

    public PersonDTO() {
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
