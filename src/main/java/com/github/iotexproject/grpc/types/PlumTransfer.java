// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * Protobuf type {@code iotextypes.PlumTransfer}
 */
public final class PlumTransfer extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotextypes.PlumTransfer)
    PlumTransferOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      PlumTransfer.class.getName());
  }
  // Use PlumTransfer.newBuilder() to construct.
  private PlumTransfer(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PlumTransfer() {
    denomination_ = com.google.protobuf.ByteString.EMPTY;
    owner_ = "";
    recipient_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_PlumTransfer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_PlumTransfer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.PlumTransfer.class, com.github.iotexproject.grpc.types.PlumTransfer.Builder.class);
  }

  public static final int COINID_FIELD_NUMBER = 1;
  private long coinID_ = 0L;
  /**
   * <code>uint64 coinID = 1;</code>
   * @return The coinID.
   */
  @java.lang.Override
  public long getCoinID() {
    return coinID_;
  }

  public static final int DENOMINATION_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString denomination_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes denomination = 2;</code>
   * @return The denomination.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDenomination() {
    return denomination_;
  }

  public static final int OWNER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object owner_ = "";
  /**
   * <code>string owner = 3;</code>
   * @return The owner.
   */
  @java.lang.Override
  public java.lang.String getOwner() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      owner_ = s;
      return s;
    }
  }
  /**
   * <code>string owner = 3;</code>
   * @return The bytes for owner.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOwnerBytes() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      owner_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECIPIENT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object recipient_ = "";
  /**
   * <code>string recipient = 4;</code>
   * @return The recipient.
   */
  @java.lang.Override
  public java.lang.String getRecipient() {
    java.lang.Object ref = recipient_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recipient_ = s;
      return s;
    }
  }
  /**
   * <code>string recipient = 4;</code>
   * @return The bytes for recipient.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRecipientBytes() {
    java.lang.Object ref = recipient_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recipient_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (coinID_ != 0L) {
      output.writeUInt64(1, coinID_);
    }
    if (!denomination_.isEmpty()) {
      output.writeBytes(2, denomination_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(owner_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, owner_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(recipient_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, recipient_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (coinID_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, coinID_);
    }
    if (!denomination_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, denomination_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(owner_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, owner_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(recipient_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, recipient_);
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.PlumTransfer)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.PlumTransfer other = (com.github.iotexproject.grpc.types.PlumTransfer) obj;

    if (getCoinID()
        != other.getCoinID()) return false;
    if (!getDenomination()
        .equals(other.getDenomination())) return false;
    if (!getOwner()
        .equals(other.getOwner())) return false;
    if (!getRecipient()
        .equals(other.getRecipient())) return false;
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
    hash = (37 * hash) + COINID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCoinID());
    hash = (37 * hash) + DENOMINATION_FIELD_NUMBER;
    hash = (53 * hash) + getDenomination().hashCode();
    hash = (37 * hash) + OWNER_FIELD_NUMBER;
    hash = (53 * hash) + getOwner().hashCode();
    hash = (37 * hash) + RECIPIENT_FIELD_NUMBER;
    hash = (53 * hash) + getRecipient().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.PlumTransfer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.PlumTransfer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.PlumTransfer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.PlumTransfer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.PlumTransfer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.PlumTransfer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.PlumTransfer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.PlumTransfer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.types.PlumTransfer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.types.PlumTransfer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.PlumTransfer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.PlumTransfer parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.PlumTransfer prototype) {
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
   * Protobuf type {@code iotextypes.PlumTransfer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.PlumTransfer)
      com.github.iotexproject.grpc.types.PlumTransferOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_PlumTransfer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_PlumTransfer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.PlumTransfer.class, com.github.iotexproject.grpc.types.PlumTransfer.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.PlumTransfer.newBuilder()
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
      coinID_ = 0L;
      denomination_ = com.google.protobuf.ByteString.EMPTY;
      owner_ = "";
      recipient_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_PlumTransfer_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.PlumTransfer getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.PlumTransfer.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.PlumTransfer build() {
      com.github.iotexproject.grpc.types.PlumTransfer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.PlumTransfer buildPartial() {
      com.github.iotexproject.grpc.types.PlumTransfer result = new com.github.iotexproject.grpc.types.PlumTransfer(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.types.PlumTransfer result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.coinID_ = coinID_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.denomination_ = denomination_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.owner_ = owner_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.recipient_ = recipient_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.PlumTransfer) {
        return mergeFrom((com.github.iotexproject.grpc.types.PlumTransfer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.PlumTransfer other) {
      if (other == com.github.iotexproject.grpc.types.PlumTransfer.getDefaultInstance()) return this;
      if (other.getCoinID() != 0L) {
        setCoinID(other.getCoinID());
      }
      if (other.getDenomination() != com.google.protobuf.ByteString.EMPTY) {
        setDenomination(other.getDenomination());
      }
      if (!other.getOwner().isEmpty()) {
        owner_ = other.owner_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getRecipient().isEmpty()) {
        recipient_ = other.recipient_;
        bitField0_ |= 0x00000008;
        onChanged();
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
              coinID_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              denomination_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              owner_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              recipient_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private long coinID_ ;
    /**
     * <code>uint64 coinID = 1;</code>
     * @return The coinID.
     */
    @java.lang.Override
    public long getCoinID() {
      return coinID_;
    }
    /**
     * <code>uint64 coinID = 1;</code>
     * @param value The coinID to set.
     * @return This builder for chaining.
     */
    public Builder setCoinID(long value) {

      coinID_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 coinID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCoinID() {
      bitField0_ = (bitField0_ & ~0x00000001);
      coinID_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString denomination_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes denomination = 2;</code>
     * @return The denomination.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getDenomination() {
      return denomination_;
    }
    /**
     * <code>bytes denomination = 2;</code>
     * @param value The denomination to set.
     * @return This builder for chaining.
     */
    public Builder setDenomination(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      denomination_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes denomination = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDenomination() {
      bitField0_ = (bitField0_ & ~0x00000002);
      denomination_ = getDefaultInstance().getDenomination();
      onChanged();
      return this;
    }

    private java.lang.Object owner_ = "";
    /**
     * <code>string owner = 3;</code>
     * @return The owner.
     */
    public java.lang.String getOwner() {
      java.lang.Object ref = owner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        owner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string owner = 3;</code>
     * @return The bytes for owner.
     */
    public com.google.protobuf.ByteString
        getOwnerBytes() {
      java.lang.Object ref = owner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        owner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string owner = 3;</code>
     * @param value The owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwner(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      owner_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string owner = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOwner() {
      owner_ = getDefaultInstance().getOwner();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string owner = 3;</code>
     * @param value The bytes for owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      owner_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object recipient_ = "";
    /**
     * <code>string recipient = 4;</code>
     * @return The recipient.
     */
    public java.lang.String getRecipient() {
      java.lang.Object ref = recipient_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recipient_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string recipient = 4;</code>
     * @return The bytes for recipient.
     */
    public com.google.protobuf.ByteString
        getRecipientBytes() {
      java.lang.Object ref = recipient_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recipient_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string recipient = 4;</code>
     * @param value The recipient to set.
     * @return This builder for chaining.
     */
    public Builder setRecipient(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      recipient_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string recipient = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecipient() {
      recipient_ = getDefaultInstance().getRecipient();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string recipient = 4;</code>
     * @param value The bytes for recipient to set.
     * @return This builder for chaining.
     */
    public Builder setRecipientBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      recipient_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iotextypes.PlumTransfer)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.PlumTransfer)
  private static final com.github.iotexproject.grpc.types.PlumTransfer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.PlumTransfer();
  }

  public static com.github.iotexproject.grpc.types.PlumTransfer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlumTransfer>
      PARSER = new com.google.protobuf.AbstractParser<PlumTransfer>() {
    @java.lang.Override
    public PlumTransfer parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlumTransfer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlumTransfer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.PlumTransfer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

