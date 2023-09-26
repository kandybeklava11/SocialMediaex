public class SocialMedia {
    private static int idd=0;
    private int  socialMediaId;
    private String platform;
    private String profileUrl;

    public SocialMedia( String platform,  String profileUrl) {
        this.socialMediaId =idd;
        this.platform = platform;
        this.profileUrl = profileUrl;
        idd++;
    }

    public int  getSocialMediaId() {
        return socialMediaId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        SocialMedia.idd = idd;
    }

    public void setSocialMediaId(int socialMediaId) {
        this.socialMediaId = socialMediaId;
    }

    @Override
    public String toString() {
        return "SocialMedia:" +
                "socialMediaId=" + socialMediaId +
                ", platform='" + platform +
                ", profileUrl='" + profileUrl  ;
    }
}
