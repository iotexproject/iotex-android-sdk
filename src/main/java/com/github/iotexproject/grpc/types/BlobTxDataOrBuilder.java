// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface BlobTxDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.BlobTxData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string blobFeeCap = 1;</code>
   * @return The blobFeeCap.
   */
  java.lang.String getBlobFeeCap();
  /**
   * <code>string blobFeeCap = 1;</code>
   * @return The bytes for blobFeeCap.
   */
  com.google.protobuf.ByteString
      getBlobFeeCapBytes();

  /**
   * <code>repeated bytes blobHashes = 2;</code>
   * @return A list containing the blobHashes.
   */
  java.util.List<com.google.protobuf.ByteString> getBlobHashesList();
  /**
   * <code>repeated bytes blobHashes = 2;</code>
   * @return The count of blobHashes.
   */
  int getBlobHashesCount();
  /**
   * <code>repeated bytes blobHashes = 2;</code>
   * @param index The index of the element to return.
   * @return The blobHashes at the given index.
   */
  com.google.protobuf.ByteString getBlobHashes(int index);

  /**
   * <code>.iotextypes.BlobTxSidecar blobTxSidecar = 3;</code>
   * @return Whether the blobTxSidecar field is set.
   */
  boolean hasBlobTxSidecar();
  /**
   * <code>.iotextypes.BlobTxSidecar blobTxSidecar = 3;</code>
   * @return The blobTxSidecar.
   */
  com.github.iotexproject.grpc.types.BlobTxSidecar getBlobTxSidecar();
  /**
   * <code>.iotextypes.BlobTxSidecar blobTxSidecar = 3;</code>
   */
  com.github.iotexproject.grpc.types.BlobTxSidecarOrBuilder getBlobTxSidecarOrBuilder();
}