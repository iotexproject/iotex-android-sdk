// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/api/api.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.api;

public interface GetLogsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotexapi.GetLogsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .iotextypes.Log logs = 1;</code>
   */
  java.util.List<com.github.iotexproject.grpc.types.Log> 
      getLogsList();
  /**
   * <code>repeated .iotextypes.Log logs = 1;</code>
   */
  com.github.iotexproject.grpc.types.Log getLogs(int index);
  /**
   * <code>repeated .iotextypes.Log logs = 1;</code>
   */
  int getLogsCount();
  /**
   * <code>repeated .iotextypes.Log logs = 1;</code>
   */
  java.util.List<? extends com.github.iotexproject.grpc.types.LogOrBuilder> 
      getLogsOrBuilderList();
  /**
   * <code>repeated .iotextypes.Log logs = 1;</code>
   */
  com.github.iotexproject.grpc.types.LogOrBuilder getLogsOrBuilder(
      int index);
}
