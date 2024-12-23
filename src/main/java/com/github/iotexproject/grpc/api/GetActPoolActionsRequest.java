// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/api/api.proto

package com.github.iotexproject.grpc.api;

/**
 * Protobuf type {@code iotexapi.GetActPoolActionsRequest}
 */
public final class GetActPoolActionsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:iotexapi.GetActPoolActionsRequest)
    GetActPoolActionsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetActPoolActionsRequest.newBuilder() to construct.
  private GetActPoolActionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetActPoolActionsRequest() {
    actionHashes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetActPoolActionsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetActPoolActionsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              actionHashes_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            actionHashes_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        actionHashes_ = actionHashes_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetActPoolActionsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetActPoolActionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.api.GetActPoolActionsRequest.class, com.github.iotexproject.grpc.api.GetActPoolActionsRequest.Builder.class);
  }

  public static final int ACTIONHASHES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList actionHashes_;
  /**
   * <pre>
   * if this field is absent, get all actions from actpool
   * </pre>
   *
   * <code>repeated string actionHashes = 1;</code>
   * @return A list containing the actionHashes.
   */
  public com.google.protobuf.ProtocolStringList
      getActionHashesList() {
    return actionHashes_;
  }
  /**
   * <pre>
   * if this field is absent, get all actions from actpool
   * </pre>
   *
   * <code>repeated string actionHashes = 1;</code>
   * @return The count of actionHashes.
   */
  public int getActionHashesCount() {
    return actionHashes_.size();
  }
  /**
   * <pre>
   * if this field is absent, get all actions from actpool
   * </pre>
   *
   * <code>repeated string actionHashes = 1;</code>
   * @param index The index of the element to return.
   * @return The actionHashes at the given index.
   */
  public java.lang.String getActionHashes(int index) {
    return actionHashes_.get(index);
  }
  /**
   * <pre>
   * if this field is absent, get all actions from actpool
   * </pre>
   *
   * <code>repeated string actionHashes = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the actionHashes at the given index.
   */
  public com.google.protobuf.ByteString
      getActionHashesBytes(int index) {
    return actionHashes_.getByteString(index);
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
    for (int i = 0; i < actionHashes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, actionHashes_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < actionHashes_.size(); i++) {
        dataSize += computeStringSizeNoTag(actionHashes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getActionHashesList().size();
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
    if (!(obj instanceof com.github.iotexproject.grpc.api.GetActPoolActionsRequest)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.api.GetActPoolActionsRequest other = (com.github.iotexproject.grpc.api.GetActPoolActionsRequest) obj;

    if (!getActionHashesList()
        .equals(other.getActionHashesList())) return false;
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
    if (getActionHashesCount() > 0) {
      hash = (37 * hash) + ACTIONHASHES_FIELD_NUMBER;
      hash = (53 * hash) + getActionHashesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.api.GetActPoolActionsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.GetActPoolActionsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetActPoolActionsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.GetActPoolActionsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetActPoolActionsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.api.GetActPoolActionsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetActPoolActionsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.api.GetActPoolActionsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetActPoolActionsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.api.GetActPoolActionsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.api.GetActPoolActionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.api.GetActPoolActionsRequest parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.api.GetActPoolActionsRequest prototype) {
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
   * Protobuf type {@code iotexapi.GetActPoolActionsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotexapi.GetActPoolActionsRequest)
      com.github.iotexproject.grpc.api.GetActPoolActionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetActPoolActionsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetActPoolActionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.api.GetActPoolActionsRequest.class, com.github.iotexproject.grpc.api.GetActPoolActionsRequest.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.api.GetActPoolActionsRequest.newBuilder()
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
      actionHashes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.api.Api.internal_static_iotexapi_GetActPoolActionsRequest_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.GetActPoolActionsRequest getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.api.GetActPoolActionsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.GetActPoolActionsRequest build() {
      com.github.iotexproject.grpc.api.GetActPoolActionsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.api.GetActPoolActionsRequest buildPartial() {
      com.github.iotexproject.grpc.api.GetActPoolActionsRequest result = new com.github.iotexproject.grpc.api.GetActPoolActionsRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        actionHashes_ = actionHashes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.actionHashes_ = actionHashes_;
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
      if (other instanceof com.github.iotexproject.grpc.api.GetActPoolActionsRequest) {
        return mergeFrom((com.github.iotexproject.grpc.api.GetActPoolActionsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.api.GetActPoolActionsRequest other) {
      if (other == com.github.iotexproject.grpc.api.GetActPoolActionsRequest.getDefaultInstance()) return this;
      if (!other.actionHashes_.isEmpty()) {
        if (actionHashes_.isEmpty()) {
          actionHashes_ = other.actionHashes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureActionHashesIsMutable();
          actionHashes_.addAll(other.actionHashes_);
        }
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
      com.github.iotexproject.grpc.api.GetActPoolActionsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.iotexproject.grpc.api.GetActPoolActionsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList actionHashes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureActionHashesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        actionHashes_ = new com.google.protobuf.LazyStringArrayList(actionHashes_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * if this field is absent, get all actions from actpool
     * </pre>
     *
     * <code>repeated string actionHashes = 1;</code>
     * @return A list containing the actionHashes.
     */
    public com.google.protobuf.ProtocolStringList
        getActionHashesList() {
      return actionHashes_.getUnmodifiableView();
    }
    /**
     * <pre>
     * if this field is absent, get all actions from actpool
     * </pre>
     *
     * <code>repeated string actionHashes = 1;</code>
     * @return The count of actionHashes.
     */
    public int getActionHashesCount() {
      return actionHashes_.size();
    }
    /**
     * <pre>
     * if this field is absent, get all actions from actpool
     * </pre>
     *
     * <code>repeated string actionHashes = 1;</code>
     * @param index The index of the element to return.
     * @return The actionHashes at the given index.
     */
    public java.lang.String getActionHashes(int index) {
      return actionHashes_.get(index);
    }
    /**
     * <pre>
     * if this field is absent, get all actions from actpool
     * </pre>
     *
     * <code>repeated string actionHashes = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the actionHashes at the given index.
     */
    public com.google.protobuf.ByteString
        getActionHashesBytes(int index) {
      return actionHashes_.getByteString(index);
    }
    /**
     * <pre>
     * if this field is absent, get all actions from actpool
     * </pre>
     *
     * <code>repeated string actionHashes = 1;</code>
     * @param index The index to set the value at.
     * @param value The actionHashes to set.
     * @return This builder for chaining.
     */
    public Builder setActionHashes(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureActionHashesIsMutable();
      actionHashes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * if this field is absent, get all actions from actpool
     * </pre>
     *
     * <code>repeated string actionHashes = 1;</code>
     * @param value The actionHashes to add.
     * @return This builder for chaining.
     */
    public Builder addActionHashes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureActionHashesIsMutable();
      actionHashes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * if this field is absent, get all actions from actpool
     * </pre>
     *
     * <code>repeated string actionHashes = 1;</code>
     * @param values The actionHashes to add.
     * @return This builder for chaining.
     */
    public Builder addAllActionHashes(
        java.lang.Iterable<java.lang.String> values) {
      ensureActionHashesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, actionHashes_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * if this field is absent, get all actions from actpool
     * </pre>
     *
     * <code>repeated string actionHashes = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearActionHashes() {
      actionHashes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * if this field is absent, get all actions from actpool
     * </pre>
     *
     * <code>repeated string actionHashes = 1;</code>
     * @param value The bytes of the actionHashes to add.
     * @return This builder for chaining.
     */
    public Builder addActionHashesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureActionHashesIsMutable();
      actionHashes_.add(value);
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


    // @@protoc_insertion_point(builder_scope:iotexapi.GetActPoolActionsRequest)
  }

  // @@protoc_insertion_point(class_scope:iotexapi.GetActPoolActionsRequest)
  private static final com.github.iotexproject.grpc.api.GetActPoolActionsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.api.GetActPoolActionsRequest();
  }

  public static com.github.iotexproject.grpc.api.GetActPoolActionsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetActPoolActionsRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetActPoolActionsRequest>() {
    @java.lang.Override
    public GetActPoolActionsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetActPoolActionsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetActPoolActionsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetActPoolActionsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.api.GetActPoolActionsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

