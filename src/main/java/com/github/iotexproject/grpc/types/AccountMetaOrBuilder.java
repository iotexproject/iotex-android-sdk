// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/blockchain.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface AccountMetaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.AccountMeta)
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
   * <code>string balance = 2;</code>
   * @return The balance.
   */
  java.lang.String getBalance();
  /**
   * <code>string balance = 2;</code>
   * @return The bytes for balance.
   */
  com.google.protobuf.ByteString
      getBalanceBytes();

  /**
   * <code>uint64 nonce = 3;</code>
   * @return The nonce.
   */
  long getNonce();

  /**
   * <code>uint64 pendingNonce = 4;</code>
   * @return The pendingNonce.
   */
  long getPendingNonce();

  /**
   * <code>uint64 numActions = 5;</code>
   * @return The numActions.
   */
  long getNumActions();

  /**
   * <code>bool isContract = 6;</code>
   * @return The isContract.
   */
  boolean getIsContract();

  /**
   * <code>bytes contractByteCode = 7;</code>
   * @return The contractByteCode.
   */
  com.google.protobuf.ByteString getContractByteCode();
}
