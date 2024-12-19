// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/consensus.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * Protobuf type {@code iotextypes.ConsensusVote}
 */
public final class ConsensusVote extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotextypes.ConsensusVote)
    ConsensusVoteOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      ConsensusVote.class.getName());
  }
  // Use ConsensusVote.newBuilder() to construct.
  private ConsensusVote(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ConsensusVote() {
    blockHash_ = com.google.protobuf.ByteString.EMPTY;
    topic_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.Consensus.internal_static_iotextypes_ConsensusVote_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.Consensus.internal_static_iotextypes_ConsensusVote_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.ConsensusVote.class, com.github.iotexproject.grpc.types.ConsensusVote.Builder.class);
  }

  /**
   * Protobuf enum {@code iotextypes.ConsensusVote.Topic}
   */
  public enum Topic
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PROPOSAL = 0;</code>
     */
    PROPOSAL(0),
    /**
     * <code>LOCK = 1;</code>
     */
    LOCK(1),
    /**
     * <code>COMMIT = 2;</code>
     */
    COMMIT(2),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 1,
        /* suffix= */ "",
        Topic.class.getName());
    }
    /**
     * <code>PROPOSAL = 0;</code>
     */
    public static final int PROPOSAL_VALUE = 0;
    /**
     * <code>LOCK = 1;</code>
     */
    public static final int LOCK_VALUE = 1;
    /**
     * <code>COMMIT = 2;</code>
     */
    public static final int COMMIT_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Topic valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Topic forNumber(int value) {
      switch (value) {
        case 0: return PROPOSAL;
        case 1: return LOCK;
        case 2: return COMMIT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Topic>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Topic> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Topic>() {
            public Topic findValueByNumber(int number) {
              return Topic.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.ConsensusVote.getDescriptor().getEnumTypes().get(0);
    }

    private static final Topic[] VALUES = values();

    public static Topic valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Topic(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:iotextypes.ConsensusVote.Topic)
  }

  public static final int BLOCKHASH_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString blockHash_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes blockHash = 1;</code>
   * @return The blockHash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBlockHash() {
    return blockHash_;
  }

  public static final int TOPIC_FIELD_NUMBER = 2;
  private int topic_ = 0;
  /**
   * <code>.iotextypes.ConsensusVote.Topic topic = 2;</code>
   * @return The enum numeric value on the wire for topic.
   */
  @java.lang.Override public int getTopicValue() {
    return topic_;
  }
  /**
   * <code>.iotextypes.ConsensusVote.Topic topic = 2;</code>
   * @return The topic.
   */
  @java.lang.Override public com.github.iotexproject.grpc.types.ConsensusVote.Topic getTopic() {
    com.github.iotexproject.grpc.types.ConsensusVote.Topic result = com.github.iotexproject.grpc.types.ConsensusVote.Topic.forNumber(topic_);
    return result == null ? com.github.iotexproject.grpc.types.ConsensusVote.Topic.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!blockHash_.isEmpty()) {
      output.writeBytes(1, blockHash_);
    }
    if (topic_ != com.github.iotexproject.grpc.types.ConsensusVote.Topic.PROPOSAL.getNumber()) {
      output.writeEnum(2, topic_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!blockHash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, blockHash_);
    }
    if (topic_ != com.github.iotexproject.grpc.types.ConsensusVote.Topic.PROPOSAL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, topic_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.iotexproject.grpc.types.ConsensusVote)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.ConsensusVote other = (com.github.iotexproject.grpc.types.ConsensusVote) obj;

    if (!getBlockHash()
        .equals(other.getBlockHash())) return false;
    if (topic_ != other.topic_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BLOCKHASH_FIELD_NUMBER;
    hash = (53 * hash) + getBlockHash().hashCode();
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + topic_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.ConsensusVote parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.ConsensusVote parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.ConsensusVote parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.ConsensusVote parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.ConsensusVote parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.ConsensusVote parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.ConsensusVote parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.ConsensusVote parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.types.ConsensusVote parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.types.ConsensusVote parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.ConsensusVote parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.ConsensusVote parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.iotexproject.grpc.types.ConsensusVote prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code iotextypes.ConsensusVote}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.ConsensusVote)
      com.github.iotexproject.grpc.types.ConsensusVoteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.Consensus.internal_static_iotextypes_ConsensusVote_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.Consensus.internal_static_iotextypes_ConsensusVote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.ConsensusVote.class, com.github.iotexproject.grpc.types.ConsensusVote.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.ConsensusVote.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      blockHash_ = com.google.protobuf.ByteString.EMPTY;
      topic_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.Consensus.internal_static_iotextypes_ConsensusVote_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.ConsensusVote getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.ConsensusVote.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.ConsensusVote build() {
      com.github.iotexproject.grpc.types.ConsensusVote result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.ConsensusVote buildPartial() {
      com.github.iotexproject.grpc.types.ConsensusVote result = new com.github.iotexproject.grpc.types.ConsensusVote(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.types.ConsensusVote result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.blockHash_ = blockHash_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.topic_ = topic_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.ConsensusVote) {
        return mergeFrom((com.github.iotexproject.grpc.types.ConsensusVote)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.ConsensusVote other) {
      if (other == com.github.iotexproject.grpc.types.ConsensusVote.getDefaultInstance()) return this;
      if (other.getBlockHash() != com.google.protobuf.ByteString.EMPTY) {
        setBlockHash(other.getBlockHash());
      }
      if (other.topic_ != 0) {
        setTopicValue(other.getTopicValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              blockHash_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              topic_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString blockHash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes blockHash = 1;</code>
     * @return The blockHash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBlockHash() {
      return blockHash_;
    }
    /**
     * <code>bytes blockHash = 1;</code>
     * @param value The blockHash to set.
     * @return This builder for chaining.
     */
    public Builder setBlockHash(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      blockHash_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes blockHash = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockHash() {
      bitField0_ = (bitField0_ & ~0x00000001);
      blockHash_ = getDefaultInstance().getBlockHash();
      onChanged();
      return this;
    }

    private int topic_ = 0;
    /**
     * <code>.iotextypes.ConsensusVote.Topic topic = 2;</code>
     * @return The enum numeric value on the wire for topic.
     */
    @java.lang.Override public int getTopicValue() {
      return topic_;
    }
    /**
     * <code>.iotextypes.ConsensusVote.Topic topic = 2;</code>
     * @param value The enum numeric value on the wire for topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopicValue(int value) {
      topic_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.ConsensusVote.Topic topic = 2;</code>
     * @return The topic.
     */
    @java.lang.Override
    public com.github.iotexproject.grpc.types.ConsensusVote.Topic getTopic() {
      com.github.iotexproject.grpc.types.ConsensusVote.Topic result = com.github.iotexproject.grpc.types.ConsensusVote.Topic.forNumber(topic_);
      return result == null ? com.github.iotexproject.grpc.types.ConsensusVote.Topic.UNRECOGNIZED : result;
    }
    /**
     * <code>.iotextypes.ConsensusVote.Topic topic = 2;</code>
     * @param value The topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopic(com.github.iotexproject.grpc.types.ConsensusVote.Topic value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      topic_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.ConsensusVote.Topic topic = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopic() {
      bitField0_ = (bitField0_ & ~0x00000002);
      topic_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iotextypes.ConsensusVote)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.ConsensusVote)
  private static final com.github.iotexproject.grpc.types.ConsensusVote DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.ConsensusVote();
  }

  public static com.github.iotexproject.grpc.types.ConsensusVote getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsensusVote>
      PARSER = new com.google.protobuf.AbstractParser<ConsensusVote>() {
    @java.lang.Override
    public ConsensusVote parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ConsensusVote> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsensusVote> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.ConsensusVote getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

