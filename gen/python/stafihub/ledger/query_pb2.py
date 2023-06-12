# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stafihub/ledger/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from stafihub.ledger import ledger_pb2 as stafihub_dot_ledger_dot_ledger__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1bstafihub/ledger/query.proto\x12\x18stafihub.stafihub.ledger\x1a\x14gogoproto/gogo.proto\x1a\x1cstafihub/ledger/ledger.proto\x1a\x1cgoogle/api/annotations.proto\"3\n\x1bQueryGetExchangeRateRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\"p\n\x1cQueryGetExchangeRateResponse\x12P\n\x0c\x65xchangeRate\x18\x01 \x01(\x0b\x32&.stafihub.stafihub.ledger.ExchangeRateB\x04\xc8\xde\x1f\x00R\x0c\x65xchangeRate\"\x1d\n\x1bQueryExchangeRateAllRequest\"r\n\x1cQueryExchangeRateAllResponse\x12R\n\rexchangeRates\x18\x01 \x03(\x0b\x32&.stafihub.stafihub.ledger.ExchangeRateB\x04\xc8\xde\x1f\x00R\rexchangeRates\"H\n\x1eQueryGetEraExchangeRateRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x10\n\x03\x65ra\x18\x02 \x01(\rR\x03\x65ra\"|\n\x1fQueryGetEraExchangeRateResponse\x12Y\n\x0f\x65raExchangeRate\x18\x01 \x01(\x0b\x32).stafihub.stafihub.ledger.EraExchangeRateB\x04\xc8\xde\x1f\x00R\x0f\x65raExchangeRate\";\n#QueryEraExchangeRatesByDenomRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\"\x83\x01\n$QueryEraExchangeRatesByDenomResponse\x12[\n\x10\x65raExchangeRates\x18\x01 \x03(\x0b\x32).stafihub.stafihub.ledger.EraExchangeRateB\x04\xc8\xde\x1f\x00R\x10\x65raExchangeRates\"6\n\x1eQueryBondedPoolsByDenomRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\"7\n\x1fQueryBondedPoolsByDenomResponse\x12\x14\n\x05\x61\x64\x64rs\x18\x01 \x03(\tR\x05\x61\x64\x64rs\"E\n\x19QueryGetPoolDetailRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x12\n\x04pool\x18\x02 \x01(\tR\x04pool\"`\n\x1aQueryGetPoolDetailResponse\x12\x42\n\x06\x64\x65tail\x18\x01 \x01(\x0b\x32$.stafihub.stafihub.ledger.PoolDetailB\x04\xc8\xde\x1f\x00R\x06\x64\x65tail\"/\n\x17QueryGetChainEraRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\",\n\x18QueryGetChainEraResponse\x12\x10\n\x03\x65ra\x18\x01 \x01(\rR\x03\x65ra\"9\n!QueryGetCurrentEraSnapshotRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\">\n\"QueryGetCurrentEraSnapshotResponse\x12\x18\n\x07shotIds\x18\x01 \x03(\tR\x07shotIds\"$\n\"QueryGetProtocolFeeReceiverRequest\"A\n#QueryGetProtocolFeeReceiverResponse\x12\x1a\n\x08receiver\x18\x01 \x01(\tR\x08receiver\">\n&QueryGetStakingRewardCommissionRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\"I\n\'QueryGetStakingRewardCommissionResponse\x12\x1e\n\ncommission\x18\x01 \x01(\tR\ncommission\"5\n\x1dQueryGetUnbondRelayFeeRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\"b\n\x1eQueryGetUnbondRelayFeeResponse\x12@\n\x03\x66\x65\x65\x18\x01 \x01(\x0b\x32(.stafihub.stafihub.ledger.UnbondRelayFeeB\x04\xc8\xde\x1f\x00R\x03\x66\x65\x65\"7\n\x1fQueryGetUnbondCommissionRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\"B\n QueryGetUnbondCommissionResponse\x12\x1e\n\ncommission\x18\x01 \x01(\tR\ncommission\"5\n\x1dQueryGetEraUnbondLimitRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\"6\n\x1eQueryGetEraUnbondLimitResponse\x12\x14\n\x05limit\x18\x01 \x01(\rR\x05limit\"G\n\x1bQueryGetBondPipelineRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x12\n\x04pool\x18\x02 \x01(\tR\x04pool\"h\n\x1cQueryGetBondPipelineResponse\x12H\n\x08pipeline\x18\x01 \x01(\x0b\x32&.stafihub.stafihub.ledger.BondPipelineB\x04\xc8\xde\x1f\x00R\x08pipeline\"D\n\x1aQueryGetEraSnapshotRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x10\n\x03\x65ra\x18\x02 \x01(\rR\x03\x65ra\"7\n\x1bQueryGetEraSnapshotResponse\x12\x18\n\x07shotIds\x18\x01 \x03(\tR\x07shotIds\"1\n\x17QueryGetSnapshotRequest\x12\x16\n\x06shotId\x18\x01 \x01(\tR\x06shotId\"\\\n\x18QueryGetSnapshotResponse\x12@\n\x04shot\x18\x01 \x01(\x0b\x32&.stafihub.stafihub.ledger.BondSnapshotB\x04\xc8\xde\x1f\x00R\x04shot\"L\n\"QueryGetTotalExpectedActiveRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x10\n\x03\x65ra\x18\x02 \x01(\rR\x03\x65ra\"m\n#QueryGetTotalExpectedActiveResponse\x12\x46\n\x06\x61\x63tive\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x06\x61\x63tive\"I\n\x19QueryGetBondRecordRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x16\n\x06txhash\x18\x02 \x01(\tR\x06txhash\"h\n\x1aQueryGetBondRecordResponse\x12J\n\nbondRecord\x18\x01 \x01(\x0b\x32$.stafihub.stafihub.ledger.BondRecordB\x04\xc8\xde\x1f\x00R\nbondRecord\"\xb0\x01\n\x18QueryGetSignatureRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x10\n\x03\x65ra\x18\x02 \x01(\rR\x03\x65ra\x12\x12\n\x04pool\x18\x03 \x01(\tR\x04pool\x12@\n\x06txType\x18\x04 \x01(\x0e\x32(.stafihub.stafihub.ledger.OriginalTxTypeR\x06txType\x12\x16\n\x06propId\x18\x05 \x01(\tR\x06propId\"d\n\x19QueryGetSignatureResponse\x12G\n\tsignature\x18\x01 \x01(\x0b\x32#.stafihub.stafihub.ledger.SignatureB\x04\xc8\xde\x1f\x00R\tsignature\".\n\x16QueryGetRParamsRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\"\\\n\x17QueryGetRParamsResponse\x12\x41\n\x07rParams\x18\x01 \x01(\x0b\x32!.stafihub.stafihub.ledger.RParamsB\x04\xc8\xde\x1f\x00R\x07rParams\"\x1e\n\x1cQueryTotalProtocolFeeRequest\"\x7f\n\x1dQueryTotalProtocolFeeResponse\x12^\n\x14totalProtocolFeeList\x18\x01 \x03(\x0b\x32*.stafihub.stafihub.ledger.TotalProtocolFeeR\x14totalProtocolFeeList\"4\n\x1cQueryRelayFeeReceiverRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\";\n\x1dQueryRelayFeeReceiverResponse\x12\x1a\n\x08receiver\x18\x01 \x01(\tR\x08receiver\"0\n\x18QueryUnbondSwitchRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\"3\n\x19QueryUnbondSwitchResponse\x12\x16\n\x06isOpen\x18\x01 \x01(\x08R\x06isOpen\"l\n\"QueryPoolUnbondNextSequenceRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x12\n\x04pool\x18\x02 \x01(\tR\x04pool\x12\x1c\n\tunlockEra\x18\x03 \x01(\rR\tunlockEra\"I\n#QueryPoolUnbondNextSequenceResponse\x12\"\n\x0cnextSequence\x18\x01 \x01(\rR\x0cnextSequence\"d\n\x1aQueryPoolUnbondingsRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x12\n\x04pool\x18\x02 \x01(\tR\x04pool\x12\x1c\n\tunlockEra\x18\x03 \x01(\rR\tunlockEra\"b\n\x1bQueryPoolUnbondingsResponse\x12\x43\n\nunbondings\x18\x01 \x03(\x0b\x32#.stafihub.stafihub.ledger.UnbondingR\nunbondings\"/\n\x17QueryIcaPoolListRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\"e\n\x18QueryIcaPoolListResponse\x12I\n\x0bicaPoolList\x18\x01 \x03(\x0b\x32\'.stafihub.stafihub.ledger.IcaPoolDetailR\x0bicaPoolList\"8\n\x1eQueryInterchainTxStatusRequest\x12\x16\n\x06propId\x18\x01 \x01(\tR\x06propId\"\x7f\n\x1fQueryInterchainTxStatusResponse\x12\\\n\x12interchainTxStatus\x18\x01 \x01(\x0e\x32,.stafihub.stafihub.ledger.InterchainTxStatusR\x12interchainTxStatus2\xf3)\n\x05Query\x12\xb9\x01\n\x0fGetExchangeRate\x12\x35.stafihub.stafihub.ledger.QueryGetExchangeRateRequest\x1a\x36.stafihub.stafihub.ledger.QueryGetExchangeRateResponse\"7\x82\xd3\xe4\x93\x02\x31\x12//stafihub/stafihub/ledger/exchange_rate/{denom}\x12\xb5\x01\n\x0f\x45xchangeRateAll\x12\x35.stafihub.stafihub.ledger.QueryExchangeRateAllRequest\x1a\x36.stafihub.stafihub.ledger.QueryExchangeRateAllResponse\"3\x82\xd3\xe4\x93\x02-\x12+/stafihub/stafihub/ledger/exchange_rate_all\x12\xcc\x01\n\x12GetEraExchangeRate\x12\x38.stafihub.stafihub.ledger.QueryGetEraExchangeRateRequest\x1a\x39.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse\"A\x82\xd3\xe4\x93\x02;\x12\x39/stafihub/stafihub/ledger/era_exchange_rate/{denom}/{era}\x12\xdf\x01\n\x17\x45raExchangeRatesByDenom\x12=.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomRequest\x1a>.stafihub.stafihub.ledger.QueryEraExchangeRatesByDenomResponse\"E\x82\xd3\xe4\x93\x02?\x12=/stafihub/stafihub/ledger/era_exchange_rates_by_denom/{denom}\x12\xca\x01\n\x12\x42ondedPoolsByDenom\x12\x38.stafihub.stafihub.ledger.QueryBondedPoolsByDenomRequest\x1a\x39.stafihub.stafihub.ledger.QueryBondedPoolsByDenomResponse\"?\x82\xd3\xe4\x93\x02\x39\x12\x37/stafihub/stafihub/ledger/bonded_pools_by_denom/{denom}\x12\xbc\x01\n\rGetPoolDetail\x12\x33.stafihub.stafihub.ledger.QueryGetPoolDetailRequest\x1a\x34.stafihub.stafihub.ledger.QueryGetPoolDetailResponse\"@\x82\xd3\xe4\x93\x02:\x12\x38/stafihub/stafihub/ledger/get_pool_detail/{denom}/{pool}\x12\xad\x01\n\x0bGetChainEra\x12\x31.stafihub.stafihub.ledger.QueryGetChainEraRequest\x1a\x32.stafihub.stafihub.ledger.QueryGetChainEraResponse\"7\x82\xd3\xe4\x93\x02\x31\x12//stafihub/stafihub/ledger/get_chain_era/{denom}\x12\xd6\x01\n\x15GetCurrentEraSnapshot\x12;.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotRequest\x1a<.stafihub.stafihub.ledger.QueryGetCurrentEraSnapshotResponse\"B\x82\xd3\xe4\x93\x02<\x12:/stafihub/stafihub/ledger/get_current_era_snapshot/{denom}\x12\xce\x01\n\x16GetProtocolFeeReceiver\x12<.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverRequest\x1a=.stafihub.stafihub.ledger.QueryGetProtocolFeeReceiverResponse\"7\x82\xd3\xe4\x93\x02\x31\x12//stafihub/stafihub/ledger/protocol_fee_receiver\x12\xe2\x01\n\x1aGetStakingRewardCommission\x12@.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionRequest\x1a\x41.stafihub.stafihub.ledger.QueryGetStakingRewardCommissionResponse\"?\x82\xd3\xe4\x93\x02\x39\x12\x37/stafihub/stafihub/ledger/get_staking_reward_commission\x12\xc6\x01\n\x11GetUnbondRelayFee\x12\x37.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeRequest\x1a\x38.stafihub.stafihub.ledger.QueryGetUnbondRelayFeeResponse\">\x82\xd3\xe4\x93\x02\x38\x12\x36/stafihub/stafihub/ledger/get_unbond_relay_fee/{denom}\x12\xc5\x01\n\x13GetUnbondCommission\x12\x39.stafihub.stafihub.ledger.QueryGetUnbondCommissionRequest\x1a:.stafihub.stafihub.ledger.QueryGetUnbondCommissionResponse\"7\x82\xd3\xe4\x93\x02\x31\x12//stafihub/stafihub/ledger/get_unbond_commission\x12\xc6\x01\n\x11GetEraUnbondLimit\x12\x37.stafihub.stafihub.ledger.QueryGetEraUnbondLimitRequest\x1a\x38.stafihub.stafihub.ledger.QueryGetEraUnbondLimitResponse\">\x82\xd3\xe4\x93\x02\x38\x12\x36/stafihub/stafihub/ledger/get_era_unbond_limit/{denom}\x12\xc4\x01\n\x0fGetBondPipeline\x12\x35.stafihub.stafihub.ledger.QueryGetBondPipelineRequest\x1a\x36.stafihub.stafihub.ledger.QueryGetBondPipelineResponse\"B\x82\xd3\xe4\x93\x02<\x12:/stafihub/stafihub/ledger/get_bond_pipeline/{denom}/{pool}\x12\xbf\x01\n\x0eGetEraSnapshot\x12\x34.stafihub.stafihub.ledger.QueryGetEraSnapshotRequest\x1a\x35.stafihub.stafihub.ledger.QueryGetEraSnapshotResponse\"@\x82\xd3\xe4\x93\x02:\x12\x38/stafihub/stafihub/ledger/get_era_snapshot/{denom}/{era}\x12\xad\x01\n\x0bGetSnapshot\x12\x31.stafihub.stafihub.ledger.QueryGetSnapshotRequest\x1a\x32.stafihub.stafihub.ledger.QueryGetSnapshotResponse\"7\x82\xd3\xe4\x93\x02\x31\x12//stafihub/stafihub/ledger/get_snapshot/{shotId}\x12\xe0\x01\n\x16GetTotalExpectedActive\x12<.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveRequest\x1a=.stafihub.stafihub.ledger.QueryGetTotalExpectedActiveResponse\"I\x82\xd3\xe4\x93\x02\x43\x12\x41/stafihub/stafihub/ledger/get_total_expected_active/{denom}/{era}\x12\xbe\x01\n\rGetBondRecord\x12\x33.stafihub.stafihub.ledger.QueryGetBondRecordRequest\x1a\x34.stafihub.stafihub.ledger.QueryGetBondRecordResponse\"B\x82\xd3\xe4\x93\x02<\x12:/stafihub/stafihub/ledger/get_bond_record/{denom}/{txhash}\x12\xa8\x01\n\x0cGetSignature\x12\x32.stafihub.stafihub.ledger.QueryGetSignatureRequest\x1a\x33.stafihub.stafihub.ledger.QueryGetSignatureResponse\"/\x82\xd3\xe4\x93\x02)\x12\'/stafihub/stafihub/ledger/get_signature\x12\xa9\x01\n\nGetRParams\x12\x30.stafihub.stafihub.ledger.QueryGetRParamsRequest\x1a\x31.stafihub.stafihub.ledger.QueryGetRParamsResponse\"6\x82\xd3\xe4\x93\x02\x30\x12./stafihub/stafihub/ledger/get_r_params/{denom}\x12\xb9\x01\n\x10TotalProtocolFee\x12\x36.stafihub.stafihub.ledger.QueryTotalProtocolFeeRequest\x1a\x37.stafihub.stafihub.ledger.QueryTotalProtocolFeeResponse\"4\x82\xd3\xe4\x93\x02.\x12,/stafihub/stafihub/ledger/total_protocol_fee\x12\xc1\x01\n\x10RelayFeeReceiver\x12\x36.stafihub.stafihub.ledger.QueryRelayFeeReceiverRequest\x1a\x37.stafihub.stafihub.ledger.QueryRelayFeeReceiverResponse\"<\x82\xd3\xe4\x93\x02\x36\x12\x34/stafihub/stafihub/ledger/relay_fee_receiver/{denom}\x12\xb0\x01\n\x0cUnbondSwitch\x12\x32.stafihub.stafihub.ledger.QueryUnbondSwitchRequest\x1a\x33.stafihub.stafihub.ledger.QueryUnbondSwitchResponse\"7\x82\xd3\xe4\x93\x02\x31\x12//stafihub/stafihub/ledger/unbond_switch/{denom}\x12\xed\x01\n\x16PoolUnbondNextSequence\x12<.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest\x1a=.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceResponse\"V\x82\xd3\xe4\x93\x02P\x12N/stafihub/stafihub/ledger/pool_unbond_next_sequence/{denom}/{pool}/{unlockEra}\x12\xcb\x01\n\x0ePoolUnbondings\x12\x34.stafihub.stafihub.ledger.QueryPoolUnbondingsRequest\x1a\x35.stafihub.stafihub.ledger.QueryPoolUnbondingsResponse\"L\x82\xd3\xe4\x93\x02\x46\x12\x44/stafihub/stafihub/ledger/pool_unbondings/{denom}/{pool}/{unlockEra}\x12\xad\x01\n\x0bIcaPoolList\x12\x31.stafihub.stafihub.ledger.QueryIcaPoolListRequest\x1a\x32.stafihub.stafihub.ledger.QueryIcaPoolListResponse\"7\x82\xd3\xe4\x93\x02\x31\x12//stafihub/stafihub/ledger/ica_pool_list/{denom}\x12\xca\x01\n\x12InterchainTxStatus\x12\x38.stafihub.stafihub.ledger.QueryInterchainTxStatusRequest\x1a\x39.stafihub.stafihub.ledger.QueryInterchainTxStatusResponse\"?\x82\xd3\xe4\x93\x02\x39\x12\x37/stafihub/stafihub/ledger/interchain_tx_status/{propId}B\xd9\x01\n\x1c\x63om.stafihub.stafihub.ledgerB\nQueryProtoP\x01Z+github.com/stafihub/stafihub/x/ledger/types\xa2\x02\x03SSL\xaa\x02\x18Stafihub.Stafihub.Ledger\xca\x02\x18Stafihub\\Stafihub\\Ledger\xe2\x02$Stafihub\\Stafihub\\Ledger\\GPBMetadata\xea\x02\x1aStafihub::Stafihub::Ledgerb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stafihub.ledger.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.stafihub.stafihub.ledgerB\nQueryProtoP\001Z+github.com/stafihub/stafihub/x/ledger/types\242\002\003SSL\252\002\030Stafihub.Stafihub.Ledger\312\002\030Stafihub\\Stafihub\\Ledger\342\002$Stafihub\\Stafihub\\Ledger\\GPBMetadata\352\002\032Stafihub::Stafihub::Ledger'
  _QUERYGETEXCHANGERATERESPONSE.fields_by_name['exchangeRate']._options = None
  _QUERYGETEXCHANGERATERESPONSE.fields_by_name['exchangeRate']._serialized_options = b'\310\336\037\000'
  _QUERYEXCHANGERATEALLRESPONSE.fields_by_name['exchangeRates']._options = None
  _QUERYEXCHANGERATEALLRESPONSE.fields_by_name['exchangeRates']._serialized_options = b'\310\336\037\000'
  _QUERYGETERAEXCHANGERATERESPONSE.fields_by_name['eraExchangeRate']._options = None
  _QUERYGETERAEXCHANGERATERESPONSE.fields_by_name['eraExchangeRate']._serialized_options = b'\310\336\037\000'
  _QUERYERAEXCHANGERATESBYDENOMRESPONSE.fields_by_name['eraExchangeRates']._options = None
  _QUERYERAEXCHANGERATESBYDENOMRESPONSE.fields_by_name['eraExchangeRates']._serialized_options = b'\310\336\037\000'
  _QUERYGETPOOLDETAILRESPONSE.fields_by_name['detail']._options = None
  _QUERYGETPOOLDETAILRESPONSE.fields_by_name['detail']._serialized_options = b'\310\336\037\000'
  _QUERYGETUNBONDRELAYFEERESPONSE.fields_by_name['fee']._options = None
  _QUERYGETUNBONDRELAYFEERESPONSE.fields_by_name['fee']._serialized_options = b'\310\336\037\000'
  _QUERYGETBONDPIPELINERESPONSE.fields_by_name['pipeline']._options = None
  _QUERYGETBONDPIPELINERESPONSE.fields_by_name['pipeline']._serialized_options = b'\310\336\037\000'
  _QUERYGETSNAPSHOTRESPONSE.fields_by_name['shot']._options = None
  _QUERYGETSNAPSHOTRESPONSE.fields_by_name['shot']._serialized_options = b'\310\336\037\000'
  _QUERYGETTOTALEXPECTEDACTIVERESPONSE.fields_by_name['active']._options = None
  _QUERYGETTOTALEXPECTEDACTIVERESPONSE.fields_by_name['active']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _QUERYGETBONDRECORDRESPONSE.fields_by_name['bondRecord']._options = None
  _QUERYGETBONDRECORDRESPONSE.fields_by_name['bondRecord']._serialized_options = b'\310\336\037\000'
  _QUERYGETSIGNATURERESPONSE.fields_by_name['signature']._options = None
  _QUERYGETSIGNATURERESPONSE.fields_by_name['signature']._serialized_options = b'\310\336\037\000'
  _QUERYGETRPARAMSRESPONSE.fields_by_name['rParams']._options = None
  _QUERYGETRPARAMSRESPONSE.fields_by_name['rParams']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['GetExchangeRate']._options = None
  _QUERY.methods_by_name['GetExchangeRate']._serialized_options = b'\202\323\344\223\0021\022//stafihub/stafihub/ledger/exchange_rate/{denom}'
  _QUERY.methods_by_name['ExchangeRateAll']._options = None
  _QUERY.methods_by_name['ExchangeRateAll']._serialized_options = b'\202\323\344\223\002-\022+/stafihub/stafihub/ledger/exchange_rate_all'
  _QUERY.methods_by_name['GetEraExchangeRate']._options = None
  _QUERY.methods_by_name['GetEraExchangeRate']._serialized_options = b'\202\323\344\223\002;\0229/stafihub/stafihub/ledger/era_exchange_rate/{denom}/{era}'
  _QUERY.methods_by_name['EraExchangeRatesByDenom']._options = None
  _QUERY.methods_by_name['EraExchangeRatesByDenom']._serialized_options = b'\202\323\344\223\002?\022=/stafihub/stafihub/ledger/era_exchange_rates_by_denom/{denom}'
  _QUERY.methods_by_name['BondedPoolsByDenom']._options = None
  _QUERY.methods_by_name['BondedPoolsByDenom']._serialized_options = b'\202\323\344\223\0029\0227/stafihub/stafihub/ledger/bonded_pools_by_denom/{denom}'
  _QUERY.methods_by_name['GetPoolDetail']._options = None
  _QUERY.methods_by_name['GetPoolDetail']._serialized_options = b'\202\323\344\223\002:\0228/stafihub/stafihub/ledger/get_pool_detail/{denom}/{pool}'
  _QUERY.methods_by_name['GetChainEra']._options = None
  _QUERY.methods_by_name['GetChainEra']._serialized_options = b'\202\323\344\223\0021\022//stafihub/stafihub/ledger/get_chain_era/{denom}'
  _QUERY.methods_by_name['GetCurrentEraSnapshot']._options = None
  _QUERY.methods_by_name['GetCurrentEraSnapshot']._serialized_options = b'\202\323\344\223\002<\022:/stafihub/stafihub/ledger/get_current_era_snapshot/{denom}'
  _QUERY.methods_by_name['GetProtocolFeeReceiver']._options = None
  _QUERY.methods_by_name['GetProtocolFeeReceiver']._serialized_options = b'\202\323\344\223\0021\022//stafihub/stafihub/ledger/protocol_fee_receiver'
  _QUERY.methods_by_name['GetStakingRewardCommission']._options = None
  _QUERY.methods_by_name['GetStakingRewardCommission']._serialized_options = b'\202\323\344\223\0029\0227/stafihub/stafihub/ledger/get_staking_reward_commission'
  _QUERY.methods_by_name['GetUnbondRelayFee']._options = None
  _QUERY.methods_by_name['GetUnbondRelayFee']._serialized_options = b'\202\323\344\223\0028\0226/stafihub/stafihub/ledger/get_unbond_relay_fee/{denom}'
  _QUERY.methods_by_name['GetUnbondCommission']._options = None
  _QUERY.methods_by_name['GetUnbondCommission']._serialized_options = b'\202\323\344\223\0021\022//stafihub/stafihub/ledger/get_unbond_commission'
  _QUERY.methods_by_name['GetEraUnbondLimit']._options = None
  _QUERY.methods_by_name['GetEraUnbondLimit']._serialized_options = b'\202\323\344\223\0028\0226/stafihub/stafihub/ledger/get_era_unbond_limit/{denom}'
  _QUERY.methods_by_name['GetBondPipeline']._options = None
  _QUERY.methods_by_name['GetBondPipeline']._serialized_options = b'\202\323\344\223\002<\022:/stafihub/stafihub/ledger/get_bond_pipeline/{denom}/{pool}'
  _QUERY.methods_by_name['GetEraSnapshot']._options = None
  _QUERY.methods_by_name['GetEraSnapshot']._serialized_options = b'\202\323\344\223\002:\0228/stafihub/stafihub/ledger/get_era_snapshot/{denom}/{era}'
  _QUERY.methods_by_name['GetSnapshot']._options = None
  _QUERY.methods_by_name['GetSnapshot']._serialized_options = b'\202\323\344\223\0021\022//stafihub/stafihub/ledger/get_snapshot/{shotId}'
  _QUERY.methods_by_name['GetTotalExpectedActive']._options = None
  _QUERY.methods_by_name['GetTotalExpectedActive']._serialized_options = b'\202\323\344\223\002C\022A/stafihub/stafihub/ledger/get_total_expected_active/{denom}/{era}'
  _QUERY.methods_by_name['GetBondRecord']._options = None
  _QUERY.methods_by_name['GetBondRecord']._serialized_options = b'\202\323\344\223\002<\022:/stafihub/stafihub/ledger/get_bond_record/{denom}/{txhash}'
  _QUERY.methods_by_name['GetSignature']._options = None
  _QUERY.methods_by_name['GetSignature']._serialized_options = b'\202\323\344\223\002)\022\'/stafihub/stafihub/ledger/get_signature'
  _QUERY.methods_by_name['GetRParams']._options = None
  _QUERY.methods_by_name['GetRParams']._serialized_options = b'\202\323\344\223\0020\022./stafihub/stafihub/ledger/get_r_params/{denom}'
  _QUERY.methods_by_name['TotalProtocolFee']._options = None
  _QUERY.methods_by_name['TotalProtocolFee']._serialized_options = b'\202\323\344\223\002.\022,/stafihub/stafihub/ledger/total_protocol_fee'
  _QUERY.methods_by_name['RelayFeeReceiver']._options = None
  _QUERY.methods_by_name['RelayFeeReceiver']._serialized_options = b'\202\323\344\223\0026\0224/stafihub/stafihub/ledger/relay_fee_receiver/{denom}'
  _QUERY.methods_by_name['UnbondSwitch']._options = None
  _QUERY.methods_by_name['UnbondSwitch']._serialized_options = b'\202\323\344\223\0021\022//stafihub/stafihub/ledger/unbond_switch/{denom}'
  _QUERY.methods_by_name['PoolUnbondNextSequence']._options = None
  _QUERY.methods_by_name['PoolUnbondNextSequence']._serialized_options = b'\202\323\344\223\002P\022N/stafihub/stafihub/ledger/pool_unbond_next_sequence/{denom}/{pool}/{unlockEra}'
  _QUERY.methods_by_name['PoolUnbondings']._options = None
  _QUERY.methods_by_name['PoolUnbondings']._serialized_options = b'\202\323\344\223\002F\022D/stafihub/stafihub/ledger/pool_unbondings/{denom}/{pool}/{unlockEra}'
  _QUERY.methods_by_name['IcaPoolList']._options = None
  _QUERY.methods_by_name['IcaPoolList']._serialized_options = b'\202\323\344\223\0021\022//stafihub/stafihub/ledger/ica_pool_list/{denom}'
  _QUERY.methods_by_name['InterchainTxStatus']._options = None
  _QUERY.methods_by_name['InterchainTxStatus']._serialized_options = b'\202\323\344\223\0029\0227/stafihub/stafihub/ledger/interchain_tx_status/{propId}'
  _globals['_QUERYGETEXCHANGERATEREQUEST']._serialized_start=139
  _globals['_QUERYGETEXCHANGERATEREQUEST']._serialized_end=190
  _globals['_QUERYGETEXCHANGERATERESPONSE']._serialized_start=192
  _globals['_QUERYGETEXCHANGERATERESPONSE']._serialized_end=304
  _globals['_QUERYEXCHANGERATEALLREQUEST']._serialized_start=306
  _globals['_QUERYEXCHANGERATEALLREQUEST']._serialized_end=335
  _globals['_QUERYEXCHANGERATEALLRESPONSE']._serialized_start=337
  _globals['_QUERYEXCHANGERATEALLRESPONSE']._serialized_end=451
  _globals['_QUERYGETERAEXCHANGERATEREQUEST']._serialized_start=453
  _globals['_QUERYGETERAEXCHANGERATEREQUEST']._serialized_end=525
  _globals['_QUERYGETERAEXCHANGERATERESPONSE']._serialized_start=527
  _globals['_QUERYGETERAEXCHANGERATERESPONSE']._serialized_end=651
  _globals['_QUERYERAEXCHANGERATESBYDENOMREQUEST']._serialized_start=653
  _globals['_QUERYERAEXCHANGERATESBYDENOMREQUEST']._serialized_end=712
  _globals['_QUERYERAEXCHANGERATESBYDENOMRESPONSE']._serialized_start=715
  _globals['_QUERYERAEXCHANGERATESBYDENOMRESPONSE']._serialized_end=846
  _globals['_QUERYBONDEDPOOLSBYDENOMREQUEST']._serialized_start=848
  _globals['_QUERYBONDEDPOOLSBYDENOMREQUEST']._serialized_end=902
  _globals['_QUERYBONDEDPOOLSBYDENOMRESPONSE']._serialized_start=904
  _globals['_QUERYBONDEDPOOLSBYDENOMRESPONSE']._serialized_end=959
  _globals['_QUERYGETPOOLDETAILREQUEST']._serialized_start=961
  _globals['_QUERYGETPOOLDETAILREQUEST']._serialized_end=1030
  _globals['_QUERYGETPOOLDETAILRESPONSE']._serialized_start=1032
  _globals['_QUERYGETPOOLDETAILRESPONSE']._serialized_end=1128
  _globals['_QUERYGETCHAINERAREQUEST']._serialized_start=1130
  _globals['_QUERYGETCHAINERAREQUEST']._serialized_end=1177
  _globals['_QUERYGETCHAINERARESPONSE']._serialized_start=1179
  _globals['_QUERYGETCHAINERARESPONSE']._serialized_end=1223
  _globals['_QUERYGETCURRENTERASNAPSHOTREQUEST']._serialized_start=1225
  _globals['_QUERYGETCURRENTERASNAPSHOTREQUEST']._serialized_end=1282
  _globals['_QUERYGETCURRENTERASNAPSHOTRESPONSE']._serialized_start=1284
  _globals['_QUERYGETCURRENTERASNAPSHOTRESPONSE']._serialized_end=1346
  _globals['_QUERYGETPROTOCOLFEERECEIVERREQUEST']._serialized_start=1348
  _globals['_QUERYGETPROTOCOLFEERECEIVERREQUEST']._serialized_end=1384
  _globals['_QUERYGETPROTOCOLFEERECEIVERRESPONSE']._serialized_start=1386
  _globals['_QUERYGETPROTOCOLFEERECEIVERRESPONSE']._serialized_end=1451
  _globals['_QUERYGETSTAKINGREWARDCOMMISSIONREQUEST']._serialized_start=1453
  _globals['_QUERYGETSTAKINGREWARDCOMMISSIONREQUEST']._serialized_end=1515
  _globals['_QUERYGETSTAKINGREWARDCOMMISSIONRESPONSE']._serialized_start=1517
  _globals['_QUERYGETSTAKINGREWARDCOMMISSIONRESPONSE']._serialized_end=1590
  _globals['_QUERYGETUNBONDRELAYFEEREQUEST']._serialized_start=1592
  _globals['_QUERYGETUNBONDRELAYFEEREQUEST']._serialized_end=1645
  _globals['_QUERYGETUNBONDRELAYFEERESPONSE']._serialized_start=1647
  _globals['_QUERYGETUNBONDRELAYFEERESPONSE']._serialized_end=1745
  _globals['_QUERYGETUNBONDCOMMISSIONREQUEST']._serialized_start=1747
  _globals['_QUERYGETUNBONDCOMMISSIONREQUEST']._serialized_end=1802
  _globals['_QUERYGETUNBONDCOMMISSIONRESPONSE']._serialized_start=1804
  _globals['_QUERYGETUNBONDCOMMISSIONRESPONSE']._serialized_end=1870
  _globals['_QUERYGETERAUNBONDLIMITREQUEST']._serialized_start=1872
  _globals['_QUERYGETERAUNBONDLIMITREQUEST']._serialized_end=1925
  _globals['_QUERYGETERAUNBONDLIMITRESPONSE']._serialized_start=1927
  _globals['_QUERYGETERAUNBONDLIMITRESPONSE']._serialized_end=1981
  _globals['_QUERYGETBONDPIPELINEREQUEST']._serialized_start=1983
  _globals['_QUERYGETBONDPIPELINEREQUEST']._serialized_end=2054
  _globals['_QUERYGETBONDPIPELINERESPONSE']._serialized_start=2056
  _globals['_QUERYGETBONDPIPELINERESPONSE']._serialized_end=2160
  _globals['_QUERYGETERASNAPSHOTREQUEST']._serialized_start=2162
  _globals['_QUERYGETERASNAPSHOTREQUEST']._serialized_end=2230
  _globals['_QUERYGETERASNAPSHOTRESPONSE']._serialized_start=2232
  _globals['_QUERYGETERASNAPSHOTRESPONSE']._serialized_end=2287
  _globals['_QUERYGETSNAPSHOTREQUEST']._serialized_start=2289
  _globals['_QUERYGETSNAPSHOTREQUEST']._serialized_end=2338
  _globals['_QUERYGETSNAPSHOTRESPONSE']._serialized_start=2340
  _globals['_QUERYGETSNAPSHOTRESPONSE']._serialized_end=2432
  _globals['_QUERYGETTOTALEXPECTEDACTIVEREQUEST']._serialized_start=2434
  _globals['_QUERYGETTOTALEXPECTEDACTIVEREQUEST']._serialized_end=2510
  _globals['_QUERYGETTOTALEXPECTEDACTIVERESPONSE']._serialized_start=2512
  _globals['_QUERYGETTOTALEXPECTEDACTIVERESPONSE']._serialized_end=2621
  _globals['_QUERYGETBONDRECORDREQUEST']._serialized_start=2623
  _globals['_QUERYGETBONDRECORDREQUEST']._serialized_end=2696
  _globals['_QUERYGETBONDRECORDRESPONSE']._serialized_start=2698
  _globals['_QUERYGETBONDRECORDRESPONSE']._serialized_end=2802
  _globals['_QUERYGETSIGNATUREREQUEST']._serialized_start=2805
  _globals['_QUERYGETSIGNATUREREQUEST']._serialized_end=2981
  _globals['_QUERYGETSIGNATURERESPONSE']._serialized_start=2983
  _globals['_QUERYGETSIGNATURERESPONSE']._serialized_end=3083
  _globals['_QUERYGETRPARAMSREQUEST']._serialized_start=3085
  _globals['_QUERYGETRPARAMSREQUEST']._serialized_end=3131
  _globals['_QUERYGETRPARAMSRESPONSE']._serialized_start=3133
  _globals['_QUERYGETRPARAMSRESPONSE']._serialized_end=3225
  _globals['_QUERYTOTALPROTOCOLFEEREQUEST']._serialized_start=3227
  _globals['_QUERYTOTALPROTOCOLFEEREQUEST']._serialized_end=3257
  _globals['_QUERYTOTALPROTOCOLFEERESPONSE']._serialized_start=3259
  _globals['_QUERYTOTALPROTOCOLFEERESPONSE']._serialized_end=3386
  _globals['_QUERYRELAYFEERECEIVERREQUEST']._serialized_start=3388
  _globals['_QUERYRELAYFEERECEIVERREQUEST']._serialized_end=3440
  _globals['_QUERYRELAYFEERECEIVERRESPONSE']._serialized_start=3442
  _globals['_QUERYRELAYFEERECEIVERRESPONSE']._serialized_end=3501
  _globals['_QUERYUNBONDSWITCHREQUEST']._serialized_start=3503
  _globals['_QUERYUNBONDSWITCHREQUEST']._serialized_end=3551
  _globals['_QUERYUNBONDSWITCHRESPONSE']._serialized_start=3553
  _globals['_QUERYUNBONDSWITCHRESPONSE']._serialized_end=3604
  _globals['_QUERYPOOLUNBONDNEXTSEQUENCEREQUEST']._serialized_start=3606
  _globals['_QUERYPOOLUNBONDNEXTSEQUENCEREQUEST']._serialized_end=3714
  _globals['_QUERYPOOLUNBONDNEXTSEQUENCERESPONSE']._serialized_start=3716
  _globals['_QUERYPOOLUNBONDNEXTSEQUENCERESPONSE']._serialized_end=3789
  _globals['_QUERYPOOLUNBONDINGSREQUEST']._serialized_start=3791
  _globals['_QUERYPOOLUNBONDINGSREQUEST']._serialized_end=3891
  _globals['_QUERYPOOLUNBONDINGSRESPONSE']._serialized_start=3893
  _globals['_QUERYPOOLUNBONDINGSRESPONSE']._serialized_end=3991
  _globals['_QUERYICAPOOLLISTREQUEST']._serialized_start=3993
  _globals['_QUERYICAPOOLLISTREQUEST']._serialized_end=4040
  _globals['_QUERYICAPOOLLISTRESPONSE']._serialized_start=4042
  _globals['_QUERYICAPOOLLISTRESPONSE']._serialized_end=4143
  _globals['_QUERYINTERCHAINTXSTATUSREQUEST']._serialized_start=4145
  _globals['_QUERYINTERCHAINTXSTATUSREQUEST']._serialized_end=4201
  _globals['_QUERYINTERCHAINTXSTATUSRESPONSE']._serialized_start=4203
  _globals['_QUERYINTERCHAINTXSTATUSRESPONSE']._serialized_end=4330
  _globals['_QUERY']._serialized_start=4333
  _globals['_QUERY']._serialized_end=9696
# @@protoc_insertion_point(module_scope)
