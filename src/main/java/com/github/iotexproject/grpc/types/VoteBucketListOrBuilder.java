// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/state_data.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface VoteBucketListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.VoteBucketList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .iotextypes.VoteBucket buckets = 1;</code>
   */
  java.util.List<com.github.iotexproject.grpc.types.VoteBucket> 
      getBucketsList();
  /**
   * <code>repeated .iotextypes.VoteBucket buckets = 1;</code>
   */
  com.github.iotexproject.grpc.types.VoteBucket getBuckets(int index);
  /**
   * <code>repeated .iotextypes.VoteBucket buckets = 1;</code>
   */
  int getBucketsCount();
  /**
   * <code>repeated .iotextypes.VoteBucket buckets = 1;</code>
   */
  java.util.List<? extends com.github.iotexproject.grpc.types.VoteBucketOrBuilder> 
      getBucketsOrBuilderList();
  /**
   * <code>repeated .iotextypes.VoteBucket buckets = 1;</code>
   */
  com.github.iotexproject.grpc.types.VoteBucketOrBuilder getBucketsOrBuilder(
      int index);
}
