// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/api/api.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.api;

public interface GetServerMetaResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotexapi.GetServerMetaResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.iotextypes.ServerMeta serverMeta = 1;</code>
   * @return Whether the serverMeta field is set.
   */
  boolean hasServerMeta();
  /**
   * <code>.iotextypes.ServerMeta serverMeta = 1;</code>
   * @return The serverMeta.
   */
  com.github.iotexproject.grpc.types.ServerMeta getServerMeta();
  /**
   * <code>.iotextypes.ServerMeta serverMeta = 1;</code>
   */
  com.github.iotexproject.grpc.types.ServerMetaOrBuilder getServerMetaOrBuilder();
}
