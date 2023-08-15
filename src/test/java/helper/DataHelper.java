package helper;

import models.Project;
import models.User;
import models.UserBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tests.LoggerTest;
import utils.configuration.ReadProperties;

public class DataHelper {
    static Logger logger = LogManager.getLogger(DataHelper.class);
    public static User getAdminUser() {
        User user = new User();
        user.setEmail(ReadProperties.username());
        user.setPassword(ReadProperties.password());
        logger.info("User DataHelper" + user.toString());
        return user;
    }

    public static User getStandartUser() {
        User user = new User();
        user.setEmail(ReadProperties.username());
        user.setPassword(ReadProperties.password());

        return user;
    }

   public static Project getCommonProject(){
        Project project = new Project.Builder()
                .withProjectName("name")
                .withAnnouncement("jsjx")
                .withProjectType(25)
                .build();
        return project;
    }

    public static UserBuilder getBuilderUser(){
        UserBuilder newBuildUser = new UserBuilder.Builder()
                .withUserEmail(ReadProperties.username())
                .withUserPassword(ReadProperties.password())
                .build();
        return newBuildUser;
    }
}
