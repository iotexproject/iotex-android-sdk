// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/blockchain.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * <pre>
 * Account Metadata
 * </pre>
 *
 * Protobuf type {@code iotextypes.AccountMeta}
 */
public final class AccountMeta extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:iotextypes.AccountMeta)
    AccountMetaOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      AccountMeta.class.getName());
  }
  // Use AccountMeta.newBuilder() to construct.
  private AccountMeta(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AccountMeta() {
    address_ = "";
    balance_ = "";
    contractByteCode_ = com.google.protobuf.ByteString.EMPTY;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_AccountMeta_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_AccountMeta_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.iotexproject.grpc.types.AccountMeta.class, com.github.iotexproject.grpc.types.AccountMeta.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object address_ = "";
  /**
   * <code>string address = 1;</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string address = 1;</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BALANCE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object balance_ = "";
  /**
   * <code>string balance = 2;</code>
   * @return The balance.
   */
  @java.lang.Override
  public java.lang.String getBalance() {
    java.lang.Object ref = balance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      balance_ = s;
      return s;
    }
  }
  /**
   * <code>string balance = 2;</code>
   * @return The bytes for balance.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBalanceBytes() {
    java.lang.Object ref = balance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      balance_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NONCE_FIELD_NUMBER = 3;
  private long nonce_ = 0L;
  /**
   * <code>uint64 nonce = 3;</code>
   * @return The nonce.
   */
  @java.lang.Override
  public long getNonce() {
    return nonce_;
  }

  public static final int PENDINGNONCE_FIELD_NUMBER = 4;
  private long pendingNonce_ = 0L;
  /**
   * <code>uint64 pendingNonce = 4;</code>
   * @return The pendingNonce.
   */
  @java.lang.Override
  public long getPendingNonce() {
    return pendingNonce_;
  }

  public static final int NUMACTIONS_FIELD_NUMBER = 5;
  private long numActions_ = 0L;
  /**
   * <code>uint64 numActions = 5;</code>
   * @return The numActions.
   */
  @java.lang.Override
  public long getNumActions() {
    return numActions_;
  }

  public static final int ISCONTRACT_FIELD_NUMBER = 6;
  private boolean isContract_ = false;
  /**
   * <code>bool isContract = 6;</code>
   * @return The isContract.
   */
  @java.lang.Override
  public boolean getIsContract() {
    return isContract_;
  }

  public static final int CONTRACTBYTECODE_FIELD_NUMBER = 7;
  private com.google.protobuf.ByteString contractByteCode_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes contractByteCode = 7;</code>
   * @return The contractByteCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContractByteCode() {
    return contractByteCode_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, address_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(balance_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, balance_);
    }
    if (nonce_ != 0L) {
      output.writeUInt64(3, nonce_);
    }
    if (pendingNonce_ != 0L) {
      output.writeUInt64(4, pendingNonce_);
    }
    if (numActions_ != 0L) {
      output.writeUInt64(5, numActions_);
    }
    if (isContract_ != false) {
      output.writeBool(6, isContract_);
    }
    if (!contractByteCode_.isEmpty()) {
      output.writeBytes(7, contractByteCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, address_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(balance_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, balance_);
    }
    if (nonce_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, nonce_);
    }
    if (pendingNonce_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, pendingNonce_);
    }
    if (numActions_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, numActions_);
    }
    if (isContract_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, isContract_);
    }
    if (!contractByteCode_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(7, contractByteCode_);
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
    if (!(obj instanceof com.github.iotexproject.grpc.types.AccountMeta)) {
      return super.equals(obj);
    }
    com.github.iotexproject.grpc.types.AccountMeta other = (com.github.iotexproject.grpc.types.AccountMeta) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (!getBalance()
        .equals(other.getBalance())) return false;
    if (getNonce()
        != other.getNonce()) return false;
    if (getPendingNonce()
        != other.getPendingNonce()) return false;
    if (getNumActions()
        != other.getNumActions()) return false;
    if (getIsContract()
        != other.getIsContract()) return false;
    if (!getContractByteCode()
        .equals(other.getContractByteCode())) return false;
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
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (37 * hash) + BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + getBalance().hashCode();
    hash = (37 * hash) + NONCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNonce());
    hash = (37 * hash) + PENDINGNONCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPendingNonce());
    hash = (37 * hash) + NUMACTIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumActions());
    hash = (37 * hash) + ISCONTRACT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsContract());
    hash = (37 * hash) + CONTRACTBYTECODE_FIELD_NUMBER;
    hash = (53 * hash) + getContractByteCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.iotexproject.grpc.types.AccountMeta parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.AccountMeta parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.AccountMeta parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.AccountMeta parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.AccountMeta parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.iotexproject.grpc.types.AccountMeta parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.AccountMeta parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.AccountMeta parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.iotexproject.grpc.types.AccountMeta parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.iotexproject.grpc.types.AccountMeta parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.iotexproject.grpc.types.AccountMeta parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.iotexproject.grpc.types.AccountMeta parseFrom(
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
  public static Builder newBuilder(com.github.iotexproject.grpc.types.AccountMeta prototype) {
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
   * Account Metadata
   * </pre>
   *
   * Protobuf type {@code iotextypes.AccountMeta}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:iotextypes.AccountMeta)
      com.github.iotexproject.grpc.types.AccountMetaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_AccountMeta_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_AccountMeta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.iotexproject.grpc.types.AccountMeta.class, com.github.iotexproject.grpc.types.AccountMeta.Builder.class);
    }

    // Construct using com.github.iotexproject.grpc.types.AccountMeta.newBuilder()
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
      address_ = "";
      balance_ = "";
      nonce_ = 0L;
      pendingNonce_ = 0L;
      numActions_ = 0L;
      isContract_ = false;
      contractByteCode_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.iotexproject.grpc.types.Blockchain.internal_static_iotextypes_AccountMeta_descriptor;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.AccountMeta getDefaultInstanceForType() {
      return com.github.iotexproject.grpc.types.AccountMeta.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.AccountMeta build() {
      com.github.iotexproject.grpc.types.AccountMeta result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.iotexproject.grpc.types.AccountMeta buildPartial() {
      com.github.iotexproject.grpc.types.AccountMeta result = new com.github.iotexproject.grpc.types.AccountMeta(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.iotexproject.grpc.types.AccountMeta result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.address_ = address_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.balance_ = balance_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.nonce_ = nonce_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pendingNonce_ = pendingNonce_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.numActions_ = numActions_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.isContract_ = isContract_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.contractByteCode_ = contractByteCode_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.iotexproject.grpc.types.AccountMeta) {
        return mergeFrom((com.github.iotexproject.grpc.types.AccountMeta)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.iotexproject.grpc.types.AccountMeta other) {
      if (other == com.github.iotexproject.grpc.types.AccountMeta.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getBalance().isEmpty()) {
        balance_ = other.balance_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getNonce() != 0L) {
        setNonce(other.getNonce());
      }
      if (other.getPendingNonce() != 0L) {
        setPendingNonce(other.getPendingNonce());
      }
      if (other.getNumActions() != 0L) {
        setNumActions(other.getNumActions());
      }
      if (other.getIsContract() != false) {
        setIsContract(other.getIsContract());
      }
      if (other.getContractByteCode() != com.google.protobuf.ByteString.EMPTY) {
        setContractByteCode(other.getContractByteCode());
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
              address_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              balance_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              nonce_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              pendingNonce_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              numActions_ = input.readUInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              isContract_ = input.readBool();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 58: {
              contractByteCode_ = input.readBytes();
              bitField0_ |= 0x00000040;
              break;
            } // case 58
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

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 1;</code>
     * @return The address.
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string address = 1;</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 1;</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      address_ = getDefaultInstance().getAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1;</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object balance_ = "";
    /**
     * <code>string balance = 2;</code>
     * @return The balance.
     */
    public java.lang.String getBalance() {
      java.lang.Object ref = balance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        balance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string balance = 2;</code>
     * @return The bytes for balance.
     */
    public com.google.protobuf.ByteString
        getBalanceBytes() {
      java.lang.Object ref = balance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        balance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string balance = 2;</code>
     * @param value The balance to set.
     * @return This builder for chaining.
     */
    public Builder setBalance(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      balance_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string balance = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBalance() {
      balance_ = getDefaultInstance().getBalance();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string balance = 2;</code>
     * @param value The bytes for balance to set.
     * @return This builder for chaining.
     */
    public Builder setBalanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      balance_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long nonce_ ;
    /**
     * <code>uint64 nonce = 3;</code>
     * @return The nonce.
     */
    @java.lang.Override
    public long getNonce() {
      return nonce_;
    }
    /**
     * <code>uint64 nonce = 3;</code>
     * @param value The nonce to set.
     * @return This builder for chaining.
     */
    public Builder setNonce(long value) {

      nonce_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 nonce = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNonce() {
      bitField0_ = (bitField0_ & ~0x00000004);
      nonce_ = 0L;
      onChanged();
      return this;
    }

    private long pendingNonce_ ;
    /**
     * <code>uint64 pendingNonce = 4;</code>
     * @return The pendingNonce.
     */
    @java.lang.Override
    public long getPendingNonce() {
      return pendingNonce_;
    }
    /**
     * <code>uint64 pendingNonce = 4;</code>
     * @param value The pendingNonce to set.
     * @return This builder for chaining.
     */
    public Builder setPendingNonce(long value) {

      pendingNonce_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 pendingNonce = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPendingNonce() {
      bitField0_ = (bitField0_ & ~0x00000008);
      pendingNonce_ = 0L;
      onChanged();
      return this;
    }

    private long numActions_ ;
    /**
     * <code>uint64 numActions = 5;</code>
     * @return The numActions.
     */
    @java.lang.Override
    public long getNumActions() {
      return numActions_;
    }
    /**
     * <code>uint64 numActions = 5;</code>
     * @param value The numActions to set.
     * @return This builder for chaining.
     */
    public Builder setNumActions(long value) {

      numActions_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 numActions = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumActions() {
      bitField0_ = (bitField0_ & ~0x00000010);
      numActions_ = 0L;
      onChanged();
      return this;
    }

    private boolean isContract_ ;
    /**
     * <code>bool isContract = 6;</code>
     * @return The isContract.
     */
    @java.lang.Override
    public boolean getIsContract() {
      return isContract_;
    }
    /**
     * <code>bool isContract = 6;</code>
     * @param value The isContract to set.
     * @return This builder for chaining.
     */
    public Builder setIsContract(boolean value) {

      isContract_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>bool isContract = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsContract() {
      bitField0_ = (bitField0_ & ~0x00000020);
      isContract_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString contractByteCode_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes contractByteCode = 7;</code>
     * @return The contractByteCode.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getContractByteCode() {
      return contractByteCode_;
    }
    /**
     * <code>bytes contractByteCode = 7;</code>
     * @param value The contractByteCode to set.
     * @return This builder for chaining.
     */
    public Builder setContractByteCode(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      contractByteCode_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>bytes contractByteCode = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearContractByteCode() {
      bitField0_ = (bitField0_ & ~0x00000040);
      contractByteCode_ = getDefaultInstance().getContractByteCode();
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iotextypes.AccountMeta)
  }

  // @@protoc_insertion_point(class_scope:iotextypes.AccountMeta)
  private static final com.github.iotexproject.grpc.types.AccountMeta DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.iotexproject.grpc.types.AccountMeta();
  }

  public static com.github.iotexproject.grpc.types.AccountMeta getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountMeta>
      PARSER = new com.google.protobuf.AbstractParser<AccountMeta>() {
    @java.lang.Override
    public AccountMeta parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccountMeta> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountMeta> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.iotexproject.grpc.types.AccountMeta getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

