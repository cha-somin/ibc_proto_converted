// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: neutron/feeburner/params.proto

package com.neutron.feeburner;

public final class ParamsProto {
  private ParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_neutron_feeburner_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_neutron_feeburner_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036neutron/feeburner/params.proto\022\021neutro" +
      "n.feeburner\032\024gogoproto/gogo.proto\"\207\001\n\006Pa" +
      "rams\022#\n\rneutron_denom\030\001 \001(\tR\014neutronDeno" +
      "m\022\'\n\017reserve_address\030\002 \001(\tR\016reserveAddre" +
      "ss\022)\n\020treasury_address\030\003 \001(\tR\017treasuryAd" +
      "dress:\004\230\240\037\000B\273\001\n\025com.neutron.feeburnerB\013P" +
      "aramsProtoP\001Z0github.com/neutron-org/neu" +
      "tron/x/feeburner/types\242\002\003NFX\252\002\021Neutron.F" +
      "eeburner\312\002\021Neutron\\Feeburner\342\002\035Neutron\\F" +
      "eeburner\\GPBMetadata\352\002\022Neutron::Feeburne" +
      "rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_neutron_feeburner_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_neutron_feeburner_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_neutron_feeburner_Params_descriptor,
        new java.lang.String[] { "NeutronDenom", "ReserveAddress", "TreasuryAddress", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
