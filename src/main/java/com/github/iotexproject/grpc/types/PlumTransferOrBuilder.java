// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/types/action.proto

package com.github.iotexproject.grpc.types;

public interface PlumTransferOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.PlumTransfer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 coinID = 1;</code>
   * @return The coinID.
   */
  long getCoinID();

  /**
   * <code>bytes denomination = 2;</code>
   * @return The denomination.
   */
  com.google.protobuf.ByteString getDenomination();

  /**
   * <code>string owner = 3;</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 3;</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>string recipient = 4;</code>
   * @return The recipient.
   */
  java.lang.String getRecipient();
  /**
   * <code>string recipient = 4;</code>
   * @return The bytes for recipient.
   */
  com.google.protobuf.ByteString
      getRecipientBytes();
}
