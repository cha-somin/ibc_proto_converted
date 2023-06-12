// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v3/genesis.proto

package com.desmos.profiles.v3;

public final class GenesisProto {
  private GenesisProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_profiles_v3_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_profiles_v3_GenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_profiles_v3_DefaultExternalAddressEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_profiles_v3_DefaultExternalAddressEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n desmos/profiles/v3/genesis.proto\022\022desm" +
      "os.profiles.v3\032\024gogoproto/gogo.proto\032&de" +
      "smos/profiles/v3/models_params.proto\032-de" +
      "smos/profiles/v3/models_dtag_requests.pr" +
      "oto\032+desmos/profiles/v3/models_chain_lin" +
      "ks.proto\032)desmos/profiles/v3/models_app_" +
      "links.proto\"\256\005\n\014GenesisState\022\234\001\n\026dtag_tr" +
      "ansfer_requests\030\001 \003(\0132\'.desmos.profiles." +
      "v3.DTagTransferRequestB=\310\336\037\000\342\336\037\024DTagTran" +
      "sferRequests\362\336\037\035yaml:\"dtag_transfer_requ" +
      "ests\"R\024dtagTransferRequests\022Z\n\013chain_lin" +
      "ks\030\002 \003(\0132\035.desmos.profiles.v3.ChainLinkB" +
      "\032\310\336\037\000\362\336\037\022yaml:\"chain_links\"R\nchainLinks\022" +
      "r\n\021application_links\030\003 \003(\0132#.desmos.prof" +
      "iles.v3.ApplicationLinkB \310\336\037\000\362\336\037\030yaml:\"a" +
      "pplication_links\"R\020applicationLinks\022\230\001\n\032" +
      "default_external_addresses\030\004 \003(\0132/.desmo" +
      "s.profiles.v3.DefaultExternalAddressEntr" +
      "yB)\310\336\037\000\362\336\037!yaml:\"default_external_addres" +
      "ses\"R\030defaultExternalAddresses\022C\n\013ibc_po" +
      "rt_id\030\005 \001(\tB#\342\336\037\tIBCPortID\362\336\037\022yaml:\"ibc_" +
      "port_id\"R\tibcPortId\022I\n\006params\030\006 \001(\0132\032.de" +
      "smos.profiles.v3.ParamsB\025\310\336\037\000\362\336\037\ryaml:\"p" +
      "arams\"R\006params:\004\210\240\037\000\"j\n\033DefaultExternalA" +
      "ddressEntry\022\024\n\005owner\030\001 \001(\tR\005owner\022\035\n\ncha" +
      "in_name\030\002 \001(\tR\tchainName\022\026\n\006target\030\003 \001(\t" +
      "R\006targetB\303\001\n\026com.desmos.profiles.v3B\014Gen" +
      "esisProtoP\001Z1github.com/desmos-labs/desm" +
      "os/v5/x/profiles/types\242\002\003DPX\252\002\022Desmos.Pr" +
      "ofiles.V3\312\002\022Desmos\\Profiles\\V3\342\002\036Desmos\\" +
      "Profiles\\V3\\GPBMetadata\352\002\024Desmos::Profil" +
      "es::V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.desmos.profiles.v3.ModelsParamsProto.getDescriptor(),
          com.desmos.profiles.v3.ModelsDtagRequestsProto.getDescriptor(),
          com.desmos.profiles.v3.ModelsChainLinksProto.getDescriptor(),
          com.desmos.profiles.v3.ModelsAppLinksProto.getDescriptor(),
        });
    internal_static_desmos_profiles_v3_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_desmos_profiles_v3_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_profiles_v3_GenesisState_descriptor,
        new java.lang.String[] { "DtagTransferRequests", "ChainLinks", "ApplicationLinks", "DefaultExternalAddresses", "IbcPortId", "Params", });
    internal_static_desmos_profiles_v3_DefaultExternalAddressEntry_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_desmos_profiles_v3_DefaultExternalAddressEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_profiles_v3_DefaultExternalAddressEntry_descriptor,
        new java.lang.String[] { "Owner", "ChainName", "Target", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.desmos.profiles.v3.ModelsParamsProto.getDescriptor();
    com.desmos.profiles.v3.ModelsDtagRequestsProto.getDescriptor();
    com.desmos.profiles.v3.ModelsChainLinksProto.getDescriptor();
    com.desmos.profiles.v3.ModelsAppLinksProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
