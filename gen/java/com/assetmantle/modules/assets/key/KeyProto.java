// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/assets/key/key.proto

package com.assetmantle.modules.assets.key;

public final class KeyProto {
  private KeyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_assets_key_Key_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_assets_key_Key_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n assetmantle/assets/key/key.proto\022\036asse" +
      "tmantle.modules.assets.key\032#assetmantle/" +
      "ids/base/asset_id.proto\"G\n\003Key\022@\n\tasset_" +
      "i_d\030\001 \001(\0132$.assetmantle.schema.ids.base." +
      "AssetIDR\007assetIDB\312\001\n\"com.assetmantle.mod" +
      "ules.assets.keyB\010KeyProtoP\001\242\002\004AMAK\252\002\036Ass" +
      "etmantle.Modules.Assets.Key\312\002\036Assetmantl" +
      "e\\Modules\\Assets\\Key\342\002*Assetmantle\\Modul" +
      "es\\Assets\\Key\\GPBMetadata\352\002!Assetmantle:" +
      ":Modules::Assets::Keyb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.ids.base.AssetIdProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_assets_key_Key_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_assets_key_Key_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_assets_key_Key_descriptor,
        new java.lang.String[] { "AssetID", });
    com.assetmantle.schema.ids.base.AssetIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
