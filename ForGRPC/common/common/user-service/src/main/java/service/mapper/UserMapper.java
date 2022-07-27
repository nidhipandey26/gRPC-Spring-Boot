package service.mapper;

import com.nidhi.grpc.Userservice;
import org.springframework.stereotype.Service;
import service.entity.User;

import java.util.List;

@Service
public class UserMapper {

    public static User convert(Userservice.UserReq request) {
        User user = new User();
        user.setId(request.getId());
        user.setUserName(request.getUsername());
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());
        user.setContact(request.getContact());
        user.setCity(request.getCity());
        return user;
    }

    public static User convertRes(Userservice.UserRes response) {
        User user = new User();
        user.setId(response.getId());
        user.setUserName(response.getUsername());
        user.setPassword(response.getPassword());
        user.setEmail(response.getEmail());
        user.setContact(response.getContact());
        user.setCity(response.getCity());
        return user;
    }

    public static Userservice.UserRes convertTo(User user) {

        Userservice.UserRes rResponse = Userservice.UserRes.newBuilder()
                .setId(user.getId())
                .setUsername(user.getUserName())
                .setPassword(user.getPassword())
                .setEmail(user.getEmail())
                .setContact(user.getContact())
                .setCity(user.getCity())
                .build();
        return rResponse;
    }

}
