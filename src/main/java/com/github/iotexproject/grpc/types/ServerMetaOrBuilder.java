// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/node.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

public interface ServerMetaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iotextypes.ServerMeta)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string packageVersion = 1;</code>
   * @return The packageVersion.
   */
  java.lang.String getPackageVersion();
  /**
   * <code>string packageVersion = 1;</code>
   * @return The bytes for packageVersion.
   */
  com.google.protobuf.ByteString
      getPackageVersionBytes();

  /**
   * <code>string packageCommitID = 2;</code>
   * @return The packageCommitID.
   */
  java.lang.String getPackageCommitID();
  /**
   * <code>string packageCommitID = 2;</code>
   * @return The bytes for packageCommitID.
   */
  com.google.protobuf.ByteString
      getPackageCommitIDBytes();

  /**
   * <code>string gitStatus = 3;</code>
   * @return The gitStatus.
   */
  java.lang.String getGitStatus();
  /**
   * <code>string gitStatus = 3;</code>
   * @return The bytes for gitStatus.
   */
  com.google.protobuf.ByteString
      getGitStatusBytes();

  /**
   * <code>string goVersion = 4;</code>
   * @return The goVersion.
   */
  java.lang.String getGoVersion();
  /**
   * <code>string goVersion = 4;</code>
   * @return The bytes for goVersion.
   */
  com.google.protobuf.ByteString
      getGoVersionBytes();

  /**
   * <code>string buildTime = 5;</code>
   * @return The buildTime.
   */
  java.lang.String getBuildTime();
  /**
   * <code>string buildTime = 5;</code>
   * @return The bytes for buildTime.
   */
  com.google.protobuf.ByteString
      getBuildTimeBytes();
}
