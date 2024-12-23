// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/api/api.proto

package com.github.iotexproject.grpc.api;

public interface BlockProducerInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotexapi.BlockProducerInfo)
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
   * <code>string votes = 2;</code>
   * @return The votes.
   */
  java.lang.String getVotes();
  /**
   * <code>string votes = 2;</code>
   * @return The bytes for votes.
   */
  com.google.protobuf.ByteString
      getVotesBytes();

  /**
   * <code>bool active = 3;</code>
   * @return The active.
   */
  boolean getActive();

  /**
   * <code>uint64 production = 4;</code>
   * @return The production.
   */
  long getProduction();
}
