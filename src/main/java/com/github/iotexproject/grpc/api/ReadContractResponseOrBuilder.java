// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/api/api.proto

package com.github.iotexproject.grpc.api;

public interface ReadContractResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotexapi.ReadContractResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string data = 1;</code>
   * @return The data.
   */
  java.lang.String getData();
  /**
   * <code>string data = 1;</code>
   * @return The bytes for data.
   */
  com.google.protobuf.ByteString
      getDataBytes();

  /**
   * <code>.iotextypes.Receipt receipt = 2;</code>
   * @return Whether the receipt field is set.
   */
  boolean hasReceipt();
  /**
   * <code>.iotextypes.Receipt receipt = 2;</code>
   * @return The receipt.
   */
  com.github.iotexproject.grpc.types.Receipt getReceipt();
  /**
   * <code>.iotextypes.Receipt receipt = 2;</code>
   */
  com.github.iotexproject.grpc.types.ReceiptOrBuilder getReceiptOrBuilder();
}
