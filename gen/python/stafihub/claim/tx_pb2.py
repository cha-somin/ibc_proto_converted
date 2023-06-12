# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stafihub/claim/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x17stafihub/claim/tx.proto\x12\x17stafihub.stafihub.claim\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"m\n\x10MsgSetMerkleRoot\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x1f\n\x05round\x18\x02 \x01(\x04\x42\t\xea\xde\x1f\x05roundR\x05round\x12\x1e\n\nmerkleRoot\x18\x03 \x01(\tR\nmerkleRoot\"\x1a\n\x18MsgSetMerkleRootResponse\"\xf6\x01\n\x08MsgClaim\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x1f\n\x05round\x18\x02 \x01(\x04\x42\t\xea\xde\x1f\x05roundR\x05round\x12\x1f\n\x05index\x18\x03 \x01(\x04\x42\t\xea\xde\x1f\x05indexR\x05index\x12\x18\n\x07\x61\x63\x63ount\x18\x04 \x01(\tR\x07\x61\x63\x63ount\x12^\n\x04\x63oin\x18\x05 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x04\x63oin\x12\x14\n\x05proof\x18\x06 \x03(\tR\x05proof\"\x12\n\x10MsgClaimResponse\"Q\n\x14MsgToggleClaimSwitch\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x1f\n\x05round\x18\x02 \x01(\x04\x42\t\xea\xde\x1f\x05roundR\x05round\"\x1e\n\x1cMsgToggleClaimSwitchResponse\"\x8d\x01\n\x0fMsgProvideToken\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12`\n\x05token\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x05token\"\x19\n\x17MsgProvideTokenResponse\"\xac\x01\n\x10MsgWithdrawToken\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x1c\n\trecipient\x18\x02 \x01(\tR\trecipient\x12`\n\x05token\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x05token\"\x1a\n\x18MsgWithdrawTokenResponse2\xa1\x04\n\x03Msg\x12m\n\rSetMerkleRoot\x12).stafihub.stafihub.claim.MsgSetMerkleRoot\x1a\x31.stafihub.stafihub.claim.MsgSetMerkleRootResponse\x12U\n\x05\x43laim\x12!.stafihub.stafihub.claim.MsgClaim\x1a).stafihub.stafihub.claim.MsgClaimResponse\x12y\n\x11ToggleClaimSwitch\x12-.stafihub.stafihub.claim.MsgToggleClaimSwitch\x1a\x35.stafihub.stafihub.claim.MsgToggleClaimSwitchResponse\x12j\n\x0cProvideToken\x12(.stafihub.stafihub.claim.MsgProvideToken\x1a\x30.stafihub.stafihub.claim.MsgProvideTokenResponse\x12m\n\rWithdrawToken\x12).stafihub.stafihub.claim.MsgWithdrawToken\x1a\x31.stafihub.stafihub.claim.MsgWithdrawTokenResponseB\xd0\x01\n\x1b\x63om.stafihub.stafihub.claimB\x07TxProtoP\x01Z*github.com/stafihub/stafihub/x/claim/types\xa2\x02\x03SSC\xaa\x02\x17Stafihub.Stafihub.Claim\xca\x02\x17Stafihub\\Stafihub\\Claim\xe2\x02#Stafihub\\Stafihub\\Claim\\GPBMetadata\xea\x02\x19Stafihub::Stafihub::Claimb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stafihub.claim.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.stafihub.stafihub.claimB\007TxProtoP\001Z*github.com/stafihub/stafihub/x/claim/types\242\002\003SSC\252\002\027Stafihub.Stafihub.Claim\312\002\027Stafihub\\Stafihub\\Claim\342\002#Stafihub\\Stafihub\\Claim\\GPBMetadata\352\002\031Stafihub::Stafihub::Claim'
  _MSGSETMERKLEROOT.fields_by_name['round']._options = None
  _MSGSETMERKLEROOT.fields_by_name['round']._serialized_options = b'\352\336\037\005round'
  _MSGCLAIM.fields_by_name['round']._options = None
  _MSGCLAIM.fields_by_name['round']._serialized_options = b'\352\336\037\005round'
  _MSGCLAIM.fields_by_name['index']._options = None
  _MSGCLAIM.fields_by_name['index']._serialized_options = b'\352\336\037\005index'
  _MSGCLAIM.fields_by_name['coin']._options = None
  _MSGCLAIM.fields_by_name['coin']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _MSGTOGGLECLAIMSWITCH.fields_by_name['round']._options = None
  _MSGTOGGLECLAIMSWITCH.fields_by_name['round']._serialized_options = b'\352\336\037\005round'
  _MSGPROVIDETOKEN.fields_by_name['token']._options = None
  _MSGPROVIDETOKEN.fields_by_name['token']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _MSGWITHDRAWTOKEN.fields_by_name['token']._options = None
  _MSGWITHDRAWTOKEN.fields_by_name['token']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _globals['_MSGSETMERKLEROOT']._serialized_start=106
  _globals['_MSGSETMERKLEROOT']._serialized_end=215
  _globals['_MSGSETMERKLEROOTRESPONSE']._serialized_start=217
  _globals['_MSGSETMERKLEROOTRESPONSE']._serialized_end=243
  _globals['_MSGCLAIM']._serialized_start=246
  _globals['_MSGCLAIM']._serialized_end=492
  _globals['_MSGCLAIMRESPONSE']._serialized_start=494
  _globals['_MSGCLAIMRESPONSE']._serialized_end=512
  _globals['_MSGTOGGLECLAIMSWITCH']._serialized_start=514
  _globals['_MSGTOGGLECLAIMSWITCH']._serialized_end=595
  _globals['_MSGTOGGLECLAIMSWITCHRESPONSE']._serialized_start=597
  _globals['_MSGTOGGLECLAIMSWITCHRESPONSE']._serialized_end=627
  _globals['_MSGPROVIDETOKEN']._serialized_start=630
  _globals['_MSGPROVIDETOKEN']._serialized_end=771
  _globals['_MSGPROVIDETOKENRESPONSE']._serialized_start=773
  _globals['_MSGPROVIDETOKENRESPONSE']._serialized_end=798
  _globals['_MSGWITHDRAWTOKEN']._serialized_start=801
  _globals['_MSGWITHDRAWTOKEN']._serialized_end=973
  _globals['_MSGWITHDRAWTOKENRESPONSE']._serialized_start=975
  _globals['_MSGWITHDRAWTOKENRESPONSE']._serialized_end=1001
  _globals['_MSG']._serialized_start=1004
  _globals['_MSG']._serialized_end=1549
# @@protoc_insertion_point(module_scope)
