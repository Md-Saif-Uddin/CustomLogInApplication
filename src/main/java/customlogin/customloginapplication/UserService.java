package customlogin.customloginapplication;

public interface UserService {

    User findByUsername(String username);
    User save(UserDto userDto);

}
