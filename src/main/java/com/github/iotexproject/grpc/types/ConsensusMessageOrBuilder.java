// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/types/consensus.proto

package com.github.iotexproject.grpc.types;

public interface ConsensusMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.ConsensusMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 height = 1;</code>
   * @return The height.
   */
  long getHeight();

  /**
   * <code>.iotextypes.Endorsement endorsement = 2;</code>
   * @return Whether the endorsement field is set.
   */
  boolean hasEndorsement();
  /**
   * <code>.iotextypes.Endorsement endorsement = 2;</code>
   * @return The endorsement.
   */
  com.github.iotexproject.grpc.types.Endorsement getEndorsement();
  /**
   * <code>.iotextypes.Endorsement endorsement = 2;</code>
   */
  com.github.iotexproject.grpc.types.EndorsementOrBuilder getEndorsementOrBuilder();

  /**
   * <code>.iotextypes.BlockProposal blockProposal = 100;</code>
   * @return Whether the blockProposal field is set.
   */
  boolean hasBlockProposal();
  /**
   * <code>.iotextypes.BlockProposal blockProposal = 100;</code>
   * @return The blockProposal.
   */
  com.github.iotexproject.grpc.types.BlockProposal getBlockProposal();
  /**
   * <code>.iotextypes.BlockProposal blockProposal = 100;</code>
   */
  com.github.iotexproject.grpc.types.BlockProposalOrBuilder getBlockProposalOrBuilder();

  /**
   * <code>.iotextypes.ConsensusVote vote = 101;</code>
   * @return Whether the vote field is set.
   */
  boolean hasVote();
  /**
   * <code>.iotextypes.ConsensusVote vote = 101;</code>
   * @return The vote.
   */
  com.github.iotexproject.grpc.types.ConsensusVote getVote();
  /**
   * <code>.iotextypes.ConsensusVote vote = 101;</code>
   */
  com.github.iotexproject.grpc.types.ConsensusVoteOrBuilder getVoteOrBuilder();

  public com.github.iotexproject.grpc.types.ConsensusMessage.MsgCase getMsgCase();
}
