// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * Protobuf type {@code iotextypes.CandidateTransferOwnership}
 */
public final class CandidateTransferOwnership extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotextypes.CandidateTransferOwnership)
    CandidateTransferOwnershipOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      CandidateTransferOwnership.class.getName());
  }
  // Use CandidateTransferOwnership.newBuilder() to construct.
  private CandidateTransferOwnership(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CandidateTransferOwnership() {
    newOwnerAddress_ = "";
    payload_ = com.google.protobuf.ByteString.EMPTY;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_CandidateTransferOwnership_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_CandidateTransferOwnership_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.CandidateTransferOwnership.class, com.github.iotexproject.grpc.types.CandidateTransferOwnership.Builder.class);
  }

  public static final int NEWOWNERADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object newOwnerAddress_ = "";
  /**
   * <code>string newOwnerAddress = 1;</code>
   * @return The newOwnerAddress.
   */
  @java.lang.Override
  public java.lang.String getNewOwnerAddress() {
    java.lang.Object ref = newOwnerAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newOwnerAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string newOwnerAddress = 1;</code>
   * @return The bytes for newOwnerAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewOwnerAddressBytes() {
    java.lang.Object ref = newOwnerAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newOwnerAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes payload = 2;</code>
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(newOwnerAddress_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, newOwnerAddress_);
    }
    if (!payload_.isEmpty()) {
      output.writeBytes(2, payload_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(newOwnerAddress_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, newOwnerAddress_);
    }
    if (!payload_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, payload_);
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.CandidateTransferOwnership)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.CandidateTransferOwnership other = (com.github.iotexproject.grpc.types.CandidateTransferOwnership) obj;

    if (!getNewOwnerAddress()
        .equals(other.getNewOwnerAddress())) return false;
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
    hash = (37 * hash) + NEWOWNERADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getNewOwnerAddress().hashCode();
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.CandidateTransferOwnership parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.CandidateTransferOwnership parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.CandidateTransferOwnership parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.CandidateTransferOwnership parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.CandidateTransferOwnership parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.CandidateTransferOwnership parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.CandidateTransferOwnership parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.CandidateTransferOwnership parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.types.CandidateTransferOwnership parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.types.CandidateTransferOwnership parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.CandidateTransferOwnership parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.CandidateTransferOwnership parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.CandidateTransferOwnership prototype) {
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
   * Protobuf type {@code iotextypes.CandidateTransferOwnership}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.CandidateTransferOwnership)
      com.github.iotexproject.grpc.types.CandidateTransferOwnershipOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_CandidateTransferOwnership_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_CandidateTransferOwnership_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.CandidateTransferOwnership.class, com.github.iotexproject.grpc.types.CandidateTransferOwnership.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.CandidateTransferOwnership.newBuilder()
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
      newOwnerAddress_ = "";
      payload_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_CandidateTransferOwnership_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.CandidateTransferOwnership getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.CandidateTransferOwnership.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.CandidateTransferOwnership build() {
      com.github.iotexproject.grpc.types.CandidateTransferOwnership result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.CandidateTransferOwnership buildPartial() {
      com.github.iotexproject.grpc.types.CandidateTransferOwnership result = new com.github.iotexproject.grpc.types.CandidateTransferOwnership(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.types.CandidateTransferOwnership result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.newOwnerAddress_ = newOwnerAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.payload_ = payload_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.CandidateTransferOwnership) {
        return mergeFrom((com.github.iotexproject.grpc.types.CandidateTransferOwnership)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.CandidateTransferOwnership other) {
      if (other == com.github.iotexproject.grpc.types.CandidateTransferOwnership.getDefaultInstance()) return this;
      if (!other.getNewOwnerAddress().isEmpty()) {
        newOwnerAddress_ = other.newOwnerAddress_;
        bitField0_ |= 0x00000001;
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
            case 10: {
              newOwnerAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              payload_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object newOwnerAddress_ = "";
    /**
     * <code>string newOwnerAddress = 1;</code>
     * @return The newOwnerAddress.
     */
    public java.lang.String getNewOwnerAddress() {
      java.lang.Object ref = newOwnerAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newOwnerAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string newOwnerAddress = 1;</code>
     * @return The bytes for newOwnerAddress.
     */
    public com.google.protobuf.ByteString
        getNewOwnerAddressBytes() {
      java.lang.Object ref = newOwnerAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newOwnerAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string newOwnerAddress = 1;</code>
     * @param value The newOwnerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setNewOwnerAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      newOwnerAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string newOwnerAddress = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewOwnerAddress() {
      newOwnerAddress_ = getDefaultInstance().getNewOwnerAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string newOwnerAddress = 1;</code>
     * @param value The bytes for newOwnerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setNewOwnerAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      newOwnerAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes payload = 2;</code>
     * @return The payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     * <code>bytes payload = 2;</code>
     * @param value The payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      payload_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes payload = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayload() {
      bitField0_ = (bitField0_ & ~0x00000002);
      payload_ = getDefaultInstance().getPayload();
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iotextypes.CandidateTransferOwnership)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.CandidateTransferOwnership)
  private static final com.github.iotexproject.grpc.types.CandidateTransferOwnership DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.CandidateTransferOwnership();
  }

  public static com.github.iotexproject.grpc.types.CandidateTransferOwnership getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CandidateTransferOwnership>
      PARSER = new com.google.protobuf.AbstractParser<CandidateTransferOwnership>() {
    @java.lang.Override
    public CandidateTransferOwnership parsePartialFrom(
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

  public static com.google.protobuf.Parser<CandidateTransferOwnership> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CandidateTransferOwnership> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.CandidateTransferOwnership getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
