// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/types/endorsement.proto

package com.github.iotexproject.grpc.types;

public interface EndorsementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.Endorsement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <code>bytes endorser = 2;</code>
   * @return The endorser.
   */
  com.google.protobuf.ByteString getEndorser();

  /**
   * <code>bytes signature = 3;</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();
}
