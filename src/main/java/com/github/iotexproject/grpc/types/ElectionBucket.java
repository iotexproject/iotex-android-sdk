// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/types/election.proto

package com.github.iotexproject.grpc.types;

/**
 * Protobuf type {@code iotextypes.ElectionBucket}
 */
public final class ElectionBucket extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:iotextypes.ElectionBucket)
    ElectionBucketOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ElectionBucket.newBuilder() to construct.
  private ElectionBucket(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ElectionBucket() {
    voter_ = com.google.protobuf.ByteString.EMPTY;
    candidate_ = com.google.protobuf.ByteString.EMPTY;
    amount_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ElectionBucket();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ElectionBucket(
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
          case 10: {

            voter_ = input.readBytes();
            break;
          }
          case 18: {

            candidate_ = input.readBytes();
            break;
          }
          case 26: {

            amount_ = input.readBytes();
            break;
          }
          case 34: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (startTime_ != null) {
              subBuilder = startTime_.toBuilder();
            }
            startTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(startTime_);
              startTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 42: {
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (duration_ != null) {
              subBuilder = duration_.toBuilder();
            }
            duration_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(duration_);
              duration_ = subBuilder.buildPartial();
            }

            break;
          }
          case 48: {

            decay_ = input.readBool();
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
    return com.github.iotexproject.grpc.types.Election.internal_static_iotextypes_ElectionBucket_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.Election.internal_static_iotextypes_ElectionBucket_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.ElectionBucket.class, com.github.iotexproject.grpc.types.ElectionBucket.Builder.class);
  }

  public static final int VOTER_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString voter_;
  /**
   * <code>bytes voter = 1;</code>
   * @return The voter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVoter() {
    return voter_;
  }

  public static final int CANDIDATE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString candidate_;
  /**
   * <code>bytes candidate = 2;</code>
   * @return The candidate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCandidate() {
    return candidate_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString amount_;
  /**
   * <code>bytes amount = 3;</code>
   * @return The amount.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAmount() {
    return amount_;
  }

  public static final int STARTTIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp startTime_;
  /**
   * <code>.google.protobuf.Timestamp startTime = 4;</code>
   * @return Whether the startTime field is set.
   */
  @java.lang.Override
  public boolean hasStartTime() {
    return startTime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp startTime = 4;</code>
   * @return The startTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStartTime() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }
  /**
   * <code>.google.protobuf.Timestamp startTime = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
    return getStartTime();
  }

  public static final int DURATION_FIELD_NUMBER = 5;
  private com.google.protobuf.Duration duration_;
  /**
   * <code>.google.protobuf.Duration duration = 5;</code>
   * @return Whether the duration field is set.
   */
  @java.lang.Override
  public boolean hasDuration() {
    return duration_ != null;
  }
  /**
   * <code>.google.protobuf.Duration duration = 5;</code>
   * @return The duration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getDuration() {
    return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
  }
  /**
   * <code>.google.protobuf.Duration duration = 5;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
    return getDuration();
  }

  public static final int DECAY_FIELD_NUMBER = 6;
  private boolean decay_;
  /**
   * <code>bool decay = 6;</code>
   * @return The decay.
   */
  @java.lang.Override
  public boolean getDecay() {
    return decay_;
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
    if (!voter_.isEmpty()) {
      output.writeBytes(1, voter_);
    }
    if (!candidate_.isEmpty()) {
      output.writeBytes(2, candidate_);
    }
    if (!amount_.isEmpty()) {
      output.writeBytes(3, amount_);
    }
    if (startTime_ != null) {
      output.writeMessage(4, getStartTime());
    }
    if (duration_ != null) {
      output.writeMessage(5, getDuration());
    }
    if (decay_ != false) {
      output.writeBool(6, decay_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!voter_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, voter_);
    }
    if (!candidate_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, candidate_);
    }
    if (!amount_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, amount_);
    }
    if (startTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getStartTime());
    }
    if (duration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getDuration());
    }
    if (decay_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, decay_);
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.ElectionBucket)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.ElectionBucket other = (com.github.iotexproject.grpc.types.ElectionBucket) obj;

    if (!getVoter()
        .equals(other.getVoter())) return false;
    if (!getCandidate()
        .equals(other.getCandidate())) return false;
    if (!getAmount()
        .equals(other.getAmount())) return false;
    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime()
          .equals(other.getStartTime())) return false;
    }
    if (hasDuration() != other.hasDuration()) return false;
    if (hasDuration()) {
      if (!getDuration()
          .equals(other.getDuration())) return false;
    }
    if (getDecay()
        != other.getDecay()) return false;
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
    hash = (37 * hash) + VOTER_FIELD_NUMBER;
    hash = (53 * hash) + getVoter().hashCode();
    hash = (37 * hash) + CANDIDATE_FIELD_NUMBER;
    hash = (53 * hash) + getCandidate().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount().hashCode();
    if (hasStartTime()) {
      hash = (37 * hash) + STARTTIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    if (hasDuration()) {
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDuration().hashCode();
    }
    hash = (37 * hash) + DECAY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDecay());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.ElectionBucket parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.ElectionBucket parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.ElectionBucket parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.ElectionBucket parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.ElectionBucket parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.ElectionBucket parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.ElectionBucket parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.ElectionBucket parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.ElectionBucket parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.ElectionBucket parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.ElectionBucket parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.ElectionBucket parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.ElectionBucket prototype) {
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
   * Protobuf type {@code iotextypes.ElectionBucket}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.ElectionBucket)
      com.github.iotexproject.grpc.types.ElectionBucketOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.Election.internal_static_iotextypes_ElectionBucket_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.Election.internal_static_iotextypes_ElectionBucket_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.ElectionBucket.class, com.github.iotexproject.grpc.types.ElectionBucket.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.ElectionBucket.newBuilder()
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
      voter_ = com.google.protobuf.ByteString.EMPTY;

      candidate_ = com.google.protobuf.ByteString.EMPTY;

      amount_ = com.google.protobuf.ByteString.EMPTY;

      if (startTimeBuilder_ == null) {
        startTime_ = null;
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }
      if (durationBuilder_ == null) {
        duration_ = null;
      } else {
        duration_ = null;
        durationBuilder_ = null;
      }
      decay_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.Election.internal_static_iotextypes_ElectionBucket_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.ElectionBucket getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.ElectionBucket.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.ElectionBucket build() {
      com.github.iotexproject.grpc.types.ElectionBucket result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.ElectionBucket buildPartial() {
      com.github.iotexproject.grpc.types.ElectionBucket result = new com.github.iotexproject.grpc.types.ElectionBucket(this);
      result.voter_ = voter_;
      result.candidate_ = candidate_;
      result.amount_ = amount_;
      if (startTimeBuilder_ == null) {
        result.startTime_ = startTime_;
      } else {
        result.startTime_ = startTimeBuilder_.build();
      }
      if (durationBuilder_ == null) {
        result.duration_ = duration_;
      } else {
        result.duration_ = durationBuilder_.build();
      }
      result.decay_ = decay_;
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
      if (other instanceof com.github.iotexproject.grpc.types.ElectionBucket) {
        return mergeFrom((com.github.iotexproject.grpc.types.ElectionBucket)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.ElectionBucket other) {
      if (other == com.github.iotexproject.grpc.types.ElectionBucket.getDefaultInstance()) return this;
      if (other.getVoter() != com.google.protobuf.ByteString.EMPTY) {
        setVoter(other.getVoter());
      }
      if (other.getCandidate() != com.google.protobuf.ByteString.EMPTY) {
        setCandidate(other.getCandidate());
      }
      if (other.getAmount() != com.google.protobuf.ByteString.EMPTY) {
        setAmount(other.getAmount());
      }
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
      }
      if (other.hasDuration()) {
        mergeDuration(other.getDuration());
      }
      if (other.getDecay() != false) {
        setDecay(other.getDecay());
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
      com.github.iotexproject.grpc.types.ElectionBucket parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.iotexproject.grpc.types.ElectionBucket) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString voter_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes voter = 1;</code>
     * @return The voter.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getVoter() {
      return voter_;
    }
    /**
     * <code>bytes voter = 1;</code>
     * @param value The voter to set.
     * @return This builder for chaining.
     */
    public Builder setVoter(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      voter_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes voter = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVoter() {
      
      voter_ = getDefaultInstance().getVoter();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString candidate_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes candidate = 2;</code>
     * @return The candidate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCandidate() {
      return candidate_;
    }
    /**
     * <code>bytes candidate = 2;</code>
     * @param value The candidate to set.
     * @return This builder for chaining.
     */
    public Builder setCandidate(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      candidate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes candidate = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCandidate() {
      
      candidate_ = getDefaultInstance().getCandidate();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString amount_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes amount = 3;</code>
     * @return The amount.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAmount() {
      return amount_;
    }
    /**
     * <code>bytes amount = 3;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes amount = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      
      amount_ = getDefaultInstance().getAmount();
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp startTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp startTime = 4;</code>
     * @return Whether the startTime field is set.
     */
    public boolean hasStartTime() {
      return startTimeBuilder_ != null || startTime_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp startTime = 4;</code>
     * @return The startTime.
     */
    public com.google.protobuf.Timestamp getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp startTime = 4;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
        onChanged();
      } else {
        startTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp startTime = 4;</code>
     */
    public Builder setStartTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
        onChanged();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp startTime = 4;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (startTime_ != null) {
          startTime_ =
            com.google.protobuf.Timestamp.newBuilder(startTime_).mergeFrom(value).buildPartial();
        } else {
          startTime_ = value;
        }
        onChanged();
      } else {
        startTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp startTime = 4;</code>
     */
    public Builder clearStartTime() {
      if (startTimeBuilder_ == null) {
        startTime_ = null;
        onChanged();
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp startTime = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {
      
      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp startTime = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp startTime = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getStartTime(),
                getParentForChildren(),
                isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    private com.google.protobuf.Duration duration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> durationBuilder_;
    /**
     * <code>.google.protobuf.Duration duration = 5;</code>
     * @return Whether the duration field is set.
     */
    public boolean hasDuration() {
      return durationBuilder_ != null || duration_ != null;
    }
    /**
     * <code>.google.protobuf.Duration duration = 5;</code>
     * @return The duration.
     */
    public com.google.protobuf.Duration getDuration() {
      if (durationBuilder_ == null) {
        return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
      } else {
        return durationBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Duration duration = 5;</code>
     */
    public Builder setDuration(com.google.protobuf.Duration value) {
      if (durationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        duration_ = value;
        onChanged();
      } else {
        durationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Duration duration = 5;</code>
     */
    public Builder setDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (durationBuilder_ == null) {
        duration_ = builderForValue.build();
        onChanged();
      } else {
        durationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Duration duration = 5;</code>
     */
    public Builder mergeDuration(com.google.protobuf.Duration value) {
      if (durationBuilder_ == null) {
        if (duration_ != null) {
          duration_ =
            com.google.protobuf.Duration.newBuilder(duration_).mergeFrom(value).buildPartial();
        } else {
          duration_ = value;
        }
        onChanged();
      } else {
        durationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Duration duration = 5;</code>
     */
    public Builder clearDuration() {
      if (durationBuilder_ == null) {
        duration_ = null;
        onChanged();
      } else {
        duration_ = null;
        durationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Duration duration = 5;</code>
     */
    public com.google.protobuf.Duration.Builder getDurationBuilder() {
      
      onChanged();
      return getDurationFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Duration duration = 5;</code>
     */
    public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
      if (durationBuilder_ != null) {
        return durationBuilder_.getMessageOrBuilder();
      } else {
        return duration_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : duration_;
      }
    }
    /**
     * <code>.google.protobuf.Duration duration = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getDurationFieldBuilder() {
      if (durationBuilder_ == null) {
        durationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getDuration(),
                getParentForChildren(),
                isClean());
        duration_ = null;
      }
      return durationBuilder_;
    }

    private boolean decay_ ;
    /**
     * <code>bool decay = 6;</code>
     * @return The decay.
     */
    @java.lang.Override
    public boolean getDecay() {
      return decay_;
    }
    /**
     * <code>bool decay = 6;</code>
     * @param value The decay to set.
     * @return This builder for chaining.
     */
    public Builder setDecay(boolean value) {
      
      decay_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool decay = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDecay() {
      
      decay_ = false;
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


    // @@protoc_insertion_point(builder_scope:iotextypes.ElectionBucket)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.ElectionBucket)
  private static final com.github.iotexproject.grpc.types.ElectionBucket DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.ElectionBucket();
  }

  public static com.github.iotexproject.grpc.types.ElectionBucket getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ElectionBucket>
      PARSER = new com.google.protobuf.AbstractParser<ElectionBucket>() {
    @java.lang.Override
    public ElectionBucket parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ElectionBucket(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ElectionBucket> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ElectionBucket> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.ElectionBucket getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

