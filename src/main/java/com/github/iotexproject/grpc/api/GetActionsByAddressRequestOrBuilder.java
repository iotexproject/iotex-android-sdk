// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/api/api.proto

package com.github.iotexproject.grpc.api;

public interface GetActionsByAddressRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotexapi.GetActionsByAddressRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 1;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 1;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>uint64 start = 2;</code>
   * @return The start.
   */
  long getStart();

  /**
   * <code>uint64 count = 3;</code>
   * @return The count.
   */
  long getCount();
}
