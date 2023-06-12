// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/p8e/p8e.proto

package com.provenance.metadata.v1.p8e;

/**
 * <pre>
 * Deprecated: Do not use.
 * </pre>
 *
 * Protobuf enum {@code provenance.metadata.v1.p8e.PartyType}
 */
@java.lang.Deprecated public enum PartyType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_UNKNOWN = 0;</code>
   */
  PARTY_TYPE_UNKNOWN(0),
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_ORIGINATOR = 1;</code>
   */
  PARTY_TYPE_ORIGINATOR(1),
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_SERVICER = 2;</code>
   */
  PARTY_TYPE_SERVICER(2),
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_INVESTOR = 3;</code>
   */
  PARTY_TYPE_INVESTOR(3),
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_CUSTODIAN = 4;</code>
   */
  PARTY_TYPE_CUSTODIAN(4),
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_OWNER = 5;</code>
   */
  PARTY_TYPE_OWNER(5),
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_AFFILIATE = 6;</code>
   */
  PARTY_TYPE_AFFILIATE(6),
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_OMNIBUS = 7;</code>
   */
  PARTY_TYPE_OMNIBUS(7),
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_PROVENANCE = 8;</code>
   */
  PARTY_TYPE_PROVENANCE(8),
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_MARKER = 9;</code>
   */
  PARTY_TYPE_MARKER(9),
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_CONTROLLER = 10;</code>
   */
  PARTY_TYPE_CONTROLLER(10),
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_VALIDATOR = 11;</code>
   */
  PARTY_TYPE_VALIDATOR(11),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_UNKNOWN = 0;</code>
   */
  public static final int PARTY_TYPE_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_ORIGINATOR = 1;</code>
   */
  public static final int PARTY_TYPE_ORIGINATOR_VALUE = 1;
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_SERVICER = 2;</code>
   */
  public static final int PARTY_TYPE_SERVICER_VALUE = 2;
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_INVESTOR = 3;</code>
   */
  public static final int PARTY_TYPE_INVESTOR_VALUE = 3;
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_CUSTODIAN = 4;</code>
   */
  public static final int PARTY_TYPE_CUSTODIAN_VALUE = 4;
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_OWNER = 5;</code>
   */
  public static final int PARTY_TYPE_OWNER_VALUE = 5;
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_AFFILIATE = 6;</code>
   */
  public static final int PARTY_TYPE_AFFILIATE_VALUE = 6;
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_OMNIBUS = 7;</code>
   */
  public static final int PARTY_TYPE_OMNIBUS_VALUE = 7;
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_PROVENANCE = 8;</code>
   */
  public static final int PARTY_TYPE_PROVENANCE_VALUE = 8;
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_MARKER = 9;</code>
   */
  public static final int PARTY_TYPE_MARKER_VALUE = 9;
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_CONTROLLER = 10;</code>
   */
  public static final int PARTY_TYPE_CONTROLLER_VALUE = 10;
  /**
   * <pre>
   * Deprecated: Do not use.
   * </pre>
   *
   * <code>PARTY_TYPE_VALIDATOR = 11;</code>
   */
  public static final int PARTY_TYPE_VALIDATOR_VALUE = 11;


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
  public static PartyType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PartyType forNumber(int value) {
    switch (value) {
      case 0: return PARTY_TYPE_UNKNOWN;
      case 1: return PARTY_TYPE_ORIGINATOR;
      case 2: return PARTY_TYPE_SERVICER;
      case 3: return PARTY_TYPE_INVESTOR;
      case 4: return PARTY_TYPE_CUSTODIAN;
      case 5: return PARTY_TYPE_OWNER;
      case 6: return PARTY_TYPE_AFFILIATE;
      case 7: return PARTY_TYPE_OMNIBUS;
      case 8: return PARTY_TYPE_PROVENANCE;
      case 9: return PARTY_TYPE_MARKER;
      case 10: return PARTY_TYPE_CONTROLLER;
      case 11: return PARTY_TYPE_VALIDATOR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PartyType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PartyType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PartyType>() {
          public PartyType findValueByNumber(int number) {
            return PartyType.forNumber(number);
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
    return com.provenance.metadata.v1.p8e.P8eProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final PartyType[] VALUES = values();

  public static PartyType valueOf(
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

  private PartyType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:provenance.metadata.v1.p8e.PartyType)
}

