import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
SocialMedia socialMedia=new SocialMedia("Instagram","httpss://facebook.com/john_doe");
SocialMedia socialMedia2=new SocialMedia("Google","httpss://facebook.com/mark_andress");
SocialMedia socialMedia3=new SocialMedia("Facebook","httpss://facebook.com/kristofer_ma");

        List<SocialMedia>socialMediaList=new ArrayList<>();
        socialMediaList.add(socialMedia);
        List<SocialMedia>socialMediaList2=new ArrayList<>();
        socialMediaList2.add(socialMedia2);
        List<SocialMedia>socialMediaList3=new ArrayList<>();
        socialMediaList3.add(socialMedia3);


        User user=new User(socialMediaList,"JOHN DOE",35);
        User user2=new User(socialMediaList2,"MARK ANDRESS",45);
        User user3=new User(socialMediaList3,"KRISTOFER MA",24);

        List<User>users=new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);

        for (User us:users) {
            System.out.println(us);
        }

        SocialMediaImpl socialMediaimpl=new SocialMediaImpl();

            int choice=0;
            do{
                    System.out.println("\n1. -> Assing social media to person"+
                            "\n2. -> Save all social media"+
                            "\n3. -> Get social media by id"+
                            "\n4. -> Get all social media by user id"+
                            "\n5. -> Delete all social media by user id"+
                            "\n6. -> Delete social media by id"+
                            "\n7.-> Exit");
                    choice=scanner.nextInt();
                    switch (choice){
                            case 1:
                                    socialMediaimpl.assignSocialMediaToPerson(users);
                                    break;
                            case 2:
                                   socialMediaimpl.saveSocialMedia(users);
                                    break;
                            case 3:
                                   socialMediaimpl.getSocialMediaById(users);
                                    break;
                            case 4:
                                   socialMediaimpl.getAllSocialMediaByPersonId(users);
                                    break;
                            case 5:
                                   socialMediaimpl.deleteAllSocialMediaByPersonId(users);
                                    break;
                            case 6:
                                   socialMediaimpl.deleteSocialMediaById(users);
                                    break;

                            default:
                                    System.out.println("Write correct choice !!");
                    }
            }while (choice!=7);


    }
}