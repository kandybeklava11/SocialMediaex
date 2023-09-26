import java.util.List;

public interface SocialMediaService {
    void assignSocialMediaToPerson(List<User>users);
    void saveSocialMedia(List<User>users);
    void getSocialMediaById(List<User>users);
    void getAllSocialMediaByPersonId(List<User>users);
    void deleteAllSocialMediaByPersonId(List<User>users);
    void deleteSocialMediaById(List<User>users);
}
