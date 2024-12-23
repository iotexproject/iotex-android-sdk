// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/api/api.proto

package com.github.iotexproject.grpc.api;

public interface BlockInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotexapi.BlockInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.iotextypes.Block block = 1;</code>
   * @return Whether the block field is set.
   */
  boolean hasBlock();
  /**
   * <code>.iotextypes.Block block = 1;</code>
   * @return The block.
   */
  com.github.iotexproject.grpc.types.Block getBlock();
  /**
   * <code>.iotextypes.Block block = 1;</code>
   */
  com.github.iotexproject.grpc.types.BlockOrBuilder getBlockOrBuilder();

  /**
   * <code>repeated .iotextypes.Receipt receipts = 2;</code>
   */
  java.util.List<com.github.iotexproject.grpc.types.Receipt> 
      getReceiptsList();
  /**
   * <code>repeated .iotextypes.Receipt receipts = 2;</code>
   */
  com.github.iotexproject.grpc.types.Receipt getReceipts(int index);
  /**
   * <code>repeated .iotextypes.Receipt receipts = 2;</code>
   */
  int getReceiptsCount();
  /**
   * <code>repeated .iotextypes.Receipt receipts = 2;</code>
   */
  java.util.List<? extends com.github.iotexproject.grpc.types.ReceiptOrBuilder> 
      getReceiptsOrBuilderList();
  /**
   * <code>repeated .iotextypes.Receipt receipts = 2;</code>
   */
  com.github.iotexproject.grpc.types.ReceiptOrBuilder getReceiptsOrBuilder(
      int index);

  /**
   * <code>.iotextypes.TransactionLogs transactionLogs = 3;</code>
   * @return Whether the transactionLogs field is set.
   */
  boolean hasTransactionLogs();
  /**
   * <code>.iotextypes.TransactionLogs transactionLogs = 3;</code>
   * @return The transactionLogs.
   */
  com.github.iotexproject.grpc.types.TransactionLogs getTransactionLogs();
  /**
   * <code>.iotextypes.TransactionLogs transactionLogs = 3;</code>
   */
  com.github.iotexproject.grpc.types.TransactionLogsOrBuilder getTransactionLogsOrBuilder();
}
