// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/types/consensus.proto

package com.github.iotexproject.grpc.types;

/**
 * Protobuf type {@code iotextypes.BlockProposal}
 */
public final class BlockProposal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:iotextypes.BlockProposal)
    BlockProposalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlockProposal.newBuilder() to construct.
  private BlockProposal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlockProposal() {
    endorsements_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlockProposal();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlockProposal(
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
            com.github.iotexproject.grpc.types.Block.Builder subBuilder = null;
            if (block_ != null) {
              subBuilder = block_.toBuilder();
            }
            block_ = input.readMessage(com.github.iotexproject.grpc.types.Block.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(block_);
              block_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              endorsements_ = new java.util.ArrayList<com.github.iotexproject.grpc.types.Endorsement>();
              mutable_bitField0_ |= 0x00000001;
            }
            endorsements_.add(
                input.readMessage(com.github.iotexproject.grpc.types.Endorsement.parser(), extensionRegistry));
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
        endorsements_ = java.util.Collections.unmodifiableList(endorsements_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.Consensus.internal_static_iotextypes_BlockProposal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.Consensus.internal_static_iotextypes_BlockProposal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.BlockProposal.class, com.github.iotexproject.grpc.types.BlockProposal.Builder.class);
  }

  public static final int BLOCK_FIELD_NUMBER = 1;
  private com.github.iotexproject.grpc.types.Block block_;
  /**
   * <code>.iotextypes.Block block = 1;</code>
   * @return Whether the block field is set.
   */
  @java.lang.Override
  public boolean hasBlock() {
    return block_ != null;
  }
  /**
   * <code>.iotextypes.Block block = 1;</code>
   * @return The block.
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.Block getBlock() {
    return block_ == null ? com.github.iotexproject.grpc.types.Block.getDefaultInstance() : block_;
  }
  /**
   * <code>.iotextypes.Block block = 1;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.BlockOrBuilder getBlockOrBuilder() {
    return getBlock();
  }

  public static final int ENDORSEMENTS_FIELD_NUMBER = 2;
  private java.util.List<com.github.iotexproject.grpc.types.Endorsement> endorsements_;
  /**
   * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.github.iotexproject.grpc.types.Endorsement> getEndorsementsList() {
    return endorsements_;
  }
  /**
   * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.github.iotexproject.grpc.types.EndorsementOrBuilder> 
      getEndorsementsOrBuilderList() {
    return endorsements_;
  }
  /**
   * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
   */
  @java.lang.Override
  public int getEndorsementsCount() {
    return endorsements_.size();
  }
  /**
   * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.Endorsement getEndorsements(int index) {
    return endorsements_.get(index);
  }
  /**
   * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.EndorsementOrBuilder getEndorsementsOrBuilder(
      int index) {
    return endorsements_.get(index);
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
    if (block_ != null) {
      output.writeMessage(1, getBlock());
    }
    for (int i = 0; i < endorsements_.size(); i++) {
      output.writeMessage(2, endorsements_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (block_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBlock());
    }
    for (int i = 0; i < endorsements_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, endorsements_.get(i));
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.BlockProposal)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.BlockProposal other = (com.github.iotexproject.grpc.types.BlockProposal) obj;

    if (hasBlock() != other.hasBlock()) return false;
    if (hasBlock()) {
      if (!getBlock()
          .equals(other.getBlock())) return false;
    }
    if (!getEndorsementsList()
        .equals(other.getEndorsementsList())) return false;
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
    if (hasBlock()) {
      hash = (37 * hash) + BLOCK_FIELD_NUMBER;
      hash = (53 * hash) + getBlock().hashCode();
    }
    if (getEndorsementsCount() > 0) {
      hash = (37 * hash) + ENDORSEMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEndorsementsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.BlockProposal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.BlockProposal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.BlockProposal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.BlockProposal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.BlockProposal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.BlockProposal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.BlockProposal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.BlockProposal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.BlockProposal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.BlockProposal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.BlockProposal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.BlockProposal parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.BlockProposal prototype) {
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
   * Protobuf type {@code iotextypes.BlockProposal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.BlockProposal)
      com.github.iotexproject.grpc.types.BlockProposalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.Consensus.internal_static_iotextypes_BlockProposal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.Consensus.internal_static_iotextypes_BlockProposal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.BlockProposal.class, com.github.iotexproject.grpc.types.BlockProposal.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.BlockProposal.newBuilder()
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
        getEndorsementsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (blockBuilder_ == null) {
        block_ = null;
      } else {
        block_ = null;
        blockBuilder_ = null;
      }
      if (endorsementsBuilder_ == null) {
        endorsements_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        endorsementsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.Consensus.internal_static_iotextypes_BlockProposal_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.BlockProposal getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.BlockProposal.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.BlockProposal build() {
      com.github.iotexproject.grpc.types.BlockProposal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.BlockProposal buildPartial() {
      com.github.iotexproject.grpc.types.BlockProposal result = new com.github.iotexproject.grpc.types.BlockProposal(this);
      int from_bitField0_ = bitField0_;
      if (blockBuilder_ == null) {
        result.block_ = block_;
      } else {
        result.block_ = blockBuilder_.build();
      }
      if (endorsementsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          endorsements_ = java.util.Collections.unmodifiableList(endorsements_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.endorsements_ = endorsements_;
      } else {
        result.endorsements_ = endorsementsBuilder_.build();
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
      if (other instanceof com.github.iotexproject.grpc.types.BlockProposal) {
        return mergeFrom((com.github.iotexproject.grpc.types.BlockProposal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.BlockProposal other) {
      if (other == com.github.iotexproject.grpc.types.BlockProposal.getDefaultInstance()) return this;
      if (other.hasBlock()) {
        mergeBlock(other.getBlock());
      }
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
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEndorsementsFieldBuilder() : null;
          } else {
            endorsementsBuilder_.addAllMessages(other.endorsements_);
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
      com.github.iotexproject.grpc.types.BlockProposal parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.iotexproject.grpc.types.BlockProposal) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.github.iotexproject.grpc.types.Block block_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.iotexproject.grpc.types.Block, com.github.iotexproject.grpc.types.Block.Builder, com.github.iotexproject.grpc.types.BlockOrBuilder> blockBuilder_;
    /**
     * <code>.iotextypes.Block block = 1;</code>
     * @return Whether the block field is set.
     */
    public boolean hasBlock() {
      return blockBuilder_ != null || block_ != null;
    }
    /**
     * <code>.iotextypes.Block block = 1;</code>
     * @return The block.
     */
    public com.github.iotexproject.grpc.types.Block getBlock() {
      if (blockBuilder_ == null) {
        return block_ == null ? com.github.iotexproject.grpc.types.Block.getDefaultInstance() : block_;
      } else {
        return blockBuilder_.getMessage();
      }
    }
    /**
     * <code>.iotextypes.Block block = 1;</code>
     */
    public Builder setBlock(com.github.iotexproject.grpc.types.Block value) {
      if (blockBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        block_ = value;
        onChanged();
      } else {
        blockBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.iotextypes.Block block = 1;</code>
     */
    public Builder setBlock(
        com.github.iotexproject.grpc.types.Block.Builder builderForValue) {
      if (blockBuilder_ == null) {
        block_ = builderForValue.build();
        onChanged();
      } else {
        blockBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.iotextypes.Block block = 1;</code>
     */
    public Builder mergeBlock(com.github.iotexproject.grpc.types.Block value) {
      if (blockBuilder_ == null) {
        if (block_ != null) {
          block_ =
            com.github.iotexproject.grpc.types.Block.newBuilder(block_).mergeFrom(value).buildPartial();
        } else {
          block_ = value;
        }
        onChanged();
      } else {
        blockBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.iotextypes.Block block = 1;</code>
     */
    public Builder clearBlock() {
      if (blockBuilder_ == null) {
        block_ = null;
        onChanged();
      } else {
        block_ = null;
        blockBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.iotextypes.Block block = 1;</code>
     */
    public com.github.iotexproject.grpc.types.Block.Builder getBlockBuilder() {
      
      onChanged();
      return getBlockFieldBuilder().getBuilder();
    }
    /**
     * <code>.iotextypes.Block block = 1;</code>
     */
    public com.github.iotexproject.grpc.types.BlockOrBuilder getBlockOrBuilder() {
      if (blockBuilder_ != null) {
        return blockBuilder_.getMessageOrBuilder();
      } else {
        return block_ == null ?
            com.github.iotexproject.grpc.types.Block.getDefaultInstance() : block_;
      }
    }
    /**
     * <code>.iotextypes.Block block = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.iotexproject.grpc.types.Block, com.github.iotexproject.grpc.types.Block.Builder, com.github.iotexproject.grpc.types.BlockOrBuilder> 
        getBlockFieldBuilder() {
      if (blockBuilder_ == null) {
        blockBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.iotexproject.grpc.types.Block, com.github.iotexproject.grpc.types.Block.Builder, com.github.iotexproject.grpc.types.BlockOrBuilder>(
                getBlock(),
                getParentForChildren(),
                isClean());
        block_ = null;
      }
      return blockBuilder_;
    }

    private java.util.List<com.github.iotexproject.grpc.types.Endorsement> endorsements_ =
      java.util.Collections.emptyList();
    private void ensureEndorsementsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        endorsements_ = new java.util.ArrayList<com.github.iotexproject.grpc.types.Endorsement>(endorsements_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.iotexproject.grpc.types.Endorsement, com.github.iotexproject.grpc.types.Endorsement.Builder, com.github.iotexproject.grpc.types.EndorsementOrBuilder> endorsementsBuilder_;

    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
     */
    public java.util.List<com.github.iotexproject.grpc.types.Endorsement> getEndorsementsList() {
      if (endorsementsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(endorsements_);
      } else {
        return endorsementsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
     */
    public int getEndorsementsCount() {
      if (endorsementsBuilder_ == null) {
        return endorsements_.size();
      } else {
        return endorsementsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
     */
    public com.github.iotexproject.grpc.types.Endorsement getEndorsements(int index) {
      if (endorsementsBuilder_ == null) {
        return endorsements_.get(index);
      } else {
        return endorsementsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
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
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
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
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
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
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
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
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
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
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
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
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
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
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
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
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
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
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
     */
    public com.github.iotexproject.grpc.types.Endorsement.Builder getEndorsementsBuilder(
        int index) {
      return getEndorsementsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
     */
    public com.github.iotexproject.grpc.types.EndorsementOrBuilder getEndorsementsOrBuilder(
        int index) {
      if (endorsementsBuilder_ == null) {
        return endorsements_.get(index);  } else {
        return endorsementsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
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
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
     */
    public com.github.iotexproject.grpc.types.Endorsement.Builder addEndorsementsBuilder() {
      return getEndorsementsFieldBuilder().addBuilder(
          com.github.iotexproject.grpc.types.Endorsement.getDefaultInstance());
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
     */
    public com.github.iotexproject.grpc.types.Endorsement.Builder addEndorsementsBuilder(
        int index) {
      return getEndorsementsFieldBuilder().addBuilder(
          index, com.github.iotexproject.grpc.types.Endorsement.getDefaultInstance());
    }
    /**
     * <code>repeated .iotextypes.Endorsement endorsements = 2;</code>
     */
    public java.util.List<com.github.iotexproject.grpc.types.Endorsement.Builder> 
         getEndorsementsBuilderList() {
      return getEndorsementsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.iotexproject.grpc.types.Endorsement, com.github.iotexproject.grpc.types.Endorsement.Builder, com.github.iotexproject.grpc.types.EndorsementOrBuilder> 
        getEndorsementsFieldBuilder() {
      if (endorsementsBuilder_ == null) {
        endorsementsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.github.iotexproject.grpc.types.Endorsement, com.github.iotexproject.grpc.types.Endorsement.Builder, com.github.iotexproject.grpc.types.EndorsementOrBuilder>(
                endorsements_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        endorsements_ = null;
      }
      return endorsementsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:iotextypes.BlockProposal)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.BlockProposal)
  private static final com.github.iotexproject.grpc.types.BlockProposal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.BlockProposal();
  }

  public static com.github.iotexproject.grpc.types.BlockProposal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlockProposal>
      PARSER = new com.google.protobuf.AbstractParser<BlockProposal>() {
    @java.lang.Override
    public BlockProposal parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlockProposal(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlockProposal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlockProposal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.BlockProposal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

