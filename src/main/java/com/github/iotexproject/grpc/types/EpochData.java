// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/blockchain.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * Protobuf type {@code iotextypes.EpochData}
 */
public final class EpochData extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotextypes.EpochData)
    EpochDataOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      EpochData.class.getName());
  }
  // Use EpochData.newBuilder() to construct.
  private EpochData(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private EpochData() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_EpochData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_EpochData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.EpochData.class, com.github.iotexproject.grpc.types.EpochData.Builder.class);
  }

  public static final int NUM_FIELD_NUMBER = 1;
  private long num_ = 0L;
  /**
   * <code>uint64 num = 1;</code>
   * @return The num.
   */
  @java.lang.Override
  public long getNum() {
    return num_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 2;
  private long height_ = 0L;
  /**
   * <code>uint64 height = 2;</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int GRAVITYCHAINSTARTHEIGHT_FIELD_NUMBER = 3;
  private long gravityChainStartHeight_ = 0L;
  /**
   * <code>uint64 gravityChainStartHeight = 3;</code>
   * @return The gravityChainStartHeight.
   */
  @java.lang.Override
  public long getGravityChainStartHeight() {
    return gravityChainStartHeight_;
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
    if (num_ != 0L) {
      output.writeUInt64(1, num_);
    }
    if (height_ != 0L) {
      output.writeUInt64(2, height_);
    }
    if (gravityChainStartHeight_ != 0L) {
      output.writeUInt64(3, gravityChainStartHeight_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (num_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, num_);
    }
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, height_);
    }
    if (gravityChainStartHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, gravityChainStartHeight_);
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.EpochData)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.EpochData other = (com.github.iotexproject.grpc.types.EpochData) obj;

    if (getNum()
        != other.getNum()) return false;
    if (getHeight()
        != other.getHeight()) return false;
    if (getGravityChainStartHeight()
        != other.getGravityChainStartHeight()) return false;
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
    hash = (37 * hash) + NUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNum());
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    hash = (37 * hash) + GRAVITYCHAINSTARTHEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGravityChainStartHeight());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.EpochData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.EpochData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.EpochData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.EpochData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.EpochData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.EpochData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.EpochData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.EpochData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.types.EpochData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.types.EpochData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.EpochData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.EpochData parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.EpochData prototype) {
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
   * Protobuf type {@code iotextypes.EpochData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.EpochData)
      com.github.iotexproject.grpc.types.EpochDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_EpochData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_EpochData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.EpochData.class, com.github.iotexproject.grpc.types.EpochData.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.EpochData.newBuilder()
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
      num_ = 0L;
      height_ = 0L;
      gravityChainStartHeight_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_EpochData_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.EpochData getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.EpochData.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.EpochData build() {
      com.github.iotexproject.grpc.types.EpochData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.EpochData buildPartial() {
      com.github.iotexproject.grpc.types.EpochData result = new com.github.iotexproject.grpc.types.EpochData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.types.EpochData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.num_ = num_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.height_ = height_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.gravityChainStartHeight_ = gravityChainStartHeight_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.EpochData) {
        return mergeFrom((com.github.iotexproject.grpc.types.EpochData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.EpochData other) {
      if (other == com.github.iotexproject.grpc.types.EpochData.getDefaultInstance()) return this;
      if (other.getNum() != 0L) {
        setNum(other.getNum());
      }
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (other.getGravityChainStartHeight() != 0L) {
        setGravityChainStartHeight(other.getGravityChainStartHeight());
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
            case 8: {
              num_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              height_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              gravityChainStartHeight_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private long num_ ;
    /**
     * <code>uint64 num = 1;</code>
     * @return The num.
     */
    @java.lang.Override
    public long getNum() {
      return num_;
    }
    /**
     * <code>uint64 num = 1;</code>
     * @param value The num to set.
     * @return This builder for chaining.
     */
    public Builder setNum(long value) {

      num_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 num = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNum() {
      bitField0_ = (bitField0_ & ~0x00000001);
      num_ = 0L;
      onChanged();
      return this;
    }

    private long height_ ;
    /**
     * <code>uint64 height = 2;</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <code>uint64 height = 2;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {

      height_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 height = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000002);
      height_ = 0L;
      onChanged();
      return this;
    }

    private long gravityChainStartHeight_ ;
    /**
     * <code>uint64 gravityChainStartHeight = 3;</code>
     * @return The gravityChainStartHeight.
     */
    @java.lang.Override
    public long getGravityChainStartHeight() {
      return gravityChainStartHeight_;
    }
    /**
     * <code>uint64 gravityChainStartHeight = 3;</code>
     * @param value The gravityChainStartHeight to set.
     * @return This builder for chaining.
     */
    public Builder setGravityChainStartHeight(long value) {

      gravityChainStartHeight_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 gravityChainStartHeight = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGravityChainStartHeight() {
      bitField0_ = (bitField0_ & ~0x00000004);
      gravityChainStartHeight_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iotextypes.EpochData)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.EpochData)
  private static final com.github.iotexproject.grpc.types.EpochData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.EpochData();
  }

  public static com.github.iotexproject.grpc.types.EpochData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EpochData>
      PARSER = new com.google.protobuf.AbstractParser<EpochData>() {
    @java.lang.Override
    public EpochData parsePartialFrom(
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

  public static com.google.protobuf.Parser<EpochData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EpochData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.EpochData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

