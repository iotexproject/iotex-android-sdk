// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface ClaimFromRewardingFundOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.ClaimFromRewardingFund)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string amount = 1;</code>
   * @return The amount.
   */
  java.lang.String getAmount();
  /**
   * <code>string amount = 1;</code>
   * @return The bytes for amount.
   */
  com.google.protobuf.ByteString
      getAmountBytes();

  /**
   * <code>bytes data = 2;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <pre>
   * address the claim of rewards for, if empty denoting the sender's address
   * more information see iip27: https://iotex.larksuite.com/wiki/EtDewVEz6i5BeCkyj6vudtdHsCh
   * </pre>
   *
   * <code>string address = 3;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * address the claim of rewards for, if empty denoting the sender's address
   * more information see iip27: https://iotex.larksuite.com/wiki/EtDewVEz6i5BeCkyj6vudtdHsCh
   * </pre>
   *
   * <code>string address = 3;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();
}
