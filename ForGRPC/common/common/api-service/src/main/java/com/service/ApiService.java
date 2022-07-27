package com.service;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Int64Value;
import com.nidhi.grpc.UserServiceGrpc;
import com.nidhi.grpc.Userservice;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ApiService {


    private UserServiceGrpc.UserServiceBlockingStub synchronousClient;

    private UserServiceGrpc.UserServiceStub asynchronousClient;

    public void createUser(Userservice.UserReq user) {
        synchronousClient.createUser(user);
    }

    public Userservice.UserRes findUserById(long id) {
        return synchronousClient.findUserById(Int64Value.of(id));
    }

    public List<Userservice.UserRes> findAllUsers() {
        return (List<Userservice.UserRes>) synchronousClient.findAllUsers(null);
    }

    public void deletUserById(long id) {
        synchronousClient.deleteUser(Int64Value.of(id));
    }

    public void updateUser(Userservice.UserReq user) {
        synchronousClient.updateUser(user);
    }

    public List<Userservice.UserRes> findUserByFillter(Userservice.UserFilter userFilter) {
       return (List<Userservice.UserRes>) synchronousClient.findUsersByFilter(userFilter);
    }

    public void deleteAllUsers()
    {
        synchronousClient.deleteUsersInBatch(null);
    }
}