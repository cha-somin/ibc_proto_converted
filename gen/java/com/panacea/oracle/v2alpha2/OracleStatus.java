// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/oracle/v2alpha2/oracle.proto

package com.panacea.oracle.v2alpha2;

/**
 * <pre>
 * OracleStatus enumerates the status of oracle.
 * </pre>
 *
 * Protobuf enum {@code panacea.oracle.v2alpha2.OracleStatus}
 */
public enum OracleStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * ORACLE_STATUS_UNSPECIFIED
   * </pre>
   *
   * <code>ORACLE_STATUS_UNSPECIFIED = 0;</code>
   */
  ORACLE_STATUS_UNSPECIFIED(0),
  /**
   * <pre>
   * ACTIVE defines the oracle status that is active
   * </pre>
   *
   * <code>ORACLE_STATUS_ACTIVE = 1;</code>
   */
  ORACLE_STATUS_ACTIVE(1),
  /**
   * <pre>
   * JAILED defines the oracle status that has been jailed
   * </pre>
   *
   * <code>ORACLE_STATUS_JAILED = 2;</code>
   */
  ORACLE_STATUS_JAILED(2),
  /**
   * <pre>
   * UPGRADING defines the oracle status that is being upgraded to new version of oracle
   * </pre>
   *
   * <code>ORACLE_STATUS_UPGRADING = 3;</code>
   */
  ORACLE_STATUS_UPGRADING(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * ORACLE_STATUS_UNSPECIFIED
   * </pre>
   *
   * <code>ORACLE_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int ORACLE_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * ACTIVE defines the oracle status that is active
   * </pre>
   *
   * <code>ORACLE_STATUS_ACTIVE = 1;</code>
   */
  public static final int ORACLE_STATUS_ACTIVE_VALUE = 1;
  /**
   * <pre>
   * JAILED defines the oracle status that has been jailed
   * </pre>
   *
   * <code>ORACLE_STATUS_JAILED = 2;</code>
   */
  public static final int ORACLE_STATUS_JAILED_VALUE = 2;
  /**
   * <pre>
   * UPGRADING defines the oracle status that is being upgraded to new version of oracle
   * </pre>
   *
   * <code>ORACLE_STATUS_UPGRADING = 3;</code>
   */
  public static final int ORACLE_STATUS_UPGRADING_VALUE = 3;


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
  public static OracleStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OracleStatus forNumber(int value) {
    switch (value) {
      case 0: return ORACLE_STATUS_UNSPECIFIED;
      case 1: return ORACLE_STATUS_ACTIVE;
      case 2: return ORACLE_STATUS_JAILED;
      case 3: return ORACLE_STATUS_UPGRADING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OracleStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OracleStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OracleStatus>() {
          public OracleStatus findValueByNumber(int number) {
            return OracleStatus.forNumber(number);
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
    return com.panacea.oracle.v2alpha2.OracleProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final OracleStatus[] VALUES = values();

  public static OracleStatus valueOf(
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

  private OracleStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:panacea.oracle.v2alpha2.OracleStatus)
}

