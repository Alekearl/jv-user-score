package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {

        for (String string : records) {
            String[] temporaryArray = string.split(":");
            String userEmail = String.valueOf(temporaryArray[0]);
            int userScore = Integer.parseInt(temporaryArray[1]);
            if (userEmail.equals(email)) {
                return userScore;
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
