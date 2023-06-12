// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/store/v1beta1/listening.proto

package com.cosmos.store.v1beta1;

public final class ListeningProto {
  private ListeningProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_store_v1beta1_StoreKVPair_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_store_v1beta1_StoreKVPair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_store_v1beta1_BlockMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_store_v1beta1_BlockMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$cosmos/store/v1beta1/listening.proto\022\024" +
      "cosmos.store.v1beta1\032\033tendermint/abci/ty" +
      "pes.proto\"j\n\013StoreKVPair\022\033\n\tstore_key\030\001 " +
      "\001(\tR\010storeKey\022\026\n\006delete\030\002 \001(\010R\006delete\022\020\n" +
      "\003key\030\003 \001(\014R\003key\022\024\n\005value\030\004 \001(\014R\005value\"\264\002" +
      "\n\rBlockMetadata\022H\n\017response_commit\030\006 \001(\013" +
      "2\037.tendermint.abci.ResponseCommitR\016respo" +
      "nseCommit\022[\n\026request_finalize_block\030\007 \001(" +
      "\0132%.tendermint.abci.RequestFinalizeBlock" +
      "R\024requestFinalizeBlock\022^\n\027response_final" +
      "ize_block\030\010 \001(\0132&.tendermint.abci.Respon" +
      "seFinalizeBlockR\025responseFinalizeBlockJ\004" +
      "\010\001\020\002J\004\010\002\020\003J\004\010\003\020\004J\004\010\004\020\005J\004\010\005\020\006B\266\001\n\030com.cos" +
      "mos.store.v1beta1B\016ListeningProtoP\001Z\030cos" +
      "mossdk.io/store/types\242\002\003CSX\252\002\024Cosmos.Sto" +
      "re.V1beta1\312\002\024Cosmos\\Store\\V1beta1\342\002 Cosm" +
      "os\\Store\\V1beta1\\GPBMetadata\352\002\026Cosmos::S" +
      "tore::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tendermint.abci.TypesProto.getDescriptor(),
        });
    internal_static_cosmos_store_v1beta1_StoreKVPair_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_store_v1beta1_StoreKVPair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_store_v1beta1_StoreKVPair_descriptor,
        new java.lang.String[] { "StoreKey", "Delete", "Key", "Value", });
    internal_static_cosmos_store_v1beta1_BlockMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_store_v1beta1_BlockMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_store_v1beta1_BlockMetadata_descriptor,
        new java.lang.String[] { "ResponseCommit", "RequestFinalizeBlock", "ResponseFinalizeBlock", });
    com.tendermint.abci.TypesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
