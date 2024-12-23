// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/api/api.proto

package com.github.iotexproject.grpc.api;

public interface LogsFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotexapi.LogsFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string address = 1;</code>
   * @return A list containing the address.
   */
  java.util.List<java.lang.String>
      getAddressList();
  /**
   * <code>repeated string address = 1;</code>
   * @return The count of address.
   */
  int getAddressCount();
  /**
   * <code>repeated string address = 1;</code>
   * @param index The index of the element to return.
   * @return The address at the given index.
   */
  java.lang.String getAddress(int index);
  /**
   * <code>repeated string address = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the address at the given index.
   */
  com.google.protobuf.ByteString
      getAddressBytes(int index);

  /**
   * <code>repeated .iotexapi.Topics topics = 2;</code>
   */
  java.util.List<com.github.iotexproject.grpc.api.Topics> 
      getTopicsList();
  /**
   * <code>repeated .iotexapi.Topics topics = 2;</code>
   */
  com.github.iotexproject.grpc.api.Topics getTopics(int index);
  /**
   * <code>repeated .iotexapi.Topics topics = 2;</code>
   */
  int getTopicsCount();
  /**
   * <code>repeated .iotexapi.Topics topics = 2;</code>
   */
  java.util.List<? extends com.github.iotexproject.grpc.api.TopicsOrBuilder> 
      getTopicsOrBuilderList();
  /**
   * <code>repeated .iotexapi.Topics topics = 2;</code>
   */
  com.github.iotexproject.grpc.api.TopicsOrBuilder getTopicsOrBuilder(
      int index);
}
