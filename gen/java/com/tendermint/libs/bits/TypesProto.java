// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/libs/bits/types.proto

package com.tendermint.libs.bits;

public final class TypesProto {
  private TypesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_libs_bits_BitArray_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_libs_bits_BitArray_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n tendermint/libs/bits/types.proto\022\024tend" +
      "ermint.libs.bits\"4\n\010BitArray\022\022\n\004bits\030\001 \001" +
      "(\003R\004bits\022\024\n\005elems\030\002 \003(\004R\005elemsB\321\001\n\030com.t" +
      "endermint.libs.bitsB\nTypesProtoP\001Z7githu" +
      "b.com/cometbft/cometbft/proto/tendermint" +
      "/libs/bits\242\002\003TLB\252\002\024Tendermint.Libs.Bits\312" +
      "\002\024Tendermint\\Libs\\Bits\342\002 Tendermint\\Libs" +
      "\\Bits\\GPBMetadata\352\002\026Tendermint::Libs::Bi" +
      "tsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tendermint_libs_bits_BitArray_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tendermint_libs_bits_BitArray_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_libs_bits_BitArray_descriptor,
        new java.lang.String[] { "Bits", "Elems", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
