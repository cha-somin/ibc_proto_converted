// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/auth/v1alpha1/tx.proto

package com.shentu.auth.v1alpha1;

public final class TxProto {
  private TxProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_shentu_auth_v1alpha1_MsgUnlock_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_shentu_auth_v1alpha1_MsgUnlock_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_shentu_auth_v1alpha1_MsgUnlockResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_shentu_auth_v1alpha1_MsgUnlockResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035shentu/auth/v1alpha1/tx.proto\022\024shentu." +
      "auth.v1alpha1\032\024gogoproto/gogo.proto\032\036cos" +
      "mos/base/v1beta1/coin.proto\"\350\001\n\tMsgUnloc" +
      "k\022)\n\006issuer\030\001 \001(\tB\021\362\336\037\ryaml:\"issuer\"R\006is" +
      "suer\0224\n\007account\030\002 \001(\tB\032\362\336\037\026yaml:\"account" +
      "_address\"R\007account\022p\n\runlock_amount\030\003 \003(" +
      "\0132\031.cosmos.base.v1beta1.CoinB0\310\336\037\000\252\337\037(gi" +
      "thub.com/cosmos/cosmos-sdk/types.CoinsR\014" +
      "unlockAmount:\010\210\240\037\000\350\240\037\000\"\023\n\021MsgUnlockRespo" +
      "nse2Y\n\003Msg\022R\n\006Unlock\022\037.shentu.auth.v1alp" +
      "ha1.MsgUnlock\032\'.shentu.auth.v1alpha1.Msg" +
      "UnlockResponseB\306\001\n\030com.shentu.auth.v1alp" +
      "ha1B\007TxProtoP\001Z/github.com/shentufoundat" +
      "ion/shentu/x/auth/types\242\002\003SAX\252\002\024Shentu.A" +
      "uth.V1alpha1\312\002\024Shentu\\Auth\\V1alpha1\342\002 Sh" +
      "entu\\Auth\\V1alpha1\\GPBMetadata\352\002\026Shentu:" +
      ":Auth::V1alpha1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_shentu_auth_v1alpha1_MsgUnlock_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_shentu_auth_v1alpha1_MsgUnlock_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_shentu_auth_v1alpha1_MsgUnlock_descriptor,
        new java.lang.String[] { "Issuer", "Account", "UnlockAmount", });
    internal_static_shentu_auth_v1alpha1_MsgUnlockResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_shentu_auth_v1alpha1_MsgUnlockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_shentu_auth_v1alpha1_MsgUnlockResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
