// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface PlumStartExitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.PlumStartExit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string subChainAddress = 1;</code>
   * @return The subChainAddress.
   */
  java.lang.String getSubChainAddress();
  /**
   * <code>string subChainAddress = 1;</code>
   * @return The bytes for subChainAddress.
   */
  com.google.protobuf.ByteString
      getSubChainAddressBytes();

  /**
   * <code>bytes previousTransfer = 2;</code>
   * @return The previousTransfer.
   */
  com.google.protobuf.ByteString getPreviousTransfer();

  /**
   * <code>bytes previousTransferBlockProof = 3;</code>
   * @return The previousTransferBlockProof.
   */
  com.google.protobuf.ByteString getPreviousTransferBlockProof();

  /**
   * <code>uint64 previousTransferBlockHeight = 4;</code>
   * @return The previousTransferBlockHeight.
   */
  long getPreviousTransferBlockHeight();

  /**
   * <code>bytes exitTransfer = 5;</code>
   * @return The exitTransfer.
   */
  com.google.protobuf.ByteString getExitTransfer();

  /**
   * <code>bytes exitTransferBlockProof = 6;</code>
   * @return The exitTransferBlockProof.
   */
  com.google.protobuf.ByteString getExitTransferBlockProof();

  /**
   * <code>uint64 exitTransferBlockHeight = 7;</code>
   * @return The exitTransferBlockHeight.
   */
  long getExitTransferBlockHeight();
}
