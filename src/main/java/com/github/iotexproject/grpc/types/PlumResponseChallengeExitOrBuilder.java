// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/types/action.proto

package com.github.iotexproject.grpc.types;

public interface PlumResponseChallengeExitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.PlumResponseChallengeExit)
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
   * <code>uint64 coinID = 2;</code>
   * @return The coinID.
   */
  long getCoinID();

  /**
   * <code>bytes challengeTransfer = 3;</code>
   * @return The challengeTransfer.
   */
  com.google.protobuf.ByteString getChallengeTransfer();

  /**
   * <code>bytes responseTransfer = 4;</code>
   * @return The responseTransfer.
   */
  com.google.protobuf.ByteString getResponseTransfer();

  /**
   * <code>bytes responseTransferBlockProof = 5;</code>
   * @return The responseTransferBlockProof.
   */
  com.google.protobuf.ByteString getResponseTransferBlockProof();

  /**
   * <code>uint64 previousTransferBlockHeight = 6;</code>
   * @return The previousTransferBlockHeight.
   */
  long getPreviousTransferBlockHeight();
}
