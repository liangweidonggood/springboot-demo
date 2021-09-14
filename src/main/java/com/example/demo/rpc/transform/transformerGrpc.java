package com.example.demo.rpc.transform;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.1)",
    comments = "Source: transform.proto")
public final class transformerGrpc {

  private transformerGrpc() {}

  public static final String SERVICE_NAME = "transform.transformer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.rpc.transform.Transform.expandReq,
      com.example.demo.rpc.transform.Transform.expandResp> getExpandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "expand",
      requestType = com.example.demo.rpc.transform.Transform.expandReq.class,
      responseType = com.example.demo.rpc.transform.Transform.expandResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.rpc.transform.Transform.expandReq,
      com.example.demo.rpc.transform.Transform.expandResp> getExpandMethod() {
    io.grpc.MethodDescriptor<com.example.demo.rpc.transform.Transform.expandReq, com.example.demo.rpc.transform.Transform.expandResp> getExpandMethod;
    if ((getExpandMethod = transformerGrpc.getExpandMethod) == null) {
      synchronized (transformerGrpc.class) {
        if ((getExpandMethod = transformerGrpc.getExpandMethod) == null) {
          transformerGrpc.getExpandMethod = getExpandMethod =
              io.grpc.MethodDescriptor.<com.example.demo.rpc.transform.Transform.expandReq, com.example.demo.rpc.transform.Transform.expandResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "expand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.rpc.transform.Transform.expandReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.rpc.transform.Transform.expandResp.getDefaultInstance()))
              .setSchemaDescriptor(new transformerMethodDescriptorSupplier("expand"))
              .build();
        }
      }
    }
    return getExpandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.rpc.transform.Transform.shortenReq,
      com.example.demo.rpc.transform.Transform.shortenResp> getShortenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "shorten",
      requestType = com.example.demo.rpc.transform.Transform.shortenReq.class,
      responseType = com.example.demo.rpc.transform.Transform.shortenResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.rpc.transform.Transform.shortenReq,
      com.example.demo.rpc.transform.Transform.shortenResp> getShortenMethod() {
    io.grpc.MethodDescriptor<com.example.demo.rpc.transform.Transform.shortenReq, com.example.demo.rpc.transform.Transform.shortenResp> getShortenMethod;
    if ((getShortenMethod = transformerGrpc.getShortenMethod) == null) {
      synchronized (transformerGrpc.class) {
        if ((getShortenMethod = transformerGrpc.getShortenMethod) == null) {
          transformerGrpc.getShortenMethod = getShortenMethod =
              io.grpc.MethodDescriptor.<com.example.demo.rpc.transform.Transform.shortenReq, com.example.demo.rpc.transform.Transform.shortenResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "shorten"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.rpc.transform.Transform.shortenReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.rpc.transform.Transform.shortenResp.getDefaultInstance()))
              .setSchemaDescriptor(new transformerMethodDescriptorSupplier("shorten"))
              .build();
        }
      }
    }
    return getShortenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static transformerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<transformerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<transformerStub>() {
        @Override
        public transformerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new transformerStub(channel, callOptions);
        }
      };
    return transformerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static transformerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<transformerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<transformerBlockingStub>() {
        @Override
        public transformerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new transformerBlockingStub(channel, callOptions);
        }
      };
    return transformerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static transformerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<transformerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<transformerFutureStub>() {
        @Override
        public transformerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new transformerFutureStub(channel, callOptions);
        }
      };
    return transformerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class transformerImplBase implements io.grpc.BindableService {

    /**
     */
    public void expand(com.example.demo.rpc.transform.Transform.expandReq request,
        io.grpc.stub.StreamObserver<com.example.demo.rpc.transform.Transform.expandResp> responseObserver) {
      asyncUnimplementedUnaryCall(getExpandMethod(), responseObserver);
    }

    /**
     */
    public void shorten(com.example.demo.rpc.transform.Transform.shortenReq request,
        io.grpc.stub.StreamObserver<com.example.demo.rpc.transform.Transform.shortenResp> responseObserver) {
      asyncUnimplementedUnaryCall(getShortenMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExpandMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.rpc.transform.Transform.expandReq,
                com.example.demo.rpc.transform.Transform.expandResp>(
                  this, METHODID_EXPAND)))
          .addMethod(
            getShortenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.rpc.transform.Transform.shortenReq,
                com.example.demo.rpc.transform.Transform.shortenResp>(
                  this, METHODID_SHORTEN)))
          .build();
    }
  }

  /**
   */
  public static final class transformerStub extends io.grpc.stub.AbstractAsyncStub<transformerStub> {
    private transformerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected transformerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new transformerStub(channel, callOptions);
    }

    /**
     */
    public void expand(com.example.demo.rpc.transform.Transform.expandReq request,
        io.grpc.stub.StreamObserver<com.example.demo.rpc.transform.Transform.expandResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExpandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void shorten(com.example.demo.rpc.transform.Transform.shortenReq request,
        io.grpc.stub.StreamObserver<com.example.demo.rpc.transform.Transform.shortenResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShortenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class transformerBlockingStub extends io.grpc.stub.AbstractBlockingStub<transformerBlockingStub> {
    private transformerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected transformerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new transformerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.demo.rpc.transform.Transform.expandResp expand(com.example.demo.rpc.transform.Transform.expandReq request) {
      return blockingUnaryCall(
          getChannel(), getExpandMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.rpc.transform.Transform.shortenResp shorten(com.example.demo.rpc.transform.Transform.shortenReq request) {
      return blockingUnaryCall(
          getChannel(), getShortenMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class transformerFutureStub extends io.grpc.stub.AbstractFutureStub<transformerFutureStub> {
    private transformerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected transformerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new transformerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.rpc.transform.Transform.expandResp> expand(
        com.example.demo.rpc.transform.Transform.expandReq request) {
      return futureUnaryCall(
          getChannel().newCall(getExpandMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.rpc.transform.Transform.shortenResp> shorten(
        com.example.demo.rpc.transform.Transform.shortenReq request) {
      return futureUnaryCall(
          getChannel().newCall(getShortenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXPAND = 0;
  private static final int METHODID_SHORTEN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final transformerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(transformerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXPAND:
          serviceImpl.expand((com.example.demo.rpc.transform.Transform.expandReq) request,
              (io.grpc.stub.StreamObserver<com.example.demo.rpc.transform.Transform.expandResp>) responseObserver);
          break;
        case METHODID_SHORTEN:
          serviceImpl.shorten((com.example.demo.rpc.transform.Transform.shortenReq) request,
              (io.grpc.stub.StreamObserver<com.example.demo.rpc.transform.Transform.shortenResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class transformerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    transformerBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.rpc.transform.Transform.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("transformer");
    }
  }

  private static final class transformerFileDescriptorSupplier
      extends transformerBaseDescriptorSupplier {
    transformerFileDescriptorSupplier() {}
  }

  private static final class transformerMethodDescriptorSupplier
      extends transformerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    transformerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (transformerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new transformerFileDescriptorSupplier())
              .addMethod(getExpandMethod())
              .addMethod(getShortenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
