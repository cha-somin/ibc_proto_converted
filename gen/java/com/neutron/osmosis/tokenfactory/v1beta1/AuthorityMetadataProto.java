// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: neutron/osmosis/tokenfactory/v1beta1/authorityMetadata.proto

package com.neutron.osmosis.tokenfactory.v1beta1;

public final class AuthorityMetadataProto {
  private AuthorityMetadataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_neutron_osmosis_tokenfactory_v1beta1_DenomAuthorityMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_neutron_osmosis_tokenfactory_v1beta1_DenomAuthorityMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<neutron/osmosis/tokenfactory/v1beta1/a" +
      "uthorityMetadata.proto\022$neutron.osmosis." +
      "tokenfactory.v1beta1\032\024gogoproto/gogo.pro" +
      "to\032\036cosmos/base/v1beta1/coin.proto\"F\n\026De" +
      "nomAuthorityMetadata\022&\n\005Admin\030\001 \001(\tB\020\362\336\037" +
      "\014yaml:\"admin\"R\005Admin:\004\350\240\037\001B\252\002\n(com.neutr" +
      "on.osmosis.tokenfactory.v1beta1B\026Authori" +
      "tyMetadataProtoP\001Z3github.com/neutron-or" +
      "g/neutron/x/tokenfactory/types\242\002\003NOT\252\002$N" +
      "eutron.Osmosis.Tokenfactory.V1beta1\312\002$Ne" +
      "utron\\Osmosis\\Tokenfactory\\V1beta1\342\0020Neu" +
      "tron\\Osmosis\\Tokenfactory\\V1beta1\\GPBMet" +
      "adata\352\002\'Neutron::Osmosis::Tokenfactory::" +
      "V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_neutron_osmosis_tokenfactory_v1beta1_DenomAuthorityMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_neutron_osmosis_tokenfactory_v1beta1_DenomAuthorityMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_neutron_osmosis_tokenfactory_v1beta1_DenomAuthorityMetadata_descriptor,
        new java.lang.String[] { "Admin", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
