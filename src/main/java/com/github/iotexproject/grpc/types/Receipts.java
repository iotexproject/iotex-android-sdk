// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/types/blockchain.proto

package com.github.iotexproject.grpc.types;

/**
 * <pre>
 * Receipts consists of a collection of recepit
 * </pre>
 *
 * Protobuf type {@code iotextypes.Receipts}
 */
public final class Receipts extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:iotextypes.Receipts)
    ReceiptsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Receipts.newBuilder() to construct.
  private Receipts(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Receipts() {
    receipts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Receipts();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Receipts(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              receipts_ = new java.util.ArrayList<com.github.iotexproject.grpc.types.Receipt>();
              mutable_bitField0_ |= 0x00000001;
            }
            receipts_.add(
                input.readMessage(com.github.iotexproject.grpc.types.Receipt.parser(), extensionRegistry));
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
        receipts_ = java.util.Collections.unmodifiableList(receipts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_Receipts_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_Receipts_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.Receipts.class, com.github.iotexproject.grpc.types.Receipts.Builder.class);
  }

  public static final int RECEIPTS_FIELD_NUMBER = 1;
  private java.util.List<com.github.iotexproject.grpc.types.Receipt> receipts_;
  /**
   * <code>repeated .iotextypes.Receipt receipts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.github.iotexproject.grpc.types.Receipt> getReceiptsList() {
    return receipts_;
  }
  /**
   * <code>repeated .iotextypes.Receipt receipts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.github.iotexproject.grpc.types.ReceiptOrBuilder> 
      getReceiptsOrBuilderList() {
    return receipts_;
  }
  /**
   * <code>repeated .iotextypes.Receipt receipts = 1;</code>
   */
  @java.lang.Override
  public int getReceiptsCount() {
    return receipts_.size();
  }
  /**
   * <code>repeated .iotextypes.Receipt receipts = 1;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.Receipt getReceipts(int index) {
    return receipts_.get(index);
  }
  /**
   * <code>repeated .iotextypes.Receipt receipts = 1;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.ReceiptOrBuilder getReceiptsOrBuilder(
      int index) {
    return receipts_.get(index);
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
    for (int i = 0; i < receipts_.size(); i++) {
      output.writeMessage(1, receipts_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < receipts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, receipts_.get(i));
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.Receipts)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.Receipts other = (com.github.iotexproject.grpc.types.Receipts) obj;

    if (!getReceiptsList()
        .equals(other.getReceiptsList())) return false;
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
    if (getReceiptsCount() > 0) {
      hash = (37 * hash) + RECEIPTS_FIELD_NUMBER;
      hash = (53 * hash) + getReceiptsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.Receipts parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.Receipts parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.Receipts parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.Receipts parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.Receipts parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.Receipts parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.Receipts parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.Receipts parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.Receipts parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.Receipts parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.Receipts parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.Receipts parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.Receipts prototype) {
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
   * <pre>
   * Receipts consists of a collection of recepit
   * </pre>
   *
   * Protobuf type {@code iotextypes.Receipts}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.Receipts)
      com.github.iotexproject.grpc.types.ReceiptsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_Receipts_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_Receipts_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.Receipts.class, com.github.iotexproject.grpc.types.Receipts.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.Receipts.newBuilder()
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
        getReceiptsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (receiptsBuilder_ == null) {
        receipts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        receiptsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_Receipts_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.Receipts getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.Receipts.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.Receipts build() {
      com.github.iotexproject.grpc.types.Receipts result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.Receipts buildPartial() {
      com.github.iotexproject.grpc.types.Receipts result = new com.github.iotexproject.grpc.types.Receipts(this);
      int from_bitField0_ = bitField0_;
      if (receiptsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          receipts_ = java.util.Collections.unmodifiableList(receipts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.receipts_ = receipts_;
      } else {
        result.receipts_ = receiptsBuilder_.build();
      }
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
      if (other instanceof com.github.iotexproject.grpc.types.Receipts) {
        return mergeFrom((com.github.iotexproject.grpc.types.Receipts)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.Receipts other) {
      if (other == com.github.iotexproject.grpc.types.Receipts.getDefaultInstance()) return this;
      if (receiptsBuilder_ == null) {
        if (!other.receipts_.isEmpty()) {
          if (receipts_.isEmpty()) {
            receipts_ = other.receipts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReceiptsIsMutable();
            receipts_.addAll(other.receipts_);
          }
          onChanged();
        }
      } else {
        if (!other.receipts_.isEmpty()) {
          if (receiptsBuilder_.isEmpty()) {
            receiptsBuilder_.dispose();
            receiptsBuilder_ = null;
            receipts_ = other.receipts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            receiptsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getReceiptsFieldBuilder() : null;
          } else {
            receiptsBuilder_.addAllMessages(other.receipts_);
          }
        }
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
      com.github.iotexproject.grpc.types.Receipts parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.iotexproject.grpc.types.Receipts) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.github.iotexproject.grpc.types.Receipt> receipts_ =
      java.util.Collections.emptyList();
    private void ensureReceiptsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        receipts_ = new java.util.ArrayList<com.github.iotexproject.grpc.types.Receipt>(receipts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.iotexproject.grpc.types.Receipt, com.github.iotexproject.grpc.types.Receipt.Builder, com.github.iotexproject.grpc.types.ReceiptOrBuilder> receiptsBuilder_;

    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public java.util.List<com.github.iotexproject.grpc.types.Receipt> getReceiptsList() {
      if (receiptsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(receipts_);
      } else {
        return receiptsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public int getReceiptsCount() {
      if (receiptsBuilder_ == null) {
        return receipts_.size();
      } else {
        return receiptsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public com.github.iotexproject.grpc.types.Receipt getReceipts(int index) {
      if (receiptsBuilder_ == null) {
        return receipts_.get(index);
      } else {
        return receiptsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public Builder setReceipts(
        int index, com.github.iotexproject.grpc.types.Receipt value) {
      if (receiptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReceiptsIsMutable();
        receipts_.set(index, value);
        onChanged();
      } else {
        receiptsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public Builder setReceipts(
        int index, com.github.iotexproject.grpc.types.Receipt.Builder builderForValue) {
      if (receiptsBuilder_ == null) {
        ensureReceiptsIsMutable();
        receipts_.set(index, builderForValue.build());
        onChanged();
      } else {
        receiptsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public Builder addReceipts(com.github.iotexproject.grpc.types.Receipt value) {
      if (receiptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReceiptsIsMutable();
        receipts_.add(value);
        onChanged();
      } else {
        receiptsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public Builder addReceipts(
        int index, com.github.iotexproject.grpc.types.Receipt value) {
      if (receiptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReceiptsIsMutable();
        receipts_.add(index, value);
        onChanged();
      } else {
        receiptsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public Builder addReceipts(
        com.github.iotexproject.grpc.types.Receipt.Builder builderForValue) {
      if (receiptsBuilder_ == null) {
        ensureReceiptsIsMutable();
        receipts_.add(builderForValue.build());
        onChanged();
      } else {
        receiptsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public Builder addReceipts(
        int index, com.github.iotexproject.grpc.types.Receipt.Builder builderForValue) {
      if (receiptsBuilder_ == null) {
        ensureReceiptsIsMutable();
        receipts_.add(index, builderForValue.build());
        onChanged();
      } else {
        receiptsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public Builder addAllReceipts(
        java.lang.Iterable<? extends com.github.iotexproject.grpc.types.Receipt> values) {
      if (receiptsBuilder_ == null) {
        ensureReceiptsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, receipts_);
        onChanged();
      } else {
        receiptsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public Builder clearReceipts() {
      if (receiptsBuilder_ == null) {
        receipts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        receiptsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public Builder removeReceipts(int index) {
      if (receiptsBuilder_ == null) {
        ensureReceiptsIsMutable();
        receipts_.remove(index);
        onChanged();
      } else {
        receiptsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public com.github.iotexproject.grpc.types.Receipt.Builder getReceiptsBuilder(
        int index) {
      return getReceiptsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public com.github.iotexproject.grpc.types.ReceiptOrBuilder getReceiptsOrBuilder(
        int index) {
      if (receiptsBuilder_ == null) {
        return receipts_.get(index);  } else {
        return receiptsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public java.util.List<? extends com.github.iotexproject.grpc.types.ReceiptOrBuilder> 
         getReceiptsOrBuilderList() {
      if (receiptsBuilder_ != null) {
        return receiptsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(receipts_);
      }
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public com.github.iotexproject.grpc.types.Receipt.Builder addReceiptsBuilder() {
      return getReceiptsFieldBuilder().addBuilder(
          com.github.iotexproject.grpc.types.Receipt.getDefaultInstance());
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public com.github.iotexproject.grpc.types.Receipt.Builder addReceiptsBuilder(
        int index) {
      return getReceiptsFieldBuilder().addBuilder(
          index, com.github.iotexproject.grpc.types.Receipt.getDefaultInstance());
    }
    /**
     * <code>repeated .iotextypes.Receipt receipts = 1;</code>
     */
    public java.util.List<com.github.iotexproject.grpc.types.Receipt.Builder> 
         getReceiptsBuilderList() {
      return getReceiptsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.iotexproject.grpc.types.Receipt, com.github.iotexproject.grpc.types.Receipt.Builder, com.github.iotexproject.grpc.types.ReceiptOrBuilder> 
        getReceiptsFieldBuilder() {
      if (receiptsBuilder_ == null) {
        receiptsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.github.iotexproject.grpc.types.Receipt, com.github.iotexproject.grpc.types.Receipt.Builder, com.github.iotexproject.grpc.types.ReceiptOrBuilder>(
                receipts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        receipts_ = null;
      }
      return receiptsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:iotextypes.Receipts)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.Receipts)
  private static final com.github.iotexproject.grpc.types.Receipts DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.Receipts();
  }

  public static com.github.iotexproject.grpc.types.Receipts getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Receipts>
      PARSER = new com.google.protobuf.AbstractParser<Receipts>() {
    @java.lang.Override
    public Receipts parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Receipts(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Receipts> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Receipts> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.Receipts getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

