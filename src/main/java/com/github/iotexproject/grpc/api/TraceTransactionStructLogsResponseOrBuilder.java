// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/api/api.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.api;

public interface TraceTransactionStructLogsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotexapi.TraceTransactionStructLogsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .iotextypes.TransactionStructLog structLogs = 1;</code>
   */
  java.util.List<com.github.iotexproject.grpc.types.TransactionStructLog> 
      getStructLogsList();
  /**
   * <code>repeated .iotextypes.TransactionStructLog structLogs = 1;</code>
   */
  com.github.iotexproject.grpc.types.TransactionStructLog getStructLogs(int index);
  /**
   * <code>repeated .iotextypes.TransactionStructLog structLogs = 1;</code>
   */
  int getStructLogsCount();
  /**
   * <code>repeated .iotextypes.TransactionStructLog structLogs = 1;</code>
   */
  java.util.List<? extends com.github.iotexproject.grpc.types.TransactionStructLogOrBuilder> 
      getStructLogsOrBuilderList();
  /**
   * <code>repeated .iotextypes.TransactionStructLog structLogs = 1;</code>
   */
  com.github.iotexproject.grpc.types.TransactionStructLogOrBuilder getStructLogsOrBuilder(
      int index);
}
