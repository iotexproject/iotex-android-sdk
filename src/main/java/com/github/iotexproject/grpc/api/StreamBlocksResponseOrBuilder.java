// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/api/api.proto

package com.github.iotexproject.grpc.api;

public interface StreamBlocksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotexapi.StreamBlocksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.iotexapi.BlockInfo block = 1;</code>
   * @return Whether the block field is set.
   */
  boolean hasBlock();
  /**
   * <code>.iotexapi.BlockInfo block = 1;</code>
   * @return The block.
   */
  com.github.iotexproject.grpc.api.BlockInfo getBlock();
  /**
   * <code>.iotexapi.BlockInfo block = 1;</code>
   */
  com.github.iotexproject.grpc.api.BlockInfoOrBuilder getBlockOrBuilder();

  /**
   * <code>.iotextypes.BlockIdentifier blockIdentifier = 2;</code>
   * @return Whether the blockIdentifier field is set.
   */
  boolean hasBlockIdentifier();
  /**
   * <code>.iotextypes.BlockIdentifier blockIdentifier = 2;</code>
   * @return The blockIdentifier.
   */
  com.github.iotexproject.grpc.types.BlockIdentifier getBlockIdentifier();
  /**
   * <code>.iotextypes.BlockIdentifier blockIdentifier = 2;</code>
   */
  com.github.iotexproject.grpc.types.BlockIdentifierOrBuilder getBlockIdentifierOrBuilder();
}
