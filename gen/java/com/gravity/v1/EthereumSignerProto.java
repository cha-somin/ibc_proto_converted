// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/ethereum_signer.proto

package com.gravity.v1;

public final class EthereumSignerProto {
  private EthereumSignerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * SignType defines messages that have been signed by an orchestrator
   * </pre>
   *
   * Protobuf enum {@code gravity.v1.SignType}
   */
  public enum SignType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * An unspecified type
     * </pre>
     *
     * <code>SIGN_TYPE_UNSPECIFIED = 0;</code>
     */
    SIGN_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * A type for multi-sig updates
     * </pre>
     *
     * <code>SIGN_TYPE_ORCHESTRATOR_SIGNED_MULTI_SIG_UPDATE = 1;</code>
     */
    SIGN_TYPE_ORCHESTRATOR_SIGNED_MULTI_SIG_UPDATE(1),
    /**
     * <pre>
     * A type for batches
     * </pre>
     *
     * <code>SIGN_TYPE_ORCHESTRATOR_SIGNED_WITHDRAW_BATCH = 2;</code>
     */
    SIGN_TYPE_ORCHESTRATOR_SIGNED_WITHDRAW_BATCH(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * An unspecified type
     * </pre>
     *
     * <code>SIGN_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int SIGN_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * A type for multi-sig updates
     * </pre>
     *
     * <code>SIGN_TYPE_ORCHESTRATOR_SIGNED_MULTI_SIG_UPDATE = 1;</code>
     */
    public static final int SIGN_TYPE_ORCHESTRATOR_SIGNED_MULTI_SIG_UPDATE_VALUE = 1;
    /**
     * <pre>
     * A type for batches
     * </pre>
     *
     * <code>SIGN_TYPE_ORCHESTRATOR_SIGNED_WITHDRAW_BATCH = 2;</code>
     */
    public static final int SIGN_TYPE_ORCHESTRATOR_SIGNED_WITHDRAW_BATCH_VALUE = 2;


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
    public static SignType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SignType forNumber(int value) {
      switch (value) {
        case 0: return SIGN_TYPE_UNSPECIFIED;
        case 1: return SIGN_TYPE_ORCHESTRATOR_SIGNED_MULTI_SIG_UPDATE;
        case 2: return SIGN_TYPE_ORCHESTRATOR_SIGNED_WITHDRAW_BATCH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SignType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SignType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SignType>() {
            public SignType findValueByNumber(int number) {
              return SignType.forNumber(number);
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
      return com.gravity.v1.EthereumSignerProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final SignType[] VALUES = values();

    public static SignType valueOf(
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

    private SignType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:gravity.v1.SignType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n gravity/v1/ethereum_signer.proto\022\ngrav" +
      "ity.v1\032\024gogoproto/gogo.proto*\225\001\n\010SignTyp" +
      "e\022\031\n\025SIGN_TYPE_UNSPECIFIED\020\000\0222\n.SIGN_TYP" +
      "E_ORCHESTRATOR_SIGNED_MULTI_SIG_UPDATE\020\001" +
      "\0220\n,SIGN_TYPE_ORCHESTRATOR_SIGNED_WITHDR" +
      "AW_BATCH\020\002\032\010\210\243\036\000\250\244\036\000B\255\001\n\016com.gravity.v1B" +
      "\023EthereumSignerProtoZ?github.com/Gravity" +
      "-Bridge/Gravity-Bridge/module/x/gravity/" +
      "types\242\002\003GXX\252\002\nGravity.V1\312\002\nGravity\\V1\342\002\026" +
      "Gravity\\V1\\GPBMetadata\352\002\013Gravity::V1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoEnumPrefix);
    registry.add(com.gogoproto.GogoProto.goprotoEnumStringer);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
