// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/types/action.proto

package com.github.iotexproject.grpc.types;

/**
 * Protobuf type {@code iotextypes.TerminatePlumChain}
 */
public final class TerminatePlumChain extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:iotextypes.TerminatePlumChain)
    TerminatePlumChainOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TerminatePlumChain.newBuilder() to construct.
  private TerminatePlumChain(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TerminatePlumChain() {
    subChainAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TerminatePlumChain();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TerminatePlumChain(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            subChainAddress_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_TerminatePlumChain_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_TerminatePlumChain_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.TerminatePlumChain.class, com.github.iotexproject.grpc.types.TerminatePlumChain.Builder.class);
  }

  public static final int SUBCHAINADDRESS_FIELD_NUMBER = 1;
  private volatile java.lang.Object subChainAddress_;
  /**
   * <code>string subChainAddress = 1;</code>
   * @return The subChainAddress.
   */
  @java.lang.Override
  public java.lang.String getSubChainAddress() {
    java.lang.Object ref = subChainAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subChainAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string subChainAddress = 1;</code>
   * @return The bytes for subChainAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubChainAddressBytes() {
    java.lang.Object ref = subChainAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subChainAddress_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subChainAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subChainAddress_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subChainAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subChainAddress_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.iotexproject.grpc.types.TerminatePlumChain)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.TerminatePlumChain other = (com.github.iotexproject.grpc.types.TerminatePlumChain) obj;

    if (!getSubChainAddress()
        .equals(other.getSubChainAddress())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SUBCHAINADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getSubChainAddress().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.TerminatePlumChain parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.TerminatePlumChain parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.TerminatePlumChain parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.TerminatePlumChain parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.TerminatePlumChain parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.TerminatePlumChain parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.TerminatePlumChain parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.TerminatePlumChain parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.TerminatePlumChain parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.TerminatePlumChain parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.TerminatePlumChain parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.TerminatePlumChain parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.iotexproject.grpc.types.TerminatePlumChain prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code iotextypes.TerminatePlumChain}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.TerminatePlumChain)
      com.github.iotexproject.grpc.types.TerminatePlumChainOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_TerminatePlumChain_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_TerminatePlumChain_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.TerminatePlumChain.class, com.github.iotexproject.grpc.types.TerminatePlumChain.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.TerminatePlumChain.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      subChainAddress_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_TerminatePlumChain_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.TerminatePlumChain getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.TerminatePlumChain.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.TerminatePlumChain build() {
      com.github.iotexproject.grpc.types.TerminatePlumChain result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.TerminatePlumChain buildPartial() {
      com.github.iotexproject.grpc.types.TerminatePlumChain result = new com.github.iotexproject.grpc.types.TerminatePlumChain(this);
      result.subChainAddress_ = subChainAddress_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.TerminatePlumChain) {
        return mergeFrom((com.github.iotexproject.grpc.types.TerminatePlumChain)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.TerminatePlumChain other) {
      if (other == com.github.iotexproject.grpc.types.TerminatePlumChain.getDefaultInstance()) return this;
      if (!other.getSubChainAddress().isEmpty()) {
        subChainAddress_ = other.subChainAddress_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.github.iotexproject.grpc.types.TerminatePlumChain parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.iotexproject.grpc.types.TerminatePlumChain) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object subChainAddress_ = "";
    /**
     * <code>string subChainAddress = 1;</code>
     * @return The subChainAddress.
     */
    public java.lang.String getSubChainAddress() {
      java.lang.Object ref = subChainAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subChainAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string subChainAddress = 1;</code>
     * @return The bytes for subChainAddress.
     */
    public com.google.protobuf.ByteString
        getSubChainAddressBytes() {
      java.lang.Object ref = subChainAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subChainAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string subChainAddress = 1;</code>
     * @param value The subChainAddress to set.
     * @return This builder for chaining.
     */
    public Builder setSubChainAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subChainAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string subChainAddress = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubChainAddress() {
      
      subChainAddress_ = getDefaultInstance().getSubChainAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string subChainAddress = 1;</code>
     * @param value The bytes for subChainAddress to set.
     * @return This builder for chaining.
     */
    public Builder setSubChainAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subChainAddress_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:iotextypes.TerminatePlumChain)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.TerminatePlumChain)
  private static final com.github.iotexproject.grpc.types.TerminatePlumChain DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.TerminatePlumChain();
  }

  public static com.github.iotexproject.grpc.types.TerminatePlumChain getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TerminatePlumChain>
      PARSER = new com.google.protobuf.AbstractParser<TerminatePlumChain>() {
    @java.lang.Override
    public TerminatePlumChain parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TerminatePlumChain(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TerminatePlumChain> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TerminatePlumChain> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.TerminatePlumChain getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

