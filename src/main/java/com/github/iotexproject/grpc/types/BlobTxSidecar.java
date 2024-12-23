// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/types/action.proto

package com.github.iotexproject.grpc.types;

/**
 * Protobuf type {@code iotextypes.BlobTxSidecar}
 */
public final class BlobTxSidecar extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:iotextypes.BlobTxSidecar)
    BlobTxSidecarOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlobTxSidecar.newBuilder() to construct.
  private BlobTxSidecar(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlobTxSidecar() {
    blobs_ = java.util.Collections.emptyList();
    commitments_ = java.util.Collections.emptyList();
    proofs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlobTxSidecar();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlobTxSidecar(
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
              blobs_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000001;
            }
            blobs_.add(input.readBytes());
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              commitments_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000002;
            }
            commitments_.add(input.readBytes());
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              proofs_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000004;
            }
            proofs_.add(input.readBytes());
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
        blobs_ = java.util.Collections.unmodifiableList(blobs_); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        commitments_ = java.util.Collections.unmodifiableList(commitments_); // C
      }
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        proofs_ = java.util.Collections.unmodifiableList(proofs_); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_BlobTxSidecar_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_BlobTxSidecar_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.BlobTxSidecar.class, com.github.iotexproject.grpc.types.BlobTxSidecar.Builder.class);
  }

  public static final int BLOBS_FIELD_NUMBER = 1;
  private java.util.List<com.google.protobuf.ByteString> blobs_;
  /**
   * <pre>
   * Blobs needed by the blob pool
   * </pre>
   *
   * <code>repeated bytes blobs = 1;</code>
   * @return A list containing the blobs.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getBlobsList() {
    return blobs_;
  }
  /**
   * <pre>
   * Blobs needed by the blob pool
   * </pre>
   *
   * <code>repeated bytes blobs = 1;</code>
   * @return The count of blobs.
   */
  public int getBlobsCount() {
    return blobs_.size();
  }
  /**
   * <pre>
   * Blobs needed by the blob pool
   * </pre>
   *
   * <code>repeated bytes blobs = 1;</code>
   * @param index The index of the element to return.
   * @return The blobs at the given index.
   */
  public com.google.protobuf.ByteString getBlobs(int index) {
    return blobs_.get(index);
  }

  public static final int COMMITMENTS_FIELD_NUMBER = 2;
  private java.util.List<com.google.protobuf.ByteString> commitments_;
  /**
   * <pre>
   * Commitments needed by the blob pool
   * </pre>
   *
   * <code>repeated bytes commitments = 2;</code>
   * @return A list containing the commitments.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getCommitmentsList() {
    return commitments_;
  }
  /**
   * <pre>
   * Commitments needed by the blob pool
   * </pre>
   *
   * <code>repeated bytes commitments = 2;</code>
   * @return The count of commitments.
   */
  public int getCommitmentsCount() {
    return commitments_.size();
  }
  /**
   * <pre>
   * Commitments needed by the blob pool
   * </pre>
   *
   * <code>repeated bytes commitments = 2;</code>
   * @param index The index of the element to return.
   * @return The commitments at the given index.
   */
  public com.google.protobuf.ByteString getCommitments(int index) {
    return commitments_.get(index);
  }

  public static final int PROOFS_FIELD_NUMBER = 3;
  private java.util.List<com.google.protobuf.ByteString> proofs_;
  /**
   * <pre>
   * Proofs needed by the blob pool
   * </pre>
   *
   * <code>repeated bytes proofs = 3;</code>
   * @return A list containing the proofs.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getProofsList() {
    return proofs_;
  }
  /**
   * <pre>
   * Proofs needed by the blob pool
   * </pre>
   *
   * <code>repeated bytes proofs = 3;</code>
   * @return The count of proofs.
   */
  public int getProofsCount() {
    return proofs_.size();
  }
  /**
   * <pre>
   * Proofs needed by the blob pool
   * </pre>
   *
   * <code>repeated bytes proofs = 3;</code>
   * @param index The index of the element to return.
   * @return The proofs at the given index.
   */
  public com.google.protobuf.ByteString getProofs(int index) {
    return proofs_.get(index);
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
    for (int i = 0; i < blobs_.size(); i++) {
      output.writeBytes(1, blobs_.get(i));
    }
    for (int i = 0; i < commitments_.size(); i++) {
      output.writeBytes(2, commitments_.get(i));
    }
    for (int i = 0; i < proofs_.size(); i++) {
      output.writeBytes(3, proofs_.get(i));
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
      for (int i = 0; i < blobs_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(blobs_.get(i));
      }
      size += dataSize;
      size += 1 * getBlobsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < commitments_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(commitments_.get(i));
      }
      size += dataSize;
      size += 1 * getCommitmentsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < proofs_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(proofs_.get(i));
      }
      size += dataSize;
      size += 1 * getProofsList().size();
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.BlobTxSidecar)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.BlobTxSidecar other = (com.github.iotexproject.grpc.types.BlobTxSidecar) obj;

    if (!getBlobsList()
        .equals(other.getBlobsList())) return false;
    if (!getCommitmentsList()
        .equals(other.getCommitmentsList())) return false;
    if (!getProofsList()
        .equals(other.getProofsList())) return false;
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
    if (getBlobsCount() > 0) {
      hash = (37 * hash) + BLOBS_FIELD_NUMBER;
      hash = (53 * hash) + getBlobsList().hashCode();
    }
    if (getCommitmentsCount() > 0) {
      hash = (37 * hash) + COMMITMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getCommitmentsList().hashCode();
    }
    if (getProofsCount() > 0) {
      hash = (37 * hash) + PROOFS_FIELD_NUMBER;
      hash = (53 * hash) + getProofsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.BlobTxSidecar parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.BlobTxSidecar parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.BlobTxSidecar parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.BlobTxSidecar parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.BlobTxSidecar parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.BlobTxSidecar parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.BlobTxSidecar parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.BlobTxSidecar parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.BlobTxSidecar parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.BlobTxSidecar parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.BlobTxSidecar parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.BlobTxSidecar parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.BlobTxSidecar prototype) {
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
   * Protobuf type {@code iotextypes.BlobTxSidecar}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.BlobTxSidecar)
      com.github.iotexproject.grpc.types.BlobTxSidecarOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_BlobTxSidecar_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_BlobTxSidecar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.BlobTxSidecar.class, com.github.iotexproject.grpc.types.BlobTxSidecar.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.BlobTxSidecar.newBuilder()
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
      blobs_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      commitments_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      proofs_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.ActionOuterClass.internal_static_iotextypes_BlobTxSidecar_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.BlobTxSidecar getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.BlobTxSidecar.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.BlobTxSidecar build() {
      com.github.iotexproject.grpc.types.BlobTxSidecar result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.BlobTxSidecar buildPartial() {
      com.github.iotexproject.grpc.types.BlobTxSidecar result = new com.github.iotexproject.grpc.types.BlobTxSidecar(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        blobs_ = java.util.Collections.unmodifiableList(blobs_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.blobs_ = blobs_;
      if (((bitField0_ & 0x00000002) != 0)) {
        commitments_ = java.util.Collections.unmodifiableList(commitments_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.commitments_ = commitments_;
      if (((bitField0_ & 0x00000004) != 0)) {
        proofs_ = java.util.Collections.unmodifiableList(proofs_);
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.proofs_ = proofs_;
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
      if (other instanceof com.github.iotexproject.grpc.types.BlobTxSidecar) {
        return mergeFrom((com.github.iotexproject.grpc.types.BlobTxSidecar)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.BlobTxSidecar other) {
      if (other == com.github.iotexproject.grpc.types.BlobTxSidecar.getDefaultInstance()) return this;
      if (!other.blobs_.isEmpty()) {
        if (blobs_.isEmpty()) {
          blobs_ = other.blobs_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureBlobsIsMutable();
          blobs_.addAll(other.blobs_);
        }
        onChanged();
      }
      if (!other.commitments_.isEmpty()) {
        if (commitments_.isEmpty()) {
          commitments_ = other.commitments_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureCommitmentsIsMutable();
          commitments_.addAll(other.commitments_);
        }
        onChanged();
      }
      if (!other.proofs_.isEmpty()) {
        if (proofs_.isEmpty()) {
          proofs_ = other.proofs_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureProofsIsMutable();
          proofs_.addAll(other.proofs_);
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
      com.github.iotexproject.grpc.types.BlobTxSidecar parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.iotexproject.grpc.types.BlobTxSidecar) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.protobuf.ByteString> blobs_ = java.util.Collections.emptyList();
    private void ensureBlobsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        blobs_ = new java.util.ArrayList<com.google.protobuf.ByteString>(blobs_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Blobs needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes blobs = 1;</code>
     * @return A list containing the blobs.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getBlobsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(blobs_) : blobs_;
    }
    /**
     * <pre>
     * Blobs needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes blobs = 1;</code>
     * @return The count of blobs.
     */
    public int getBlobsCount() {
      return blobs_.size();
    }
    /**
     * <pre>
     * Blobs needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes blobs = 1;</code>
     * @param index The index of the element to return.
     * @return The blobs at the given index.
     */
    public com.google.protobuf.ByteString getBlobs(int index) {
      return blobs_.get(index);
    }
    /**
     * <pre>
     * Blobs needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes blobs = 1;</code>
     * @param index The index to set the value at.
     * @param value The blobs to set.
     * @return This builder for chaining.
     */
    public Builder setBlobs(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBlobsIsMutable();
      blobs_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Blobs needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes blobs = 1;</code>
     * @param value The blobs to add.
     * @return This builder for chaining.
     */
    public Builder addBlobs(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBlobsIsMutable();
      blobs_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Blobs needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes blobs = 1;</code>
     * @param values The blobs to add.
     * @return This builder for chaining.
     */
    public Builder addAllBlobs(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureBlobsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, blobs_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Blobs needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes blobs = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlobs() {
      blobs_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.ByteString> commitments_ = java.util.Collections.emptyList();
    private void ensureCommitmentsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        commitments_ = new java.util.ArrayList<com.google.protobuf.ByteString>(commitments_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * Commitments needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes commitments = 2;</code>
     * @return A list containing the commitments.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getCommitmentsList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(commitments_) : commitments_;
    }
    /**
     * <pre>
     * Commitments needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes commitments = 2;</code>
     * @return The count of commitments.
     */
    public int getCommitmentsCount() {
      return commitments_.size();
    }
    /**
     * <pre>
     * Commitments needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes commitments = 2;</code>
     * @param index The index of the element to return.
     * @return The commitments at the given index.
     */
    public com.google.protobuf.ByteString getCommitments(int index) {
      return commitments_.get(index);
    }
    /**
     * <pre>
     * Commitments needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes commitments = 2;</code>
     * @param index The index to set the value at.
     * @param value The commitments to set.
     * @return This builder for chaining.
     */
    public Builder setCommitments(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCommitmentsIsMutable();
      commitments_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Commitments needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes commitments = 2;</code>
     * @param value The commitments to add.
     * @return This builder for chaining.
     */
    public Builder addCommitments(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCommitmentsIsMutable();
      commitments_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Commitments needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes commitments = 2;</code>
     * @param values The commitments to add.
     * @return This builder for chaining.
     */
    public Builder addAllCommitments(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureCommitmentsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, commitments_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Commitments needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes commitments = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommitments() {
      commitments_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.ByteString> proofs_ = java.util.Collections.emptyList();
    private void ensureProofsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        proofs_ = new java.util.ArrayList<com.google.protobuf.ByteString>(proofs_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * Proofs needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes proofs = 3;</code>
     * @return A list containing the proofs.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getProofsList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(proofs_) : proofs_;
    }
    /**
     * <pre>
     * Proofs needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes proofs = 3;</code>
     * @return The count of proofs.
     */
    public int getProofsCount() {
      return proofs_.size();
    }
    /**
     * <pre>
     * Proofs needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes proofs = 3;</code>
     * @param index The index of the element to return.
     * @return The proofs at the given index.
     */
    public com.google.protobuf.ByteString getProofs(int index) {
      return proofs_.get(index);
    }
    /**
     * <pre>
     * Proofs needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes proofs = 3;</code>
     * @param index The index to set the value at.
     * @param value The proofs to set.
     * @return This builder for chaining.
     */
    public Builder setProofs(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureProofsIsMutable();
      proofs_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Proofs needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes proofs = 3;</code>
     * @param value The proofs to add.
     * @return This builder for chaining.
     */
    public Builder addProofs(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureProofsIsMutable();
      proofs_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Proofs needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes proofs = 3;</code>
     * @param values The proofs to add.
     * @return This builder for chaining.
     */
    public Builder addAllProofs(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureProofsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, proofs_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Proofs needed by the blob pool
     * </pre>
     *
     * <code>repeated bytes proofs = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearProofs() {
      proofs_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
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


    // @@protoc_insertion_point(builder_scope:iotextypes.BlobTxSidecar)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.BlobTxSidecar)
  private static final com.github.iotexproject.grpc.types.BlobTxSidecar DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.BlobTxSidecar();
  }

  public static com.github.iotexproject.grpc.types.BlobTxSidecar getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlobTxSidecar>
      PARSER = new com.google.protobuf.AbstractParser<BlobTxSidecar>() {
    @java.lang.Override
    public BlobTxSidecar parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlobTxSidecar(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlobTxSidecar> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlobTxSidecar> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.BlobTxSidecar getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

