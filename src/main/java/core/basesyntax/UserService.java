package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {

        for (String string : records) {
            String[] temporaryArray = string.split(":");
            if (temporaryArray[0].equals(email)) {
                return Integer.parseInt(temporaryArray[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
