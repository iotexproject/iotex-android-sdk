// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/types/consensus.proto

package com.github.iotexproject.grpc.types;

public interface ConsensusVoteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.ConsensusVote)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes blockHash = 1;</code>
   * @return The blockHash.
   */
  com.google.protobuf.ByteString getBlockHash();

  /**
   * <code>.iotextypes.ConsensusVote.Topic topic = 2;</code>
   * @return The enum numeric value on the wire for topic.
   */
  int getTopicValue();
  /**
   * <code>.iotextypes.ConsensusVote.Topic topic = 2;</code>
   * @return The topic.
   */
  com.github.iotexproject.grpc.types.ConsensusVote.Topic getTopic();
}
