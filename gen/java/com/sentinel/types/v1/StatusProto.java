// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/types/v1/status.proto

package com.sentinel.types.v1;

public final class StatusProto {
  private StatusProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code sentinel.types.v1.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STATUS_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "StatusUnspecified"];</code>
     */
    STATUS_UNSPECIFIED(0),
    /**
     * <code>STATUS_ACTIVE = 1 [(.gogoproto.enumvalue_customname) = "StatusActive"];</code>
     */
    STATUS_ACTIVE(1),
    /**
     * <code>STATUS_INACTIVE_PENDING = 2 [(.gogoproto.enumvalue_customname) = "StatusInactivePending"];</code>
     */
    STATUS_INACTIVE_PENDING(2),
    /**
     * <code>STATUS_INACTIVE = 3 [(.gogoproto.enumvalue_customname) = "StatusInactive"];</code>
     */
    STATUS_INACTIVE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>STATUS_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "StatusUnspecified"];</code>
     */
    public static final int STATUS_UNSPECIFIED_VALUE = 0;
    /**
     * <code>STATUS_ACTIVE = 1 [(.gogoproto.enumvalue_customname) = "StatusActive"];</code>
     */
    public static final int STATUS_ACTIVE_VALUE = 1;
    /**
     * <code>STATUS_INACTIVE_PENDING = 2 [(.gogoproto.enumvalue_customname) = "StatusInactivePending"];</code>
     */
    public static final int STATUS_INACTIVE_PENDING_VALUE = 2;
    /**
     * <code>STATUS_INACTIVE = 3 [(.gogoproto.enumvalue_customname) = "StatusInactive"];</code>
     */
    public static final int STATUS_INACTIVE_VALUE = 3;


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
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return STATUS_UNSPECIFIED;
        case 1: return STATUS_ACTIVE;
        case 2: return STATUS_INACTIVE_PENDING;
        case 3: return STATUS_INACTIVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
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
      return com.sentinel.types.v1.StatusProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
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

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:sentinel.types.v1.Status)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036sentinel/types/v1/status.proto\022\021sentin" +
      "el.types.v1\032\024gogoproto/gogo.proto*\275\001\n\006St" +
      "atus\022-\n\022STATUS_UNSPECIFIED\020\000\032\025\212\235 \021Status" +
      "Unspecified\022#\n\rSTATUS_ACTIVE\020\001\032\020\212\235 \014Stat" +
      "usActive\0226\n\027STATUS_INACTIVE_PENDING\020\002\032\031\212" +
      "\235 \025StatusInactivePending\022\'\n\017STATUS_INACT" +
      "IVE\020\003\032\022\212\235 \016StatusInactiveB\274\001\n\025com.sentin" +
      "el.types.v1B\013StatusProtoZ&github.com/sen" +
      "tinel-official/hub/types\242\002\003STX\252\002\021Sentine" +
      "l.Types.V1\312\002\021Sentinel\\Types\\V1\342\002\035Sentine" +
      "l\\Types\\V1\\GPBMetadata\352\002\023Sentinel::Types" +
      "::V1\310\341\036\000\320\341\036\000\350\342\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.enumvalueCustomname);
    registry.add(com.gogoproto.GogoProto.goprotoEnumPrefixAll);
    registry.add(com.gogoproto.GogoProto.goprotoEnumStringerAll);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
