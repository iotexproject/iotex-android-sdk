// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * <pre>
 * Deprecated
 * </pre>
 *
 * Protobuf type {@code iotextypes.EvmTransfer}
 */
public final class EvmTransfer extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotextypes.EvmTransfer)
    EvmTransferOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      EvmTransfer.class.getName());
  }
  // Use EvmTransfer.newBuilder() to construct.
  private EvmTransfer(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private EvmTransfer() {
    amount_ = com.google.protobuf.ByteString.EMPTY;
    from_ = "";
    to_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_EvmTransfer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_EvmTransfer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.EvmTransfer.class, com.github.iotexproject.grpc.types.EvmTransfer.Builder.class);
  }

  public static final int AMOUNT_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString amount_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes amount = 1;</code>
   * @return The amount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAmount() {
    return amount_;
  }

  public static final int FROM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object from_ = "";
  /**
   * <code>string from = 2;</code>
   * @return The from.
   */
  @java.lang.Override
  public java.lang.String getFrom() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      from_ = s;
      return s;
    }
  }
  /**
   * <code>string from = 2;</code>
   * @return The bytes for from.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFromBytes() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      from_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TO_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object to_ = "";
  /**
   * <code>string to = 3;</code>
   * @return The to.
   */
  @java.lang.Override
  public java.lang.String getTo() {
    java.lang.Object ref = to_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      to_ = s;
      return s;
    }
  }
  /**
   * <code>string to = 3;</code>
   * @return The bytes for to.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getToBytes() {
    java.lang.Object ref = to_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      to_ = b;
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
    if (!amount_.isEmpty()) {
      output.writeBytes(1, amount_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(from_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, from_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(to_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, to_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!amount_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, amount_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(from_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, from_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(to_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, to_);
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.EvmTransfer)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.EvmTransfer other = (com.github.iotexproject.grpc.types.EvmTransfer) obj;

    if (!getAmount()
        .equals(other.getAmount())) return false;
    if (!getFrom()
        .equals(other.getFrom())) return false;
    if (!getTo()
        .equals(other.getTo())) return false;
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
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + getFrom().hashCode();
    hash = (37 * hash) + TO_FIELD_NUMBER;
    hash = (53 * hash) + getTo().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.EvmTransfer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.EvmTransfer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.EvmTransfer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.EvmTransfer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.EvmTransfer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.EvmTransfer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.EvmTransfer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.EvmTransfer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.types.EvmTransfer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.types.EvmTransfer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.EvmTransfer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.EvmTransfer parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.EvmTransfer prototype) {
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
   * Deprecated
   * </pre>
   *
   * Protobuf type {@code iotextypes.EvmTransfer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.EvmTransfer)
      com.github.iotexproject.grpc.types.EvmTransferOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_EvmTransfer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_EvmTransfer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.EvmTransfer.class, com.github.iotexproject.grpc.types.EvmTransfer.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.EvmTransfer.newBuilder()
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
      amount_ = com.google.protobuf.ByteString.EMPTY;
      from_ = "";
      to_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_EvmTransfer_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.EvmTransfer getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.EvmTransfer.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.EvmTransfer build() {
      com.github.iotexproject.grpc.types.EvmTransfer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.EvmTransfer buildPartial() {
      com.github.iotexproject.grpc.types.EvmTransfer result = new com.github.iotexproject.grpc.types.EvmTransfer(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.types.EvmTransfer result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.amount_ = amount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.from_ = from_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.to_ = to_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.EvmTransfer) {
        return mergeFrom((com.github.iotexproject.grpc.types.EvmTransfer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.EvmTransfer other) {
      if (other == com.github.iotexproject.grpc.types.EvmTransfer.getDefaultInstance()) return this;
      if (other.getAmount() != com.google.protobuf.ByteString.EMPTY) {
        setAmount(other.getAmount());
      }
      if (!other.getFrom().isEmpty()) {
        from_ = other.from_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getTo().isEmpty()) {
        to_ = other.to_;
        bitField0_ |= 0x00000004;
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
            case 10: {
              amount_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              from_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              to_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.ByteString amount_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes amount = 1;</code>
     * @return The amount.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAmount() {
      return amount_;
    }
    /**
     * <code>bytes amount = 1;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      amount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes amount = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      amount_ = getDefaultInstance().getAmount();
      onChanged();
      return this;
    }

    private java.lang.Object from_ = "";
    /**
     * <code>string from = 2;</code>
     * @return The from.
     */
    public java.lang.String getFrom() {
      java.lang.Object ref = from_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        from_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string from = 2;</code>
     * @return The bytes for from.
     */
    public com.google.protobuf.ByteString
        getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string from = 2;</code>
     * @param value The from to set.
     * @return This builder for chaining.
     */
    public Builder setFrom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      from_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string from = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrom() {
      from_ = getDefaultInstance().getFrom();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string from = 2;</code>
     * @param value The bytes for from to set.
     * @return This builder for chaining.
     */
    public Builder setFromBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      from_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object to_ = "";
    /**
     * <code>string to = 3;</code>
     * @return The to.
     */
    public java.lang.String getTo() {
      java.lang.Object ref = to_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        to_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string to = 3;</code>
     * @return The bytes for to.
     */
    public com.google.protobuf.ByteString
        getToBytes() {
      java.lang.Object ref = to_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        to_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string to = 3;</code>
     * @param value The to to set.
     * @return This builder for chaining.
     */
    public Builder setTo(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      to_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string to = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTo() {
      to_ = getDefaultInstance().getTo();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string to = 3;</code>
     * @param value The bytes for to to set.
     * @return This builder for chaining.
     */
    public Builder setToBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      to_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iotextypes.EvmTransfer)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.EvmTransfer)
  private static final com.github.iotexproject.grpc.types.EvmTransfer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.EvmTransfer();
  }

  public static com.github.iotexproject.grpc.types.EvmTransfer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EvmTransfer>
      PARSER = new com.google.protobuf.AbstractParser<EvmTransfer>() {
    @java.lang.Override
    public EvmTransfer parsePartialFrom(
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

  public static com.google.protobuf.Parser<EvmTransfer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EvmTransfer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.EvmTransfer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

