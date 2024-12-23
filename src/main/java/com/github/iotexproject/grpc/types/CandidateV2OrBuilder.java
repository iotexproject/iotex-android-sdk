// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/types/state_data.proto

package com.github.iotexproject.grpc.types;

public interface CandidateV2OrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.CandidateV2)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string ownerAddress = 1;</code>
   * @return The ownerAddress.
   */
  java.lang.String getOwnerAddress();
  /**
   * <code>string ownerAddress = 1;</code>
   * @return The bytes for ownerAddress.
   */
  com.google.protobuf.ByteString
      getOwnerAddressBytes();

  /**
   * <code>string operatorAddress = 2;</code>
   * @return The operatorAddress.
   */
  java.lang.String getOperatorAddress();
  /**
   * <code>string operatorAddress = 2;</code>
   * @return The bytes for operatorAddress.
   */
  com.google.protobuf.ByteString
      getOperatorAddressBytes();

  /**
   * <code>string rewardAddress = 3;</code>
   * @return The rewardAddress.
   */
  java.lang.String getRewardAddress();
  /**
   * <code>string rewardAddress = 3;</code>
   * @return The bytes for rewardAddress.
   */
  com.google.protobuf.ByteString
      getRewardAddressBytes();

  /**
   * <code>string name = 4;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 4;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string totalWeightedVotes = 5;</code>
   * @return The totalWeightedVotes.
   */
  java.lang.String getTotalWeightedVotes();
  /**
   * <code>string totalWeightedVotes = 5;</code>
   * @return The bytes for totalWeightedVotes.
   */
  com.google.protobuf.ByteString
      getTotalWeightedVotesBytes();

  /**
   * <code>uint64 selfStakeBucketIdx = 6;</code>
   * @return The selfStakeBucketIdx.
   */
  long getSelfStakeBucketIdx();

  /**
   * <code>string selfStakingTokens = 7;</code>
   * @return The selfStakingTokens.
   */
  java.lang.String getSelfStakingTokens();
  /**
   * <code>string selfStakingTokens = 7;</code>
   * @return The bytes for selfStakingTokens.
   */
  com.google.protobuf.ByteString
      getSelfStakingTokensBytes();

  /**
   * <code>string id = 8;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 8;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();
}
