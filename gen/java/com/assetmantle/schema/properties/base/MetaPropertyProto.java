// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/properties/base/meta_property.proto

package com.assetmantle.schema.properties.base;

public final class MetaPropertyProto {
  private MetaPropertyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_schema_properties_base_MetaProperty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_schema_properties_base_MetaProperty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/assetmantle/properties/base/meta_prope" +
      "rty.proto\022\"assetmantle.schema.properties" +
      ".base\032$assetmantle/data/base/any_data.pr" +
      "oto\032\024gogoproto/gogo.proto\032&assetmantle/i" +
      "ds/base/property_id.proto\"\211\001\n\014MetaProper" +
      "ty\0228\n\003i_d\030\001 \001(\0132\'.assetmantle.schema.ids" +
      ".base.PropertyIDR\002iD\0229\n\004data\030\002 \001(\0132%.ass" +
      "etmantle.schema.data.base.AnyDataR\004data:" +
      "\004\210\240\037\000B\347\001\n&com.assetmantle.schema.propert" +
      "ies.baseB\021MetaPropertyProtoP\001\242\002\004ASPB\252\002\"A" +
      "ssetmantle.Schema.Properties.Base\312\002\"Asse" +
      "tmantle\\Schema\\Properties\\Base\342\002.Assetma" +
      "ntle\\Schema\\Properties\\Base\\GPBMetadata\352" +
      "\002%Assetmantle::Schema::Properties::Baseb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.data.base.AnyDataProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.assetmantle.schema.ids.base.PropertyIdProto.getDescriptor(),
        });
    internal_static_assetmantle_schema_properties_base_MetaProperty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_schema_properties_base_MetaProperty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_schema_properties_base_MetaProperty_descriptor,
        new java.lang.String[] { "ID", "Data", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.assetmantle.schema.data.base.AnyDataProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.assetmantle.schema.ids.base.PropertyIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
