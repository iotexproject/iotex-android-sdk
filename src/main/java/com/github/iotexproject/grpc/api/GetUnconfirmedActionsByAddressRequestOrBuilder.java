// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/api/api.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.api;

public interface GetUnconfirmedActionsByAddressRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotexapi.GetUnconfirmedActionsByAddressRequest)
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
