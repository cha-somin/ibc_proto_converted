// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/transfer/v1/tx.proto

package com.ibc.applications.transfer.v1;

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
    internal_static_ibc_applications_transfer_v1_MsgTransfer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_transfer_v1_MsgTransfer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_transfer_v1_MsgTransferResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_transfer_v1_MsgTransferResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_transfer_v1_MsgUpdateParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_transfer_v1_MsgUpdateParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_transfer_v1_MsgUpdateParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_transfer_v1_MsgUpdateParamsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%ibc/applications/transfer/v1/tx.proto\022" +
      "\034ibc.applications.transfer.v1\032\024gogoproto" +
      "/gogo.proto\032\036cosmos/base/v1beta1/coin.pr" +
      "oto\032\027cosmos/msg/v1/msg.proto\032\037ibc/core/c" +
      "lient/v1/client.proto\032+ibc/applications/" +
      "transfer/v1/transfer.proto\"\337\002\n\013MsgTransf" +
      "er\022\037\n\013source_port\030\001 \001(\tR\nsourcePort\022%\n\016s" +
      "ource_channel\030\002 \001(\tR\rsourceChannel\0225\n\005to" +
      "ken\030\003 \001(\0132\031.cosmos.base.v1beta1.CoinB\004\310\336" +
      "\037\000R\005token\022\026\n\006sender\030\004 \001(\tR\006sender\022\032\n\010rec" +
      "eiver\030\005 \001(\tR\010receiver\022G\n\016timeout_height\030" +
      "\006 \001(\0132\032.ibc.core.client.v1.HeightB\004\310\336\037\000R" +
      "\rtimeoutHeight\022+\n\021timeout_timestamp\030\007 \001(" +
      "\004R\020timeoutTimestamp\022\022\n\004memo\030\010 \001(\tR\004memo:" +
      "\023\210\240\037\000\350\240\037\000\202\347\260*\006sender\"1\n\023MsgTransferRespo" +
      "nse\022\032\n\010sequence\030\001 \001(\004R\010sequence\"\203\001\n\017MsgU" +
      "pdateParams\022\034\n\tauthority\030\001 \001(\tR\tauthorit" +
      "y\022B\n\006params\030\002 \001(\0132$.ibc.applications.tra" +
      "nsfer.v1.ParamsB\004\310\336\037\000R\006params:\016\202\347\260*\tauth" +
      "ority\"\031\n\027MsgUpdateParamsResponse2\345\001\n\003Msg" +
      "\022h\n\010Transfer\022).ibc.applications.transfer" +
      ".v1.MsgTransfer\0321.ibc.applications.trans" +
      "fer.v1.MsgTransferResponse\022t\n\014UpdatePara" +
      "ms\022-.ibc.applications.transfer.v1.MsgUpd" +
      "ateParams\0325.ibc.applications.transfer.v1" +
      ".MsgUpdateParamsResponseB\367\001\n com.ibc.app" +
      "lications.transfer.v1B\007TxProtoP\001Z7github" +
      ".com/cosmos/ibc-go/v7/modules/apps/trans" +
      "fer/types\242\002\003IAT\252\002\034Ibc.Applications.Trans" +
      "fer.V1\312\002\034Ibc\\Applications\\Transfer\\V1\342\002(" +
      "Ibc\\Applications\\Transfer\\V1\\GPBMetadata" +
      "\352\002\037Ibc::Applications::Transfer::V1b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.cosmos.msg.v1.MsgProto.getDescriptor(),
          com.ibc.core.client.v1.ClientProto.getDescriptor(),
          com.ibc.applications.transfer.v1.TransferProto.getDescriptor(),
        });
    internal_static_ibc_applications_transfer_v1_MsgTransfer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_applications_transfer_v1_MsgTransfer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_transfer_v1_MsgTransfer_descriptor,
        new java.lang.String[] { "SourcePort", "SourceChannel", "Token", "Sender", "Receiver", "TimeoutHeight", "TimeoutTimestamp", "Memo", });
    internal_static_ibc_applications_transfer_v1_MsgTransferResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ibc_applications_transfer_v1_MsgTransferResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_transfer_v1_MsgTransferResponse_descriptor,
        new java.lang.String[] { "Sequence", });
    internal_static_ibc_applications_transfer_v1_MsgUpdateParams_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ibc_applications_transfer_v1_MsgUpdateParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_transfer_v1_MsgUpdateParams_descriptor,
        new java.lang.String[] { "Authority", "Params", });
    internal_static_ibc_applications_transfer_v1_MsgUpdateParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ibc_applications_transfer_v1_MsgUpdateParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_transfer_v1_MsgUpdateParamsResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos.msg.v1.MsgProto.signer);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.cosmos.msg.v1.MsgProto.getDescriptor();
    com.ibc.core.client.v1.ClientProto.getDescriptor();
    com.ibc.applications.transfer.v1.TransferProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
