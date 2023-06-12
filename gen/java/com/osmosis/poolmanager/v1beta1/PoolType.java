// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/poolmanager/v1beta1/module_route.proto

package com.osmosis.poolmanager.v1beta1;

/**
 * <pre>
 * PoolType is an enumeration of all supported pool types.
 * </pre>
 *
 * Protobuf enum {@code osmosis.poolmanager.v1beta1.PoolType}
 */
public enum PoolType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Balancer is the standard xy=k curve. Its pool model is defined in x/gamm.
   * </pre>
   *
   * <code>Balancer = 0;</code>
   */
  Balancer(0),
  /**
   * <pre>
   * Stableswap is the Solidly cfmm stable swap curve. Its pool model is defined
   * in x/gamm.
   * </pre>
   *
   * <code>Stableswap = 1;</code>
   */
  Stableswap(1),
  /**
   * <pre>
   * Concentrated is the pool model specific to concentrated liquidity. It is
   * defined in x/concentrated-liquidity.
   * </pre>
   *
   * <code>Concentrated = 2;</code>
   */
  Concentrated(2),
  /**
   * <pre>
   * CosmWasm is the pool model specific to CosmWasm. It is defined in
   * x/cosmwasmpool.
   * </pre>
   *
   * <code>CosmWasm = 3;</code>
   */
  CosmWasm(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Balancer is the standard xy=k curve. Its pool model is defined in x/gamm.
   * </pre>
   *
   * <code>Balancer = 0;</code>
   */
  public static final int Balancer_VALUE = 0;
  /**
   * <pre>
   * Stableswap is the Solidly cfmm stable swap curve. Its pool model is defined
   * in x/gamm.
   * </pre>
   *
   * <code>Stableswap = 1;</code>
   */
  public static final int Stableswap_VALUE = 1;
  /**
   * <pre>
   * Concentrated is the pool model specific to concentrated liquidity. It is
   * defined in x/concentrated-liquidity.
   * </pre>
   *
   * <code>Concentrated = 2;</code>
   */
  public static final int Concentrated_VALUE = 2;
  /**
   * <pre>
   * CosmWasm is the pool model specific to CosmWasm. It is defined in
   * x/cosmwasmpool.
   * </pre>
   *
   * <code>CosmWasm = 3;</code>
   */
  public static final int CosmWasm_VALUE = 3;


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
  public static PoolType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PoolType forNumber(int value) {
    switch (value) {
      case 0: return Balancer;
      case 1: return Stableswap;
      case 2: return Concentrated;
      case 3: return CosmWasm;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PoolType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PoolType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PoolType>() {
          public PoolType findValueByNumber(int number) {
            return PoolType.forNumber(number);
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
    return com.osmosis.poolmanager.v1beta1.ModuleRouteProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final PoolType[] VALUES = values();

  public static PoolType valueOf(
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

  private PoolType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:osmosis.poolmanager.v1beta1.PoolType)
}

