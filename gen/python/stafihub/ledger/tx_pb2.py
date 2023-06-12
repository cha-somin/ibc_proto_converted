# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stafihub/ledger/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from stafihub.ledger import ledger_pb2 as stafihub_dot_ledger_dot_ledger__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18stafihub/ledger/tx.proto\x12\x18stafihub.stafihub.ledger\x1a\x19google/protobuf/any.proto\x1a\x14gogoproto/gogo.proto\x1a\x1cstafihub/ledger/ledger.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"g\n\x14MsgSetEraUnbondLimit\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\x1f\n\x05limit\x18\x03 \x01(\rB\t\xea\xde\x1f\x05limitR\x05limit\"\x1e\n\x1cMsgSetEraUnbondLimitResponse\"\xa5\x01\n\x10MsgSetPoolDetail\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\x12\n\x04pool\x18\x03 \x01(\tR\x04pool\x12 \n\x0bsubAccounts\x18\x04 \x03(\tR\x0bsubAccounts\x12+\n\tthreshold\x18\x05 \x01(\rB\r\xea\xde\x1f\tthresholdR\tthreshold\"\x1a\n\x18MsgSetPoolDetailResponse\"_\n\x0fMsgSetLeastBond\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\x1c\n\tleastBond\x18\x03 \x01(\tR\tleastBond\"\x19\n\x17MsgSetLeastBondResponse\"M\n\x1bMsgClearCurrentEraSnapShots\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\"%\n#MsgClearCurrentEraSnapShotsResponse\"\x9f\x01\n\x1dMsgSetStakingRewardCommission\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12N\n\ncommission\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/stafihub/stafihub/utils.DecR\ncommission\"\'\n%MsgSetStakingRewardCommissionResponse\"Q\n\x19MsgSetProtocolFeeReceiver\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x1a\n\x08receiver\x18\x02 \x01(\tR\x08receiver\"#\n!MsgSetProtocolFeeReceiverResponse\"\xa8\x01\n\x14MsgSetUnbondRelayFee\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12`\n\x05value\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x05value\"\x1e\n\x1cMsgSetUnbondRelayFeeResponse\"\xc2\x01\n\x12MsgLiquidityUnbond\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x12\n\x04pool\x18\x02 \x01(\tR\x04pool\x12`\n\x05value\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x05value\x12\x1c\n\trecipient\x18\x04 \x01(\tR\trecipient\"\x1c\n\x1aMsgLiquidityUnbondResponse\"\x98\x01\n\x16MsgSetUnbondCommission\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12N\n\ncommission\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/stafihub/stafihub/utils.DecR\ncommission\" \n\x1eMsgSetUnbondCommissionResponse\"\xeb\x01\n\x12MsgSubmitSignature\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\x19\n\x03\x65ra\x18\x03 \x01(\rB\x07\xea\xde\x1f\x03\x65raR\x03\x65ra\x12\x12\n\x04pool\x18\x04 \x01(\tR\x04pool\x12@\n\x06txType\x18\x05 \x01(\x0e\x32(.stafihub.stafihub.ledger.OriginalTxTypeR\x06txType\x12\x16\n\x06propId\x18\x06 \x01(\tR\x06propId\x12\x1c\n\tsignature\x18\x07 \x01(\tR\tsignature\"\x1c\n\x1aMsgSubmitSignatureResponse\"\xfc\x01\n\rMsgSetRParams\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\x1a\n\x08gasPrice\x18\x03 \x01(\tR\x08gasPrice\x12\x1e\n\neraSeconds\x18\x04 \x01(\rR\neraSeconds\x12\"\n\x06offset\x18\x05 \x01(\x05\x42\n\xea\xde\x1f\x06offsetR\x06offset\x12=\n\x0f\x62ondingDuration\x18\x06 \x01(\rB\x13\xea\xde\x1f\x0f\x62ondingDurationR\x0f\x62ondingDuration\x12\x1c\n\tleastBond\x18\x07 \x01(\tR\tleastBond\"\x17\n\x15MsgSetRParamsResponse\"d\n\x16MsgSetRelayFeeReceiver\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\x1a\n\x08receiver\x18\x03 \x01(\tR\x08receiver\" \n\x1eMsgSetRelayFeeReceiverResponse\"a\n\x13MsgSetRelayGasPrice\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\x1a\n\x08gasPrice\x18\x03 \x01(\tR\x08gasPrice\"\x1d\n\x1bMsgSetRelayGasPriceResponse\"\xd5\x01\n\x10MsgSetEraSeconds\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12.\n\neraSeconds\x18\x03 \x01(\rB\x0e\xea\xde\x1f\neraSecondsR\neraSeconds\x12=\n\x0f\x62ondingDuration\x18\x04 \x01(\rB\x13\xea\xde\x1f\x0f\x62ondingDurationR\x0f\x62ondingDuration\x12\"\n\x06offset\x18\x05 \x01(\x05\x42\n\xea\xde\x1f\x06offsetR\x06offset\"\x1a\n\x18MsgSetEraSecondsResponse\"[\n\x0fMsgRmBondedPool\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\x18\n\x07\x61\x64\x64ress\x18\x03 \x01(\tR\x07\x61\x64\x64ress\"\x19\n\x17MsgRmBondedPoolResponse\"\xaa\x04\n\x0eMsgMigrateInit\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\x12\n\x04pool\x18\x03 \x01(\tR\x04pool\x12P\n\x0btotalSupply\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0btotalSupply\x12\x46\n\x06\x61\x63tive\x18\x05 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x06\x61\x63tive\x12\x42\n\x04\x62ond\x18\x06 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x04\x62ond\x12\x46\n\x06unbond\x18\x07 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x06unbond\x12R\n\x0c\x65xchangeRate\x18\x08 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/stafihub/stafihub/utils.DecR\x0c\x65xchangeRate\x12Z\n\x10totalProtocolFee\x18\t \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x10totalProtocolFee\"\x18\n\x16MsgMigrateInitResponse\"\xba\x01\n\x14MsgMigrateUnbondings\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\x12\n\x04pool\x18\x03 \x01(\tR\x04pool\x12\x19\n\x03\x65ra\x18\x04 \x01(\rB\x07\xea\xde\x1f\x03\x65raR\x03\x65ra\x12\x43\n\nunbondings\x18\x05 \x03(\x0b\x32#.stafihub.stafihub.ledger.UnbondingR\nunbondings\"\x1e\n\x1cMsgMigrateUnbondingsResponse\"G\n\x15MsgToggleUnbondSwitch\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\"\x1f\n\x1dMsgToggleUnbondSwitchResponse\"0\n\x14MsgUnsealMigrateInit\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\"\x1e\n\x1cMsgUnsealMigrateInitResponse\"h\n\x12MsgRegisterIcaPool\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\"\n\x0c\x63onnectionId\x18\x03 \x01(\tR\x0c\x63onnectionId\"\x1c\n\x1aMsgRegisterIcaPoolResponse\"X\n\x14MsgSetWithdrawalAddr\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12&\n\x0e\x64\x65legationAddr\x18\x03 \x01(\tR\x0e\x64\x65legationAddr\"\x1e\n\x1cMsgSetWithdrawalAddrResponse\"Q\n\x0bMsgInitPool\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\x12\n\x04pool\x18\x03 \x01(\tR\x04pool\"\x15\n\x13MsgInitPoolResponse\"\x94\x01\n\x10MsgSetPoolStatus\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\x12\n\x04pool\x18\x03 \x01(\tR\x04pool\x12<\n\x06status\x18\x04 \x01(\x0e\x32$.stafihub.stafihub.ledger.PoolStatusR\x06status\"\x1a\n\x18MsgSetPoolStatusResponse2\xfa\x15\n\x03Msg\x12{\n\x11SetEraUnbondLimit\x12..stafihub.stafihub.ledger.MsgSetEraUnbondLimit\x1a\x36.stafihub.stafihub.ledger.MsgSetEraUnbondLimitResponse\x12o\n\rSetPoolDetail\x12*.stafihub.stafihub.ledger.MsgSetPoolDetail\x1a\x32.stafihub.stafihub.ledger.MsgSetPoolDetailResponse\x12l\n\x0cSetLeastBond\x12).stafihub.stafihub.ledger.MsgSetLeastBond\x1a\x31.stafihub.stafihub.ledger.MsgSetLeastBondResponse\x12\x90\x01\n\x18\x43learCurrentEraSnapShots\x12\x35.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShots\x1a=.stafihub.stafihub.ledger.MsgClearCurrentEraSnapShotsResponse\x12\x96\x01\n\x1aSetStakingRewardCommission\x12\x37.stafihub.stafihub.ledger.MsgSetStakingRewardCommission\x1a?.stafihub.stafihub.ledger.MsgSetStakingRewardCommissionResponse\x12\x8a\x01\n\x16SetProtocolFeeReceiver\x12\x33.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiver\x1a;.stafihub.stafihub.ledger.MsgSetProtocolFeeReceiverResponse\x12{\n\x11SetUnbondRelayFee\x12..stafihub.stafihub.ledger.MsgSetUnbondRelayFee\x1a\x36.stafihub.stafihub.ledger.MsgSetUnbondRelayFeeResponse\x12u\n\x0fLiquidityUnbond\x12,.stafihub.stafihub.ledger.MsgLiquidityUnbond\x1a\x34.stafihub.stafihub.ledger.MsgLiquidityUnbondResponse\x12\x81\x01\n\x13SetUnbondCommission\x12\x30.stafihub.stafihub.ledger.MsgSetUnbondCommission\x1a\x38.stafihub.stafihub.ledger.MsgSetUnbondCommissionResponse\x12u\n\x0fSubmitSignature\x12,.stafihub.stafihub.ledger.MsgSubmitSignature\x1a\x34.stafihub.stafihub.ledger.MsgSubmitSignatureResponse\x12\x66\n\nSetRParams\x12\'.stafihub.stafihub.ledger.MsgSetRParams\x1a/.stafihub.stafihub.ledger.MsgSetRParamsResponse\x12\x81\x01\n\x13SetRelayFeeReceiver\x12\x30.stafihub.stafihub.ledger.MsgSetRelayFeeReceiver\x1a\x38.stafihub.stafihub.ledger.MsgSetRelayFeeReceiverResponse\x12x\n\x10SetRelayGasPrice\x12-.stafihub.stafihub.ledger.MsgSetRelayGasPrice\x1a\x35.stafihub.stafihub.ledger.MsgSetRelayGasPriceResponse\x12o\n\rSetEraSeconds\x12*.stafihub.stafihub.ledger.MsgSetEraSeconds\x1a\x32.stafihub.stafihub.ledger.MsgSetEraSecondsResponse\x12l\n\x0cRmBondedPool\x12).stafihub.stafihub.ledger.MsgRmBondedPool\x1a\x31.stafihub.stafihub.ledger.MsgRmBondedPoolResponse\x12i\n\x0bMigrateInit\x12(.stafihub.stafihub.ledger.MsgMigrateInit\x1a\x30.stafihub.stafihub.ledger.MsgMigrateInitResponse\x12{\n\x11MigrateUnbondings\x12..stafihub.stafihub.ledger.MsgMigrateUnbondings\x1a\x36.stafihub.stafihub.ledger.MsgMigrateUnbondingsResponse\x12~\n\x12ToggleUnbondSwitch\x12/.stafihub.stafihub.ledger.MsgToggleUnbondSwitch\x1a\x37.stafihub.stafihub.ledger.MsgToggleUnbondSwitchResponse\x12{\n\x11UnsealMigrateInit\x12..stafihub.stafihub.ledger.MsgUnsealMigrateInit\x1a\x36.stafihub.stafihub.ledger.MsgUnsealMigrateInitResponse\x12u\n\x0fRegisterIcaPool\x12,.stafihub.stafihub.ledger.MsgRegisterIcaPool\x1a\x34.stafihub.stafihub.ledger.MsgRegisterIcaPoolResponse\x12{\n\x11SetWithdrawalAddr\x12..stafihub.stafihub.ledger.MsgSetWithdrawalAddr\x1a\x36.stafihub.stafihub.ledger.MsgSetWithdrawalAddrResponse\x12`\n\x08InitPool\x12%.stafihub.stafihub.ledger.MsgInitPool\x1a-.stafihub.stafihub.ledger.MsgInitPoolResponse\x12o\n\rSetPoolStatus\x12*.stafihub.stafihub.ledger.MsgSetPoolStatus\x1a\x32.stafihub.stafihub.ledger.MsgSetPoolStatusResponseB\xd6\x01\n\x1c\x63om.stafihub.stafihub.ledgerB\x07TxProtoP\x01Z+github.com/stafihub/stafihub/x/ledger/types\xa2\x02\x03SSL\xaa\x02\x18Stafihub.Stafihub.Ledger\xca\x02\x18Stafihub\\Stafihub\\Ledger\xe2\x02$Stafihub\\Stafihub\\Ledger\\GPBMetadata\xea\x02\x1aStafihub::Stafihub::Ledgerb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stafihub.ledger.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.stafihub.stafihub.ledgerB\007TxProtoP\001Z+github.com/stafihub/stafihub/x/ledger/types\242\002\003SSL\252\002\030Stafihub.Stafihub.Ledger\312\002\030Stafihub\\Stafihub\\Ledger\342\002$Stafihub\\Stafihub\\Ledger\\GPBMetadata\352\002\032Stafihub::Stafihub::Ledger'
  _MSGSETERAUNBONDLIMIT.fields_by_name['limit']._options = None
  _MSGSETERAUNBONDLIMIT.fields_by_name['limit']._serialized_options = b'\352\336\037\005limit'
  _MSGSETPOOLDETAIL.fields_by_name['threshold']._options = None
  _MSGSETPOOLDETAIL.fields_by_name['threshold']._serialized_options = b'\352\336\037\tthreshold'
  _MSGSETSTAKINGREWARDCOMMISSION.fields_by_name['commission']._options = None
  _MSGSETSTAKINGREWARDCOMMISSION.fields_by_name['commission']._serialized_options = b'\310\336\037\000\332\336\037&github.com/stafihub/stafihub/utils.Dec'
  _MSGSETUNBONDRELAYFEE.fields_by_name['value']._options = None
  _MSGSETUNBONDRELAYFEE.fields_by_name['value']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _MSGLIQUIDITYUNBOND.fields_by_name['value']._options = None
  _MSGLIQUIDITYUNBOND.fields_by_name['value']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _MSGSETUNBONDCOMMISSION.fields_by_name['commission']._options = None
  _MSGSETUNBONDCOMMISSION.fields_by_name['commission']._serialized_options = b'\310\336\037\000\332\336\037&github.com/stafihub/stafihub/utils.Dec'
  _MSGSUBMITSIGNATURE.fields_by_name['era']._options = None
  _MSGSUBMITSIGNATURE.fields_by_name['era']._serialized_options = b'\352\336\037\003era'
  _MSGSETRPARAMS.fields_by_name['offset']._options = None
  _MSGSETRPARAMS.fields_by_name['offset']._serialized_options = b'\352\336\037\006offset'
  _MSGSETRPARAMS.fields_by_name['bondingDuration']._options = None
  _MSGSETRPARAMS.fields_by_name['bondingDuration']._serialized_options = b'\352\336\037\017bondingDuration'
  _MSGSETERASECONDS.fields_by_name['eraSeconds']._options = None
  _MSGSETERASECONDS.fields_by_name['eraSeconds']._serialized_options = b'\352\336\037\neraSeconds'
  _MSGSETERASECONDS.fields_by_name['bondingDuration']._options = None
  _MSGSETERASECONDS.fields_by_name['bondingDuration']._serialized_options = b'\352\336\037\017bondingDuration'
  _MSGSETERASECONDS.fields_by_name['offset']._options = None
  _MSGSETERASECONDS.fields_by_name['offset']._serialized_options = b'\352\336\037\006offset'
  _MSGMIGRATEINIT.fields_by_name['totalSupply']._options = None
  _MSGMIGRATEINIT.fields_by_name['totalSupply']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _MSGMIGRATEINIT.fields_by_name['active']._options = None
  _MSGMIGRATEINIT.fields_by_name['active']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _MSGMIGRATEINIT.fields_by_name['bond']._options = None
  _MSGMIGRATEINIT.fields_by_name['bond']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _MSGMIGRATEINIT.fields_by_name['unbond']._options = None
  _MSGMIGRATEINIT.fields_by_name['unbond']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _MSGMIGRATEINIT.fields_by_name['exchangeRate']._options = None
  _MSGMIGRATEINIT.fields_by_name['exchangeRate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/stafihub/stafihub/utils.Dec'
  _MSGMIGRATEINIT.fields_by_name['totalProtocolFee']._options = None
  _MSGMIGRATEINIT.fields_by_name['totalProtocolFee']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _MSGMIGRATEUNBONDINGS.fields_by_name['era']._options = None
  _MSGMIGRATEUNBONDINGS.fields_by_name['era']._serialized_options = b'\352\336\037\003era'
  _globals['_MSGSETERAUNBONDLIMIT']._serialized_start=165
  _globals['_MSGSETERAUNBONDLIMIT']._serialized_end=268
  _globals['_MSGSETERAUNBONDLIMITRESPONSE']._serialized_start=270
  _globals['_MSGSETERAUNBONDLIMITRESPONSE']._serialized_end=300
  _globals['_MSGSETPOOLDETAIL']._serialized_start=303
  _globals['_MSGSETPOOLDETAIL']._serialized_end=468
  _globals['_MSGSETPOOLDETAILRESPONSE']._serialized_start=470
  _globals['_MSGSETPOOLDETAILRESPONSE']._serialized_end=496
  _globals['_MSGSETLEASTBOND']._serialized_start=498
  _globals['_MSGSETLEASTBOND']._serialized_end=593
  _globals['_MSGSETLEASTBONDRESPONSE']._serialized_start=595
  _globals['_MSGSETLEASTBONDRESPONSE']._serialized_end=620
  _globals['_MSGCLEARCURRENTERASNAPSHOTS']._serialized_start=622
  _globals['_MSGCLEARCURRENTERASNAPSHOTS']._serialized_end=699
  _globals['_MSGCLEARCURRENTERASNAPSHOTSRESPONSE']._serialized_start=701
  _globals['_MSGCLEARCURRENTERASNAPSHOTSRESPONSE']._serialized_end=738
  _globals['_MSGSETSTAKINGREWARDCOMMISSION']._serialized_start=741
  _globals['_MSGSETSTAKINGREWARDCOMMISSION']._serialized_end=900
  _globals['_MSGSETSTAKINGREWARDCOMMISSIONRESPONSE']._serialized_start=902
  _globals['_MSGSETSTAKINGREWARDCOMMISSIONRESPONSE']._serialized_end=941
  _globals['_MSGSETPROTOCOLFEERECEIVER']._serialized_start=943
  _globals['_MSGSETPROTOCOLFEERECEIVER']._serialized_end=1024
  _globals['_MSGSETPROTOCOLFEERECEIVERRESPONSE']._serialized_start=1026
  _globals['_MSGSETPROTOCOLFEERECEIVERRESPONSE']._serialized_end=1061
  _globals['_MSGSETUNBONDRELAYFEE']._serialized_start=1064
  _globals['_MSGSETUNBONDRELAYFEE']._serialized_end=1232
  _globals['_MSGSETUNBONDRELAYFEERESPONSE']._serialized_start=1234
  _globals['_MSGSETUNBONDRELAYFEERESPONSE']._serialized_end=1264
  _globals['_MSGLIQUIDITYUNBOND']._serialized_start=1267
  _globals['_MSGLIQUIDITYUNBOND']._serialized_end=1461
  _globals['_MSGLIQUIDITYUNBONDRESPONSE']._serialized_start=1463
  _globals['_MSGLIQUIDITYUNBONDRESPONSE']._serialized_end=1491
  _globals['_MSGSETUNBONDCOMMISSION']._serialized_start=1494
  _globals['_MSGSETUNBONDCOMMISSION']._serialized_end=1646
  _globals['_MSGSETUNBONDCOMMISSIONRESPONSE']._serialized_start=1648
  _globals['_MSGSETUNBONDCOMMISSIONRESPONSE']._serialized_end=1680
  _globals['_MSGSUBMITSIGNATURE']._serialized_start=1683
  _globals['_MSGSUBMITSIGNATURE']._serialized_end=1918
  _globals['_MSGSUBMITSIGNATURERESPONSE']._serialized_start=1920
  _globals['_MSGSUBMITSIGNATURERESPONSE']._serialized_end=1948
  _globals['_MSGSETRPARAMS']._serialized_start=1951
  _globals['_MSGSETRPARAMS']._serialized_end=2203
  _globals['_MSGSETRPARAMSRESPONSE']._serialized_start=2205
  _globals['_MSGSETRPARAMSRESPONSE']._serialized_end=2228
  _globals['_MSGSETRELAYFEERECEIVER']._serialized_start=2230
  _globals['_MSGSETRELAYFEERECEIVER']._serialized_end=2330
  _globals['_MSGSETRELAYFEERECEIVERRESPONSE']._serialized_start=2332
  _globals['_MSGSETRELAYFEERECEIVERRESPONSE']._serialized_end=2364
  _globals['_MSGSETRELAYGASPRICE']._serialized_start=2366
  _globals['_MSGSETRELAYGASPRICE']._serialized_end=2463
  _globals['_MSGSETRELAYGASPRICERESPONSE']._serialized_start=2465
  _globals['_MSGSETRELAYGASPRICERESPONSE']._serialized_end=2494
  _globals['_MSGSETERASECONDS']._serialized_start=2497
  _globals['_MSGSETERASECONDS']._serialized_end=2710
  _globals['_MSGSETERASECONDSRESPONSE']._serialized_start=2712
  _globals['_MSGSETERASECONDSRESPONSE']._serialized_end=2738
  _globals['_MSGRMBONDEDPOOL']._serialized_start=2740
  _globals['_MSGRMBONDEDPOOL']._serialized_end=2831
  _globals['_MSGRMBONDEDPOOLRESPONSE']._serialized_start=2833
  _globals['_MSGRMBONDEDPOOLRESPONSE']._serialized_end=2858
  _globals['_MSGMIGRATEINIT']._serialized_start=2861
  _globals['_MSGMIGRATEINIT']._serialized_end=3415
  _globals['_MSGMIGRATEINITRESPONSE']._serialized_start=3417
  _globals['_MSGMIGRATEINITRESPONSE']._serialized_end=3441
  _globals['_MSGMIGRATEUNBONDINGS']._serialized_start=3444
  _globals['_MSGMIGRATEUNBONDINGS']._serialized_end=3630
  _globals['_MSGMIGRATEUNBONDINGSRESPONSE']._serialized_start=3632
  _globals['_MSGMIGRATEUNBONDINGSRESPONSE']._serialized_end=3662
  _globals['_MSGTOGGLEUNBONDSWITCH']._serialized_start=3664
  _globals['_MSGTOGGLEUNBONDSWITCH']._serialized_end=3735
  _globals['_MSGTOGGLEUNBONDSWITCHRESPONSE']._serialized_start=3737
  _globals['_MSGTOGGLEUNBONDSWITCHRESPONSE']._serialized_end=3768
  _globals['_MSGUNSEALMIGRATEINIT']._serialized_start=3770
  _globals['_MSGUNSEALMIGRATEINIT']._serialized_end=3818
  _globals['_MSGUNSEALMIGRATEINITRESPONSE']._serialized_start=3820
  _globals['_MSGUNSEALMIGRATEINITRESPONSE']._serialized_end=3850
  _globals['_MSGREGISTERICAPOOL']._serialized_start=3852
  _globals['_MSGREGISTERICAPOOL']._serialized_end=3956
  _globals['_MSGREGISTERICAPOOLRESPONSE']._serialized_start=3958
  _globals['_MSGREGISTERICAPOOLRESPONSE']._serialized_end=3986
  _globals['_MSGSETWITHDRAWALADDR']._serialized_start=3988
  _globals['_MSGSETWITHDRAWALADDR']._serialized_end=4076
  _globals['_MSGSETWITHDRAWALADDRRESPONSE']._serialized_start=4078
  _globals['_MSGSETWITHDRAWALADDRRESPONSE']._serialized_end=4108
  _globals['_MSGINITPOOL']._serialized_start=4110
  _globals['_MSGINITPOOL']._serialized_end=4191
  _globals['_MSGINITPOOLRESPONSE']._serialized_start=4193
  _globals['_MSGINITPOOLRESPONSE']._serialized_end=4214
  _globals['_MSGSETPOOLSTATUS']._serialized_start=4217
  _globals['_MSGSETPOOLSTATUS']._serialized_end=4365
  _globals['_MSGSETPOOLSTATUSRESPONSE']._serialized_start=4367
  _globals['_MSGSETPOOLSTATUSRESPONSE']._serialized_end=4393
  _globals['_MSG']._serialized_start=4396
  _globals['_MSG']._serialized_end=7206
# @@protoc_insertion_point(module_scope)
