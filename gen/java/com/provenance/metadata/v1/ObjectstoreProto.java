// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/objectstore.proto

package com.provenance.metadata.v1;

public final class ObjectstoreProto {
  private ObjectstoreProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_metadata_v1_ObjectStoreLocator_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_metadata_v1_ObjectStoreLocator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_metadata_v1_OSLocatorParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_metadata_v1_OSLocatorParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(provenance/metadata/v1/objectstore.pro" +
      "to\022\026provenance.metadata.v1\032\024gogoproto/go" +
      "go.proto\"r\n\022ObjectStoreLocator\022\024\n\005owner\030" +
      "\001 \001(\tR\005owner\022\037\n\013locator_uri\030\002 \001(\tR\nlocat" +
      "orUri\022%\n\016encryption_key\030\003 \001(\tR\rencryptio" +
      "nKey\"`\n\017OSLocatorParams\022M\n\016max_uri_lengt" +
      "h\030\001 \001(\rB\'\310\336\037\000\332\336\037\006uint32\362\336\037\025yaml:\"max_uri" +
      "_length\"R\014maxUriLengthB\336\001\n\032com.provenanc" +
      "e.metadata.v1B\020ObjectstoreProtoP\001Z4githu" +
      "b.com/provenance-io/provenance/x/metadat" +
      "a/types\242\002\003PMX\252\002\026Provenance.Metadata.V1\312\002" +
      "\026Provenance\\Metadata\\V1\342\002\"Provenance\\Met" +
      "adata\\V1\\GPBMetadata\352\002\030Provenance::Metad" +
      "ata::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_provenance_metadata_v1_ObjectStoreLocator_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_provenance_metadata_v1_ObjectStoreLocator_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_metadata_v1_ObjectStoreLocator_descriptor,
        new java.lang.String[] { "Owner", "LocatorUri", "EncryptionKey", });
    internal_static_provenance_metadata_v1_OSLocatorParams_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_provenance_metadata_v1_OSLocatorParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_metadata_v1_OSLocatorParams_descriptor,
        new java.lang.String[] { "MaxUriLength", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
