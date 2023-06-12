// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/oracle/v2alpha2/oracle.proto

package com.panacea.oracle.v2alpha2;

/**
 * <pre>
 * OracleRegistrationStatus enumerates the status of OracleRegistration.
 * </pre>
 *
 * Protobuf enum {@code panacea.oracle.v2alpha2.OracleRegistrationStatus}
 */
public enum OracleRegistrationStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * ORACLE_REGISTRATION_STATUS_UNSPECIFIED
   * </pre>
   *
   * <code>ORACLE_REGISTRATION_STATUS_UNSPECIFIED = 0;</code>
   */
  ORACLE_REGISTRATION_STATUS_UNSPECIFIED(0),
  /**
   * <pre>
   * VOTING_PERIOD defines the status of OracleRegistration in voting period.
   * </pre>
   *
   * <code>ORACLE_REGISTRATION_STATUS_VOTING_PERIOD = 1;</code>
   */
  ORACLE_REGISTRATION_STATUS_VOTING_PERIOD(1),
  /**
   * <pre>
   * PASSED defines the status of OracleRegistration passed.
   * </pre>
   *
   * <code>ORACLE_REGISTRATION_STATUS_PASSED = 2;</code>
   */
  ORACLE_REGISTRATION_STATUS_PASSED(2),
  /**
   * <pre>
   * PASSED defines the status of OracleRegistration rejected.
   * </pre>
   *
   * <code>ORACLE_REGISTRATION_STATUS_REJECTED = 3;</code>
   */
  ORACLE_REGISTRATION_STATUS_REJECTED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * ORACLE_REGISTRATION_STATUS_UNSPECIFIED
   * </pre>
   *
   * <code>ORACLE_REGISTRATION_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int ORACLE_REGISTRATION_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * VOTING_PERIOD defines the status of OracleRegistration in voting period.
   * </pre>
   *
   * <code>ORACLE_REGISTRATION_STATUS_VOTING_PERIOD = 1;</code>
   */
  public static final int ORACLE_REGISTRATION_STATUS_VOTING_PERIOD_VALUE = 1;
  /**
   * <pre>
   * PASSED defines the status of OracleRegistration passed.
   * </pre>
   *
   * <code>ORACLE_REGISTRATION_STATUS_PASSED = 2;</code>
   */
  public static final int ORACLE_REGISTRATION_STATUS_PASSED_VALUE = 2;
  /**
   * <pre>
   * PASSED defines the status of OracleRegistration rejected.
   * </pre>
   *
   * <code>ORACLE_REGISTRATION_STATUS_REJECTED = 3;</code>
   */
  public static final int ORACLE_REGISTRATION_STATUS_REJECTED_VALUE = 3;


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
  public static OracleRegistrationStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OracleRegistrationStatus forNumber(int value) {
    switch (value) {
      case 0: return ORACLE_REGISTRATION_STATUS_UNSPECIFIED;
      case 1: return ORACLE_REGISTRATION_STATUS_VOTING_PERIOD;
      case 2: return ORACLE_REGISTRATION_STATUS_PASSED;
      case 3: return ORACLE_REGISTRATION_STATUS_REJECTED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OracleRegistrationStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OracleRegistrationStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OracleRegistrationStatus>() {
          public OracleRegistrationStatus findValueByNumber(int number) {
            return OracleRegistrationStatus.forNumber(number);
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
    return com.panacea.oracle.v2alpha2.OracleProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final OracleRegistrationStatus[] VALUES = values();

  public static OracleRegistrationStatus valueOf(
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

  private OracleRegistrationStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:panacea.oracle.v2alpha2.OracleRegistrationStatus)
}

