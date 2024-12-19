// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/state_data.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * Protobuf type {@code iotextypes.CandidateListV2}
 */
public final class CandidateListV2 extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotextypes.CandidateListV2)
    CandidateListV2OrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      CandidateListV2.class.getName());
  }
  // Use CandidateListV2.newBuilder() to construct.
  private CandidateListV2(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CandidateListV2() {
    candidates_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.StateData.internal_static_iotextypes_CandidateListV2_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.StateData.internal_static_iotextypes_CandidateListV2_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.CandidateListV2.class, com.github.iotexproject.grpc.types.CandidateListV2.Builder.class);
  }

  public static final int CANDIDATES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.github.iotexproject.grpc.types.CandidateV2> candidates_;
  /**
   * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.github.iotexproject.grpc.types.CandidateV2> getCandidatesList() {
    return candidates_;
  }
  /**
   * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.github.iotexproject.grpc.types.CandidateV2OrBuilder> 
      getCandidatesOrBuilderList() {
    return candidates_;
  }
  /**
   * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
   */
  @java.lang.Override
  public int getCandidatesCount() {
    return candidates_.size();
  }
  /**
   * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.CandidateV2 getCandidates(int index) {
    return candidates_.get(index);
  }
  /**
   * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.CandidateV2OrBuilder getCandidatesOrBuilder(
      int index) {
    return candidates_.get(index);
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
    for (int i = 0; i < candidates_.size(); i++) {
      output.writeMessage(1, candidates_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < candidates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, candidates_.get(i));
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.CandidateListV2)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.CandidateListV2 other = (com.github.iotexproject.grpc.types.CandidateListV2) obj;

    if (!getCandidatesList()
        .equals(other.getCandidatesList())) return false;
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
    if (getCandidatesCount() > 0) {
      hash = (37 * hash) + CANDIDATES_FIELD_NUMBER;
      hash = (53 * hash) + getCandidatesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.CandidateListV2 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.CandidateListV2 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.CandidateListV2 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.CandidateListV2 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.CandidateListV2 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.CandidateListV2 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.CandidateListV2 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.CandidateListV2 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.types.CandidateListV2 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.types.CandidateListV2 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.CandidateListV2 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.CandidateListV2 parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.CandidateListV2 prototype) {
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
   * Protobuf type {@code iotextypes.CandidateListV2}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.CandidateListV2)
      com.github.iotexproject.grpc.types.CandidateListV2OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.StateData.internal_static_iotextypes_CandidateListV2_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.StateData.internal_static_iotextypes_CandidateListV2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.CandidateListV2.class, com.github.iotexproject.grpc.types.CandidateListV2.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.CandidateListV2.newBuilder()
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
      if (candidatesBuilder_ == null) {
        candidates_ = java.util.Collections.emptyList();
      } else {
        candidates_ = null;
        candidatesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.StateData.internal_static_iotextypes_CandidateListV2_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.CandidateListV2 getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.CandidateListV2.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.CandidateListV2 build() {
      com.github.iotexproject.grpc.types.CandidateListV2 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.CandidateListV2 buildPartial() {
      com.github.iotexproject.grpc.types.CandidateListV2 result = new com.github.iotexproject.grpc.types.CandidateListV2(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.github.iotexproject.grpc.types.CandidateListV2 result) {
      if (candidatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          candidates_ = java.util.Collections.unmodifiableList(candidates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.candidates_ = candidates_;
      } else {
        result.candidates_ = candidatesBuilder_.build();
      }
    }

    private void buildPartial0(com.github.iotexproject.grpc.types.CandidateListV2 result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.CandidateListV2) {
        return mergeFrom((com.github.iotexproject.grpc.types.CandidateListV2)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.CandidateListV2 other) {
      if (other == com.github.iotexproject.grpc.types.CandidateListV2.getDefaultInstance()) return this;
      if (candidatesBuilder_ == null) {
        if (!other.candidates_.isEmpty()) {
          if (candidates_.isEmpty()) {
            candidates_ = other.candidates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCandidatesIsMutable();
            candidates_.addAll(other.candidates_);
          }
          onChanged();
        }
      } else {
        if (!other.candidates_.isEmpty()) {
          if (candidatesBuilder_.isEmpty()) {
            candidatesBuilder_.dispose();
            candidatesBuilder_ = null;
            candidates_ = other.candidates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            candidatesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getCandidatesFieldBuilder() : null;
          } else {
            candidatesBuilder_.addAllMessages(other.candidates_);
          }
        }
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
              com.github.iotexproject.grpc.types.CandidateV2 m =
                  input.readMessage(
                      com.github.iotexproject.grpc.types.CandidateV2.parser(),
                      extensionRegistry);
              if (candidatesBuilder_ == null) {
                ensureCandidatesIsMutable();
                candidates_.add(m);
              } else {
                candidatesBuilder_.addMessage(m);
              }
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

    private java.util.List<com.github.iotexproject.grpc.types.CandidateV2> candidates_ =
      java.util.Collections.emptyList();
    private void ensureCandidatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        candidates_ = new java.util.ArrayList<com.github.iotexproject.grpc.types.CandidateV2>(candidates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.github.iotexproject.grpc.types.CandidateV2, com.github.iotexproject.grpc.types.CandidateV2.Builder, com.github.iotexproject.grpc.types.CandidateV2OrBuilder> candidatesBuilder_;

    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public java.util.List<com.github.iotexproject.grpc.types.CandidateV2> getCandidatesList() {
      if (candidatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(candidates_);
      } else {
        return candidatesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public int getCandidatesCount() {
      if (candidatesBuilder_ == null) {
        return candidates_.size();
      } else {
        return candidatesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public com.github.iotexproject.grpc.types.CandidateV2 getCandidates(int index) {
      if (candidatesBuilder_ == null) {
        return candidates_.get(index);
      } else {
        return candidatesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public Builder setCandidates(
        int index, com.github.iotexproject.grpc.types.CandidateV2 value) {
      if (candidatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCandidatesIsMutable();
        candidates_.set(index, value);
        onChanged();
      } else {
        candidatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public Builder setCandidates(
        int index, com.github.iotexproject.grpc.types.CandidateV2.Builder builderForValue) {
      if (candidatesBuilder_ == null) {
        ensureCandidatesIsMutable();
        candidates_.set(index, builderForValue.build());
        onChanged();
      } else {
        candidatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public Builder addCandidates(com.github.iotexproject.grpc.types.CandidateV2 value) {
      if (candidatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCandidatesIsMutable();
        candidates_.add(value);
        onChanged();
      } else {
        candidatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public Builder addCandidates(
        int index, com.github.iotexproject.grpc.types.CandidateV2 value) {
      if (candidatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCandidatesIsMutable();
        candidates_.add(index, value);
        onChanged();
      } else {
        candidatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public Builder addCandidates(
        com.github.iotexproject.grpc.types.CandidateV2.Builder builderForValue) {
      if (candidatesBuilder_ == null) {
        ensureCandidatesIsMutable();
        candidates_.add(builderForValue.build());
        onChanged();
      } else {
        candidatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public Builder addCandidates(
        int index, com.github.iotexproject.grpc.types.CandidateV2.Builder builderForValue) {
      if (candidatesBuilder_ == null) {
        ensureCandidatesIsMutable();
        candidates_.add(index, builderForValue.build());
        onChanged();
      } else {
        candidatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public Builder addAllCandidates(
        java.lang.Iterable<? extends com.github.iotexproject.grpc.types.CandidateV2> values) {
      if (candidatesBuilder_ == null) {
        ensureCandidatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, candidates_);
        onChanged();
      } else {
        candidatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public Builder clearCandidates() {
      if (candidatesBuilder_ == null) {
        candidates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        candidatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public Builder removeCandidates(int index) {
      if (candidatesBuilder_ == null) {
        ensureCandidatesIsMutable();
        candidates_.remove(index);
        onChanged();
      } else {
        candidatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public com.github.iotexproject.grpc.types.CandidateV2.Builder getCandidatesBuilder(
        int index) {
      return getCandidatesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public com.github.iotexproject.grpc.types.CandidateV2OrBuilder getCandidatesOrBuilder(
        int index) {
      if (candidatesBuilder_ == null) {
        return candidates_.get(index);  } else {
        return candidatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public java.util.List<? extends com.github.iotexproject.grpc.types.CandidateV2OrBuilder> 
         getCandidatesOrBuilderList() {
      if (candidatesBuilder_ != null) {
        return candidatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(candidates_);
      }
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public com.github.iotexproject.grpc.types.CandidateV2.Builder addCandidatesBuilder() {
      return getCandidatesFieldBuilder().addBuilder(
          com.github.iotexproject.grpc.types.CandidateV2.getDefaultInstance());
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public com.github.iotexproject.grpc.types.CandidateV2.Builder addCandidatesBuilder(
        int index) {
      return getCandidatesFieldBuilder().addBuilder(
          index, com.github.iotexproject.grpc.types.CandidateV2.getDefaultInstance());
    }
    /**
     * <code>repeated .iotextypes.CandidateV2 candidates = 1;</code>
     */
    public java.util.List<com.github.iotexproject.grpc.types.CandidateV2.Builder> 
         getCandidatesBuilderList() {
      return getCandidatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.github.iotexproject.grpc.types.CandidateV2, com.github.iotexproject.grpc.types.CandidateV2.Builder, com.github.iotexproject.grpc.types.CandidateV2OrBuilder> 
        getCandidatesFieldBuilder() {
      if (candidatesBuilder_ == null) {
        candidatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.github.iotexproject.grpc.types.CandidateV2, com.github.iotexproject.grpc.types.CandidateV2.Builder, com.github.iotexproject.grpc.types.CandidateV2OrBuilder>(
                candidates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        candidates_ = null;
      }
      return candidatesBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:iotextypes.CandidateListV2)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.CandidateListV2)
  private static final com.github.iotexproject.grpc.types.CandidateListV2 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.CandidateListV2();
  }

  public static com.github.iotexproject.grpc.types.CandidateListV2 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CandidateListV2>
      PARSER = new com.google.protobuf.AbstractParser<CandidateListV2>() {
    @java.lang.Override
    public CandidateListV2 parsePartialFrom(
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

  public static com.google.protobuf.Parser<CandidateListV2> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CandidateListV2> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.CandidateListV2 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

