// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/state_data.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface VoteBucketOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.VoteBucket)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 index = 1;</code>
   * @return The index.
   */
  long getIndex();

  /**
   * <code>string candidateAddress = 2;</code>
   * @return The candidateAddress.
   */
  java.lang.String getCandidateAddress();
  /**
   * <code>string candidateAddress = 2;</code>
   * @return The bytes for candidateAddress.
   */
  com.google.protobuf.ByteString
      getCandidateAddressBytes();

  /**
   * <code>string stakedAmount = 3;</code>
   * @return The stakedAmount.
   */
  java.lang.String getStakedAmount();
  /**
   * <code>string stakedAmount = 3;</code>
   * @return The bytes for stakedAmount.
   */
  com.google.protobuf.ByteString
      getStakedAmountBytes();

  /**
   * <code>uint32 stakedDuration = 4;</code>
   * @return The stakedDuration.
   */
  int getStakedDuration();

  /**
   * <code>.google.protobuf.Timestamp createTime = 5;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <code>.google.protobuf.Timestamp createTime = 5;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <code>.google.protobuf.Timestamp createTime = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp stakeStartTime = 6;</code>
   * @return Whether the stakeStartTime field is set.
   */
  boolean hasStakeStartTime();
  /**
   * <code>.google.protobuf.Timestamp stakeStartTime = 6;</code>
   * @return The stakeStartTime.
   */
  com.google.protobuf.Timestamp getStakeStartTime();
  /**
   * <code>.google.protobuf.Timestamp stakeStartTime = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStakeStartTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp unstakeStartTime = 7;</code>
   * @return Whether the unstakeStartTime field is set.
   */
  boolean hasUnstakeStartTime();
  /**
   * <code>.google.protobuf.Timestamp unstakeStartTime = 7;</code>
   * @return The unstakeStartTime.
   */
  com.google.protobuf.Timestamp getUnstakeStartTime();
  /**
   * <code>.google.protobuf.Timestamp unstakeStartTime = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUnstakeStartTimeOrBuilder();

  /**
   * <code>bool autoStake = 8;</code>
   * @return The autoStake.
   */
  boolean getAutoStake();

  /**
   * <code>string owner = 9;</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 9;</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>string contractAddress = 10;</code>
   * @return The contractAddress.
   */
  java.lang.String getContractAddress();
  /**
   * <code>string contractAddress = 10;</code>
   * @return The bytes for contractAddress.
   */
  com.google.protobuf.ByteString
      getContractAddressBytes();

  /**
   * <code>uint64 stakedDurationBlockNumber = 11;</code>
   * @return The stakedDurationBlockNumber.
   */
  long getStakedDurationBlockNumber();

  /**
   * <code>uint64 createBlockHeight = 12;</code>
   * @return The createBlockHeight.
   */
  long getCreateBlockHeight();

  /**
   * <code>uint64 stakeStartBlockHeight = 13;</code>
   * @return The stakeStartBlockHeight.
   */
  long getStakeStartBlockHeight();

  /**
   * <code>uint64 unstakeStartBlockHeight = 14;</code>
   * @return The unstakeStartBlockHeight.
   */
  long getUnstakeStartBlockHeight();

  /**
   * <code>uint64 endorsementExpireBlockHeight = 15;</code>
   * @return The endorsementExpireBlockHeight.
   */
  long getEndorsementExpireBlockHeight();
}