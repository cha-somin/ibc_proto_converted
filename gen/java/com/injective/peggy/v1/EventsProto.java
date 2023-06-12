// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/peggy/v1/events.proto

package com.injective.peggy.v1;

public final class EventsProto {
  private EventsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventAttestationObserved_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventAttestationObserved_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventBridgeWithdrawCanceled_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventBridgeWithdrawCanceled_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventOutgoingBatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventOutgoingBatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventOutgoingBatchCanceled_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventOutgoingBatchCanceled_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventValsetUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventValsetUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventSetOrchestratorAddresses_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventSetOrchestratorAddresses_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventValsetConfirm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventValsetConfirm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventSendToEth_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventSendToEth_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventConfirmBatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventConfirmBatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventAttestationVote_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventAttestationVote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventDepositClaim_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventDepositClaim_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventWithdrawClaim_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventWithdrawClaim_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventERC20DeployedClaim_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventERC20DeployedClaim_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventValsetUpdateClaim_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventValsetUpdateClaim_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventCancelSendToEth_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventCancelSendToEth_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventSubmitBadSignatureEvidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventSubmitBadSignatureEvidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_EventValidatorSlash_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_EventValidatorSlash_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037injective/peggy/v1/events.proto\022\022injec" +
      "tive.peggy.v1\032\024gogoproto/gogo.proto\032$inj" +
      "ective/peggy/v1/attestation.proto\032\036injec" +
      "tive/peggy/v1/types.proto\"\362\001\n\030EventAttes" +
      "tationObserved\022H\n\020attestation_type\030\001 \001(\016" +
      "2\035.injective.peggy.v1.ClaimTypeR\017attesta" +
      "tionType\022\'\n\017bridge_contract\030\002 \001(\tR\016bridg" +
      "eContract\022&\n\017bridge_chain_id\030\003 \001(\004R\rbrid" +
      "geChainId\022%\n\016attestation_id\030\004 \001(\014R\rattes" +
      "tationId\022\024\n\005nonce\030\005 \001(\004R\005nonce\"n\n\033EventB" +
      "ridgeWithdrawCanceled\022\'\n\017bridge_contract" +
      "\030\001 \001(\tR\016bridgeContract\022&\n\017bridge_chain_i" +
      "d\030\002 \001(\004R\rbridgeChainId\"\305\001\n\022EventOutgoing" +
      "Batch\022\024\n\005denom\030\001 \001(\tR\005denom\0221\n\024orchestra" +
      "tor_address\030\002 \001(\tR\023orchestratorAddress\022\037" +
      "\n\013batch_nonce\030\003 \001(\004R\nbatchNonce\022#\n\rbatch" +
      "_timeout\030\004 \001(\004R\014batchTimeout\022 \n\014batch_tx" +
      "_ids\030\005 \003(\004R\nbatchTxIds\"\236\001\n\032EventOutgoing" +
      "BatchCanceled\022\'\n\017bridge_contract\030\001 \001(\tR\016" +
      "bridgeContract\022&\n\017bridge_chain_id\030\002 \001(\004R" +
      "\rbridgeChainId\022\031\n\010batch_id\030\003 \001(\004R\007batchI" +
      "d\022\024\n\005nonce\030\004 \001(\004R\005nonce\"\246\002\n\030EventValsetU" +
      "pdateRequest\022!\n\014valset_nonce\030\001 \001(\004R\013vals" +
      "etNonce\022#\n\rvalset_height\030\002 \001(\004R\014valsetHe" +
      "ight\022J\n\016valset_members\030\003 \003(\0132#.injective" +
      ".peggy.v1.BridgeValidatorR\rvalsetMembers" +
      "\022S\n\rreward_amount\030\004 \001(\tB.\310\336\037\000\332\336\037&github." +
      "com/cosmos/cosmos-sdk/types.IntR\014rewardA" +
      "mount\022!\n\014reward_token\030\005 \001(\tR\013rewardToken" +
      "\"\261\001\n\035EventSetOrchestratorAddresses\022+\n\021va" +
      "lidator_address\030\001 \001(\tR\020validatorAddress\022" +
      "1\n\024orchestrator_address\030\002 \001(\tR\023orchestra" +
      "torAddress\0220\n\024operator_eth_address\030\003 \001(\t" +
      "R\022operatorEthAddress\"j\n\022EventValsetConfi" +
      "rm\022!\n\014valset_nonce\030\001 \001(\004R\013valsetNonce\0221\n" +
      "\024orchestrator_address\030\002 \001(\tR\023orchestrato" +
      "rAddress\"\203\002\n\016EventSendToEth\022$\n\016outgoing_" +
      "tx_id\030\001 \001(\004R\014outgoingTxId\022\026\n\006sender\030\002 \001(" +
      "\tR\006sender\022\032\n\010receiver\030\003 \001(\tR\010receiver\022G\n" +
      "\006amount\030\004 \001(\tB/\310\336\037\000\332\336\037\'github.com/cosmos" +
      "/cosmos-sdk/types.CoinR\006amount\022N\n\nbridge" +
      "_fee\030\005 \001(\tB/\310\336\037\000\332\336\037\'github.com/cosmos/co" +
      "smos-sdk/types.CoinR\tbridgeFee\"g\n\021EventC" +
      "onfirmBatch\022\037\n\013batch_nonce\030\001 \001(\004R\nbatchN" +
      "once\0221\n\024orchestrator_address\030\002 \001(\tR\023orch" +
      "estratorAddress\"t\n\024EventAttestationVote\022" +
      "\037\n\013event_nonce\030\001 \001(\004R\neventNonce\022%\n\016atte" +
      "station_id\030\002 \001(\014R\rattestationId\022\024\n\005voter" +
      "\030\003 \001(\tR\005voter\"\206\003\n\021EventDepositClaim\022\037\n\013e" +
      "vent_nonce\030\001 \001(\004R\neventNonce\022!\n\014event_he" +
      "ight\030\002 \001(\004R\013eventHeight\022%\n\016attestation_i" +
      "d\030\003 \001(\014R\rattestationId\022\'\n\017ethereum_sende" +
      "r\030\004 \001(\tR\016ethereumSender\022\'\n\017cosmos_receiv" +
      "er\030\005 \001(\tR\016cosmosReceiver\022%\n\016token_contra" +
      "ct\030\006 \001(\tR\rtokenContract\022F\n\006amount\030\007 \001(\tB" +
      ".\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/ty" +
      "pes.IntR\006amount\0221\n\024orchestrator_address\030" +
      "\010 \001(\tR\023orchestratorAddress\022\022\n\004data\030\t \001(\t" +
      "R\004data\"\372\001\n\022EventWithdrawClaim\022\037\n\013event_n" +
      "once\030\001 \001(\004R\neventNonce\022!\n\014event_height\030\002" +
      " \001(\004R\013eventHeight\022%\n\016attestation_id\030\003 \001(" +
      "\014R\rattestationId\022\037\n\013batch_nonce\030\004 \001(\004R\nb" +
      "atchNonce\022%\n\016token_contract\030\005 \001(\tR\rtoken" +
      "Contract\0221\n\024orchestrator_address\030\006 \001(\tR\023" +
      "orchestratorAddress\"\311\002\n\027EventERC20Deploy" +
      "edClaim\022\037\n\013event_nonce\030\001 \001(\004R\neventNonce" +
      "\022!\n\014event_height\030\002 \001(\004R\013eventHeight\022%\n\016a" +
      "ttestation_id\030\003 \001(\014R\rattestationId\022!\n\014co" +
      "smos_denom\030\004 \001(\tR\013cosmosDenom\022%\n\016token_c" +
      "ontract\030\005 \001(\tR\rtokenContract\022\022\n\004name\030\006 \001" +
      "(\tR\004name\022\026\n\006symbol\030\007 \001(\tR\006symbol\022\032\n\010deci" +
      "mals\030\010 \001(\004R\010decimals\0221\n\024orchestrator_add" +
      "ress\030\t \001(\tR\023orchestratorAddress\"\235\003\n\026Even" +
      "tValsetUpdateClaim\022\037\n\013event_nonce\030\001 \001(\004R" +
      "\neventNonce\022!\n\014event_height\030\002 \001(\004R\013event" +
      "Height\022%\n\016attestation_id\030\003 \001(\014R\rattestat" +
      "ionId\022!\n\014valset_nonce\030\004 \001(\004R\013valsetNonce" +
      "\022J\n\016valset_members\030\005 \003(\0132#.injective.peg" +
      "gy.v1.BridgeValidatorR\rvalsetMembers\022S\n\r" +
      "reward_amount\030\006 \001(\tB.\310\336\037\000\332\336\037&github.com/" +
      "cosmos/cosmos-sdk/types.IntR\014rewardAmoun" +
      "t\022!\n\014reward_token\030\007 \001(\tR\013rewardToken\0221\n\024" +
      "orchestrator_address\030\010 \001(\tR\023orchestrator" +
      "Address\"<\n\024EventCancelSendToEth\022$\n\016outgo" +
      "ing_tx_id\030\001 \001(\004R\014outgoingTxId\"\210\001\n\037EventS" +
      "ubmitBadSignatureEvidence\022*\n\021bad_eth_sig" +
      "nature\030\001 \001(\tR\017badEthSignature\0229\n\031bad_eth" +
      "_signature_subject\030\002 \001(\tR\026badEthSignatur" +
      "eSubject\"\265\001\n\023EventValidatorSlash\022\024\n\005powe" +
      "r\030\001 \001(\003R\005power\022\026\n\006reason\030\002 \001(\tR\006reason\022+" +
      "\n\021consensus_address\030\003 \001(\tR\020consensusAddr" +
      "ess\022)\n\020operator_address\030\004 \001(\tR\017operatorA" +
      "ddress\022\030\n\007moniker\030\005 \001(\tR\007monikerB\334\001\n\026com" +
      ".injective.peggy.v1B\013EventsProtoP\001ZKgith" +
      "ub.com/InjectiveLabs/injective-core/inje" +
      "ctive-chain/modules/peggy/types\242\002\003IPX\252\002\022" +
      "Injective.Peggy.V1\312\002\022Injective\\Peggy\\V1\342" +
      "\002\036Injective\\Peggy\\V1\\GPBMetadata\352\002\024Injec" +
      "tive::Peggy::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.injective.peggy.v1.AttestationProto.getDescriptor(),
          com.injective.peggy.v1.TypesProto.getDescriptor(),
        });
    internal_static_injective_peggy_v1_EventAttestationObserved_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_injective_peggy_v1_EventAttestationObserved_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventAttestationObserved_descriptor,
        new java.lang.String[] { "AttestationType", "BridgeContract", "BridgeChainId", "AttestationId", "Nonce", });
    internal_static_injective_peggy_v1_EventBridgeWithdrawCanceled_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_injective_peggy_v1_EventBridgeWithdrawCanceled_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventBridgeWithdrawCanceled_descriptor,
        new java.lang.String[] { "BridgeContract", "BridgeChainId", });
    internal_static_injective_peggy_v1_EventOutgoingBatch_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_injective_peggy_v1_EventOutgoingBatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventOutgoingBatch_descriptor,
        new java.lang.String[] { "Denom", "OrchestratorAddress", "BatchNonce", "BatchTimeout", "BatchTxIds", });
    internal_static_injective_peggy_v1_EventOutgoingBatchCanceled_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_injective_peggy_v1_EventOutgoingBatchCanceled_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventOutgoingBatchCanceled_descriptor,
        new java.lang.String[] { "BridgeContract", "BridgeChainId", "BatchId", "Nonce", });
    internal_static_injective_peggy_v1_EventValsetUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_injective_peggy_v1_EventValsetUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventValsetUpdateRequest_descriptor,
        new java.lang.String[] { "ValsetNonce", "ValsetHeight", "ValsetMembers", "RewardAmount", "RewardToken", });
    internal_static_injective_peggy_v1_EventSetOrchestratorAddresses_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_injective_peggy_v1_EventSetOrchestratorAddresses_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventSetOrchestratorAddresses_descriptor,
        new java.lang.String[] { "ValidatorAddress", "OrchestratorAddress", "OperatorEthAddress", });
    internal_static_injective_peggy_v1_EventValsetConfirm_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_injective_peggy_v1_EventValsetConfirm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventValsetConfirm_descriptor,
        new java.lang.String[] { "ValsetNonce", "OrchestratorAddress", });
    internal_static_injective_peggy_v1_EventSendToEth_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_injective_peggy_v1_EventSendToEth_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventSendToEth_descriptor,
        new java.lang.String[] { "OutgoingTxId", "Sender", "Receiver", "Amount", "BridgeFee", });
    internal_static_injective_peggy_v1_EventConfirmBatch_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_injective_peggy_v1_EventConfirmBatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventConfirmBatch_descriptor,
        new java.lang.String[] { "BatchNonce", "OrchestratorAddress", });
    internal_static_injective_peggy_v1_EventAttestationVote_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_injective_peggy_v1_EventAttestationVote_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventAttestationVote_descriptor,
        new java.lang.String[] { "EventNonce", "AttestationId", "Voter", });
    internal_static_injective_peggy_v1_EventDepositClaim_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_injective_peggy_v1_EventDepositClaim_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventDepositClaim_descriptor,
        new java.lang.String[] { "EventNonce", "EventHeight", "AttestationId", "EthereumSender", "CosmosReceiver", "TokenContract", "Amount", "OrchestratorAddress", "Data", });
    internal_static_injective_peggy_v1_EventWithdrawClaim_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_injective_peggy_v1_EventWithdrawClaim_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventWithdrawClaim_descriptor,
        new java.lang.String[] { "EventNonce", "EventHeight", "AttestationId", "BatchNonce", "TokenContract", "OrchestratorAddress", });
    internal_static_injective_peggy_v1_EventERC20DeployedClaim_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_injective_peggy_v1_EventERC20DeployedClaim_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventERC20DeployedClaim_descriptor,
        new java.lang.String[] { "EventNonce", "EventHeight", "AttestationId", "CosmosDenom", "TokenContract", "Name", "Symbol", "Decimals", "OrchestratorAddress", });
    internal_static_injective_peggy_v1_EventValsetUpdateClaim_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_injective_peggy_v1_EventValsetUpdateClaim_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventValsetUpdateClaim_descriptor,
        new java.lang.String[] { "EventNonce", "EventHeight", "AttestationId", "ValsetNonce", "ValsetMembers", "RewardAmount", "RewardToken", "OrchestratorAddress", });
    internal_static_injective_peggy_v1_EventCancelSendToEth_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_injective_peggy_v1_EventCancelSendToEth_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventCancelSendToEth_descriptor,
        new java.lang.String[] { "OutgoingTxId", });
    internal_static_injective_peggy_v1_EventSubmitBadSignatureEvidence_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_injective_peggy_v1_EventSubmitBadSignatureEvidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventSubmitBadSignatureEvidence_descriptor,
        new java.lang.String[] { "BadEthSignature", "BadEthSignatureSubject", });
    internal_static_injective_peggy_v1_EventValidatorSlash_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_injective_peggy_v1_EventValidatorSlash_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_EventValidatorSlash_descriptor,
        new java.lang.String[] { "Power", "Reason", "ConsensusAddress", "OperatorAddress", "Moniker", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.injective.peggy.v1.AttestationProto.getDescriptor();
    com.injective.peggy.v1.TypesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
