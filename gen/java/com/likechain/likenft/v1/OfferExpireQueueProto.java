// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/offer_expire_queue.proto

package com.likechain.likenft.v1;

public final class OfferExpireQueueProto {
  private OfferExpireQueueProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_likechain_likenft_v1_OfferExpireQueueEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_likechain_likenft_v1_OfferExpireQueueEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-likechain/likenft/v1/offer_expire_queu" +
      "e.proto\022\024likechain.likenft.v1\032\024gogoproto" +
      "/gogo.proto\032\037google/protobuf/timestamp.p" +
      "roto\"{\n\025OfferExpireQueueEntry\022E\n\013expire_" +
      "time\030\001 \001(\0132\032.google.protobuf.TimestampB\010" +
      "\310\336\037\000\220\337\037\001R\nexpireTime\022\033\n\toffer_key\030\002 \001(\014R" +
      "\010offerKeyB\332\001\n\030com.likechain.likenft.v1B\025" +
      "OfferExpireQueueProtoP\001Z5github.com/like" +
      "coin/likecoin-chain/v4/x/likenft/types\242\002" +
      "\003LLX\252\002\024Likechain.Likenft.V1\312\002\024Likechain\\" +
      "Likenft\\V1\342\002 Likechain\\Likenft\\V1\\GPBMet" +
      "adata\352\002\026Likechain::Likenft::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_likechain_likenft_v1_OfferExpireQueueEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_likechain_likenft_v1_OfferExpireQueueEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_likechain_likenft_v1_OfferExpireQueueEntry_descriptor,
        new java.lang.String[] { "ExpireTime", "OfferKey", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
