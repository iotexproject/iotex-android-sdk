// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface GrantRewardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.GrantReward)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.iotextypes.RewardType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.iotextypes.RewardType type = 1;</code>
   * @return The type.
   */
  com.github.iotexproject.grpc.types.RewardType getType();

  /**
   * <code>uint64 height = 2;</code>
   * @return The height.
   */
  long getHeight();
}
