import java.util.List;

public class User {
    private static int idd=0;
    private String name;
    private int age;
    private int personId;
    private List<SocialMedia> socialMedia;

    public User( List<SocialMedia> socialMedia,String name,int age) {
        this.age=age;
        this.name=name;
        this.personId = idd;
        this.socialMedia=socialMedia;
        idd++;
    }

    public int getPersonId() {
        return personId;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        User.idd = idd;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public List<SocialMedia> getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(List<SocialMedia> socialMedia) {
        this.socialMedia = socialMedia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n"+"User" +
                "name='" + name +
                ", age=" + age +
                ", personId=" + personId +
                ", socialMedia=" + socialMedia;
    }
}
