# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: provenance/msgfees/v1/proposals.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%provenance/msgfees/v1/proposals.proto\x12\x15provenance.msgfees.v1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xd9\x02\n\x11\x41\x64\x64MsgFeeProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12 \n\x0cmsg_type_url\x18\x03 \x01(\tR\nmsgTypeUrl\x12\x8b\x01\n\x0e\x61\x64\x64itional_fee\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinBI\xc8\xde\x1f\x00\xf2\xde\x1f\x15yaml:\"additional_fee\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\radditionalFee\x12\x1c\n\trecipient\x18\x05 \x01(\tR\trecipient\x12\x34\n\x16recipient_basis_points\x18\x06 \x01(\tR\x14recipientBasisPoints:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\xc2\x02\n\x14UpdateMsgFeeProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12 \n\x0cmsg_type_url\x18\x03 \x01(\tR\nmsgTypeUrl\x12r\n\x0e\x61\x64\x64itional_fee\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\radditionalFee\x12\x1c\n\trecipient\x18\x05 \x01(\tR\trecipient\x12\x34\n\x16recipient_basis_points\x18\x06 \x01(\tR\x14recipientBasisPoints:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"z\n\x14RemoveMsgFeeProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12 \n\x0cmsg_type_url\x18\x03 \x01(\tR\nmsgTypeUrl:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\x8b\x01\n\x1cUpdateNhashPerUsdMilProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12)\n\x11nhash_per_usd_mil\x18\x03 \x01(\x04R\x0enhashPerUsdMil:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\x96\x01\n UpdateConversionFeeDenomProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x30\n\x14\x63onversion_fee_denom\x18\x04 \x01(\tR\x12\x63onversionFeeDenom:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\x42\xd6\x01\n\x19\x63om.provenance.msgfees.v1B\x0eProposalsProtoP\x01Z3github.com/provenance-io/provenance/x/msgfees/types\xa2\x02\x03PMX\xaa\x02\x15Provenance.Msgfees.V1\xca\x02\x15Provenance\\Msgfees\\V1\xe2\x02!Provenance\\Msgfees\\V1\\GPBMetadata\xea\x02\x17Provenance::Msgfees::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'provenance.msgfees.v1.proposals_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\031com.provenance.msgfees.v1B\016ProposalsProtoP\001Z3github.com/provenance-io/provenance/x/msgfees/types\242\002\003PMX\252\002\025Provenance.Msgfees.V1\312\002\025Provenance\\Msgfees\\V1\342\002!Provenance\\Msgfees\\V1\\GPBMetadata\352\002\027Provenance::Msgfees::V1'
  _ADDMSGFEEPROPOSAL.fields_by_name['additional_fee']._options = None
  _ADDMSGFEEPROPOSAL.fields_by_name['additional_fee']._serialized_options = b'\310\336\037\000\362\336\037\025yaml:\"additional_fee\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _ADDMSGFEEPROPOSAL._options = None
  _ADDMSGFEEPROPOSAL._serialized_options = b'\230\240\037\001\350\240\037\001'
  _UPDATEMSGFEEPROPOSAL.fields_by_name['additional_fee']._options = None
  _UPDATEMSGFEEPROPOSAL.fields_by_name['additional_fee']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _UPDATEMSGFEEPROPOSAL._options = None
  _UPDATEMSGFEEPROPOSAL._serialized_options = b'\230\240\037\001\350\240\037\001'
  _REMOVEMSGFEEPROPOSAL._options = None
  _REMOVEMSGFEEPROPOSAL._serialized_options = b'\230\240\037\001\350\240\037\001'
  _UPDATENHASHPERUSDMILPROPOSAL._options = None
  _UPDATENHASHPERUSDMILPROPOSAL._serialized_options = b'\230\240\037\001\350\240\037\001'
  _UPDATECONVERSIONFEEDENOMPROPOSAL._options = None
  _UPDATECONVERSIONFEEDENOMPROPOSAL._serialized_options = b'\230\240\037\001\350\240\037\001'
  _globals['_ADDMSGFEEPROPOSAL']._serialized_start=119
  _globals['_ADDMSGFEEPROPOSAL']._serialized_end=464
  _globals['_UPDATEMSGFEEPROPOSAL']._serialized_start=467
  _globals['_UPDATEMSGFEEPROPOSAL']._serialized_end=789
  _globals['_REMOVEMSGFEEPROPOSAL']._serialized_start=791
  _globals['_REMOVEMSGFEEPROPOSAL']._serialized_end=913
  _globals['_UPDATENHASHPERUSDMILPROPOSAL']._serialized_start=916
  _globals['_UPDATENHASHPERUSDMILPROPOSAL']._serialized_end=1055
  _globals['_UPDATECONVERSIONFEEDENOMPROPOSAL']._serialized_start=1058
  _globals['_UPDATECONVERSIONFEEDENOMPROPOSAL']._serialized_end=1208
# @@protoc_insertion_point(module_scope)
