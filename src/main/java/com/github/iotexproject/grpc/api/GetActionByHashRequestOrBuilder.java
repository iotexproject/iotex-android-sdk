// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/api/api.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.api;

public interface GetActionByHashRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotexapi.GetActionByHashRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string actionHash = 1;</code>
   * @return The actionHash.
   */
  java.lang.String getActionHash();
  /**
   * <code>string actionHash = 1;</code>
   * @return The bytes for actionHash.
   */
  com.google.protobuf.ByteString
      getActionHashBytes();

  /**
   * <code>bool checkPending = 2;</code>
   * @return The checkPending.
   */
  boolean getCheckPending();
}
