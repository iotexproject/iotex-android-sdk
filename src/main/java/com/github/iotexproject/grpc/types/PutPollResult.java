// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/action.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * Protobuf type {@code iotextypes.PutPollResult}
 */
public final class PutPollResult extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotextypes.PutPollResult)
    PutPollResultOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      PutPollResult.class.getName());
  }
  // Use PutPollResult.newBuilder() to construct.
  private PutPollResult(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PutPollResult() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_PutPollResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_PutPollResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.PutPollResult.class, com.github.iotexproject.grpc.types.PutPollResult.Builder.class);
  }

  private int bitField0_;
  public static final int HEIGHT_FIELD_NUMBER = 1;
  private long height_ = 0L;
  /**
   * <code>uint64 height = 1;</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int CANDIDATES_FIELD_NUMBER = 2;
  private com.github.iotexproject.grpc.types.CandidateList candidates_;
  /**
   * <code>.iotextypes.CandidateList candidates = 2;</code>
   * @return Whether the candidates field is set.
   */
  @java.lang.Override
  public boolean hasCandidates() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.iotextypes.CandidateList candidates = 2;</code>
   * @return The candidates.
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.CandidateList getCandidates() {
    return candidates_ == null ? com.github.iotexproject.grpc.types.CandidateList.getDefaultInstance() : candidates_;
  }
  /**
   * <code>.iotextypes.CandidateList candidates = 2;</code>
   */
  @java.lang.Override
  public com.github.iotexproject.grpc.types.CandidateListOrBuilder getCandidatesOrBuilder() {
    return candidates_ == null ? com.github.iotexproject.grpc.types.CandidateList.getDefaultInstance() : candidates_;
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
    if (height_ != 0L) {
      output.writeUInt64(1, height_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getCandidates());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, height_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCandidates());
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.PutPollResult)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.PutPollResult other = (com.github.iotexproject.grpc.types.PutPollResult) obj;

    if (getHeight()
        != other.getHeight()) return false;
    if (hasCandidates() != other.hasCandidates()) return false;
    if (hasCandidates()) {
      if (!getCandidates()
          .equals(other.getCandidates())) return false;
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
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    if (hasCandidates()) {
      hash = (37 * hash) + CANDIDATES_FIELD_NUMBER;
      hash = (53 * hash) + getCandidates().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.PutPollResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.PutPollResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.PutPollResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.PutPollResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.PutPollResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.PutPollResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.PutPollResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.PutPollResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.types.PutPollResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.types.PutPollResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.PutPollResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.PutPollResult parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.PutPollResult prototype) {
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
   * Protobuf type {@code iotextypes.PutPollResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.PutPollResult)
      com.github.iotexproject.grpc.types.PutPollResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_PutPollResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_PutPollResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.PutPollResult.class, com.github.iotexproject.grpc.types.PutPollResult.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.PutPollResult.newBuilder()
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
        getCandidatesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      height_ = 0L;
      candidates_ = null;
      if (candidatesBuilder_ != null) {
        candidatesBuilder_.dispose();
        candidatesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_PutPollResult_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.PutPollResult getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.PutPollResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.PutPollResult build() {
      com.github.iotexproject.grpc.types.PutPollResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.PutPollResult buildPartial() {
      com.github.iotexproject.grpc.types.PutPollResult result = new com.github.iotexproject.grpc.types.PutPollResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.types.PutPollResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.height_ = height_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.candidates_ = candidatesBuilder_ == null
            ? candidates_
            : candidatesBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.PutPollResult) {
        return mergeFrom((com.github.iotexproject.grpc.types.PutPollResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.PutPollResult other) {
      if (other == com.github.iotexproject.grpc.types.PutPollResult.getDefaultInstance()) return this;
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (other.hasCandidates()) {
        mergeCandidates(other.getCandidates());
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
              height_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getCandidatesFieldBuilder().getBuilder(),
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

    private long height_ ;
    /**
     * <code>uint64 height = 1;</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <code>uint64 height = 1;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {

      height_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 height = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000001);
      height_ = 0L;
      onChanged();
      return this;
    }

    private com.github.iotexproject.grpc.types.CandidateList candidates_;
    private com.google.protobuf.SingleFieldBuilder<
        com.github.iotexproject.grpc.types.CandidateList, com.github.iotexproject.grpc.types.CandidateList.Builder, com.github.iotexproject.grpc.types.CandidateListOrBuilder> candidatesBuilder_;
    /**
     * <code>.iotextypes.CandidateList candidates = 2;</code>
     * @return Whether the candidates field is set.
     */
    public boolean hasCandidates() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.iotextypes.CandidateList candidates = 2;</code>
     * @return The candidates.
     */
    public com.github.iotexproject.grpc.types.CandidateList getCandidates() {
      if (candidatesBuilder_ == null) {
        return candidates_ == null ? com.github.iotexproject.grpc.types.CandidateList.getDefaultInstance() : candidates_;
      } else {
        return candidatesBuilder_.getMessage();
      }
    }
    /**
     * <code>.iotextypes.CandidateList candidates = 2;</code>
     */
    public Builder setCandidates(com.github.iotexproject.grpc.types.CandidateList value) {
      if (candidatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        candidates_ = value;
      } else {
        candidatesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.CandidateList candidates = 2;</code>
     */
    public Builder setCandidates(
        com.github.iotexproject.grpc.types.CandidateList.Builder builderForValue) {
      if (candidatesBuilder_ == null) {
        candidates_ = builderForValue.build();
      } else {
        candidatesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.CandidateList candidates = 2;</code>
     */
    public Builder mergeCandidates(com.github.iotexproject.grpc.types.CandidateList value) {
      if (candidatesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          candidates_ != null &&
          candidates_ != com.github.iotexproject.grpc.types.CandidateList.getDefaultInstance()) {
          getCandidatesBuilder().mergeFrom(value);
        } else {
          candidates_ = value;
        }
      } else {
        candidatesBuilder_.mergeFrom(value);
      }
      if (candidates_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.iotextypes.CandidateList candidates = 2;</code>
     */
    public Builder clearCandidates() {
      bitField0_ = (bitField0_ & ~0x00000002);
      candidates_ = null;
      if (candidatesBuilder_ != null) {
        candidatesBuilder_.dispose();
        candidatesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.iotextypes.CandidateList candidates = 2;</code>
     */
    public com.github.iotexproject.grpc.types.CandidateList.Builder getCandidatesBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCandidatesFieldBuilder().getBuilder();
    }
    /**
     * <code>.iotextypes.CandidateList candidates = 2;</code>
     */
    public com.github.iotexproject.grpc.types.CandidateListOrBuilder getCandidatesOrBuilder() {
      if (candidatesBuilder_ != null) {
        return candidatesBuilder_.getMessageOrBuilder();
      } else {
        return candidates_ == null ?
            com.github.iotexproject.grpc.types.CandidateList.getDefaultInstance() : candidates_;
      }
    }
    /**
     * <code>.iotextypes.CandidateList candidates = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.github.iotexproject.grpc.types.CandidateList, com.github.iotexproject.grpc.types.CandidateList.Builder, com.github.iotexproject.grpc.types.CandidateListOrBuilder> 
        getCandidatesFieldBuilder() {
      if (candidatesBuilder_ == null) {
        candidatesBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.github.iotexproject.grpc.types.CandidateList, com.github.iotexproject.grpc.types.CandidateList.Builder, com.github.iotexproject.grpc.types.CandidateListOrBuilder>(
                getCandidates(),
                getParentForChildren(),
                isClean());
        candidates_ = null;
      }
      return candidatesBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:iotextypes.PutPollResult)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.PutPollResult)
  private static final com.github.iotexproject.grpc.types.PutPollResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.PutPollResult();
  }

  public static com.github.iotexproject.grpc.types.PutPollResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PutPollResult>
      PARSER = new com.google.protobuf.AbstractParser<PutPollResult>() {
    @java.lang.Override
    public PutPollResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<PutPollResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PutPollResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.PutPollResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
