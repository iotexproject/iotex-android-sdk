// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/genesis.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface GenesisOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.Genesis)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.iotextypes.GenesisBlockchain blockchain = 1;</code>
   * @return Whether the blockchain field is set.
   */
  boolean hasBlockchain();
  /**
   * <code>.iotextypes.GenesisBlockchain blockchain = 1;</code>
   * @return The blockchain.
   */
  com.github.iotexproject.grpc.types.GenesisBlockchain getBlockchain();
  /**
   * <code>.iotextypes.GenesisBlockchain blockchain = 1;</code>
   */
  com.github.iotexproject.grpc.types.GenesisBlockchainOrBuilder getBlockchainOrBuilder();

  /**
   * <code>.iotextypes.GenesisAccount account = 2;</code>
   * @return Whether the account field is set.
   */
  boolean hasAccount();
  /**
   * <code>.iotextypes.GenesisAccount account = 2;</code>
   * @return The account.
   */
  com.github.iotexproject.grpc.types.GenesisAccount getAccount();
  /**
   * <code>.iotextypes.GenesisAccount account = 2;</code>
   */
  com.github.iotexproject.grpc.types.GenesisAccountOrBuilder getAccountOrBuilder();

  /**
   * <code>.iotextypes.GenesisPoll poll = 3;</code>
   * @return Whether the poll field is set.
   */
  boolean hasPoll();
  /**
   * <code>.iotextypes.GenesisPoll poll = 3;</code>
   * @return The poll.
   */
  com.github.iotexproject.grpc.types.GenesisPoll getPoll();
  /**
   * <code>.iotextypes.GenesisPoll poll = 3;</code>
   */
  com.github.iotexproject.grpc.types.GenesisPollOrBuilder getPollOrBuilder();

  /**
   * <code>.iotextypes.GenesisRewarding rewarding = 4;</code>
   * @return Whether the rewarding field is set.
   */
  boolean hasRewarding();
  /**
   * <code>.iotextypes.GenesisRewarding rewarding = 4;</code>
   * @return The rewarding.
   */
  com.github.iotexproject.grpc.types.GenesisRewarding getRewarding();
  /**
   * <code>.iotextypes.GenesisRewarding rewarding = 4;</code>
   */
  com.github.iotexproject.grpc.types.GenesisRewardingOrBuilder getRewardingOrBuilder();
}
