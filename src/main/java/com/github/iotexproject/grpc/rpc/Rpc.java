// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/rpc/rpc.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.rpc;

public final class Rpc {
  private Rpc() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      Rpc.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_iotexrpc_BlockSync_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_iotexrpc_BlockSync_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_iotexrpc_ActionSync_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_iotexrpc_ActionSync_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_iotexrpc_BroadcastMsg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_iotexrpc_BroadcastMsg_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_iotexrpc_UnicastMsg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_iotexrpc_UnicastMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023proto/rpc/rpc.proto\022\010iotexrpc\032\037google/" +
      "protobuf/timestamp.proto\"\'\n\tBlockSync\022\r\n" +
      "\005start\030\002 \001(\004\022\013\n\003end\030\003 \001(\004\"\034\n\nActionSync\022" +
      "\016\n\006hashes\030\001 \003(\014\"\233\001\n\014BroadcastMsg\022\020\n\010chai" +
      "n_id\030\001 \001(\r\022\'\n\010msg_type\030\002 \001(\0162\025.iotexrpc." +
      "MessageType\022\020\n\010msg_body\030\003 \001(\014\022\017\n\007peer_id" +
      "\030\004 \001(\t\022-\n\ttimestamp\030\005 \001(\0132\032.google.proto" +
      "buf.Timestamp\"\247\001\n\nUnicastMsg\022\020\n\010chain_id" +
      "\030\001 \001(\r\022\014\n\004addr\030\002 \001(\t\022\'\n\010msg_type\030\003 \001(\0162\025" +
      ".iotexrpc.MessageType\022\020\n\010msg_body\030\004 \001(\014\022" +
      "\017\n\007peer_id\030\005 \001(\t\022-\n\ttimestamp\030\006 \001(\0132\032.go" +
      "ogle.protobuf.Timestamp*\266\001\n\013MessageType\022" +
      "\013\n\007UNKNOWN\020\000\022\n\n\006ACTION\020\001\022\t\n\005BLOCK\020\002\022\r\n\tC" +
      "ONSENSUS\020\003\022\021\n\rBLOCK_REQUEST\020\004\022\025\n\021NODE_IN" +
      "FO_REQUEST\020\005\022\r\n\tNODE_INFO\020\006\022\013\n\007ACTIONS\020\007" +
      "\022\017\n\013ACTION_HASH\020\010\022\022\n\016ACTION_REQUEST\020\t\022\t\n" +
      "\004TEST\020\221NBY\n com.github.iotexproject.grpc" +
      ".rpcP\001Z3github.com/iotexproject/iotex-pr" +
      "oto/golang/iotexrpcb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_iotexrpc_BlockSync_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_iotexrpc_BlockSync_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_iotexrpc_BlockSync_descriptor,
        new java.lang.String[] { "Start", "End", });
    internal_static_iotexrpc_ActionSync_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_iotexrpc_ActionSync_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_iotexrpc_ActionSync_descriptor,
        new java.lang.String[] { "Hashes", });
    internal_static_iotexrpc_BroadcastMsg_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_iotexrpc_BroadcastMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_iotexrpc_BroadcastMsg_descriptor,
        new java.lang.String[] { "ChainId", "MsgType", "MsgBody", "PeerId", "Timestamp", });
    internal_static_iotexrpc_UnicastMsg_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_iotexrpc_UnicastMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_iotexrpc_UnicastMsg_descriptor,
        new java.lang.String[] { "ChainId", "Addr", "MsgType", "MsgBody", "PeerId", "Timestamp", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}