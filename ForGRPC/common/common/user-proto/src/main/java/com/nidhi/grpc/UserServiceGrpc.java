package com.nidhi.grpc;

import com.google.protobuf.Descriptors;

import java.util.Map;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: userservice.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nidhi.grpc.Userservice.UserReq,
      com.nidhi.grpc.Userservice.UserRes> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createUser",
      requestType = com.nidhi.grpc.Userservice.UserReq.class,
      responseType = com.nidhi.grpc.Userservice.UserRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nidhi.grpc.Userservice.UserReq,
      com.nidhi.grpc.Userservice.UserRes> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.nidhi.grpc.Userservice.UserReq, com.nidhi.grpc.Userservice.UserRes> getCreateUserMethod;
    if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
          UserServiceGrpc.getCreateUserMethod = getCreateUserMethod = 
              io.grpc.MethodDescriptor.<com.nidhi.grpc.Userservice.UserReq, com.nidhi.grpc.Userservice.UserRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "createUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nidhi.grpc.Userservice.UserReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nidhi.grpc.Userservice.UserRes.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("createUser"))
                  .build();
          }
        }
     }
     return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nidhi.grpc.Userservice.UserReq,
      com.nidhi.grpc.Userservice.UserRes> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUser",
      requestType = com.nidhi.grpc.Userservice.UserReq.class,
      responseType = com.nidhi.grpc.Userservice.UserRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nidhi.grpc.Userservice.UserReq,
      com.nidhi.grpc.Userservice.UserRes> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.nidhi.grpc.Userservice.UserReq, com.nidhi.grpc.Userservice.UserRes> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod = 
              io.grpc.MethodDescriptor.<com.nidhi.grpc.Userservice.UserReq, com.nidhi.grpc.Userservice.UserRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "updateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nidhi.grpc.Userservice.UserReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nidhi.grpc.Userservice.UserRes.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("updateUser"))
                  .build();
          }
        }
     }
     return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nidhi.grpc.Userservice.UserFilter,
      com.nidhi.grpc.Userservice.UserRes> getFindUsersByFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findUsersByFilter",
      requestType = com.nidhi.grpc.Userservice.UserFilter.class,
      responseType = com.nidhi.grpc.Userservice.UserRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.nidhi.grpc.Userservice.UserFilter,
      com.nidhi.grpc.Userservice.UserRes> getFindUsersByFilterMethod() {
    io.grpc.MethodDescriptor<com.nidhi.grpc.Userservice.UserFilter, com.nidhi.grpc.Userservice.UserRes> getFindUsersByFilterMethod;
    if ((getFindUsersByFilterMethod = UserServiceGrpc.getFindUsersByFilterMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindUsersByFilterMethod = UserServiceGrpc.getFindUsersByFilterMethod) == null) {
          UserServiceGrpc.getFindUsersByFilterMethod = getFindUsersByFilterMethod = 
              io.grpc.MethodDescriptor.<com.nidhi.grpc.Userservice.UserFilter, com.nidhi.grpc.Userservice.UserRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "findUsersByFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nidhi.grpc.Userservice.UserFilter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nidhi.grpc.Userservice.UserRes.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("findUsersByFilter"))
                  .build();
          }
        }
     }
     return getFindUsersByFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.google.protobuf.Empty> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUser",
      requestType = com.google.protobuf.Int64Value.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.google.protobuf.Empty> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int64Value, com.google.protobuf.Empty> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
          UserServiceGrpc.getDeleteUserMethod = getDeleteUserMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Int64Value, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "deleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int64Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("deleteUser"))
                  .build();
          }
        }
     }
     return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.nidhi.grpc.Userservice.UserRes> getFindUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findUserById",
      requestType = com.google.protobuf.Int64Value.class,
      responseType = com.nidhi.grpc.Userservice.UserRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.nidhi.grpc.Userservice.UserRes> getFindUserByIdMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int64Value, com.nidhi.grpc.Userservice.UserRes> getFindUserByIdMethod;
    if ((getFindUserByIdMethod = UserServiceGrpc.getFindUserByIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindUserByIdMethod = UserServiceGrpc.getFindUserByIdMethod) == null) {
          UserServiceGrpc.getFindUserByIdMethod = getFindUserByIdMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Int64Value, com.nidhi.grpc.Userservice.UserRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "findUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int64Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nidhi.grpc.Userservice.UserRes.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("findUserById"))
                  .build();
          }
        }
     }
     return getFindUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.nidhi.grpc.Userservice.UserRes> getFindAllUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllUsers",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.nidhi.grpc.Userservice.UserRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.nidhi.grpc.Userservice.UserRes> getFindAllUsersMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.nidhi.grpc.Userservice.UserRes> getFindAllUsersMethod;
    if ((getFindAllUsersMethod = UserServiceGrpc.getFindAllUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindAllUsersMethod = UserServiceGrpc.getFindAllUsersMethod) == null) {
          UserServiceGrpc.getFindAllUsersMethod = getFindAllUsersMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.nidhi.grpc.Userservice.UserRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "findAllUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nidhi.grpc.Userservice.UserRes.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("findAllUsers"))
                  .build();
          }
        }
     }
     return getFindAllUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getDeleteUsersInBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUsersInBatch",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getDeleteUsersInBatchMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getDeleteUsersInBatchMethod;
    if ((getDeleteUsersInBatchMethod = UserServiceGrpc.getDeleteUsersInBatchMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUsersInBatchMethod = UserServiceGrpc.getDeleteUsersInBatchMethod) == null) {
          UserServiceGrpc.getDeleteUsersInBatchMethod = getDeleteUsersInBatchMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "deleteUsersInBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("deleteUsersInBatch"))
                  .build();
          }
        }
     }
     return getDeleteUsersInBatchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(com.nidhi.grpc.Userservice.UserReq request,
        io.grpc.stub.StreamObserver<com.nidhi.grpc.Userservice.UserRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(com.nidhi.grpc.Userservice.UserReq request,
        io.grpc.stub.StreamObserver<com.nidhi.grpc.Userservice.UserRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void findUsersByFilter(com.nidhi.grpc.Userservice.UserFilter request,
        io.grpc.stub.StreamObserver<com.nidhi.grpc.Userservice.UserRes> responseObserver) {
      asyncUnimplementedUnaryCall(getFindUsersByFilterMethod(), responseObserver);
    }

    public abstract Map<Descriptors.FieldDescriptor, Object> findById(int user_id);

    /**
     */
    public void deleteUser(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    public void findUserById(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.nidhi.grpc.Userservice.UserRes> responseObserver) {
      asyncUnimplementedUnaryCall(getFindUserByIdMethod(), responseObserver);
    }

    /**
     */
    public void findAllUsers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.nidhi.grpc.Userservice.UserRes> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllUsersMethod(), responseObserver);
    }

    /**
     */
    public void deleteUsersInBatch(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUsersInBatchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nidhi.grpc.Userservice.UserReq,
                com.nidhi.grpc.Userservice.UserRes>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getUpdateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nidhi.grpc.Userservice.UserReq,
                com.nidhi.grpc.Userservice.UserRes>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getFindUsersByFilterMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.nidhi.grpc.Userservice.UserFilter,
                com.nidhi.grpc.Userservice.UserRes>(
                  this, METHODID_FIND_USERS_BY_FILTER)))
          .addMethod(
            getDeleteUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Int64Value,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getFindUserByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Int64Value,
                com.nidhi.grpc.Userservice.UserRes>(
                  this, METHODID_FIND_USER_BY_ID)))
          .addMethod(
            getFindAllUsersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.nidhi.grpc.Userservice.UserRes>(
                  this, METHODID_FIND_ALL_USERS)))
          .addMethod(
            getDeleteUsersInBatchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_USERS_IN_BATCH)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void createUser(com.nidhi.grpc.Userservice.UserReq request,
        io.grpc.stub.StreamObserver<com.nidhi.grpc.Userservice.UserRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.nidhi.grpc.Userservice.UserReq request,
        io.grpc.stub.StreamObserver<com.nidhi.grpc.Userservice.UserRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findUsersByFilter(com.nidhi.grpc.Userservice.UserFilter request,
        io.grpc.stub.StreamObserver<com.nidhi.grpc.Userservice.UserRes> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFindUsersByFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findUserById(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.nidhi.grpc.Userservice.UserRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllUsers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.nidhi.grpc.Userservice.UserRes> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFindAllUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUsersInBatch(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUsersInBatchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nidhi.grpc.Userservice.UserRes createUser(com.nidhi.grpc.Userservice.UserReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nidhi.grpc.Userservice.UserRes updateUser(com.nidhi.grpc.Userservice.UserReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.nidhi.grpc.Userservice.UserRes> findUsersByFilter(
        com.nidhi.grpc.Userservice.UserFilter request) {
      return blockingServerStreamingCall(
          getChannel(), getFindUsersByFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteUser(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nidhi.grpc.Userservice.UserRes findUserById(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), getFindUserByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.nidhi.grpc.Userservice.UserRes> findAllUsers(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getFindAllUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteUsersInBatch(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUsersInBatchMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nidhi.grpc.Userservice.UserRes> createUser(
        com.nidhi.grpc.Userservice.UserReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nidhi.grpc.Userservice.UserRes> updateUser(
        com.nidhi.grpc.Userservice.UserReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteUser(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nidhi.grpc.Userservice.UserRes> findUserById(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(getFindUserByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteUsersInBatch(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUsersInBatchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_UPDATE_USER = 1;
  private static final int METHODID_FIND_USERS_BY_FILTER = 2;
  private static final int METHODID_DELETE_USER = 3;
  private static final int METHODID_FIND_USER_BY_ID = 4;
  private static final int METHODID_FIND_ALL_USERS = 5;
  private static final int METHODID_DELETE_USERS_IN_BATCH = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.nidhi.grpc.Userservice.UserReq) request,
              (io.grpc.stub.StreamObserver<com.nidhi.grpc.Userservice.UserRes>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.nidhi.grpc.Userservice.UserReq) request,
              (io.grpc.stub.StreamObserver<com.nidhi.grpc.Userservice.UserRes>) responseObserver);
          break;
        case METHODID_FIND_USERS_BY_FILTER:
          serviceImpl.findUsersByFilter((com.nidhi.grpc.Userservice.UserFilter) request,
              (io.grpc.stub.StreamObserver<com.nidhi.grpc.Userservice.UserRes>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_FIND_USER_BY_ID:
          serviceImpl.findUserById((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<com.nidhi.grpc.Userservice.UserRes>) responseObserver);
          break;
        case METHODID_FIND_ALL_USERS:
          serviceImpl.findAllUsers((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.nidhi.grpc.Userservice.UserRes>) responseObserver);
          break;
        case METHODID_DELETE_USERS_IN_BATCH:
          serviceImpl.deleteUsersInBatch((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nidhi.grpc.Userservice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getFindUsersByFilterMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getFindUserByIdMethod())
              .addMethod(getFindAllUsersMethod())
              .addMethod(getDeleteUsersInBatchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
