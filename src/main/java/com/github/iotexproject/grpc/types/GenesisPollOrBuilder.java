// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/genesis.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface GenesisPollOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.GenesisPoll)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool enableGravityChainVoting = 1;</code>
   * @return The enableGravityChainVoting.
   */
  boolean getEnableGravityChainVoting();

  /**
   * <code>uint64 gravityChainStartHeight = 2;</code>
   * @return The gravityChainStartHeight.
   */
  long getGravityChainStartHeight();

  /**
   * <code>string registerContractAddress = 3;</code>
   * @return The registerContractAddress.
   */
  java.lang.String getRegisterContractAddress();
  /**
   * <code>string registerContractAddress = 3;</code>
   * @return The bytes for registerContractAddress.
   */
  com.google.protobuf.ByteString
      getRegisterContractAddressBytes();

  /**
   * <code>string stakingContractAddress = 4;</code>
   * @return The stakingContractAddress.
   */
  java.lang.String getStakingContractAddress();
  /**
   * <code>string stakingContractAddress = 4;</code>
   * @return The bytes for stakingContractAddress.
   */
  com.google.protobuf.ByteString
      getStakingContractAddressBytes();

  /**
   * <code>string voteThreshold = 5;</code>
   * @return The voteThreshold.
   */
  java.lang.String getVoteThreshold();
  /**
   * <code>string voteThreshold = 5;</code>
   * @return The bytes for voteThreshold.
   */
  com.google.protobuf.ByteString
      getVoteThresholdBytes();

  /**
   * <code>string scoreThreshold = 6;</code>
   * @return The scoreThreshold.
   */
  java.lang.String getScoreThreshold();
  /**
   * <code>string scoreThreshold = 6;</code>
   * @return The bytes for scoreThreshold.
   */
  com.google.protobuf.ByteString
      getScoreThresholdBytes();

  /**
   * <code>string selfStakingThreshold = 7;</code>
   * @return The selfStakingThreshold.
   */
  java.lang.String getSelfStakingThreshold();
  /**
   * <code>string selfStakingThreshold = 7;</code>
   * @return The bytes for selfStakingThreshold.
   */
  com.google.protobuf.ByteString
      getSelfStakingThresholdBytes();

  /**
   * <code>repeated .iotextypes.GenesisDelegate delegates = 8;</code>
   */
  java.util.List<com.github.iotexproject.grpc.types.GenesisDelegate> 
      getDelegatesList();
  /**
   * <code>repeated .iotextypes.GenesisDelegate delegates = 8;</code>
   */
  com.github.iotexproject.grpc.types.GenesisDelegate getDelegates(int index);
  /**
   * <code>repeated .iotextypes.GenesisDelegate delegates = 8;</code>
   */
  int getDelegatesCount();
  /**
   * <code>repeated .iotextypes.GenesisDelegate delegates = 8;</code>
   */
  java.util.List<? extends com.github.iotexproject.grpc.types.GenesisDelegateOrBuilder> 
      getDelegatesOrBuilderList();
  /**
   * <code>repeated .iotextypes.GenesisDelegate delegates = 8;</code>
   */
  com.github.iotexproject.grpc.types.GenesisDelegateOrBuilder getDelegatesOrBuilder(
      int index);
}
