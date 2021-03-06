package EmberFlexberryDummy.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import EmberFlexberryDummy.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import java.util.Date;


/**
 * Entity implementation class for Entity: SuccessorSocialNetwork
 */
@Entity(name = "EmberFlexberryDummySuccessorSocialNetwork")
@Table(schema = "public", name = "SuccessorSocialNetwork")
public class SuccessorSocialNetwork {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "VK")
    private String vk;

    @Column(name = "Facebook")
    private String facebook;

    @Column(name = "Twitter")
    private String twitter;

    @Column(name = "Name")
    private String name;

    @Column(name = "EMail")
    private String eMail;

    @Column(name = "Birthday")
    private Date birthday;


    public SuccessorSocialNetwork() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getVK() {
      return vk;
    }

    public void setVK(String vk) {
      this.vk = vk;
    }

    public String getFacebook() {
      return facebook;
    }

    public void setFacebook(String facebook) {
      this.facebook = facebook;
    }

    public String getTwitter() {
      return twitter;
    }

    public void setTwitter(String twitter) {
      this.twitter = twitter;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getEMail() {
      return eMail;
    }

    public void setEMail(String email) {
      this.eMail = email;
    }

    public Date getBirthday() {
      return birthday;
    }

    public void setBirthday(Date birthday) {
      this.birthday = birthday;
    }


}