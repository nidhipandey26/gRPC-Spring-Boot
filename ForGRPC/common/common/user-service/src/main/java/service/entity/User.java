package service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nidhi.grpc.Userservice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String userName;
    private String password;
    private String email;
    private String contact;
    private String city;
  //  @JsonProperty("users")
   // private List<User> users;


}
