// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/mining/models.proto

package com.stafihub.stafihub.mining;

public final class ModelsProto {
  private ModelsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_mining_StakePool_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_mining_StakePool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_mining_RewardPool_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_mining_RewardPool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_mining_UserStakeRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_mining_UserStakeRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_mining_UserRewardInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_mining_UserRewardInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_mining_RewardToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_mining_RewardToken_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_mining_StakeItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_mining_StakeItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_mining_StakeItemLimit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_mining_StakeItemLimit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034stafihub/mining/models.proto\022\030stafihub" +
      ".stafihub.mining\032\024gogoproto/gogo.proto\"\221" +
      "\003\n\tStakePool\022\024\n\005index\030\001 \001(\rR\005index\022(\n\017st" +
      "akeTokenDenom\030\002 \001(\tR\017stakeTokenDenom\022F\n\013" +
      "rewardPools\030\003 \003(\0132$.stafihub.stafihub.mi" +
      "ning.RewardPoolR\013rewardPools\022\\\n\021totalSta" +
      "kedAmount\030\004 \001(\tB.\310\336\037\000\332\336\037&github.com/cosm" +
      "os/cosmos-sdk/types.IntR\021totalStakedAmou" +
      "nt\022Z\n\020totalStakedPower\030\005 \001(\tB.\310\336\037\000\332\336\037&gi" +
      "thub.com/cosmos/cosmos-sdk/types.IntR\020to" +
      "talStakedPower\022(\n\017emergencySwitch\030\006 \001(\010R" +
      "\017emergencySwitch\022\030\n\007creator\030\007 \001(\tR\007creat" +
      "or\"\216\005\n\nRewardPool\022\024\n\005index\030\001 \001(\rR\005index\022" +
      "*\n\020rewardTokenDenom\030\002 \001(\tR\020rewardTokenDe" +
      "nom\022\\\n\021totalRewardAmount\030\003 \001(\tB.\310\336\037\000\332\336\037&" +
      "github.com/cosmos/cosmos-sdk/types.IntR\021" +
      "totalRewardAmount\022Z\n\020leftRewardAmount\030\004 " +
      "\001(\tB.\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sd" +
      "k/types.IntR\020leftRewardAmount\022X\n\017rewardP" +
      "erSecond\030\005 \001(\tB.\310\336\037\000\332\336\037&github.com/cosmo" +
      "s/cosmos-sdk/types.IntR\017rewardPerSecond\022" +
      "&\n\016startTimestamp\030\006 \001(\004R\016startTimestamp\022" +
      "V\n\016rewardPerPower\030\007 \001(\tB.\310\336\037\000\332\336\037&github." +
      "com/cosmos/cosmos-sdk/types.IntR\016rewardP" +
      "erPower\0220\n\023lastRewardTimestamp\030\010 \001(\004R\023la" +
      "stRewardTimestamp\022\030\n\007creator\030\t \001(\tR\007crea" +
      "tor\022^\n\022totalClaimedAmount\030\n \001(\tB.\310\336\037\000\332\336\037" +
      "&github.com/cosmos/cosmos-sdk/types.IntR" +
      "\022totalClaimedAmount\"\347\003\n\017UserStakeRecord\022" +
      " \n\013userAddress\030\001 \001(\tR\013userAddress\022&\n\016sta" +
      "kePoolIndex\030\002 \001(\rR\016stakePoolIndex\022\024\n\005ind" +
      "ex\030\003 \001(\rR\005index\022R\n\014stakedAmount\030\004 \001(\tB.\310" +
      "\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/type" +
      "s.IntR\014stakedAmount\022P\n\013stakedPower\030\005 \001(\t" +
      "B.\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/t" +
      "ypes.IntR\013stakedPower\022&\n\016startTimestamp\030" +
      "\006 \001(\004R\016startTimestamp\022*\n\020lockEndTimestam" +
      "p\030\007 \001(\004R\020lockEndTimestamp\022R\n\017userRewardI" +
      "nfos\030\010 \003(\0132(.stafihub.stafihub.mining.Us" +
      "erRewardInfoR\017userRewardInfos\022&\n\016stakeIt" +
      "emIndex\030\t \001(\rR\016stakeItemIndex\"\214\002\n\016UserRe" +
      "wardInfo\022(\n\017rewardPoolIndex\030\001 \001(\rR\017rewar" +
      "dPoolIndex\022*\n\020rewardTokenDenom\030\002 \001(\tR\020re" +
      "wardTokenDenom\022N\n\nrewardDebt\030\003 \001(\tB.\310\336\037\000" +
      "\332\336\037&github.com/cosmos/cosmos-sdk/types.I" +
      "ntR\nrewardDebt\022T\n\rclaimedAmount\030\004 \001(\tB.\310" +
      "\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/type" +
      "s.IntR\rclaimedAmount\"\375\001\n\013RewardToken\022*\n\020" +
      "rewardTokenDenom\030\001 \001(\tR\020rewardTokenDenom" +
      "\022b\n\024minTotalRewardAmount\030\002 \001(\tB.\310\336\037\000\332\336\037&" +
      "github.com/cosmos/cosmos-sdk/types.IntR\024" +
      "minTotalRewardAmount\022^\n\022minRewardPerSeco" +
      "nd\030\003 \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos/cosm" +
      "os-sdk/types.IntR\022minRewardPerSecond\"\333\001\n" +
      "\tStakeItem\022\024\n\005index\030\001 \001(\rR\005index\022&\n\016stak" +
      "ePoolIndex\030\002 \001(\rR\016stakePoolIndex\022\036\n\nlock" +
      "Second\030\003 \001(\004R\nlockSecond\022X\n\017powerRewardR" +
      "ate\030\004 \001(\tB.\310\336\037\000\332\336\037&github.com/stafihub/s" +
      "tafihub/utils.DecR\017powerRewardRate\022\026\n\006en" +
      "able\030\005 \001(\010R\006enable\"\226\001\n\016StakeItemLimit\022^\n" +
      "\022maxPowerRewardRate\030\001 \001(\tB.\310\336\037\000\332\336\037&githu" +
      "b.com/stafihub/stafihub/utils.DecR\022maxPo" +
      "werRewardRate\022$\n\rmaxLockSecond\030\002 \001(\004R\rma" +
      "xLockSecondB\332\001\n\034com.stafihub.stafihub.mi" +
      "ningB\013ModelsProtoP\001Z+github.com/stafihub" +
      "/stafihub/x/mining/types\242\002\003SSM\252\002\030Stafihu" +
      "b.Stafihub.Mining\312\002\030Stafihub\\Stafihub\\Mi" +
      "ning\342\002$Stafihub\\Stafihub\\Mining\\GPBMetad" +
      "ata\352\002\032Stafihub::Stafihub::Miningb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_stafihub_stafihub_mining_StakePool_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stafihub_stafihub_mining_StakePool_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_mining_StakePool_descriptor,
        new java.lang.String[] { "Index", "StakeTokenDenom", "RewardPools", "TotalStakedAmount", "TotalStakedPower", "EmergencySwitch", "Creator", });
    internal_static_stafihub_stafihub_mining_RewardPool_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_stafihub_stafihub_mining_RewardPool_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_mining_RewardPool_descriptor,
        new java.lang.String[] { "Index", "RewardTokenDenom", "TotalRewardAmount", "LeftRewardAmount", "RewardPerSecond", "StartTimestamp", "RewardPerPower", "LastRewardTimestamp", "Creator", "TotalClaimedAmount", });
    internal_static_stafihub_stafihub_mining_UserStakeRecord_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_stafihub_stafihub_mining_UserStakeRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_mining_UserStakeRecord_descriptor,
        new java.lang.String[] { "UserAddress", "StakePoolIndex", "Index", "StakedAmount", "StakedPower", "StartTimestamp", "LockEndTimestamp", "UserRewardInfos", "StakeItemIndex", });
    internal_static_stafihub_stafihub_mining_UserRewardInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_stafihub_stafihub_mining_UserRewardInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_mining_UserRewardInfo_descriptor,
        new java.lang.String[] { "RewardPoolIndex", "RewardTokenDenom", "RewardDebt", "ClaimedAmount", });
    internal_static_stafihub_stafihub_mining_RewardToken_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_stafihub_stafihub_mining_RewardToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_mining_RewardToken_descriptor,
        new java.lang.String[] { "RewardTokenDenom", "MinTotalRewardAmount", "MinRewardPerSecond", });
    internal_static_stafihub_stafihub_mining_StakeItem_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_stafihub_stafihub_mining_StakeItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_mining_StakeItem_descriptor,
        new java.lang.String[] { "Index", "StakePoolIndex", "LockSecond", "PowerRewardRate", "Enable", });
    internal_static_stafihub_stafihub_mining_StakeItemLimit_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_stafihub_stafihub_mining_StakeItemLimit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_mining_StakeItemLimit_descriptor,
        new java.lang.String[] { "MaxPowerRewardRate", "MaxLockSecond", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
