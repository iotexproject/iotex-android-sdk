// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/types/action.proto

package com.github.iotexproject.grpc.types;

public interface LogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.Log)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string contractAddress = 1;</code>
   * @return The contractAddress.
   */
  java.lang.String getContractAddress();
  /**
   * <code>string contractAddress = 1;</code>
   * @return The bytes for contractAddress.
   */
  com.google.protobuf.ByteString
      getContractAddressBytes();

  /**
   * <code>repeated bytes topics = 2;</code>
   * @return A list containing the topics.
   */
  java.util.List<com.google.protobuf.ByteString> getTopicsList();
  /**
   * <code>repeated bytes topics = 2;</code>
   * @return The count of topics.
   */
  int getTopicsCount();
  /**
   * <code>repeated bytes topics = 2;</code>
   * @param index The index of the element to return.
   * @return The topics at the given index.
   */
  com.google.protobuf.ByteString getTopics(int index);

  /**
   * <code>bytes data = 3;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <code>uint64 blkHeight = 4;</code>
   * @return The blkHeight.
   */
  long getBlkHeight();

  /**
   * <code>bytes actHash = 5;</code>
   * @return The actHash.
   */
  com.google.protobuf.ByteString getActHash();

  /**
   * <code>uint32 index = 6;</code>
   * @return The index.
   */
  int getIndex();

  /**
   * <code>bytes blkHash = 7;</code>
   * @return The blkHash.
   */
  com.google.protobuf.ByteString getBlkHash();

  /**
   * <code>uint32 txIndex = 8;</code>
   * @return The txIndex.
   */
  int getTxIndex();
}
