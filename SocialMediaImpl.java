import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SocialMediaImpl implements SocialMediaService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void assignSocialMediaToPerson(List<User> users) {
        System.out.println("Write users name");
        String name = scanner.nextLine();
        System.out.println("Write users age");
        int age = scanner.nextInt();
        System.out.println("New social media");
        System.out.println("Write platform");
        String plat = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Write platform URL");
        String url = scanner.nextLine();


        SocialMedia socialMedia = new SocialMedia(plat, url);

        List<SocialMedia> socialMediaList = new ArrayList<>();
        socialMediaList.add(socialMedia);
        User user = new User(socialMediaList, name, age);

        users.add(user);
        System.out.println(user);
    }

    @Override
    public void saveSocialMedia(List<User> users) {
        for (User user : users) {
            System.out.println("Successfully saved");
            System.out.println(user);
        }
    }

    @Override
    public void getSocialMediaById(List<User> users) {
        System.out.println("Write social medias ID");
        int id = scanner.nextInt();
        boolean b = false;

        for (User user : users)
            for (SocialMedia soo : user.getSocialMedia()) {
                if (soo.getSocialMediaId() == id) {
                    System.out.println(soo);
                    b = true;
                    break;
                }
            }
        if (!b) {
            System.out.println("Not found");
        }

    }

    @Override
    public void getAllSocialMediaByPersonId(List<User> users) {
        System.out.println("Write user id");
        int id = scanner.nextInt();
        boolean b = false;
        for (User user : users) {
            if (user.getPersonId() == id)
                for (SocialMedia soo : user.getSocialMedia()) {
                    System.out.println(soo);
                    b = true;
                    break;
                }
        }
        if (!b) {
            System.out.println("Not found");
        }
    }

    @Override
    public void deleteAllSocialMediaByPersonId(List<User> users) {
        System.out.println("Write user id");
        int id = scanner.nextInt();
        boolean found = false;

        for (User user : users) {
            if (user.getPersonId() == id) {
                user.getSocialMedia().clear();
                System.out.println("Successfully deleted all social media");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }

    @Override
    public void deleteSocialMediaById(List<User> users) {
        System.out.println("Write social media ID");
        int id = scanner.nextInt();
        boolean found = false;

        for (User user : users) {
            List<SocialMedia> socialMediaList = user.getSocialMedia();

            for (int i = socialMediaList.size() - 1; i >= 0; i--) {
                SocialMedia socialMedia = socialMediaList.get(i);
                if (socialMedia.getSocialMediaId() == id) {
                    socialMediaList.remove(i); // Удаление социального медиа из списка
                    System.out.println("Successfully deleted");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}

