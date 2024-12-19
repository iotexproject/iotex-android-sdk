// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/types/transaction_log.proto
// Protobuf Java Version: 4.29.1

package com.github.iotexproject.grpc.types;

/**
 * Protobuf enum {@code iotextypes.TransactionLogType}
 */
public enum TransactionLogType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>IN_CONTRACT_TRANSFER = 0;</code>
   */
  IN_CONTRACT_TRANSFER(0),
  /**
   * <code>WITHDRAW_BUCKET = 1;</code>
   */
  WITHDRAW_BUCKET(1),
  /**
   * <code>CREATE_BUCKET = 2;</code>
   */
  CREATE_BUCKET(2),
  /**
   * <code>DEPOSIT_TO_BUCKET = 3;</code>
   */
  DEPOSIT_TO_BUCKET(3),
  /**
   * <code>CANDIDATE_SELF_STAKE = 4;</code>
   */
  CANDIDATE_SELF_STAKE(4),
  /**
   * <code>CANDIDATE_REGISTRATION_FEE = 5;</code>
   */
  CANDIDATE_REGISTRATION_FEE(5),
  /**
   * <code>GAS_FEE = 6;</code>
   */
  GAS_FEE(6),
  /**
   * <code>NATIVE_TRANSFER = 7;</code>
   */
  NATIVE_TRANSFER(7),
  /**
   * <code>DEPOSIT_TO_REWARDING_FUND = 8;</code>
   */
  DEPOSIT_TO_REWARDING_FUND(8),
  /**
   * <code>CLAIM_FROM_REWARDING_FUND = 9;</code>
   */
  CLAIM_FROM_REWARDING_FUND(9),
  /**
   * <code>BLOB_FEE = 10;</code>
   */
  BLOB_FEE(10),
  /**
   * <code>PRIORITY_FEE = 11;</code>
   */
  PRIORITY_FEE(11),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      TransactionLogType.class.getName());
  }
  /**
   * <code>IN_CONTRACT_TRANSFER = 0;</code>
   */
  public static final int IN_CONTRACT_TRANSFER_VALUE = 0;
  /**
   * <code>WITHDRAW_BUCKET = 1;</code>
   */
  public static final int WITHDRAW_BUCKET_VALUE = 1;
  /**
   * <code>CREATE_BUCKET = 2;</code>
   */
  public static final int CREATE_BUCKET_VALUE = 2;
  /**
   * <code>DEPOSIT_TO_BUCKET = 3;</code>
   */
  public static final int DEPOSIT_TO_BUCKET_VALUE = 3;
  /**
   * <code>CANDIDATE_SELF_STAKE = 4;</code>
   */
  public static final int CANDIDATE_SELF_STAKE_VALUE = 4;
  /**
   * <code>CANDIDATE_REGISTRATION_FEE = 5;</code>
   */
  public static final int CANDIDATE_REGISTRATION_FEE_VALUE = 5;
  /**
   * <code>GAS_FEE = 6;</code>
   */
  public static final int GAS_FEE_VALUE = 6;
  /**
   * <code>NATIVE_TRANSFER = 7;</code>
   */
  public static final int NATIVE_TRANSFER_VALUE = 7;
  /**
   * <code>DEPOSIT_TO_REWARDING_FUND = 8;</code>
   */
  public static final int DEPOSIT_TO_REWARDING_FUND_VALUE = 8;
  /**
   * <code>CLAIM_FROM_REWARDING_FUND = 9;</code>
   */
  public static final int CLAIM_FROM_REWARDING_FUND_VALUE = 9;
  /**
   * <code>BLOB_FEE = 10;</code>
   */
  public static final int BLOB_FEE_VALUE = 10;
  /**
   * <code>PRIORITY_FEE = 11;</code>
   */
  public static final int PRIORITY_FEE_VALUE = 11;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TransactionLogType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TransactionLogType forNumber(int value) {
    switch (value) {
      case 0: return IN_CONTRACT_TRANSFER;
      case 1: return WITHDRAW_BUCKET;
      case 2: return CREATE_BUCKET;
      case 3: return DEPOSIT_TO_BUCKET;
      case 4: return CANDIDATE_SELF_STAKE;
      case 5: return CANDIDATE_REGISTRATION_FEE;
      case 6: return GAS_FEE;
      case 7: return NATIVE_TRANSFER;
      case 8: return DEPOSIT_TO_REWARDING_FUND;
      case 9: return CLAIM_FROM_REWARDING_FUND;
      case 10: return BLOB_FEE;
      case 11: return PRIORITY_FEE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TransactionLogType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TransactionLogType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TransactionLogType>() {
          public TransactionLogType findValueByNumber(int number) {
            return TransactionLogType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.github.iotexproject.grpc.types.TransactionLogOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final TransactionLogType[] VALUES = values();

  public static TransactionLogType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TransactionLogType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:iotextypes.TransactionLogType)
}

