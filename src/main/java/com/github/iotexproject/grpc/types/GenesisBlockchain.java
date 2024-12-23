// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/types/genesis.proto

package com.github.iotexproject.grpc.types;

/**
 * Protobuf type {@code iotextypes.GenesisBlockchain}
 */
public final class GenesisBlockchain extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:iotextypes.GenesisBlockchain)
    GenesisBlockchainOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisBlockchain.newBuilder() to construct.
  private GenesisBlockchain(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisBlockchain() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisBlockchain();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GenesisBlockchain(
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
          case 8: {

            timestamp_ = input.readInt64();
            break;
          }
          case 16: {

            blockGasLimit_ = input.readUInt64();
            break;
          }
          case 24: {

            actionGasLimit_ = input.readUInt64();
            break;
          }
          case 32: {

            blockInterval_ = input.readInt64();
            break;
          }
          case 40: {

            numSubEpochs_ = input.readUInt64();
            break;
          }
          case 48: {

            numDelegates_ = input.readUInt64();
            break;
          }
          case 56: {

            numCandidateDelegates_ = input.readUInt64();
            break;
          }
          case 64: {

            timeBasedRotation_ = input.readBool();
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
    return com.github.iotexproject.grpc.types.GenesisOuterClass.internal_static_iotextypes_GenesisBlockchain_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.GenesisOuterClass.internal_static_iotextypes_GenesisBlockchain_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.GenesisBlockchain.class, com.github.iotexproject.grpc.types.GenesisBlockchain.Builder.class);
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  private long timestamp_;
  /**
   * <code>int64 timestamp = 1;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int BLOCKGASLIMIT_FIELD_NUMBER = 2;
  private long blockGasLimit_;
  /**
   * <code>uint64 blockGasLimit = 2;</code>
   * @return The blockGasLimit.
   */
  @java.lang.Override
  public long getBlockGasLimit() {
    return blockGasLimit_;
  }

  public static final int ACTIONGASLIMIT_FIELD_NUMBER = 3;
  private long actionGasLimit_;
  /**
   * <code>uint64 actionGasLimit = 3;</code>
   * @return The actionGasLimit.
   */
  @java.lang.Override
  public long getActionGasLimit() {
    return actionGasLimit_;
  }

  public static final int BLOCKINTERVAL_FIELD_NUMBER = 4;
  private long blockInterval_;
  /**
   * <code>int64 blockInterval = 4;</code>
   * @return The blockInterval.
   */
  @java.lang.Override
  public long getBlockInterval() {
    return blockInterval_;
  }

  public static final int NUMSUBEPOCHS_FIELD_NUMBER = 5;
  private long numSubEpochs_;
  /**
   * <code>uint64 numSubEpochs = 5;</code>
   * @return The numSubEpochs.
   */
  @java.lang.Override
  public long getNumSubEpochs() {
    return numSubEpochs_;
  }

  public static final int NUMDELEGATES_FIELD_NUMBER = 6;
  private long numDelegates_;
  /**
   * <code>uint64 numDelegates = 6;</code>
   * @return The numDelegates.
   */
  @java.lang.Override
  public long getNumDelegates() {
    return numDelegates_;
  }

  public static final int NUMCANDIDATEDELEGATES_FIELD_NUMBER = 7;
  private long numCandidateDelegates_;
  /**
   * <code>uint64 numCandidateDelegates = 7;</code>
   * @return The numCandidateDelegates.
   */
  @java.lang.Override
  public long getNumCandidateDelegates() {
    return numCandidateDelegates_;
  }

  public static final int TIMEBASEDROTATION_FIELD_NUMBER = 8;
  private boolean timeBasedRotation_;
  /**
   * <code>bool timeBasedRotation = 8;</code>
   * @return The timeBasedRotation.
   */
  @java.lang.Override
  public boolean getTimeBasedRotation() {
    return timeBasedRotation_;
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
    if (timestamp_ != 0L) {
      output.writeInt64(1, timestamp_);
    }
    if (blockGasLimit_ != 0L) {
      output.writeUInt64(2, blockGasLimit_);
    }
    if (actionGasLimit_ != 0L) {
      output.writeUInt64(3, actionGasLimit_);
    }
    if (blockInterval_ != 0L) {
      output.writeInt64(4, blockInterval_);
    }
    if (numSubEpochs_ != 0L) {
      output.writeUInt64(5, numSubEpochs_);
    }
    if (numDelegates_ != 0L) {
      output.writeUInt64(6, numDelegates_);
    }
    if (numCandidateDelegates_ != 0L) {
      output.writeUInt64(7, numCandidateDelegates_);
    }
    if (timeBasedRotation_ != false) {
      output.writeBool(8, timeBasedRotation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, timestamp_);
    }
    if (blockGasLimit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, blockGasLimit_);
    }
    if (actionGasLimit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, actionGasLimit_);
    }
    if (blockInterval_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, blockInterval_);
    }
    if (numSubEpochs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, numSubEpochs_);
    }
    if (numDelegates_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, numDelegates_);
    }
    if (numCandidateDelegates_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(7, numCandidateDelegates_);
    }
    if (timeBasedRotation_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, timeBasedRotation_);
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.GenesisBlockchain)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.GenesisBlockchain other = (com.github.iotexproject.grpc.types.GenesisBlockchain) obj;

    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (getBlockGasLimit()
        != other.getBlockGasLimit()) return false;
    if (getActionGasLimit()
        != other.getActionGasLimit()) return false;
    if (getBlockInterval()
        != other.getBlockInterval()) return false;
    if (getNumSubEpochs()
        != other.getNumSubEpochs()) return false;
    if (getNumDelegates()
        != other.getNumDelegates()) return false;
    if (getNumCandidateDelegates()
        != other.getNumCandidateDelegates()) return false;
    if (getTimeBasedRotation()
        != other.getTimeBasedRotation()) return false;
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
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + BLOCKGASLIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBlockGasLimit());
    hash = (37 * hash) + ACTIONGASLIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getActionGasLimit());
    hash = (37 * hash) + BLOCKINTERVAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBlockInterval());
    hash = (37 * hash) + NUMSUBEPOCHS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumSubEpochs());
    hash = (37 * hash) + NUMDELEGATES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumDelegates());
    hash = (37 * hash) + NUMCANDIDATEDELEGATES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumCandidateDelegates());
    hash = (37 * hash) + TIMEBASEDROTATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getTimeBasedRotation());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.GenesisBlockchain parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.GenesisBlockchain parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.GenesisBlockchain parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.GenesisBlockchain parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.GenesisBlockchain parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.GenesisBlockchain parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.GenesisBlockchain parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.GenesisBlockchain parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.GenesisBlockchain parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.GenesisBlockchain parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.GenesisBlockchain parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.GenesisBlockchain parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.GenesisBlockchain prototype) {
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
   * Protobuf type {@code iotextypes.GenesisBlockchain}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.GenesisBlockchain)
      com.github.iotexproject.grpc.types.GenesisBlockchainOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.GenesisOuterClass.internal_static_iotextypes_GenesisBlockchain_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.GenesisOuterClass.internal_static_iotextypes_GenesisBlockchain_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.GenesisBlockchain.class, com.github.iotexproject.grpc.types.GenesisBlockchain.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.GenesisBlockchain.newBuilder()
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
      timestamp_ = 0L;

      blockGasLimit_ = 0L;

      actionGasLimit_ = 0L;

      blockInterval_ = 0L;

      numSubEpochs_ = 0L;

      numDelegates_ = 0L;

      numCandidateDelegates_ = 0L;

      timeBasedRotation_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.GenesisOuterClass.internal_static_iotextypes_GenesisBlockchain_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.GenesisBlockchain getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.GenesisBlockchain.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.GenesisBlockchain build() {
      com.github.iotexproject.grpc.types.GenesisBlockchain result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.GenesisBlockchain buildPartial() {
      com.github.iotexproject.grpc.types.GenesisBlockchain result = new com.github.iotexproject.grpc.types.GenesisBlockchain(this);
      result.timestamp_ = timestamp_;
      result.blockGasLimit_ = blockGasLimit_;
      result.actionGasLimit_ = actionGasLimit_;
      result.blockInterval_ = blockInterval_;
      result.numSubEpochs_ = numSubEpochs_;
      result.numDelegates_ = numDelegates_;
      result.numCandidateDelegates_ = numCandidateDelegates_;
      result.timeBasedRotation_ = timeBasedRotation_;
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
      if (other instanceof com.github.iotexproject.grpc.types.GenesisBlockchain) {
        return mergeFrom((com.github.iotexproject.grpc.types.GenesisBlockchain)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.GenesisBlockchain other) {
      if (other == com.github.iotexproject.grpc.types.GenesisBlockchain.getDefaultInstance()) return this;
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (other.getBlockGasLimit() != 0L) {
        setBlockGasLimit(other.getBlockGasLimit());
      }
      if (other.getActionGasLimit() != 0L) {
        setActionGasLimit(other.getActionGasLimit());
      }
      if (other.getBlockInterval() != 0L) {
        setBlockInterval(other.getBlockInterval());
      }
      if (other.getNumSubEpochs() != 0L) {
        setNumSubEpochs(other.getNumSubEpochs());
      }
      if (other.getNumDelegates() != 0L) {
        setNumDelegates(other.getNumDelegates());
      }
      if (other.getNumCandidateDelegates() != 0L) {
        setNumCandidateDelegates(other.getNumCandidateDelegates());
      }
      if (other.getTimeBasedRotation() != false) {
        setTimeBasedRotation(other.getTimeBasedRotation());
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
      com.github.iotexproject.grpc.types.GenesisBlockchain parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.iotexproject.grpc.types.GenesisBlockchain) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>int64 timestamp = 1;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int64 timestamp = 1;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private long blockGasLimit_ ;
    /**
     * <code>uint64 blockGasLimit = 2;</code>
     * @return The blockGasLimit.
     */
    @java.lang.Override
    public long getBlockGasLimit() {
      return blockGasLimit_;
    }
    /**
     * <code>uint64 blockGasLimit = 2;</code>
     * @param value The blockGasLimit to set.
     * @return This builder for chaining.
     */
    public Builder setBlockGasLimit(long value) {
      
      blockGasLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 blockGasLimit = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockGasLimit() {
      
      blockGasLimit_ = 0L;
      onChanged();
      return this;
    }

    private long actionGasLimit_ ;
    /**
     * <code>uint64 actionGasLimit = 3;</code>
     * @return The actionGasLimit.
     */
    @java.lang.Override
    public long getActionGasLimit() {
      return actionGasLimit_;
    }
    /**
     * <code>uint64 actionGasLimit = 3;</code>
     * @param value The actionGasLimit to set.
     * @return This builder for chaining.
     */
    public Builder setActionGasLimit(long value) {
      
      actionGasLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 actionGasLimit = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearActionGasLimit() {
      
      actionGasLimit_ = 0L;
      onChanged();
      return this;
    }

    private long blockInterval_ ;
    /**
     * <code>int64 blockInterval = 4;</code>
     * @return The blockInterval.
     */
    @java.lang.Override
    public long getBlockInterval() {
      return blockInterval_;
    }
    /**
     * <code>int64 blockInterval = 4;</code>
     * @param value The blockInterval to set.
     * @return This builder for chaining.
     */
    public Builder setBlockInterval(long value) {
      
      blockInterval_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 blockInterval = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockInterval() {
      
      blockInterval_ = 0L;
      onChanged();
      return this;
    }

    private long numSubEpochs_ ;
    /**
     * <code>uint64 numSubEpochs = 5;</code>
     * @return The numSubEpochs.
     */
    @java.lang.Override
    public long getNumSubEpochs() {
      return numSubEpochs_;
    }
    /**
     * <code>uint64 numSubEpochs = 5;</code>
     * @param value The numSubEpochs to set.
     * @return This builder for chaining.
     */
    public Builder setNumSubEpochs(long value) {
      
      numSubEpochs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 numSubEpochs = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumSubEpochs() {
      
      numSubEpochs_ = 0L;
      onChanged();
      return this;
    }

    private long numDelegates_ ;
    /**
     * <code>uint64 numDelegates = 6;</code>
     * @return The numDelegates.
     */
    @java.lang.Override
    public long getNumDelegates() {
      return numDelegates_;
    }
    /**
     * <code>uint64 numDelegates = 6;</code>
     * @param value The numDelegates to set.
     * @return This builder for chaining.
     */
    public Builder setNumDelegates(long value) {
      
      numDelegates_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 numDelegates = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumDelegates() {
      
      numDelegates_ = 0L;
      onChanged();
      return this;
    }

    private long numCandidateDelegates_ ;
    /**
     * <code>uint64 numCandidateDelegates = 7;</code>
     * @return The numCandidateDelegates.
     */
    @java.lang.Override
    public long getNumCandidateDelegates() {
      return numCandidateDelegates_;
    }
    /**
     * <code>uint64 numCandidateDelegates = 7;</code>
     * @param value The numCandidateDelegates to set.
     * @return This builder for chaining.
     */
    public Builder setNumCandidateDelegates(long value) {
      
      numCandidateDelegates_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 numCandidateDelegates = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumCandidateDelegates() {
      
      numCandidateDelegates_ = 0L;
      onChanged();
      return this;
    }

    private boolean timeBasedRotation_ ;
    /**
     * <code>bool timeBasedRotation = 8;</code>
     * @return The timeBasedRotation.
     */
    @java.lang.Override
    public boolean getTimeBasedRotation() {
      return timeBasedRotation_;
    }
    /**
     * <code>bool timeBasedRotation = 8;</code>
     * @param value The timeBasedRotation to set.
     * @return This builder for chaining.
     */
    public Builder setTimeBasedRotation(boolean value) {
      
      timeBasedRotation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool timeBasedRotation = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeBasedRotation() {
      
      timeBasedRotation_ = false;
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


    // @@protoc_insertion_point(builder_scope:iotextypes.GenesisBlockchain)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.GenesisBlockchain)
  private static final com.github.iotexproject.grpc.types.GenesisBlockchain DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.GenesisBlockchain();
  }

  public static com.github.iotexproject.grpc.types.GenesisBlockchain getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisBlockchain>
      PARSER = new com.google.protobuf.AbstractParser<GenesisBlockchain>() {
    @java.lang.Override
    public GenesisBlockchain parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GenesisBlockchain(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GenesisBlockchain> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenesisBlockchain> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.GenesisBlockchain getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

