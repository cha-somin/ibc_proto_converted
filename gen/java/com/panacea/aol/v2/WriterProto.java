// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/aol/v2/writer.proto

package com.panacea.aol.v2;

public final class WriterProto {
  private WriterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_aol_v2_Writer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_aol_v2_Writer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033panacea/aol/v2/writer.proto\022\016panacea.a" +
      "ol.v2\032\024gogoproto/gogo.proto\"k\n\006Writer\022\030\n" +
      "\007moniker\030\001 \001(\tR\007moniker\022 \n\013description\030\002" +
      " \001(\tR\013description\022%\n\016nano_timestamp\030\003 \001(" +
      "\003R\rnanoTimestampB\254\001\n\022com.panacea.aol.v2B" +
      "\013WriterProtoP\001Z/github.com/medibloc/pana" +
      "cea-core/v2/x/aol/types\242\002\003PAX\252\002\016Panacea." +
      "Aol.V2\312\002\016Panacea\\Aol\\V2\342\002\032Panacea\\Aol\\V2" +
      "\\GPBMetadata\352\002\020Panacea::Aol::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_panacea_aol_v2_Writer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_panacea_aol_v2_Writer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_aol_v2_Writer_descriptor,
        new java.lang.String[] { "Moniker", "Description", "NanoTimestamp", });
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
