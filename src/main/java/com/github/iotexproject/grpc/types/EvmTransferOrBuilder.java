// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface EvmTransferOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.EvmTransfer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes amount = 1;</code>
   * @return The amount.
   */
  com.google.protobuf.ByteString getAmount();

  /**
   * <code>string from = 2;</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <code>string from = 2;</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <code>string to = 3;</code>
   * @return The to.
   */
  java.lang.String getTo();
  /**
   * <code>string to = 3;</code>
   * @return The bytes for to.
   */
  com.google.protobuf.ByteString
      getToBytes();
}
