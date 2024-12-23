// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/types/blockchain.proto

package com.github.iotexproject.grpc.types;

public interface BlockHeaderCoreOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.BlockHeaderCore)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 version = 1;</code>
   * @return The version.
   */
  int getVersion();

  /**
   * <code>uint64 height = 2;</code>
   * @return The height.
   */
  long getHeight();

  /**
   * <code>.google.protobuf.Timestamp timestamp = 3;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>.google.protobuf.Timestamp timestamp = 3;</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <code>.google.protobuf.Timestamp timestamp = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <code>bytes prevBlockHash = 4;</code>
   * @return The prevBlockHash.
   */
  com.google.protobuf.ByteString getPrevBlockHash();

  /**
   * <code>bytes txRoot = 5;</code>
   * @return The txRoot.
   */
  com.google.protobuf.ByteString getTxRoot();

  /**
   * <code>bytes deltaStateDigest = 6;</code>
   * @return The deltaStateDigest.
   */
  com.google.protobuf.ByteString getDeltaStateDigest();

  /**
   * <code>bytes receiptRoot = 7;</code>
   * @return The receiptRoot.
   */
  com.google.protobuf.ByteString getReceiptRoot();

  /**
   * <code>bytes logsBloom = 8;</code>
   * @return The logsBloom.
   */
  com.google.protobuf.ByteString getLogsBloom();

  /**
   * <code>uint64 gasUsed = 9;</code>
   * @return The gasUsed.
   */
  long getGasUsed();

  /**
   * <code>bytes baseFee = 10;</code>
   * @return The baseFee.
   */
  com.google.protobuf.ByteString getBaseFee();

  /**
   * <code>uint64 blobGasUsed = 11;</code>
   * @return The blobGasUsed.
   */
  long getBlobGasUsed();

  /**
   * <code>uint64 excessBlobGas = 12;</code>
   * @return The excessBlobGas.
   */
  long getExcessBlobGas();
}
