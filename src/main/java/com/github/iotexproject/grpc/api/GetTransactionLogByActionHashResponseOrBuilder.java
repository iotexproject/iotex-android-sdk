// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/api/api.proto

package com.github.iotexproject.grpc.api;

public interface GetTransactionLogByActionHashResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotexapi.GetTransactionLogByActionHashResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.iotextypes.TransactionLog transactionLog = 1;</code>
   * @return Whether the transactionLog field is set.
   */
  boolean hasTransactionLog();
  /**
   * <code>.iotextypes.TransactionLog transactionLog = 1;</code>
   * @return The transactionLog.
   */
  com.github.iotexproject.grpc.types.TransactionLog getTransactionLog();
  /**
   * <code>.iotextypes.TransactionLog transactionLog = 1;</code>
   */
  com.github.iotexproject.grpc.types.TransactionLogOrBuilder getTransactionLogOrBuilder();
}
