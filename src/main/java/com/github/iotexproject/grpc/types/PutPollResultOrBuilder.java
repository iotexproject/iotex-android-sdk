// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/types/action.proto

package com.github.iotexproject.grpc.types;

public interface PutPollResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.PutPollResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 height = 1;</code>
   * @return The height.
   */
  long getHeight();

  /**
   * <code>.iotextypes.CandidateList candidates = 2;</code>
   * @return Whether the candidates field is set.
   */
  boolean hasCandidates();
  /**
   * <code>.iotextypes.CandidateList candidates = 2;</code>
   * @return The candidates.
   */
  com.github.iotexproject.grpc.types.CandidateList getCandidates();
  /**
   * <code>.iotextypes.CandidateList candidates = 2;</code>
   */
  com.github.iotexproject.grpc.types.CandidateListOrBuilder getCandidatesOrBuilder();
}
