// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/api/api.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.api;

/**
 * Protobuf type {@code iotexapi.GetTransactionLogByActionHashResponse}
 */
public final class GetTransactionLogByActionHashResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotexapi.GetTransactionLogByActionHashResponse)
    GetTransactionLogByActionHashResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      GetTransactionLogByActionHashResponse.class.getName());
  }
  // Use GetTransactionLogByActionHashResponse.newBuilder() to construct.
  private GetTransactionLogByActionHashResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetTransactionLogByActionHashResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetTransactionLogByActionHashResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetTransactionLogByActionHashResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse.class, com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse.Builder.class);
  }

  private int bitField0_;
  public static final int TRANSACTIONLOG_FIELD_NUMBER = 1;
  private com.github.iotexproject.grpc.types.TransactionLog transactionLog_;
  /**
   * <code>.iotextypes.TransactionLog transactionLog = 1;</code>
   * @return Whether the transactionLog field is set.
   */
  @java.lang.Override
  public boolean hasTransactionLog() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.iotextypes.TransactionLog transactionLog = 1;</code>
   * @return The transactionLog.
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.TransactionLog getTransactionLog() {
    return transactionLog_ == null ? com.github.iotexproject.grpc.types.TransactionLog.getDefaultInstance() : transactionLog_;
  }
  /**
   * <code>.iotextypes.TransactionLog transactionLog = 1;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.TransactionLogOrBuilder getTransactionLogOrBuilder() {
    return transactionLog_ == null ? com.github.iotexproject.grpc.types.TransactionLog.getDefaultInstance() : transactionLog_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getTransactionLog());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTransactionLog());
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
    if (!(obj instanceof com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse other = (com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse) obj;

    if (hasTransactionLog() != other.hasTransactionLog()) return false;
    if (hasTransactionLog()) {
      if (!getTransactionLog()
          .equals(other.getTransactionLog())) return false;
    }
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
    if (hasTransactionLog()) {
      hash = (37 * hash) + TRANSACTIONLOG_FIELD_NUMBER;
      hash = (53 * hash) + getTransactionLog().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse prototype) {
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
   * Protobuf type {@code iotexapi.GetTransactionLogByActionHashResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotexapi.GetTransactionLogByActionHashResponse)
      com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetTransactionLogByActionHashResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetTransactionLogByActionHashResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse.class, com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getTransactionLogFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      transactionLog_ = null;
      if (transactionLogBuilder_ != null) {
        transactionLogBuilder_.dispose();
        transactionLogBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetTransactionLogByActionHashResponse_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse build() {
      com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse buildPartial() {
      com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse result = new com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.transactionLog_ = transactionLogBuilder_ == null
            ? transactionLog_
            : transactionLogBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse) {
        return mergeFrom((com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse other) {
      if (other == com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse.getDefaultInstance()) return this;
      if (other.hasTransactionLog()) {
        mergeTransactionLog(other.getTransactionLog());
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
              input.readMessage(
                  getTransactionLogFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.github.iotexproject.grpc.types.TransactionLog transactionLog_;
    private com.google.protobuf.SingleFieldBuilder<
        com.github.iotexproject.grpc.types.TransactionLog, com.github.iotexproject.grpc.types.TransactionLog.Builder, com.github.iotexproject.grpc.types.TransactionLogOrBuilder> transactionLogBuilder_;
    /**
     * <code>.iotextypes.TransactionLog transactionLog = 1;</code>
     * @return Whether the transactionLog field is set.
     */
    public boolean hasTransactionLog() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.iotextypes.TransactionLog transactionLog = 1;</code>
     * @return The transactionLog.
     */
    public com.github.iotexproject.grpc.types.TransactionLog getTransactionLog() {
      if (transactionLogBuilder_ == null) {
        return transactionLog_ == null ? com.github.iotexproject.grpc.types.TransactionLog.getDefaultInstance() : transactionLog_;
      } else {
        return transactionLogBuilder_.getMessage();
      }
    }
    /**
     * <code>.iotextypes.TransactionLog transactionLog = 1;</code>
     */
    public Builder setTransactionLog(com.github.iotexproject.grpc.types.TransactionLog value) {
      if (transactionLogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transactionLog_ = value;
      } else {
        transactionLogBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.TransactionLog transactionLog = 1;</code>
     */
    public Builder setTransactionLog(
        com.github.iotexproject.grpc.types.TransactionLog.Builder builderForValue) {
      if (transactionLogBuilder_ == null) {
        transactionLog_ = builderForValue.build();
      } else {
        transactionLogBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.TransactionLog transactionLog = 1;</code>
     */
    public Builder mergeTransactionLog(com.github.iotexproject.grpc.types.TransactionLog value) {
      if (transactionLogBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          transactionLog_ != null &&
          transactionLog_ != com.github.iotexproject.grpc.types.TransactionLog.getDefaultInstance()) {
          getTransactionLogBuilder().mergeFrom(value);
        } else {
          transactionLog_ = value;
        }
      } else {
        transactionLogBuilder_.mergeFrom(value);
      }
      if (transactionLog_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.iotextypes.TransactionLog transactionLog = 1;</code>
     */
    public Builder clearTransactionLog() {
      bitField0_ = (bitField0_ & ~0x00000001);
      transactionLog_ = null;
      if (transactionLogBuilder_ != null) {
        transactionLogBuilder_.dispose();
        transactionLogBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.TransactionLog transactionLog = 1;</code>
     */
    public com.github.iotexproject.grpc.types.TransactionLog.Builder getTransactionLogBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTransactionLogFieldBuilder().getBuilder();
    }
    /**
     * <code>.iotextypes.TransactionLog transactionLog = 1;</code>
     */
    public com.github.iotexproject.grpc.types.TransactionLogOrBuilder getTransactionLogOrBuilder() {
      if (transactionLogBuilder_ != null) {
        return transactionLogBuilder_.getMessageOrBuilder();
      } else {
        return transactionLog_ == null ?
            com.github.iotexproject.grpc.types.TransactionLog.getDefaultInstance() : transactionLog_;
      }
    }
    /**
     * <code>.iotextypes.TransactionLog transactionLog = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.github.iotexproject.grpc.types.TransactionLog, com.github.iotexproject.grpc.types.TransactionLog.Builder, com.github.iotexproject.grpc.types.TransactionLogOrBuilder> 
        getTransactionLogFieldBuilder() {
      if (transactionLogBuilder_ == null) {
        transactionLogBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.github.iotexproject.grpc.types.TransactionLog, com.github.iotexproject.grpc.types.TransactionLog.Builder, com.github.iotexproject.grpc.types.TransactionLogOrBuilder>(
                getTransactionLog(),
                getParentForChildren(),
                isClean());
        transactionLog_ = null;
      }
      return transactionLogBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:iotexapi.GetTransactionLogByActionHashResponse)
  }

  // @@protoc_insertion_point(class_scope:iotexapi.GetTransactionLogByActionHashResponse)
  private static final com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse();
  }

  public static com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTransactionLogByActionHashResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetTransactionLogByActionHashResponse>() {
    @java.lang.Override
    public GetTransactionLogByActionHashResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetTransactionLogByActionHashResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTransactionLogByActionHashResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.api.GetTransactionLogByActionHashResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
