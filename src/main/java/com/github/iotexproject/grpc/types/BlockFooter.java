// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/blockchain.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * <pre>
 * footer of a block
 * </pre>
 *
 * Protobuf type {@code iotextypes.BlockFooter}
 */
public final class BlockFooter extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotextypes.BlockFooter)
    BlockFooterOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      BlockFooter.class.getName());
  }
  // Use BlockFooter.newBuilder() to construct.
  private BlockFooter(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private BlockFooter() {
    endorsements_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_BlockFooter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_BlockFooter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.BlockFooter.class, com.github.iotexproject.grpc.types.BlockFooter.Builder.class);
  }

  private int bitField0_;
  public static final int ENDORSEMENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.github.iotexproject.grpc.types.Endorsement> endorsements_;
  /**
   * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.github.iotexproject.grpc.types.Endorsement> getEndorsementsList() {
    return endorsements_;
  }
  /**
   * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.github.iotexproject.grpc.types.EndorsementOrBuilder> 
      getEndorsementsOrBuilderList() {
    return endorsements_;
  }
  /**
   * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
   */
  @java.lang.Override
  public int getEndorsementsCount() {
    return endorsements_.size();
  }
  /**
   * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.Endorsement getEndorsements(int index) {
    return endorsements_.get(index);
  }
  /**
   * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.EndorsementOrBuilder getEndorsementsOrBuilder(
      int index) {
    return endorsements_.get(index);
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp timestamp_;
  /**
   * <code>.google.protobuf.Timestamp timestamp = 2;</code>
   * @return Whether the timestamp field is set.
   */
  @java.lang.Override
  public boolean hasTimestamp() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.Timestamp timestamp = 2;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTimestamp() {
    return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
  }
  /**
   * <code>.google.protobuf.Timestamp timestamp = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
    return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
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
    for (int i = 0; i < endorsements_.size(); i++) {
      output.writeMessage(1, endorsements_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getTimestamp());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < endorsements_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, endorsements_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTimestamp());
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.BlockFooter)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.BlockFooter other = (com.github.iotexproject.grpc.types.BlockFooter) obj;

    if (!getEndorsementsList()
        .equals(other.getEndorsementsList())) return false;
    if (hasTimestamp() != other.hasTimestamp()) return false;
    if (hasTimestamp()) {
      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
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
    if (getEndorsementsCount() > 0) {
      hash = (37 * hash) + ENDORSEMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEndorsementsList().hashCode();
    }
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.BlockFooter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.BlockFooter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.BlockFooter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.BlockFooter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.BlockFooter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.BlockFooter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.BlockFooter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.BlockFooter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.types.BlockFooter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.types.BlockFooter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.BlockFooter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.BlockFooter parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.BlockFooter prototype) {
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
   * footer of a block
   * </pre>
   *
   * Protobuf type {@code iotextypes.BlockFooter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.BlockFooter)
      com.github.iotexproject.grpc.types.BlockFooterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_BlockFooter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_BlockFooter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.BlockFooter.class, com.github.iotexproject.grpc.types.BlockFooter.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.BlockFooter.newBuilder()
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
        getEndorsementsFieldBuilder();
        getTimestampFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (endorsementsBuilder_ == null) {
        endorsements_ = java.util.Collections.emptyList();
      } else {
        endorsements_ = null;
        endorsementsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      timestamp_ = null;
      if (timestampBuilder_ != null) {
        timestampBuilder_.dispose();
        timestampBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_BlockFooter_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.BlockFooter getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.BlockFooter.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.BlockFooter build() {
      com.github.iotexproject.grpc.types.BlockFooter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.BlockFooter buildPartial() {
      com.github.iotexproject.grpc.types.BlockFooter result = new com.github.iotexproject.grpc.types.BlockFooter(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.github.iotexproject.grpc.types.BlockFooter result) {
      if (endorsementsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          endorsements_ = java.util.Collections.unmodifiableList(endorsements_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.endorsements_ = endorsements_;
      } else {
        result.endorsements_ = endorsementsBuilder_.build();
      }
    }

    private void buildPartial0(com.github.iotexproject.grpc.types.BlockFooter result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timestamp_ = timestampBuilder_ == null
            ? timestamp_
            : timestampBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.BlockFooter) {
        return mergeFrom((com.github.iotexproject.grpc.types.BlockFooter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.BlockFooter other) {
      if (other == com.github.iotexproject.grpc.types.BlockFooter.getDefaultInstance()) return this;
      if (endorsementsBuilder_ == null) {
        if (!other.endorsements_.isEmpty()) {
          if (endorsements_.isEmpty()) {
            endorsements_ = other.endorsements_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEndorsementsIsMutable();
            endorsements_.addAll(other.endorsements_);
          }
          onChanged();
        }
      } else {
        if (!other.endorsements_.isEmpty()) {
          if (endorsementsBuilder_.isEmpty()) {
            endorsementsBuilder_.dispose();
            endorsementsBuilder_ = null;
            endorsements_ = other.endorsements_;
            bitField0_ = (bitField0_ & ~0x00000001);
            endorsementsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getEndorsementsFieldBuilder() : null;
          } else {
            endorsementsBuilder_.addAllMessages(other.endorsements_);
          }
        }
      }
      if (other.hasTimestamp()) {
        mergeTimestamp(other.getTimestamp());
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
              com.github.iotexproject.grpc.types.Endorsement m =
                  input.readMessage(
                      com.github.iotexproject.grpc.types.Endorsement.parser(),
                      extensionRegistry);
              if (endorsementsBuilder_ == null) {
                ensureEndorsementsIsMutable();
                endorsements_.add(m);
              } else {
                endorsementsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTimestampFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.util.List<com.github.iotexproject.grpc.types.Endorsement> endorsements_ =
      java.util.Collections.emptyList();
    private void ensureEndorsementsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        endorsements_ = new java.util.ArrayList<com.github.iotexproject.grpc.types.Endorsement>(endorsements_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.github.iotexproject.grpc.types.Endorsement, com.github.iotexproject.grpc.types.Endorsement.Builder, com.github.iotexproject.grpc.types.EndorsementOrBuilder> endorsementsBuilder_;

    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public java.util.List<com.github.iotexproject.grpc.types.Endorsement> getEndorsementsList() {
      if (endorsementsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(endorsements_);
      } else {
        return endorsementsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public int getEndorsementsCount() {
      if (endorsementsBuilder_ == null) {
        return endorsements_.size();
      } else {
        return endorsementsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public com.github.iotexproject.grpc.types.Endorsement getEndorsements(int index) {
      if (endorsementsBuilder_ == null) {
        return endorsements_.get(index);
      } else {
        return endorsementsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public Builder setEndorsements(
        int index, com.github.iotexproject.grpc.types.Endorsement value) {
      if (endorsementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEndorsementsIsMutable();
        endorsements_.set(index, value);
        onChanged();
      } else {
        endorsementsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public Builder setEndorsements(
        int index, com.github.iotexproject.grpc.types.Endorsement.Builder builderForValue) {
      if (endorsementsBuilder_ == null) {
        ensureEndorsementsIsMutable();
        endorsements_.set(index, builderForValue.build());
        onChanged();
      } else {
        endorsementsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public Builder addEndorsements(com.github.iotexproject.grpc.types.Endorsement value) {
      if (endorsementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEndorsementsIsMutable();
        endorsements_.add(value);
        onChanged();
      } else {
        endorsementsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public Builder addEndorsements(
        int index, com.github.iotexproject.grpc.types.Endorsement value) {
      if (endorsementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEndorsementsIsMutable();
        endorsements_.add(index, value);
        onChanged();
      } else {
        endorsementsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public Builder addEndorsements(
        com.github.iotexproject.grpc.types.Endorsement.Builder builderForValue) {
      if (endorsementsBuilder_ == null) {
        ensureEndorsementsIsMutable();
        endorsements_.add(builderForValue.build());
        onChanged();
      } else {
        endorsementsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public Builder addEndorsements(
        int index, com.github.iotexproject.grpc.types.Endorsement.Builder builderForValue) {
      if (endorsementsBuilder_ == null) {
        ensureEndorsementsIsMutable();
        endorsements_.add(index, builderForValue.build());
        onChanged();
      } else {
        endorsementsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public Builder addAllEndorsements(
        java.lang.Iterable<? extends com.github.iotexproject.grpc.types.Endorsement> values) {
      if (endorsementsBuilder_ == null) {
        ensureEndorsementsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, endorsements_);
        onChanged();
      } else {
        endorsementsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public Builder clearEndorsements() {
      if (endorsementsBuilder_ == null) {
        endorsements_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        endorsementsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public Builder removeEndorsements(int index) {
      if (endorsementsBuilder_ == null) {
        ensureEndorsementsIsMutable();
        endorsements_.remove(index);
        onChanged();
      } else {
        endorsementsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public com.github.iotexproject.grpc.types.Endorsement.Builder getEndorsementsBuilder(
        int index) {
      return getEndorsementsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public com.github.iotexproject.grpc.types.EndorsementOrBuilder getEndorsementsOrBuilder(
        int index) {
      if (endorsementsBuilder_ == null) {
        return endorsements_.get(index);  } else {
        return endorsementsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public java.util.List<? extends com.github.iotexproject.grpc.types.EndorsementOrBuilder> 
         getEndorsementsOrBuilderList() {
      if (endorsementsBuilder_ != null) {
        return endorsementsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(endorsements_);
      }
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public com.github.iotexproject.grpc.types.Endorsement.Builder addEndorsementsBuilder() {
      return getEndorsementsFieldBuilder().addBuilder(
          com.github.iotexproject.grpc.types.Endorsement.getDefaultInstance());
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public com.github.iotexproject.grpc.types.Endorsement.Builder addEndorsementsBuilder(
        int index) {
      return getEndorsementsFieldBuilder().addBuilder(
          index, com.github.iotexproject.grpc.types.Endorsement.getDefaultInstance());
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 1;</code>
     */
    public java.util.List<com.github.iotexproject.grpc.types.Endorsement.Builder> 
         getEndorsementsBuilderList() {
      return getEndorsementsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.github.iotexproject.grpc.types.Endorsement, com.github.iotexproject.grpc.types.Endorsement.Builder, com.github.iotexproject.grpc.types.EndorsementOrBuilder> 
        getEndorsementsFieldBuilder() {
      if (endorsementsBuilder_ == null) {
        endorsementsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.github.iotexproject.grpc.types.Endorsement, com.github.iotexproject.grpc.types.Endorsement.Builder, com.github.iotexproject.grpc.types.EndorsementOrBuilder>(
                endorsements_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        endorsements_ = null;
      }
      return endorsementsBuilder_;
    }

    private com.google.protobuf.Timestamp timestamp_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timestampBuilder_;
    /**
     * <code>.google.protobuf.Timestamp timestamp = 2;</code>
     * @return Whether the timestamp field is set.
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 2;</code>
     * @return The timestamp.
     */
    public com.google.protobuf.Timestamp getTimestamp() {
      if (timestampBuilder_ == null) {
        return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      } else {
        return timestampBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 2;</code>
     */
    public Builder setTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timestamp_ = value;
      } else {
        timestampBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 2;</code>
     */
    public Builder setTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timestampBuilder_ == null) {
        timestamp_ = builderForValue.build();
      } else {
        timestampBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 2;</code>
     */
    public Builder mergeTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          timestamp_ != null &&
          timestamp_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTimestampBuilder().mergeFrom(value);
        } else {
          timestamp_ = value;
        }
      } else {
        timestampBuilder_.mergeFrom(value);
      }
      if (timestamp_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 2;</code>
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timestamp_ = null;
      if (timestampBuilder_ != null) {
        timestampBuilder_.dispose();
        timestampBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimestampBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTimestampFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
      if (timestampBuilder_ != null) {
        return timestampBuilder_.getMessageOrBuilder();
      } else {
        return timestamp_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimestampFieldBuilder() {
      if (timestampBuilder_ == null) {
        timestampBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTimestamp(),
                getParentForChildren(),
                isClean());
        timestamp_ = null;
      }
      return timestampBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:iotextypes.BlockFooter)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.BlockFooter)
  private static final com.github.iotexproject.grpc.types.BlockFooter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.BlockFooter();
  }

  public static com.github.iotexproject.grpc.types.BlockFooter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlockFooter>
      PARSER = new com.google.protobuf.AbstractParser<BlockFooter>() {
    @java.lang.Override
    public BlockFooter parsePartialFrom(
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

  public static com.google.protobuf.Parser<BlockFooter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlockFooter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.BlockFooter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

