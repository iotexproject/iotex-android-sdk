// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/api/api.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.api;

/**
 * Protobuf type {@code iotexapi.GetRawBlocksRequest}
 */
public final class GetRawBlocksRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotexapi.GetRawBlocksRequest)
    GetRawBlocksRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      GetRawBlocksRequest.class.getName());
  }
  // Use GetRawBlocksRequest.newBuilder() to construct.
  private GetRawBlocksRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetRawBlocksRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetRawBlocksRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetRawBlocksRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.api.GetRawBlocksRequest.class, com.github.iotexproject.grpc.api.GetRawBlocksRequest.Builder.class);
  }

  public static final int STARTHEIGHT_FIELD_NUMBER = 1;
  private long startHeight_ = 0L;
  /**
   * <code>uint64 startHeight = 1;</code>
   * @return The startHeight.
   */
  @java.lang.Override
  public long getStartHeight() {
    return startHeight_;
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private long count_ = 0L;
  /**
   * <code>uint64 count = 2;</code>
   * @return The count.
   */
  @java.lang.Override
  public long getCount() {
    return count_;
  }

  public static final int WITHRECEIPTS_FIELD_NUMBER = 3;
  private boolean withReceipts_ = false;
  /**
   * <code>bool withReceipts = 3;</code>
   * @return The withReceipts.
   */
  @java.lang.Override
  public boolean getWithReceipts() {
    return withReceipts_;
  }

  public static final int WITHTRANSACTIONLOGS_FIELD_NUMBER = 4;
  private boolean withTransactionLogs_ = false;
  /**
   * <code>bool withTransactionLogs = 4;</code>
   * @return The withTransactionLogs.
   */
  @java.lang.Override
  public boolean getWithTransactionLogs() {
    return withTransactionLogs_;
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
    if (startHeight_ != 0L) {
      output.writeUInt64(1, startHeight_);
    }
    if (count_ != 0L) {
      output.writeUInt64(2, count_);
    }
    if (withReceipts_ != false) {
      output.writeBool(3, withReceipts_);
    }
    if (withTransactionLogs_ != false) {
      output.writeBool(4, withTransactionLogs_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, startHeight_);
    }
    if (count_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, count_);
    }
    if (withReceipts_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, withReceipts_);
    }
    if (withTransactionLogs_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, withTransactionLogs_);
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
    if (!(obj instanceof com.github.iotexproject.grpc.api.GetRawBlocksRequest)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.api.GetRawBlocksRequest other = (com.github.iotexproject.grpc.api.GetRawBlocksRequest) obj;

    if (getStartHeight()
        != other.getStartHeight()) return false;
    if (getCount()
        != other.getCount()) return false;
    if (getWithReceipts()
        != other.getWithReceipts()) return false;
    if (getWithTransactionLogs()
        != other.getWithTransactionLogs()) return false;
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
    hash = (37 * hash) + STARTHEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartHeight());
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCount());
    hash = (37 * hash) + WITHRECEIPTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getWithReceipts());
    hash = (37 * hash) + WITHTRANSACTIONLOGS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getWithTransactionLogs());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.api.GetRawBlocksRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.GetRawBlocksRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetRawBlocksRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.GetRawBlocksRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetRawBlocksRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.GetRawBlocksRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetRawBlocksRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.api.GetRawBlocksRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.api.GetRawBlocksRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.api.GetRawBlocksRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetRawBlocksRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.api.GetRawBlocksRequest parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.api.GetRawBlocksRequest prototype) {
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
   * Protobuf type {@code iotexapi.GetRawBlocksRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotexapi.GetRawBlocksRequest)
      com.github.iotexproject.grpc.api.GetRawBlocksRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetRawBlocksRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetRawBlocksRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.api.GetRawBlocksRequest.class, com.github.iotexproject.grpc.api.GetRawBlocksRequest.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.api.GetRawBlocksRequest.newBuilder()
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
      startHeight_ = 0L;
      count_ = 0L;
      withReceipts_ = false;
      withTransactionLogs_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetRawBlocksRequest_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.GetRawBlocksRequest getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.api.GetRawBlocksRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.GetRawBlocksRequest build() {
      com.github.iotexproject.grpc.api.GetRawBlocksRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.GetRawBlocksRequest buildPartial() {
      com.github.iotexproject.grpc.api.GetRawBlocksRequest result = new com.github.iotexproject.grpc.api.GetRawBlocksRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.api.GetRawBlocksRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startHeight_ = startHeight_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.count_ = count_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.withReceipts_ = withReceipts_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.withTransactionLogs_ = withTransactionLogs_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.api.GetRawBlocksRequest) {
        return mergeFrom((com.github.iotexproject.grpc.api.GetRawBlocksRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.api.GetRawBlocksRequest other) {
      if (other == com.github.iotexproject.grpc.api.GetRawBlocksRequest.getDefaultInstance()) return this;
      if (other.getStartHeight() != 0L) {
        setStartHeight(other.getStartHeight());
      }
      if (other.getCount() != 0L) {
        setCount(other.getCount());
      }
      if (other.getWithReceipts() != false) {
        setWithReceipts(other.getWithReceipts());
      }
      if (other.getWithTransactionLogs() != false) {
        setWithTransactionLogs(other.getWithTransactionLogs());
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
              startHeight_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              count_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              withReceipts_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              withTransactionLogs_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private long startHeight_ ;
    /**
     * <code>uint64 startHeight = 1;</code>
     * @return The startHeight.
     */
    @java.lang.Override
    public long getStartHeight() {
      return startHeight_;
    }
    /**
     * <code>uint64 startHeight = 1;</code>
     * @param value The startHeight to set.
     * @return This builder for chaining.
     */
    public Builder setStartHeight(long value) {

      startHeight_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 startHeight = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartHeight() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startHeight_ = 0L;
      onChanged();
      return this;
    }

    private long count_ ;
    /**
     * <code>uint64 count = 2;</code>
     * @return The count.
     */
    @java.lang.Override
    public long getCount() {
      return count_;
    }
    /**
     * <code>uint64 count = 2;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(long value) {

      count_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      count_ = 0L;
      onChanged();
      return this;
    }

    private boolean withReceipts_ ;
    /**
     * <code>bool withReceipts = 3;</code>
     * @return The withReceipts.
     */
    @java.lang.Override
    public boolean getWithReceipts() {
      return withReceipts_;
    }
    /**
     * <code>bool withReceipts = 3;</code>
     * @param value The withReceipts to set.
     * @return This builder for chaining.
     */
    public Builder setWithReceipts(boolean value) {

      withReceipts_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool withReceipts = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWithReceipts() {
      bitField0_ = (bitField0_ & ~0x00000004);
      withReceipts_ = false;
      onChanged();
      return this;
    }

    private boolean withTransactionLogs_ ;
    /**
     * <code>bool withTransactionLogs = 4;</code>
     * @return The withTransactionLogs.
     */
    @java.lang.Override
    public boolean getWithTransactionLogs() {
      return withTransactionLogs_;
    }
    /**
     * <code>bool withTransactionLogs = 4;</code>
     * @param value The withTransactionLogs to set.
     * @return This builder for chaining.
     */
    public Builder setWithTransactionLogs(boolean value) {

      withTransactionLogs_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool withTransactionLogs = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearWithTransactionLogs() {
      bitField0_ = (bitField0_ & ~0x00000008);
      withTransactionLogs_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iotexapi.GetRawBlocksRequest)
  }

  // @@protoc_insertion_point(class_scope:iotexapi.GetRawBlocksRequest)
  private static final com.github.iotexproject.grpc.api.GetRawBlocksRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.api.GetRawBlocksRequest();
  }

  public static com.github.iotexproject.grpc.api.GetRawBlocksRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetRawBlocksRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetRawBlocksRequest>() {
    @java.lang.Override
    public GetRawBlocksRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetRawBlocksRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetRawBlocksRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.api.GetRawBlocksRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
