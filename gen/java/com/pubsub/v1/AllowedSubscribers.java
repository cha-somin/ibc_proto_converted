// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/pubsub/v1/pubsub.proto

package com.pubsub.v1;

/**
 * <pre>
 * for a given PublisherIntent, determines what types of subscribers may subscribe
 * </pre>
 *
 * Protobuf enum {@code pubsub.v1.AllowedSubscribers}
 */
public enum AllowedSubscribers
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * any valid account address
   * </pre>
   *
   * <code>ANY = 0;</code>
   */
  ANY(0),
  /**
   * <pre>
   * account address must map to a validator in the active validator set
   * </pre>
   *
   * <code>VALIDATORS = 1;</code>
   */
  VALIDATORS(1),
  /**
   * <pre>
   * a specific list of account addresses
   * </pre>
   *
   * <code>LIST = 2;</code>
   */
  LIST(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * any valid account address
   * </pre>
   *
   * <code>ANY = 0;</code>
   */
  public static final int ANY_VALUE = 0;
  /**
   * <pre>
   * account address must map to a validator in the active validator set
   * </pre>
   *
   * <code>VALIDATORS = 1;</code>
   */
  public static final int VALIDATORS_VALUE = 1;
  /**
   * <pre>
   * a specific list of account addresses
   * </pre>
   *
   * <code>LIST = 2;</code>
   */
  public static final int LIST_VALUE = 2;


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
  public static AllowedSubscribers valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AllowedSubscribers forNumber(int value) {
    switch (value) {
      case 0: return ANY;
      case 1: return VALIDATORS;
      case 2: return LIST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AllowedSubscribers>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AllowedSubscribers> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AllowedSubscribers>() {
          public AllowedSubscribers findValueByNumber(int number) {
            return AllowedSubscribers.forNumber(number);
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
    return com.pubsub.v1.PubsubProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final AllowedSubscribers[] VALUES = values();

  public static AllowedSubscribers valueOf(
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

  private AllowedSubscribers(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:pubsub.v1.AllowedSubscribers)
}

