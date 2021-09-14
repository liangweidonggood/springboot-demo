package com.example.demo.rpc;

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
    comments = "Source: historydata.proto")
public final class historydataGrpc {

  private historydataGrpc() {}

  public static final String SERVICE_NAME = "historydata.historydata";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Historydata.uploadWorkHourReq,
      Historydata.uploadWorkHourResp> getUploadWorkHourMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "uploadWorkHour",
      requestType = Historydata.uploadWorkHourReq.class,
      responseType = Historydata.uploadWorkHourResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Historydata.uploadWorkHourReq,
      Historydata.uploadWorkHourResp> getUploadWorkHourMethod() {
    io.grpc.MethodDescriptor<Historydata.uploadWorkHourReq, Historydata.uploadWorkHourResp> getUploadWorkHourMethod;
    if ((getUploadWorkHourMethod = historydataGrpc.getUploadWorkHourMethod) == null) {
      synchronized (historydataGrpc.class) {
        if ((getUploadWorkHourMethod = historydataGrpc.getUploadWorkHourMethod) == null) {
          historydataGrpc.getUploadWorkHourMethod = getUploadWorkHourMethod =
              io.grpc.MethodDescriptor.<Historydata.uploadWorkHourReq, Historydata.uploadWorkHourResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "uploadWorkHour"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Historydata.uploadWorkHourReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Historydata.uploadWorkHourResp.getDefaultInstance()))
              .setSchemaDescriptor(new historydataMethodDescriptorSupplier("uploadWorkHour"))
              .build();
        }
      }
    }
    return getUploadWorkHourMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Historydata.snReq,
      Historydata.strRes> getAddHistoryTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addHistoryTable",
      requestType = Historydata.snReq.class,
      responseType = Historydata.strRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Historydata.snReq,
      Historydata.strRes> getAddHistoryTableMethod() {
    io.grpc.MethodDescriptor<Historydata.snReq, Historydata.strRes> getAddHistoryTableMethod;
    if ((getAddHistoryTableMethod = historydataGrpc.getAddHistoryTableMethod) == null) {
      synchronized (historydataGrpc.class) {
        if ((getAddHistoryTableMethod = historydataGrpc.getAddHistoryTableMethod) == null) {
          historydataGrpc.getAddHistoryTableMethod = getAddHistoryTableMethod =
              io.grpc.MethodDescriptor.<Historydata.snReq, Historydata.strRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addHistoryTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Historydata.snReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Historydata.strRes.getDefaultInstance()))
              .setSchemaDescriptor(new historydataMethodDescriptorSupplier("addHistoryTable"))
              .build();
        }
      }
    }
    return getAddHistoryTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Historydata.snReq,
      Historydata.redisFindHistoryRes> getRedisFindHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "redisFindHistory",
      requestType = Historydata.snReq.class,
      responseType = Historydata.redisFindHistoryRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Historydata.snReq,
      Historydata.redisFindHistoryRes> getRedisFindHistoryMethod() {
    io.grpc.MethodDescriptor<Historydata.snReq, Historydata.redisFindHistoryRes> getRedisFindHistoryMethod;
    if ((getRedisFindHistoryMethod = historydataGrpc.getRedisFindHistoryMethod) == null) {
      synchronized (historydataGrpc.class) {
        if ((getRedisFindHistoryMethod = historydataGrpc.getRedisFindHistoryMethod) == null) {
          historydataGrpc.getRedisFindHistoryMethod = getRedisFindHistoryMethod =
              io.grpc.MethodDescriptor.<Historydata.snReq, Historydata.redisFindHistoryRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "redisFindHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Historydata.snReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Historydata.redisFindHistoryRes.getDefaultInstance()))
              .setSchemaDescriptor(new historydataMethodDescriptorSupplier("redisFindHistory"))
              .build();
        }
      }
    }
    return getRedisFindHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Historydata.historyDataReq,
      Historydata.strRes> getAddHistoryDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addHistoryData",
      requestType = Historydata.historyDataReq.class,
      responseType = Historydata.strRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Historydata.historyDataReq,
      Historydata.strRes> getAddHistoryDataMethod() {
    io.grpc.MethodDescriptor<Historydata.historyDataReq, Historydata.strRes> getAddHistoryDataMethod;
    if ((getAddHistoryDataMethod = historydataGrpc.getAddHistoryDataMethod) == null) {
      synchronized (historydataGrpc.class) {
        if ((getAddHistoryDataMethod = historydataGrpc.getAddHistoryDataMethod) == null) {
          historydataGrpc.getAddHistoryDataMethod = getAddHistoryDataMethod =
              io.grpc.MethodDescriptor.<Historydata.historyDataReq, Historydata.strRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addHistoryData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Historydata.historyDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Historydata.strRes.getDefaultInstance()))
              .setSchemaDescriptor(new historydataMethodDescriptorSupplier("addHistoryData"))
              .build();
        }
      }
    }
    return getAddHistoryDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Historydata.findAlarmCountByDayReq,
      Historydata.findAlarmCountByDayListRes> getFindAlarmCountByDayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAlarmCountByDay",
      requestType = Historydata.findAlarmCountByDayReq.class,
      responseType = Historydata.findAlarmCountByDayListRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Historydata.findAlarmCountByDayReq,
      Historydata.findAlarmCountByDayListRes> getFindAlarmCountByDayMethod() {
    io.grpc.MethodDescriptor<Historydata.findAlarmCountByDayReq, Historydata.findAlarmCountByDayListRes> getFindAlarmCountByDayMethod;
    if ((getFindAlarmCountByDayMethod = historydataGrpc.getFindAlarmCountByDayMethod) == null) {
      synchronized (historydataGrpc.class) {
        if ((getFindAlarmCountByDayMethod = historydataGrpc.getFindAlarmCountByDayMethod) == null) {
          historydataGrpc.getFindAlarmCountByDayMethod = getFindAlarmCountByDayMethod =
              io.grpc.MethodDescriptor.<Historydata.findAlarmCountByDayReq, Historydata.findAlarmCountByDayListRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAlarmCountByDay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Historydata.findAlarmCountByDayReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Historydata.findAlarmCountByDayListRes.getDefaultInstance()))
              .setSchemaDescriptor(new historydataMethodDescriptorSupplier("findAlarmCountByDay"))
              .build();
        }
      }
    }
    return getFindAlarmCountByDayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Historydata.findAlarmListByDayReq,
      Historydata.findAlarmListByDayRes> getFindAlarmListByDayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAlarmListByDay",
      requestType = Historydata.findAlarmListByDayReq.class,
      responseType = Historydata.findAlarmListByDayRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Historydata.findAlarmListByDayReq,
      Historydata.findAlarmListByDayRes> getFindAlarmListByDayMethod() {
    io.grpc.MethodDescriptor<Historydata.findAlarmListByDayReq, Historydata.findAlarmListByDayRes> getFindAlarmListByDayMethod;
    if ((getFindAlarmListByDayMethod = historydataGrpc.getFindAlarmListByDayMethod) == null) {
      synchronized (historydataGrpc.class) {
        if ((getFindAlarmListByDayMethod = historydataGrpc.getFindAlarmListByDayMethod) == null) {
          historydataGrpc.getFindAlarmListByDayMethod = getFindAlarmListByDayMethod =
              io.grpc.MethodDescriptor.<Historydata.findAlarmListByDayReq, Historydata.findAlarmListByDayRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAlarmListByDay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Historydata.findAlarmListByDayReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Historydata.findAlarmListByDayRes.getDefaultInstance()))
              .setSchemaDescriptor(new historydataMethodDescriptorSupplier("findAlarmListByDay"))
              .build();
        }
      }
    }
    return getFindAlarmListByDayMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static historydataStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<historydataStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<historydataStub>() {
        @Override
        public historydataStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new historydataStub(channel, callOptions);
        }
      };
    return historydataStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static historydataBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<historydataBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<historydataBlockingStub>() {
        @Override
        public historydataBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new historydataBlockingStub(channel, callOptions);
        }
      };
    return historydataBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static historydataFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<historydataFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<historydataFutureStub>() {
        @Override
        public historydataFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new historydataFutureStub(channel, callOptions);
        }
      };
    return historydataFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class historydataImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *根据企业id统计工时并上传 返回远程调用的信息
     * </pre>
     */
    public void uploadWorkHour(Historydata.uploadWorkHourReq request,
                               io.grpc.stub.StreamObserver<Historydata.uploadWorkHourResp> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadWorkHourMethod(), responseObserver);
    }

    /**
     * <pre>
     *新增history表   新增alarm表
     * </pre>
     */
    public void addHistoryTable(Historydata.snReq request,
                                io.grpc.stub.StreamObserver<Historydata.strRes> responseObserver) {
      asyncUnimplementedUnaryCall(getAddHistoryTableMethod(), responseObserver);
    }

    /**
     * <pre>
     *redis中查询history
     * </pre>
     */
    public void redisFindHistory(Historydata.snReq request,
                                 io.grpc.stub.StreamObserver<Historydata.redisFindHistoryRes> responseObserver) {
      asyncUnimplementedUnaryCall(getRedisFindHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     *新增history,alarm记录 redis中新增history最新记录
     * </pre>
     */
    public void addHistoryData(Historydata.historyDataReq request,
                               io.grpc.stub.StreamObserver<Historydata.strRes> responseObserver) {
      asyncUnimplementedUnaryCall(getAddHistoryDataMethod(), responseObserver);
    }

    /**
     * <pre>
     *统计alarm数据 按天统计近N天的报警 数量和日期
     * </pre>
     */
    public void findAlarmCountByDay(Historydata.findAlarmCountByDayReq request,
                                    io.grpc.stub.StreamObserver<Historydata.findAlarmCountByDayListRes> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAlarmCountByDayMethod(), responseObserver);
    }

    /**
     * <pre>
     *根据条件统计报警 起始时间 报警数据
     * </pre>
     */
    public void findAlarmListByDay(Historydata.findAlarmListByDayReq request,
                                   io.grpc.stub.StreamObserver<Historydata.findAlarmListByDayRes> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAlarmListByDayMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadWorkHourMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Historydata.uploadWorkHourReq,
                Historydata.uploadWorkHourResp>(
                  this, METHODID_UPLOAD_WORK_HOUR)))
          .addMethod(
            getAddHistoryTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Historydata.snReq,
                Historydata.strRes>(
                  this, METHODID_ADD_HISTORY_TABLE)))
          .addMethod(
            getRedisFindHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Historydata.snReq,
                Historydata.redisFindHistoryRes>(
                  this, METHODID_REDIS_FIND_HISTORY)))
          .addMethod(
            getAddHistoryDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Historydata.historyDataReq,
                Historydata.strRes>(
                  this, METHODID_ADD_HISTORY_DATA)))
          .addMethod(
            getFindAlarmCountByDayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Historydata.findAlarmCountByDayReq,
                Historydata.findAlarmCountByDayListRes>(
                  this, METHODID_FIND_ALARM_COUNT_BY_DAY)))
          .addMethod(
            getFindAlarmListByDayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Historydata.findAlarmListByDayReq,
                Historydata.findAlarmListByDayRes>(
                  this, METHODID_FIND_ALARM_LIST_BY_DAY)))
          .build();
    }
  }

  /**
   */
  public static final class historydataStub extends io.grpc.stub.AbstractAsyncStub<historydataStub> {
    private historydataStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected historydataStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new historydataStub(channel, callOptions);
    }

    /**
     * <pre>
     *根据企业id统计工时并上传 返回远程调用的信息
     * </pre>
     */
    public void uploadWorkHour(Historydata.uploadWorkHourReq request,
                               io.grpc.stub.StreamObserver<Historydata.uploadWorkHourResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadWorkHourMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *新增history表   新增alarm表
     * </pre>
     */
    public void addHistoryTable(Historydata.snReq request,
                                io.grpc.stub.StreamObserver<Historydata.strRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddHistoryTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *redis中查询history
     * </pre>
     */
    public void redisFindHistory(Historydata.snReq request,
                                 io.grpc.stub.StreamObserver<Historydata.redisFindHistoryRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRedisFindHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *新增history,alarm记录 redis中新增history最新记录
     * </pre>
     */
    public void addHistoryData(Historydata.historyDataReq request,
                               io.grpc.stub.StreamObserver<Historydata.strRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddHistoryDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *统计alarm数据 按天统计近N天的报警 数量和日期
     * </pre>
     */
    public void findAlarmCountByDay(Historydata.findAlarmCountByDayReq request,
                                    io.grpc.stub.StreamObserver<Historydata.findAlarmCountByDayListRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAlarmCountByDayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据条件统计报警 起始时间 报警数据
     * </pre>
     */
    public void findAlarmListByDay(Historydata.findAlarmListByDayReq request,
                                   io.grpc.stub.StreamObserver<Historydata.findAlarmListByDayRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAlarmListByDayMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class historydataBlockingStub extends io.grpc.stub.AbstractBlockingStub<historydataBlockingStub> {
    private historydataBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected historydataBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new historydataBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *根据企业id统计工时并上传 返回远程调用的信息
     * </pre>
     */
    public Historydata.uploadWorkHourResp uploadWorkHour(Historydata.uploadWorkHourReq request) {
      return blockingUnaryCall(
          getChannel(), getUploadWorkHourMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *新增history表   新增alarm表
     * </pre>
     */
    public Historydata.strRes addHistoryTable(Historydata.snReq request) {
      return blockingUnaryCall(
          getChannel(), getAddHistoryTableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *redis中查询history
     * </pre>
     */
    public Historydata.redisFindHistoryRes redisFindHistory(Historydata.snReq request) {
      return blockingUnaryCall(
          getChannel(), getRedisFindHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *新增history,alarm记录 redis中新增history最新记录
     * </pre>
     */
    public Historydata.strRes addHistoryData(Historydata.historyDataReq request) {
      return blockingUnaryCall(
          getChannel(), getAddHistoryDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *统计alarm数据 按天统计近N天的报警 数量和日期
     * </pre>
     */
    public Historydata.findAlarmCountByDayListRes findAlarmCountByDay(Historydata.findAlarmCountByDayReq request) {
      return blockingUnaryCall(
          getChannel(), getFindAlarmCountByDayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *根据条件统计报警 起始时间 报警数据
     * </pre>
     */
    public Historydata.findAlarmListByDayRes findAlarmListByDay(Historydata.findAlarmListByDayReq request) {
      return blockingUnaryCall(
          getChannel(), getFindAlarmListByDayMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class historydataFutureStub extends io.grpc.stub.AbstractFutureStub<historydataFutureStub> {
    private historydataFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected historydataFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new historydataFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *根据企业id统计工时并上传 返回远程调用的信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Historydata.uploadWorkHourResp> uploadWorkHour(
        Historydata.uploadWorkHourReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadWorkHourMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *新增history表   新增alarm表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Historydata.strRes> addHistoryTable(
        Historydata.snReq request) {
      return futureUnaryCall(
          getChannel().newCall(getAddHistoryTableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *redis中查询history
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Historydata.redisFindHistoryRes> redisFindHistory(
        Historydata.snReq request) {
      return futureUnaryCall(
          getChannel().newCall(getRedisFindHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *新增history,alarm记录 redis中新增history最新记录
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Historydata.strRes> addHistoryData(
        Historydata.historyDataReq request) {
      return futureUnaryCall(
          getChannel().newCall(getAddHistoryDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *统计alarm数据 按天统计近N天的报警 数量和日期
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Historydata.findAlarmCountByDayListRes> findAlarmCountByDay(
        Historydata.findAlarmCountByDayReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAlarmCountByDayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *根据条件统计报警 起始时间 报警数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Historydata.findAlarmListByDayRes> findAlarmListByDay(
        Historydata.findAlarmListByDayReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAlarmListByDayMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_WORK_HOUR = 0;
  private static final int METHODID_ADD_HISTORY_TABLE = 1;
  private static final int METHODID_REDIS_FIND_HISTORY = 2;
  private static final int METHODID_ADD_HISTORY_DATA = 3;
  private static final int METHODID_FIND_ALARM_COUNT_BY_DAY = 4;
  private static final int METHODID_FIND_ALARM_LIST_BY_DAY = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final historydataImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(historydataImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_WORK_HOUR:
          serviceImpl.uploadWorkHour((Historydata.uploadWorkHourReq) request,
              (io.grpc.stub.StreamObserver<Historydata.uploadWorkHourResp>) responseObserver);
          break;
        case METHODID_ADD_HISTORY_TABLE:
          serviceImpl.addHistoryTable((Historydata.snReq) request,
              (io.grpc.stub.StreamObserver<Historydata.strRes>) responseObserver);
          break;
        case METHODID_REDIS_FIND_HISTORY:
          serviceImpl.redisFindHistory((Historydata.snReq) request,
              (io.grpc.stub.StreamObserver<Historydata.redisFindHistoryRes>) responseObserver);
          break;
        case METHODID_ADD_HISTORY_DATA:
          serviceImpl.addHistoryData((Historydata.historyDataReq) request,
              (io.grpc.stub.StreamObserver<Historydata.strRes>) responseObserver);
          break;
        case METHODID_FIND_ALARM_COUNT_BY_DAY:
          serviceImpl.findAlarmCountByDay((Historydata.findAlarmCountByDayReq) request,
              (io.grpc.stub.StreamObserver<Historydata.findAlarmCountByDayListRes>) responseObserver);
          break;
        case METHODID_FIND_ALARM_LIST_BY_DAY:
          serviceImpl.findAlarmListByDay((Historydata.findAlarmListByDayReq) request,
              (io.grpc.stub.StreamObserver<Historydata.findAlarmListByDayRes>) responseObserver);
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

  private static abstract class historydataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    historydataBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Historydata.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("historydata");
    }
  }

  private static final class historydataFileDescriptorSupplier
      extends historydataBaseDescriptorSupplier {
    historydataFileDescriptorSupplier() {}
  }

  private static final class historydataMethodDescriptorSupplier
      extends historydataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    historydataMethodDescriptorSupplier(String methodName) {
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
      synchronized (historydataGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new historydataFileDescriptorSupplier())
              .addMethod(getUploadWorkHourMethod())
              .addMethod(getAddHistoryTableMethod())
              .addMethod(getRedisFindHistoryMethod())
              .addMethod(getAddHistoryDataMethod())
              .addMethod(getFindAlarmCountByDayMethod())
              .addMethod(getFindAlarmListByDayMethod())
              .build();
        }
      }
    }
    return result;
  }
}
