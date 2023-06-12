# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stafihub/ledger/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from stafihub.ledger import ledger_pb2 as stafihub_dot_ledger_dot_ledger__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1dstafihub/ledger/genesis.proto\x12\x18stafihub.stafihub.ledger\x1a\x14gogoproto/gogo.proto\x1a\x1cstafihub/ledger/ledger.proto\"\xd1\x11\n\x0cGenesisState\x12X\n\x10\x65xchangeRateList\x18\x01 \x03(\x0b\x32&.stafihub.stafihub.ledger.ExchangeRateB\x04\xc8\xde\x1f\x00R\x10\x65xchangeRateList\x12[\n\x13\x65raExchangeRateList\x18\x02 \x03(\x0b\x32).stafihub.stafihub.ledger.EraExchangeRateR\x13\x65raExchangeRateList\x12^\n\x14totalProtocolFeeList\x18\x03 \x03(\x0b\x32*.stafihub.stafihub.ledger.TotalProtocolFeeR\x14totalProtocolFeeList\x12R\n\x10unbondSwitchList\x18\x04 \x03(\x0b\x32&.stafihub.stafihub.ledger.UnbondSwitchR\x10unbondSwitchList\x12\x46\n\x0e\x62ondedPoolList\x18\x05 \x03(\x0b\x32\x1e.stafihub.stafihub.ledger.PoolR\x0e\x62ondedPoolList\x12R\n\x10\x62ondPipelineList\x18\x06 \x03(\x0b\x32&.stafihub.stafihub.ledger.BondPipelineR\x10\x62ondPipelineList\x12X\n\x12\x65raUnbondLimitList\x18\x07 \x03(\x0b\x32(.stafihub.stafihub.ledger.EraUnbondLimitR\x12\x65raUnbondLimitList\x12L\n\x0epoolDetailList\x18\x08 \x03(\x0b\x32$.stafihub.stafihub.ledger.PoolDetailR\x0epoolDetailList\x12]\n\x16\x63urrentEraSnapshotList\x18\t \x03(\x0b\x32%.stafihub.stafihub.ledger.EraSnapshotR\x16\x63urrentEraSnapshotList\x12M\n\x0csnapshotList\x18\n \x03(\x0b\x32).stafihub.stafihub.ledger.GenesisSnapshotR\x0csnapshotList\x12V\n\x0f\x65raSnapshotList\x18\x0b \x03(\x0b\x32,.stafihub.stafihub.ledger.GenesisEraSnapshotR\x0f\x65raSnapshotList\x12\x46\n\x0c\x63hainEraList\x18\x0c \x03(\x0b\x32\".stafihub.stafihub.ledger.ChainEraR\x0c\x63hainEraList\x12s\n\x1bstakingRewardCommissionList\x18\r \x03(\x0b\x32\x31.stafihub.stafihub.ledger.StakingRewardCommissionR\x1bstakingRewardCommissionList\x12\x30\n\x13protocolFeeReceiver\x18\x0e \x01(\tR\x13protocolFeeReceiver\x12^\n\x14relayFeeReceiverList\x18\x0f \x03(\x0b\x32*.stafihub.stafihub.ledger.RelayFeeReceiverR\x14relayFeeReceiverList\x12g\n\x17totalExpectedActiveList\x18\x10 \x03(\x0b\x32-.stafihub.stafihub.ledger.TotalExpectedActiveR\x17totalExpectedActiveList\x12\\\n\x11poolUnbondingList\x18\x11 \x03(\x0b\x32..stafihub.stafihub.ledger.GenesisPoolUnbondingR\x11poolUnbondingList\x12X\n\x12unbondRelayFeeList\x18\x12 \x03(\x0b\x32(.stafihub.stafihub.ledger.UnbondRelayFeeR\x12unbondRelayFeeList\x12^\n\x14unbondCommissionList\x18\x13 \x03(\x0b\x32*.stafihub.stafihub.ledger.UnbondCommissionR\x14unbondCommissionList\x12L\n\x0e\x62ondRecordList\x18\x14 \x03(\x0b\x32$.stafihub.stafihub.ledger.BondRecordR\x0e\x62ondRecordList\x12\x43\n\x0brparamsList\x18\x15 \x03(\x0b\x32!.stafihub.stafihub.ledger.RParamsR\x0brparamsList\x12I\n\rsignatureList\x18\x16 \x03(\x0b\x32#.stafihub.stafihub.ledger.SignatureR\rsignatureList\x12(\n\x0fMigrateIsSealed\x18\x17 \x01(\x08R\x0fMigrateIsSealed\x12U\n\x11icaPoolDetailList\x18\x18 \x03(\x0b\x32\'.stafihub.stafihub.ledger.IcaPoolDetailR\x11icaPoolDetailList\x12}\n\x1cinterchainTxProposalInfoList\x18\x19 \x03(\x0b\x32\x39.stafihub.stafihub.ledger.GenesisInterchainTxProposalInfoR\x1cinterchainTxProposalInfoList\x12^\n\x14totalExpectedFeeList\x18\x1a \x03(\x0b\x32*.stafihub.stafihub.ledger.TotalExpectedFeeR\x14totalExpectedFeeList\"<\n\x0cUnbondSwitch\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x16\n\x06switch\x18\x02 \x01(\x08R\x06switch\"V\n\x12GenesisEraSnapshot\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x10\n\x03\x65ra\x18\x02 \x01(\rR\x03\x65ra\x12\x18\n\x07shotIds\x18\x03 \x03(\tR\x07shotIds\"u\n\x17StakingRewardCommission\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x44\n\x05value\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/stafihub/stafihub/utils.DecR\x05value\"n\n\x10UnbondCommission\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x44\n\x05value\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/stafihub/stafihub/utils.DecR\x05value\"B\n\x10RelayFeeReceiver\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\"\x83\x01\n\x13TotalExpectedActive\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x10\n\x03\x65ra\x18\x02 \x01(\rR\x03\x65ra\x12\x44\n\x05value\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x05value\"\x80\x01\n\x10TotalExpectedFee\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x10\n\x03\x65ra\x18\x02 \x01(\rR\x03\x65ra\x12\x44\n\x05value\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x05value\"\xb1\x01\n\x14GenesisPoolUnbonding\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x10\n\x03\x65ra\x18\x02 \x01(\rR\x03\x65ra\x12\x12\n\x04pool\x18\x03 \x01(\tR\x04pool\x12\x1a\n\x08sequence\x18\x04 \x01(\rR\x08sequence\x12\x41\n\tunbonding\x18\x05 \x01(\x0b\x32#.stafihub.stafihub.ledger.UnbondingR\tunbonding\"m\n\x0fGenesisSnapshot\x12\x16\n\x06shotId\x18\x01 \x01(\tR\x06shotId\x12\x42\n\x08snapshot\x18\x02 \x01(\x0b\x32&.stafihub.stafihub.ledger.BondSnapshotR\x08snapshot\"\xe9\x01\n\x1fGenesisInterchainTxProposalInfo\x12\x1e\n\nctrlPortId\x18\x01 \x01(\tR\nctrlPortId\x12$\n\rctrlChannelId\x18\x02 \x01(\tR\rctrlChannelId\x12\x1a\n\x08sequence\x18\x03 \x01(\x04R\x08sequence\x12\x1e\n\nproposalId\x18\x04 \x01(\tR\nproposalId\x12\x44\n\x06status\x18\x05 \x01(\x0e\x32,.stafihub.stafihub.ledger.InterchainTxStatusR\x06statusB\xdb\x01\n\x1c\x63om.stafihub.stafihub.ledgerB\x0cGenesisProtoP\x01Z+github.com/stafihub/stafihub/x/ledger/types\xa2\x02\x03SSL\xaa\x02\x18Stafihub.Stafihub.Ledger\xca\x02\x18Stafihub\\Stafihub\\Ledger\xe2\x02$Stafihub\\Stafihub\\Ledger\\GPBMetadata\xea\x02\x1aStafihub::Stafihub::Ledgerb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stafihub.ledger.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.stafihub.stafihub.ledgerB\014GenesisProtoP\001Z+github.com/stafihub/stafihub/x/ledger/types\242\002\003SSL\252\002\030Stafihub.Stafihub.Ledger\312\002\030Stafihub\\Stafihub\\Ledger\342\002$Stafihub\\Stafihub\\Ledger\\GPBMetadata\352\002\032Stafihub::Stafihub::Ledger'
  _GENESISSTATE.fields_by_name['exchangeRateList']._options = None
  _GENESISSTATE.fields_by_name['exchangeRateList']._serialized_options = b'\310\336\037\000'
  _STAKINGREWARDCOMMISSION.fields_by_name['value']._options = None
  _STAKINGREWARDCOMMISSION.fields_by_name['value']._serialized_options = b'\310\336\037\000\332\336\037&github.com/stafihub/stafihub/utils.Dec'
  _UNBONDCOMMISSION.fields_by_name['value']._options = None
  _UNBONDCOMMISSION.fields_by_name['value']._serialized_options = b'\310\336\037\000\332\336\037&github.com/stafihub/stafihub/utils.Dec'
  _TOTALEXPECTEDACTIVE.fields_by_name['value']._options = None
  _TOTALEXPECTEDACTIVE.fields_by_name['value']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _TOTALEXPECTEDFEE.fields_by_name['value']._options = None
  _TOTALEXPECTEDFEE.fields_by_name['value']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_GENESISSTATE']._serialized_start=112
  _globals['_GENESISSTATE']._serialized_end=2369
  _globals['_UNBONDSWITCH']._serialized_start=2371
  _globals['_UNBONDSWITCH']._serialized_end=2431
  _globals['_GENESISERASNAPSHOT']._serialized_start=2433
  _globals['_GENESISERASNAPSHOT']._serialized_end=2519
  _globals['_STAKINGREWARDCOMMISSION']._serialized_start=2521
  _globals['_STAKINGREWARDCOMMISSION']._serialized_end=2638
  _globals['_UNBONDCOMMISSION']._serialized_start=2640
  _globals['_UNBONDCOMMISSION']._serialized_end=2750
  _globals['_RELAYFEERECEIVER']._serialized_start=2752
  _globals['_RELAYFEERECEIVER']._serialized_end=2818
  _globals['_TOTALEXPECTEDACTIVE']._serialized_start=2821
  _globals['_TOTALEXPECTEDACTIVE']._serialized_end=2952
  _globals['_TOTALEXPECTEDFEE']._serialized_start=2955
  _globals['_TOTALEXPECTEDFEE']._serialized_end=3083
  _globals['_GENESISPOOLUNBONDING']._serialized_start=3086
  _globals['_GENESISPOOLUNBONDING']._serialized_end=3263
  _globals['_GENESISSNAPSHOT']._serialized_start=3265
  _globals['_GENESISSNAPSHOT']._serialized_end=3374
  _globals['_GENESISINTERCHAINTXPROPOSALINFO']._serialized_start=3377
  _globals['_GENESISINTERCHAINTXPROPOSALINFO']._serialized_end=3610
# @@protoc_insertion_point(module_scope)
