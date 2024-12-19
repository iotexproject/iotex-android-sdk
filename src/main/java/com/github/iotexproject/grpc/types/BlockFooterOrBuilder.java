// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/blockchain.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface BlockFooterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.BlockFooter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
   */
  java.util.List<com.github.iotexproject.grpc.types.Endorsement> 
      getEndorsementsList();
  /**
   * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
   */
  com.github.iotexproject.grpc.types.Endorsement getEndorsements(int index);
  /**
   * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
   */
  int getEndorsementsCount();
  /**
   * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
   */
  java.util.List<? extends com.github.iotexproject.grpc.types.EndorsementOrBuilder> 
      getEndorsementsOrBuilderList();
  /**
   * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
   */
  com.github.iotexproject.grpc.types.EndorsementOrBuilder getEndorsementsOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Timestamp timestamp = 2;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.google.protobuf.Timestamp timestamp = 2;</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <code>.google.protobuf.Timestamp timestamp = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();
}
