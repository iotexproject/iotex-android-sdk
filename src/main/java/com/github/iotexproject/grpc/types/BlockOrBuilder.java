// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/blockchain.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface BlockOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.Block)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.iotextypes.BlockHeader header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <code>.iotextypes.BlockHeader header = 1;</code>
   * @return The header.
   */
  com.github.iotexproject.grpc.types.BlockHeader getHeader();
  /**
   * <code>.iotextypes.BlockHeader header = 1;</code>
   */
  com.github.iotexproject.grpc.types.BlockHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>.iotextypes.BlockBody body = 2;</code>
   * @return Whether the body field is set.
   */
  boolean hasBody();
  /**
   * <code>.iotextypes.BlockBody body = 2;</code>
   * @return The body.
   */
  com.github.iotexproject.grpc.types.BlockBody getBody();
  /**
   * <code>.iotextypes.BlockBody body = 2;</code>
   */
  com.github.iotexproject.grpc.types.BlockBodyOrBuilder getBodyOrBuilder();

  /**
   * <code>.iotextypes.BlockFooter footer = 3;</code>
   * @return Whether the footer field is set.
   */
  boolean hasFooter();
  /**
   * <code>.iotextypes.BlockFooter footer = 3;</code>
   * @return The footer.
   */
  com.github.iotexproject.grpc.types.BlockFooter getFooter();
  /**
   * <code>.iotextypes.BlockFooter footer = 3;</code>
   */
  com.github.iotexproject.grpc.types.BlockFooterOrBuilder getFooterOrBuilder();
}
