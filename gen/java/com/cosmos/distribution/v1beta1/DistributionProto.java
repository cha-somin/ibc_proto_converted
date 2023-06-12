// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/distribution.proto

package com.cosmos.distribution.v1beta1;

public final class DistributionProto {
  private DistributionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_Params_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewards_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewards_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewards_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewards_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommission_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorOutstandingRewards_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorOutstandingRewards_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvents_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvents_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_FeePool_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_FeePool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_DelegatorStartingInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_DelegatorStartingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_DelegationDelegatorReward_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_DelegationDelegatorReward_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposalWithDeposit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposalWithDeposit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.cosmos/distribution/v1beta1/distributi" +
      "on.proto\022\033cosmos.distribution.v1beta1\032\024g" +
      "ogoproto/gogo.proto\032\036cosmos/base/v1beta1" +
      "/coin.proto\032\031cosmos_proto/cosmos.proto\032\021" +
      "amino/amino.proto\"\273\003\n\006Params\022f\n\rcommunit" +
      "y_tax\030\001 \001(\tBA\310\336\037\000\332\336\037&github.com/cosmos/c" +
      "osmos-sdk/types.Dec\322\264-\ncosmos.Dec\250\347\260*\001R\014" +
      "communityTax\022u\n\024base_proposer_reward\030\002 \001" +
      "(\tBC\030\001\310\336\037\000\332\336\037&github.com/cosmos/cosmos-s" +
      "dk/types.Dec\322\264-\ncosmos.Dec\250\347\260*\001R\022basePro" +
      "poserReward\022w\n\025bonus_proposer_reward\030\003 \001" +
      "(\tBC\030\001\310\336\037\000\332\336\037&github.com/cosmos/cosmos-s" +
      "dk/types.Dec\322\264-\ncosmos.Dec\250\347\260*\001R\023bonusPr" +
      "oposerReward\0222\n\025withdraw_addr_enabled\030\004 " +
      "\001(\010R\023withdrawAddrEnabled:%\212\347\260* cosmos-sd" +
      "k/x/distribution/Params\"\326\001\n\032ValidatorHis" +
      "toricalRewards\022\216\001\n\027cumulative_reward_rat" +
      "io\030\001 \003(\0132\034.cosmos.base.v1beta1.DecCoinB8" +
      "\310\336\037\000\252\337\037+github.com/cosmos/cosmos-sdk/typ" +
      "es.DecCoins\250\347\260*\001R\025cumulativeRewardRatio\022" +
      "\'\n\017reference_count\030\002 \001(\rR\016referenceCount" +
      "\"\243\001\n\027ValidatorCurrentRewards\022p\n\007rewards\030" +
      "\001 \003(\0132\034.cosmos.base.v1beta1.DecCoinB8\310\336\037" +
      "\000\252\337\037+github.com/cosmos/cosmos-sdk/types." +
      "DecCoins\250\347\260*\001R\007rewards\022\026\n\006period\030\002 \001(\004R\006" +
      "period\"\230\001\n\036ValidatorAccumulatedCommissio" +
      "n\022v\n\ncommission\030\001 \003(\0132\034.cosmos.base.v1be" +
      "ta1.DecCoinB8\310\336\037\000\252\337\037+github.com/cosmos/c" +
      "osmos-sdk/types.DecCoins\250\347\260*\001R\ncommissio" +
      "n\"\217\001\n\033ValidatorOutstandingRewards\022p\n\007rew" +
      "ards\030\001 \003(\0132\034.cosmos.base.v1beta1.DecCoin" +
      "B8\310\336\037\000\252\337\037+github.com/cosmos/cosmos-sdk/t" +
      "ypes.DecCoins\250\347\260*\001R\007rewards\"\232\001\n\023Validato" +
      "rSlashEvent\022)\n\020validator_period\030\001 \001(\004R\017v" +
      "alidatorPeriod\022X\n\010fraction\030\002 \001(\tB<\310\336\037\000\332\336" +
      "\037&github.com/cosmos/cosmos-sdk/types.Dec" +
      "\322\264-\ncosmos.DecR\010fraction\"\211\001\n\024ValidatorSl" +
      "ashEvents\022q\n\026validator_slash_events\030\001 \003(" +
      "\01320.cosmos.distribution.v1beta1.Validato" +
      "rSlashEventB\t\310\336\037\000\250\347\260*\001R\024validatorSlashEv" +
      "ents\"\210\001\n\007FeePool\022}\n\016community_pool\030\001 \003(\013" +
      "2\034.cosmos.base.v1beta1.DecCoinB8\310\336\037\000\252\337\037+" +
      "github.com/cosmos/cosmos-sdk/types.DecCo" +
      "ins\250\347\260*\001R\rcommunityPool\"\227\002\n\032CommunityPoo" +
      "lSpendProposal\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013" +
      "description\030\002 \001(\tR\013description\022\034\n\trecipi" +
      "ent\030\003 \001(\tR\trecipient\022y\n\006amount\030\004 \003(\0132\031.c" +
      "osmos.base.v1beta1.CoinBF\310\336\037\000\252\337\037(github." +
      "com/cosmos/cosmos-sdk/types.Coins\232\347\260*\014le" +
      "gacy_coins\250\347\260*\001R\006amount:(\030\001\210\240\037\000\350\240\037\000\312\264-\032c" +
      "osmos.gov.v1beta1.Content\"\337\001\n\025DelegatorS" +
      "tartingInfo\022\'\n\017previous_period\030\001 \001(\004R\016pr" +
      "eviousPeriod\022W\n\005stake\030\002 \001(\tBA\310\336\037\000\332\336\037&git" +
      "hub.com/cosmos/cosmos-sdk/types.Dec\322\264-\nc" +
      "osmos.Dec\250\347\260*\001R\005stake\022D\n\006height\030\003 \001(\004B,\352" +
      "\336\037\017creation_height\242\347\260*\017creation_height\250\347" +
      "\260*\001R\006height\"\341\001\n\031DelegationDelegatorRewar" +
      "d\022N\n\021validator_address\030\001 \001(\tB!\322\264-\035cosmos" +
      ".ValidatorAddressStringR\020validatorAddres" +
      "s\022n\n\006reward\030\002 \003(\0132\034.cosmos.base.v1beta1." +
      "DecCoinB8\310\336\037\000\252\337\037+github.com/cosmos/cosmo" +
      "s-sdk/types.DecCoins\250\347\260*\001R\006reward:\004\210\240\037\000\"" +
      "\323\001\n%CommunityPoolSpendProposalWithDeposi" +
      "t\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013description\030\002" +
      " \001(\tR\013description\022\034\n\trecipient\030\003 \001(\tR\tre" +
      "cipient\022\026\n\006amount\030\004 \001(\tR\006amount\022\030\n\007depos" +
      "it\030\005 \001(\tR\007deposit:\"\210\240\037\000\312\264-\032cosmos.gov.v1" +
      "beta1.ContentB\371\001\n\037com.cosmos.distributio" +
      "n.v1beta1B\021DistributionProtoP\001Z1github.c" +
      "om/cosmos/cosmos-sdk/x/distribution/type" +
      "s\242\002\003CDX\252\002\033Cosmos.Distribution.V1beta1\312\002\033" +
      "Cosmos\\Distribution\\V1beta1\342\002\'Cosmos\\Dis" +
      "tribution\\V1beta1\\GPBMetadata\352\002\035Cosmos::" +
      "Distribution::V1beta1\250\342\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.amino.AminoProto.getDescriptor(),
        });
    internal_static_cosmos_distribution_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_distribution_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_Params_descriptor,
        new java.lang.String[] { "CommunityTax", "BaseProposerReward", "BonusProposerReward", "WithdrawAddrEnabled", });
    internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewards_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewards_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorHistoricalRewards_descriptor,
        new java.lang.String[] { "CumulativeRewardRatio", "ReferenceCount", });
    internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewards_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewards_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorCurrentRewards_descriptor,
        new java.lang.String[] { "Rewards", "Period", });
    internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommission_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorAccumulatedCommission_descriptor,
        new java.lang.String[] { "Commission", });
    internal_static_cosmos_distribution_v1beta1_ValidatorOutstandingRewards_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_distribution_v1beta1_ValidatorOutstandingRewards_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorOutstandingRewards_descriptor,
        new java.lang.String[] { "Rewards", });
    internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvent_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvent_descriptor,
        new java.lang.String[] { "ValidatorPeriod", "Fraction", });
    internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvents_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvents_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_ValidatorSlashEvents_descriptor,
        new java.lang.String[] { "ValidatorSlashEvents", });
    internal_static_cosmos_distribution_v1beta1_FeePool_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_cosmos_distribution_v1beta1_FeePool_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_FeePool_descriptor,
        new java.lang.String[] { "CommunityPool", });
    internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposal_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Recipient", "Amount", });
    internal_static_cosmos_distribution_v1beta1_DelegatorStartingInfo_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_cosmos_distribution_v1beta1_DelegatorStartingInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_DelegatorStartingInfo_descriptor,
        new java.lang.String[] { "PreviousPeriod", "Stake", "Height", });
    internal_static_cosmos_distribution_v1beta1_DelegationDelegatorReward_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_cosmos_distribution_v1beta1_DelegationDelegatorReward_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_DelegationDelegatorReward_descriptor,
        new java.lang.String[] { "ValidatorAddress", "Reward", });
    internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposalWithDeposit_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposalWithDeposit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_distribution_v1beta1_CommunityPoolSpendProposalWithDeposit_descriptor,
        new java.lang.String[] { "Title", "Description", "Recipient", "Amount", "Deposit", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.amino.AminoProto.dontOmitempty);
    registry.add(com.amino.AminoProto.encoding);
    registry.add(com.amino.AminoProto.fieldName);
    registry.add(com.amino.AminoProto.name);
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.amino.AminoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
