package service.service;


import com.google.protobuf.Descriptors;
import com.google.protobuf.Empty;
import com.google.protobuf.Int64Value;
import com.nidhi.grpc.UserServiceGrpc;
import com.nidhi.grpc.Userservice;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import service.entity.User;
import service.mapper.UserMapper;
import service.repository.UserRepository;

import java.util.List;
import java.util.Map;

@GrpcService
public class UserService extends UserServiceGrpc.UserServiceImplBase {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private service.mapper.UserMapper userMapper;

    @Override
    public void createUser(Userservice.UserReq request, StreamObserver<Userservice.UserRes> responseObserver) {
        User user = UserMapper.convert(request);
        userRepository.save(user);
        Userservice.UserRes userResponse = userMapper.convertTo(user);
        responseObserver.onNext(userResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void updateUser(Userservice.UserReq request, StreamObserver<Userservice.UserRes> responseObserver) {
        User user = UserMapper.convert(request);
        userRepository.save(user);
        Userservice.UserRes userResponse = userMapper.convertTo(user);
        responseObserver.onNext(userResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void findUsersByFilter(Userservice.UserFilter request, StreamObserver<Userservice.UserRes> responseObserver) {
        List<User> users = userRepository.search(request.getUsername());

        for (User user : users) {
            responseObserver.onNext(userMapper.convertTo(user));
            System.out.println(user);
        }

        responseObserver.onCompleted();
    }


    @Override
    public void deleteUsersInBatch(Empty request, StreamObserver<Empty> responseObserver) {
        userRepository.deleteAll();
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }


    @Override
    public void findUserById(Int64Value request, StreamObserver<Userservice.UserRes> responseObserver) {

        User user = userRepository.findById(request.getValue()).orElse(null);
        Userservice.UserRes userResponse = userMapper.convertTo(user);
        responseObserver.onNext(userResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void findAllUsers(Empty request, StreamObserver<Userservice.UserRes> responseObserver) {
        List<User> users = userRepository.findAll();
        for (User user : users) {
            responseObserver.onNext(userMapper.convertTo(user));
        }
        responseObserver.onCompleted();
    }


    @Override
    public Map<Descriptors.FieldDescriptor, Object> findById(int user_id) {
        return null;
    }

    @Override
    public void deleteUser(Int64Value request, StreamObserver<Empty> responseObserver) {
        userRepository.deleteById(request.getValue());
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }

}
