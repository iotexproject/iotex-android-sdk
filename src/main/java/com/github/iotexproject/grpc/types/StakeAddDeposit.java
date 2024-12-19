// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * <pre>
 * add the amount of bucket 
 * </pre>
 *
 * Protobuf type {@code iotextypes.StakeAddDeposit}
 */
public final class StakeAddDeposit extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotextypes.StakeAddDeposit)
    StakeAddDepositOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      StakeAddDeposit.class.getName());
  }
  // Use StakeAddDeposit.newBuilder() to construct.
  private StakeAddDeposit(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private StakeAddDeposit() {
    amount_ = "";
    payload_ = com.google.protobuf.ByteString.EMPTY;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_StakeAddDeposit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_StakeAddDeposit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.StakeAddDeposit.class, com.github.iotexproject.grpc.types.StakeAddDeposit.Builder.class);
  }

  public static final int BUCKETINDEX_FIELD_NUMBER = 1;
  private long bucketIndex_ = 0L;
  /**
   * <code>uint64 bucketIndex = 1;</code>
   * @return The bucketIndex.
   */
  @java.lang.Override
  public long getBucketIndex() {
    return bucketIndex_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object amount_ = "";
  /**
   * <code>string amount = 2;</code>
   * @return The amount.
   */
  @java.lang.Override
  public java.lang.String getAmount() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      amount_ = s;
      return s;
    }
  }
  /**
   * <code>string amount = 2;</code>
   * @return The bytes for amount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAmountBytes() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      amount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes payload = 3;</code>
   * @return The payload.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPayload() {
    return payload_;
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
    if (bucketIndex_ != 0L) {
      output.writeUInt64(1, bucketIndex_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(amount_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, amount_);
    }
    if (!payload_.isEmpty()) {
      output.writeBytes(3, payload_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bucketIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, bucketIndex_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(amount_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, amount_);
    }
    if (!payload_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, payload_);
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.StakeAddDeposit)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.StakeAddDeposit other = (com.github.iotexproject.grpc.types.StakeAddDeposit) obj;

    if (getBucketIndex()
        != other.getBucketIndex()) return false;
    if (!getAmount()
        .equals(other.getAmount())) return false;
    if (!getPayload()
        .equals(other.getPayload())) return false;
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
    hash = (37 * hash) + BUCKETINDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBucketIndex());
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.StakeAddDeposit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.StakeAddDeposit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.StakeAddDeposit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.StakeAddDeposit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.StakeAddDeposit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.StakeAddDeposit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.StakeAddDeposit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.StakeAddDeposit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.types.StakeAddDeposit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.types.StakeAddDeposit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.StakeAddDeposit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.StakeAddDeposit parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.StakeAddDeposit prototype) {
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
   * <pre>
   * add the amount of bucket 
   * </pre>
   *
   * Protobuf type {@code iotextypes.StakeAddDeposit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.StakeAddDeposit)
      com.github.iotexproject.grpc.types.StakeAddDepositOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_StakeAddDeposit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_StakeAddDeposit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.StakeAddDeposit.class, com.github.iotexproject.grpc.types.StakeAddDeposit.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.StakeAddDeposit.newBuilder()
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
      bucketIndex_ = 0L;
      amount_ = "";
      payload_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_StakeAddDeposit_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.StakeAddDeposit getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.StakeAddDeposit.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.StakeAddDeposit build() {
      com.github.iotexproject.grpc.types.StakeAddDeposit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.StakeAddDeposit buildPartial() {
      com.github.iotexproject.grpc.types.StakeAddDeposit result = new com.github.iotexproject.grpc.types.StakeAddDeposit(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.types.StakeAddDeposit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bucketIndex_ = bucketIndex_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.amount_ = amount_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.payload_ = payload_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.StakeAddDeposit) {
        return mergeFrom((com.github.iotexproject.grpc.types.StakeAddDeposit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.StakeAddDeposit other) {
      if (other == com.github.iotexproject.grpc.types.StakeAddDeposit.getDefaultInstance()) return this;
      if (other.getBucketIndex() != 0L) {
        setBucketIndex(other.getBucketIndex());
      }
      if (!other.getAmount().isEmpty()) {
        amount_ = other.amount_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
        setPayload(other.getPayload());
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
              bucketIndex_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              amount_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              payload_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private long bucketIndex_ ;
    /**
     * <code>uint64 bucketIndex = 1;</code>
     * @return The bucketIndex.
     */
    @java.lang.Override
    public long getBucketIndex() {
      return bucketIndex_;
    }
    /**
     * <code>uint64 bucketIndex = 1;</code>
     * @param value The bucketIndex to set.
     * @return This builder for chaining.
     */
    public Builder setBucketIndex(long value) {

      bucketIndex_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 bucketIndex = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBucketIndex() {
      bitField0_ = (bitField0_ & ~0x00000001);
      bucketIndex_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object amount_ = "";
    /**
     * <code>string amount = 2;</code>
     * @return The amount.
     */
    public java.lang.String getAmount() {
      java.lang.Object ref = amount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        amount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string amount = 2;</code>
     * @return The bytes for amount.
     */
    public com.google.protobuf.ByteString
        getAmountBytes() {
      java.lang.Object ref = amount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        amount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string amount = 2;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      amount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      amount_ = getDefaultInstance().getAmount();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string amount = 2;</code>
     * @param value The bytes for amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      amount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes payload = 3;</code>
     * @return The payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     * <code>bytes payload = 3;</code>
     * @param value The payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      payload_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bytes payload = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayload() {
      bitField0_ = (bitField0_ & ~0x00000004);
      payload_ = getDefaultInstance().getPayload();
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iotextypes.StakeAddDeposit)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.StakeAddDeposit)
  private static final com.github.iotexproject.grpc.types.StakeAddDeposit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.StakeAddDeposit();
  }

  public static com.github.iotexproject.grpc.types.StakeAddDeposit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StakeAddDeposit>
      PARSER = new com.google.protobuf.AbstractParser<StakeAddDeposit>() {
    @java.lang.Override
    public StakeAddDeposit parsePartialFrom(
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

  public static com.google.protobuf.Parser<StakeAddDeposit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StakeAddDeposit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.StakeAddDeposit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

