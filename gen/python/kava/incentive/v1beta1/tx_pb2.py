# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/incentive/v1beta1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1fkava/incentive/v1beta1/tx.proto\x12\x16kava.incentive.v1beta1\x1a\x14gogoproto/gogo.proto\"T\n\tSelection\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\'\n\x0fmultiplier_name\x18\x02 \x01(\tR\x0emultiplierName:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"f\n\x19MsgClaimUSDXMintingReward\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\'\n\x0fmultiplier_name\x18\x02 \x01(\tR\x0emultiplierName:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"#\n!MsgClaimUSDXMintingRewardResponse\"\x95\x01\n\x12MsgClaimHardReward\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12]\n\x0f\x64\x65noms_to_claim\x18\x02 \x03(\x0b\x32!.kava.incentive.v1beta1.SelectionB\x12\xc8\xde\x1f\x00\xaa\xdf\x1f\nSelectionsR\rdenomsToClaim:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x1c\n\x1aMsgClaimHardRewardResponse\"\x9a\x01\n\x17MsgClaimDelegatorReward\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12]\n\x0f\x64\x65noms_to_claim\x18\x02 \x03(\x0b\x32!.kava.incentive.v1beta1.SelectionB\x12\xc8\xde\x1f\x00\xaa\xdf\x1f\nSelectionsR\rdenomsToClaim:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"!\n\x1fMsgClaimDelegatorRewardResponse\"\x95\x01\n\x12MsgClaimSwapReward\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12]\n\x0f\x64\x65noms_to_claim\x18\x02 \x03(\x0b\x32!.kava.incentive.v1beta1.SelectionB\x12\xc8\xde\x1f\x00\xaa\xdf\x1f\nSelectionsR\rdenomsToClaim:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x1c\n\x1aMsgClaimSwapRewardResponse\"\x98\x01\n\x15MsgClaimSavingsReward\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12]\n\x0f\x64\x65noms_to_claim\x18\x02 \x03(\x0b\x32!.kava.incentive.v1beta1.SelectionB\x12\xc8\xde\x1f\x00\xaa\xdf\x1f\nSelectionsR\rdenomsToClaim:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x1f\n\x1dMsgClaimSavingsRewardResponse\"\x95\x01\n\x12MsgClaimEarnReward\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12]\n\x0f\x64\x65noms_to_claim\x18\x02 \x03(\x0b\x32!.kava.incentive.v1beta1.SelectionB\x12\xc8\xde\x1f\x00\xaa\xdf\x1f\nSelectionsR\rdenomsToClaim:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x1c\n\x1aMsgClaimEarnRewardResponse2\xe6\x05\n\x03Msg\x12\x86\x01\n\x16\x43laimUSDXMintingReward\x12\x31.kava.incentive.v1beta1.MsgClaimUSDXMintingReward\x1a\x39.kava.incentive.v1beta1.MsgClaimUSDXMintingRewardResponse\x12q\n\x0f\x43laimHardReward\x12*.kava.incentive.v1beta1.MsgClaimHardReward\x1a\x32.kava.incentive.v1beta1.MsgClaimHardRewardResponse\x12\x80\x01\n\x14\x43laimDelegatorReward\x12/.kava.incentive.v1beta1.MsgClaimDelegatorReward\x1a\x37.kava.incentive.v1beta1.MsgClaimDelegatorRewardResponse\x12q\n\x0f\x43laimSwapReward\x12*.kava.incentive.v1beta1.MsgClaimSwapReward\x1a\x32.kava.incentive.v1beta1.MsgClaimSwapRewardResponse\x12z\n\x12\x43laimSavingsReward\x12-.kava.incentive.v1beta1.MsgClaimSavingsReward\x1a\x35.kava.incentive.v1beta1.MsgClaimSavingsRewardResponse\x12q\n\x0f\x43laimEarnReward\x12*.kava.incentive.v1beta1.MsgClaimEarnReward\x1a\x32.kava.incentive.v1beta1.MsgClaimEarnRewardResponseB\xcc\x01\n\x1a\x63om.kava.incentive.v1beta1B\x07TxProtoP\x01Z+github.com/kava-labs/kava/x/incentive/types\xa2\x02\x03KIX\xaa\x02\x16Kava.Incentive.V1beta1\xca\x02\x16Kava\\Incentive\\V1beta1\xe2\x02\"Kava\\Incentive\\V1beta1\\GPBMetadata\xea\x02\x18Kava::Incentive::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.incentive.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.kava.incentive.v1beta1B\007TxProtoP\001Z+github.com/kava-labs/kava/x/incentive/types\242\002\003KIX\252\002\026Kava.Incentive.V1beta1\312\002\026Kava\\Incentive\\V1beta1\342\002\"Kava\\Incentive\\V1beta1\\GPBMetadata\352\002\030Kava::Incentive::V1beta1'
  _SELECTION._options = None
  _SELECTION._serialized_options = b'\210\240\037\000\350\240\037\000'
  _MSGCLAIMUSDXMINTINGREWARD._options = None
  _MSGCLAIMUSDXMINTINGREWARD._serialized_options = b'\210\240\037\000\350\240\037\000'
  _MSGCLAIMHARDREWARD.fields_by_name['denoms_to_claim']._options = None
  _MSGCLAIMHARDREWARD.fields_by_name['denoms_to_claim']._serialized_options = b'\310\336\037\000\252\337\037\nSelections'
  _MSGCLAIMHARDREWARD._options = None
  _MSGCLAIMHARDREWARD._serialized_options = b'\210\240\037\000\350\240\037\000'
  _MSGCLAIMDELEGATORREWARD.fields_by_name['denoms_to_claim']._options = None
  _MSGCLAIMDELEGATORREWARD.fields_by_name['denoms_to_claim']._serialized_options = b'\310\336\037\000\252\337\037\nSelections'
  _MSGCLAIMDELEGATORREWARD._options = None
  _MSGCLAIMDELEGATORREWARD._serialized_options = b'\210\240\037\000\350\240\037\000'
  _MSGCLAIMSWAPREWARD.fields_by_name['denoms_to_claim']._options = None
  _MSGCLAIMSWAPREWARD.fields_by_name['denoms_to_claim']._serialized_options = b'\310\336\037\000\252\337\037\nSelections'
  _MSGCLAIMSWAPREWARD._options = None
  _MSGCLAIMSWAPREWARD._serialized_options = b'\210\240\037\000\350\240\037\000'
  _MSGCLAIMSAVINGSREWARD.fields_by_name['denoms_to_claim']._options = None
  _MSGCLAIMSAVINGSREWARD.fields_by_name['denoms_to_claim']._serialized_options = b'\310\336\037\000\252\337\037\nSelections'
  _MSGCLAIMSAVINGSREWARD._options = None
  _MSGCLAIMSAVINGSREWARD._serialized_options = b'\210\240\037\000\350\240\037\000'
  _MSGCLAIMEARNREWARD.fields_by_name['denoms_to_claim']._options = None
  _MSGCLAIMEARNREWARD.fields_by_name['denoms_to_claim']._serialized_options = b'\310\336\037\000\252\337\037\nSelections'
  _MSGCLAIMEARNREWARD._options = None
  _MSGCLAIMEARNREWARD._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_SELECTION']._serialized_start=81
  _globals['_SELECTION']._serialized_end=165
  _globals['_MSGCLAIMUSDXMINTINGREWARD']._serialized_start=167
  _globals['_MSGCLAIMUSDXMINTINGREWARD']._serialized_end=269
  _globals['_MSGCLAIMUSDXMINTINGREWARDRESPONSE']._serialized_start=271
  _globals['_MSGCLAIMUSDXMINTINGREWARDRESPONSE']._serialized_end=306
  _globals['_MSGCLAIMHARDREWARD']._serialized_start=309
  _globals['_MSGCLAIMHARDREWARD']._serialized_end=458
  _globals['_MSGCLAIMHARDREWARDRESPONSE']._serialized_start=460
  _globals['_MSGCLAIMHARDREWARDRESPONSE']._serialized_end=488
  _globals['_MSGCLAIMDELEGATORREWARD']._serialized_start=491
  _globals['_MSGCLAIMDELEGATORREWARD']._serialized_end=645
  _globals['_MSGCLAIMDELEGATORREWARDRESPONSE']._serialized_start=647
  _globals['_MSGCLAIMDELEGATORREWARDRESPONSE']._serialized_end=680
  _globals['_MSGCLAIMSWAPREWARD']._serialized_start=683
  _globals['_MSGCLAIMSWAPREWARD']._serialized_end=832
  _globals['_MSGCLAIMSWAPREWARDRESPONSE']._serialized_start=834
  _globals['_MSGCLAIMSWAPREWARDRESPONSE']._serialized_end=862
  _globals['_MSGCLAIMSAVINGSREWARD']._serialized_start=865
  _globals['_MSGCLAIMSAVINGSREWARD']._serialized_end=1017
  _globals['_MSGCLAIMSAVINGSREWARDRESPONSE']._serialized_start=1019
  _globals['_MSGCLAIMSAVINGSREWARDRESPONSE']._serialized_end=1050
  _globals['_MSGCLAIMEARNREWARD']._serialized_start=1053
  _globals['_MSGCLAIMEARNREWARD']._serialized_end=1202
  _globals['_MSGCLAIMEARNREWARDRESPONSE']._serialized_start=1204
  _globals['_MSGCLAIMEARNREWARDRESPONSE']._serialized_end=1232
  _globals['_MSG']._serialized_start=1235
  _globals['_MSG']._serialized_end=1977
# @@protoc_insertion_point(module_scope)