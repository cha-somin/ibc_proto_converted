// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: neutron/interchaintxs/v1/params.proto

package com.neutron.interchaintxs;

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
    internal_static_neutron_interchaintxs_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_neutron_interchaintxs_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%neutron/interchaintxs/v1/params.proto\022" +
      "\025neutron.interchaintxs\032\024gogoproto/gogo.p" +
      "roto\"J\n\006Params\022:\n\032msg_submit_tx_max_mess" +
      "ages\030\001 \001(\004R\026msgSubmitTxMaxMessages:\004\230\240\037\000" +
      "B\323\001\n\031com.neutron.interchaintxsB\013ParamsPr" +
      "otoP\001Z4github.com/neutron-org/neutron/x/" +
      "interchaintxs/types\242\002\003NIX\252\002\025Neutron.Inte" +
      "rchaintxs\312\002\025Neutron\\Interchaintxs\342\002!Neut" +
      "ron\\Interchaintxs\\GPBMetadata\352\002\026Neutron:" +
      ":Interchaintxsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_neutron_interchaintxs_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_neutron_interchaintxs_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_neutron_interchaintxs_Params_descriptor,
        new java.lang.String[] { "MsgSubmitTxMaxMessages", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
