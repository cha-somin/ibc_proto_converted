// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/ids/base/data_id.proto

package com.assetmantle.schema.ids.base;

public final class DataIdProto {
  private DataIdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_schema_ids_base_DataID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_schema_ids_base_DataID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"assetmantle/ids/base/data_id.proto\022\033as" +
      "setmantle.schema.ids.base\032\024gogoproto/gog" +
      "o.proto\032\"assetmantle/ids/base/hash_id.pr" +
      "oto\032$assetmantle/ids/base/string_id.prot" +
      "o\"\216\001\n\006DataID\022?\n\010type_i_d\030\001 \001(\0132%.assetma" +
      "ntle.schema.ids.base.StringIDR\006typeID\022=\n" +
      "\010hash_i_d\030\002 \001(\0132#.assetmantle.schema.ids" +
      ".base.HashIDR\006hashID:\004\210\240\037\000B\276\001\n\037com.asset" +
      "mantle.schema.ids.baseB\013DataIdProtoP\001\242\002\004" +
      "ASIB\252\002\033Assetmantle.Schema.Ids.Base\312\002\033Ass" +
      "etmantle\\Schema\\Ids\\Base\342\002\'Assetmantle\\S" +
      "chema\\Ids\\Base\\GPBMetadata\352\002\036Assetmantle" +
      "::Schema::Ids::Baseb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.assetmantle.schema.ids.base.HashIdProto.getDescriptor(),
          com.assetmantle.schema.ids.base.StringIdProto.getDescriptor(),
        });
    internal_static_assetmantle_schema_ids_base_DataID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_schema_ids_base_DataID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_schema_ids_base_DataID_descriptor,
        new java.lang.String[] { "TypeID", "HashID", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.assetmantle.schema.ids.base.HashIdProto.getDescriptor();
    com.assetmantle.schema.ids.base.StringIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
