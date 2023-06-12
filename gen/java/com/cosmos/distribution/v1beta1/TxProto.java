// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/tx.proto

package com.cosmos.distribution.v1beta1;

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
    internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddressResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddressResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_MsgWithdrawDelegatorReward_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_MsgWithdrawDelegatorReward_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_MsgWithdrawDelegatorRewardResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_MsgWithdrawDelegatorRewardResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommission_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommissionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommissionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_MsgFundCommunityPool_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_MsgFundCommunityPool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_MsgFundCommunityPoolResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_MsgFundCommunityPoolResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_MsgUpdateParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_MsgUpdateParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_MsgUpdateParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_MsgUpdateParamsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_MsgCommunityPoolSpend_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_MsgCommunityPoolSpend_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_MsgCommunityPoolSpendResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_MsgCommunityPoolSpendResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_MsgDepositValidatorRewardsPool_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_MsgDepositValidatorRewardsPool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_MsgDepositValidatorRewardsPoolResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_MsgDepositValidatorRewardsPoolResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$cosmos/distribution/v1beta1/tx.proto\022\033" +
      "cosmos.distribution.v1beta1\032\024gogoproto/g" +
      "ogo.proto\032\036cosmos/base/v1beta1/coin.prot" +
      "o\032\031cosmos_proto/cosmos.proto\032\027cosmos/msg" +
      "/v1/msg.proto\032\021amino/amino.proto\032.cosmos" +
      "/distribution/v1beta1/distribution.proto" +
      "\"\353\001\n\025MsgSetWithdrawAddress\022E\n\021delegator_" +
      "address\030\001 \001(\tB\030\322\264-\024cosmos.AddressStringR" +
      "\020delegatorAddress\022C\n\020withdraw_address\030\002 " +
      "\001(\tB\030\322\264-\024cosmos.AddressStringR\017withdrawA" +
      "ddress:F\210\240\037\000\350\240\037\000\202\347\260*\021delegator_address\212\347" +
      "\260*#cosmos-sdk/MsgModifyWithdrawAddress\"\037" +
      "\n\035MsgSetWithdrawAddressResponse\"\376\001\n\032MsgW" +
      "ithdrawDelegatorReward\022E\n\021delegator_addr" +
      "ess\030\001 \001(\tB\030\322\264-\024cosmos.AddressStringR\020del" +
      "egatorAddress\022N\n\021validator_address\030\002 \001(\t" +
      "B!\322\264-\035cosmos.ValidatorAddressStringR\020val" +
      "idatorAddress:I\210\240\037\000\350\240\037\000\202\347\260*\021delegator_ad" +
      "dress\212\347\260*&cosmos-sdk/MsgWithdrawDelegati" +
      "onReward\"\237\001\n\"MsgWithdrawDelegatorRewardR" +
      "esponse\022y\n\006amount\030\001 \003(\0132\031.cosmos.base.v1" +
      "beta1.CoinBF\310\336\037\000\252\337\037(github.com/cosmos/co" +
      "smos-sdk/types.Coins\232\347\260*\014legacy_coins\250\347\260" +
      "*\001R\006amount\"\270\001\n\036MsgWithdrawValidatorCommi" +
      "ssion\022N\n\021validator_address\030\001 \001(\tB!\322\264-\035co" +
      "smos.ValidatorAddressStringR\020validatorAd" +
      "dress:F\210\240\037\000\350\240\037\000\202\347\260*\021validator_address\212\347\260" +
      "*#cosmos-sdk/MsgWithdrawValCommission\"\243\001" +
      "\n&MsgWithdrawValidatorCommissionResponse" +
      "\022y\n\006amount\030\001 \003(\0132\031.cosmos.base.v1beta1.C" +
      "oinBF\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sd" +
      "k/types.Coins\232\347\260*\014legacy_coins\250\347\260*\001R\006amo" +
      "unt\"\205\002\n\024MsgFundCommunityPool\022y\n\006amount\030\001" +
      " \003(\0132\031.cosmos.base.v1beta1.CoinBF\310\336\037\000\252\337\037" +
      "(github.com/cosmos/cosmos-sdk/types.Coin" +
      "s\232\347\260*\014legacy_coins\250\347\260*\001R\006amount\0226\n\tdepos" +
      "itor\030\002 \001(\tB\030\322\264-\024cosmos.AddressStringR\tde" +
      "positor::\210\240\037\000\350\240\037\000\202\347\260*\tdepositor\212\347\260*\037cosm" +
      "os-sdk/MsgFundCommunityPool\"\036\n\034MsgFundCo" +
      "mmunityPoolResponse\"\315\001\n\017MsgUpdateParams\022" +
      "6\n\tauthority\030\001 \001(\tB\030\322\264-\024cosmos.AddressSt" +
      "ringR\tauthority\022F\n\006params\030\002 \001(\0132#.cosmos" +
      ".distribution.v1beta1.ParamsB\t\310\336\037\000\250\347\260*\001R" +
      "\006params::\202\347\260*\tauthority\212\347\260*\'cosmos-sdk/d" +
      "istribution/MsgUpdateParams\"\031\n\027MsgUpdate" +
      "ParamsResponse\"\243\002\n\025MsgCommunityPoolSpend" +
      "\0226\n\tauthority\030\001 \001(\tB\030\322\264-\024cosmos.AddressS" +
      "tringR\tauthority\022\034\n\trecipient\030\002 \001(\tR\trec" +
      "ipient\022y\n\006amount\030\003 \003(\0132\031.cosmos.base.v1b" +
      "eta1.CoinBF\310\336\037\000\252\337\037(github.com/cosmos/cos" +
      "mos-sdk/types.Coins\232\347\260*\014legacy_coins\250\347\260*" +
      "\001R\006amount:9\202\347\260*\tauthority\212\347\260*&cosmos-sdk" +
      "/distr/MsgCommunityPoolSpend\"\037\n\035MsgCommu" +
      "nityPoolSpendResponse\"\345\002\n\036MsgDepositVali" +
      "datorRewardsPool\0226\n\tdepositor\030\001 \001(\tB\030\322\264-" +
      "\024cosmos.AddressStringR\tdepositor\022N\n\021vali" +
      "dator_address\030\002 \001(\tB!\322\264-\035cosmos.Validato" +
      "rAddressStringR\020validatorAddress\022y\n\006amou" +
      "nt\030\003 \003(\0132\031.cosmos.base.v1beta1.CoinBF\310\336\037" +
      "\000\252\337\037(github.com/cosmos/cosmos-sdk/types." +
      "Coins\232\347\260*\014legacy_coins\250\347\260*\001R\006amount:@\210\240\037" +
      "\000\350\240\037\000\202\347\260*\tdepositor\212\347\260*%cosmos-sdk/distr" +
      "/MsgDepositValRewards\"(\n&MsgDepositValid" +
      "atorRewardsPoolResponse2\354\007\n\003Msg\022\204\001\n\022SetW" +
      "ithdrawAddress\0222.cosmos.distribution.v1b" +
      "eta1.MsgSetWithdrawAddress\032:.cosmos.dist" +
      "ribution.v1beta1.MsgSetWithdrawAddressRe" +
      "sponse\022\223\001\n\027WithdrawDelegatorReward\0227.cos" +
      "mos.distribution.v1beta1.MsgWithdrawDele" +
      "gatorReward\032?.cosmos.distribution.v1beta" +
      "1.MsgWithdrawDelegatorRewardResponse\022\237\001\n" +
      "\033WithdrawValidatorCommission\022;.cosmos.di" +
      "stribution.v1beta1.MsgWithdrawValidatorC" +
      "ommission\032C.cosmos.distribution.v1beta1." +
      "MsgWithdrawValidatorCommissionResponse\022\201" +
      "\001\n\021FundCommunityPool\0221.cosmos.distributi" +
      "on.v1beta1.MsgFundCommunityPool\0329.cosmos" +
      ".distribution.v1beta1.MsgFundCommunityPo" +
      "olResponse\022r\n\014UpdateParams\022,.cosmos.dist" +
      "ribution.v1beta1.MsgUpdateParams\0324.cosmo" +
      "s.distribution.v1beta1.MsgUpdateParamsRe" +
      "sponse\022\204\001\n\022CommunityPoolSpend\0222.cosmos.d" +
      "istribution.v1beta1.MsgCommunityPoolSpen" +
      "d\032:.cosmos.distribution.v1beta1.MsgCommu" +
      "nityPoolSpendResponse\022\237\001\n\033DepositValidat" +
      "orRewardsPool\022;.cosmos.distribution.v1be" +
      "ta1.MsgDepositValidatorRewardsPool\032C.cos" +
      "mos.distribution.v1beta1.MsgDepositValid" +
      "atorRewardsPoolResponse\032\005\200\347\260*\001B\357\001\n\037com.c" +
      "osmos.distribution.v1beta1B\007TxProtoP\001Z1g" +
      "ithub.com/cosmos/cosmos-sdk/x/distributi" +
      "on/types\242\002\003CDX\252\002\033Cosmos.Distribution.V1b" +
      "eta1\312\002\033Cosmos\\Distribution\\V1beta1\342\002\'Cos" +
      "mos\\Distribution\\V1beta1\\GPBMetadata\352\002\035C" +
      "osmos::Distribution::V1beta1\250\342\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.cosmos.msg.v1.MsgProto.getDescriptor(),
          com.amino.AminoProto.getDescriptor(),
          com.cosmos.distribution.v1beta1.DistributionProto.getDescriptor(),
        });
    internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddress_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddress_descriptor,
        new java.lang.String[] { "DelegatorAddress", "WithdrawAddress", });
    internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddressResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddressResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_MsgSetWithdrawAddressResponse_descriptor,
        new java.lang.String[] { });
    internal_static_cosmos_distribution_v1beta1_MsgWithdrawDelegatorReward_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_distribution_v1beta1_MsgWithdrawDelegatorReward_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_MsgWithdrawDelegatorReward_descriptor,
        new java.lang.String[] { "DelegatorAddress", "ValidatorAddress", });
    internal_static_cosmos_distribution_v1beta1_MsgWithdrawDelegatorRewardResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_distribution_v1beta1_MsgWithdrawDelegatorRewardResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_MsgWithdrawDelegatorRewardResponse_descriptor,
        new java.lang.String[] { "Amount", });
    internal_static_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommission_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommission_descriptor,
        new java.lang.String[] { "ValidatorAddress", });
    internal_static_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommissionResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommissionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommissionResponse_descriptor,
        new java.lang.String[] { "Amount", });
    internal_static_cosmos_distribution_v1beta1_MsgFundCommunityPool_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_cosmos_distribution_v1beta1_MsgFundCommunityPool_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_MsgFundCommunityPool_descriptor,
        new java.lang.String[] { "Amount", "Depositor", });
    internal_static_cosmos_distribution_v1beta1_MsgFundCommunityPoolResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_cosmos_distribution_v1beta1_MsgFundCommunityPoolResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_MsgFundCommunityPoolResponse_descriptor,
        new java.lang.String[] { });
    internal_static_cosmos_distribution_v1beta1_MsgUpdateParams_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_cosmos_distribution_v1beta1_MsgUpdateParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_MsgUpdateParams_descriptor,
        new java.lang.String[] { "Authority", "Params", });
    internal_static_cosmos_distribution_v1beta1_MsgUpdateParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_cosmos_distribution_v1beta1_MsgUpdateParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_MsgUpdateParamsResponse_descriptor,
        new java.lang.String[] { });
    internal_static_cosmos_distribution_v1beta1_MsgCommunityPoolSpend_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_cosmos_distribution_v1beta1_MsgCommunityPoolSpend_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_MsgCommunityPoolSpend_descriptor,
        new java.lang.String[] { "Authority", "Recipient", "Amount", });
    internal_static_cosmos_distribution_v1beta1_MsgCommunityPoolSpendResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_cosmos_distribution_v1beta1_MsgCommunityPoolSpendResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_MsgCommunityPoolSpendResponse_descriptor,
        new java.lang.String[] { });
    internal_static_cosmos_distribution_v1beta1_MsgDepositValidatorRewardsPool_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_cosmos_distribution_v1beta1_MsgDepositValidatorRewardsPool_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_MsgDepositValidatorRewardsPool_descriptor,
        new java.lang.String[] { "Depositor", "ValidatorAddress", "Amount", });
    internal_static_cosmos_distribution_v1beta1_MsgDepositValidatorRewardsPoolResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_cosmos_distribution_v1beta1_MsgDepositValidatorRewardsPoolResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_MsgDepositValidatorRewardsPoolResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.amino.AminoProto.dontOmitempty);
    registry.add(com.amino.AminoProto.encoding);
    registry.add(com.amino.AminoProto.name);
    registry.add(com.cosmos.msg.v1.MsgProto.service);
    registry.add(com.cosmos.msg.v1.MsgProto.signer);
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.cosmos.msg.v1.MsgProto.getDescriptor();
    com.amino.AminoProto.getDescriptor();
    com.cosmos.distribution.v1beta1.DistributionProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
