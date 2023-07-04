# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/earn/v1beta1/proposal.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n kava/earn/v1beta1/proposal.proto\x12\x11kava.earn.v1beta1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\"\x99\x01\n\x1c\x43ommunityPoolDepositProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x37\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\"\x84\x02\n CommunityPoolDepositProposalJSON\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x37\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\x12\x65\n\x07\x64\x65posit\x18\x04 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x07\x64\x65posit:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x01\"\x9a\x01\n\x1d\x43ommunityPoolWithdrawProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x37\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\"\x85\x02\n!CommunityPoolWithdrawProposalJSON\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x37\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\x12\x65\n\x07\x64\x65posit\x18\x04 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x07\x64\x65posit:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x01\x42\xb4\x01\n\x15\x63om.kava.earn.v1beta1B\rProposalProtoP\x01Z&github.com/kava-labs/kava/x/earn/types\xa2\x02\x03KEX\xaa\x02\x11Kava.Earn.V1beta1\xca\x02\x11Kava\\Earn\\V1beta1\xe2\x02\x1dKava\\Earn\\V1beta1\\GPBMetadata\xea\x02\x13Kava::Earn::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.earn.v1beta1.proposal_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\025com.kava.earn.v1beta1B\rProposalProtoP\001Z&github.com/kava-labs/kava/x/earn/types\242\002\003KEX\252\002\021Kava.Earn.V1beta1\312\002\021Kava\\Earn\\V1beta1\342\002\035Kava\\Earn\\V1beta1\\GPBMetadata\352\002\023Kava::Earn::V1beta1'
  _COMMUNITYPOOLDEPOSITPROPOSAL.fields_by_name['amount']._options = None
  _COMMUNITYPOOLDEPOSITPROPOSAL.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _COMMUNITYPOOLDEPOSITPROPOSAL._options = None
  _COMMUNITYPOOLDEPOSITPROPOSAL._serialized_options = b'\210\240\037\000\230\240\037\000'
  _COMMUNITYPOOLDEPOSITPROPOSALJSON.fields_by_name['amount']._options = None
  _COMMUNITYPOOLDEPOSITPROPOSALJSON.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _COMMUNITYPOOLDEPOSITPROPOSALJSON.fields_by_name['deposit']._options = None
  _COMMUNITYPOOLDEPOSITPROPOSALJSON.fields_by_name['deposit']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _COMMUNITYPOOLDEPOSITPROPOSALJSON._options = None
  _COMMUNITYPOOLDEPOSITPROPOSALJSON._serialized_options = b'\210\240\037\000\230\240\037\001'
  _COMMUNITYPOOLWITHDRAWPROPOSAL.fields_by_name['amount']._options = None
  _COMMUNITYPOOLWITHDRAWPROPOSAL.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _COMMUNITYPOOLWITHDRAWPROPOSAL._options = None
  _COMMUNITYPOOLWITHDRAWPROPOSAL._serialized_options = b'\210\240\037\000\230\240\037\000'
  _COMMUNITYPOOLWITHDRAWPROPOSALJSON.fields_by_name['amount']._options = None
  _COMMUNITYPOOLWITHDRAWPROPOSALJSON.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _COMMUNITYPOOLWITHDRAWPROPOSALJSON.fields_by_name['deposit']._options = None
  _COMMUNITYPOOLWITHDRAWPROPOSALJSON.fields_by_name['deposit']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _COMMUNITYPOOLWITHDRAWPROPOSALJSON._options = None
  _COMMUNITYPOOLWITHDRAWPROPOSALJSON._serialized_options = b'\210\240\037\000\230\240\037\001'
  _globals['_COMMUNITYPOOLDEPOSITPROPOSAL']._serialized_start=110
  _globals['_COMMUNITYPOOLDEPOSITPROPOSAL']._serialized_end=263
  _globals['_COMMUNITYPOOLDEPOSITPROPOSALJSON']._serialized_start=266
  _globals['_COMMUNITYPOOLDEPOSITPROPOSALJSON']._serialized_end=526
  _globals['_COMMUNITYPOOLWITHDRAWPROPOSAL']._serialized_start=529
  _globals['_COMMUNITYPOOLWITHDRAWPROPOSAL']._serialized_end=683
  _globals['_COMMUNITYPOOLWITHDRAWPROPOSALJSON']._serialized_start=686
  _globals['_COMMUNITYPOOLWITHDRAWPROPOSALJSON']._serialized_end=947
# @@protoc_insertion_point(module_scope)