# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stride/ratelimit/gov.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1astride/ratelimit/gov.proto\x12\x10stride.ratelimit\x1a\x14gogoproto/gogo.proto\"\x9a\x03\n\x14\x41\x64\x64RateLimitProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\x12\x1d\n\nchannel_id\x18\x04 \x01(\tR\tchannelId\x12X\n\x10max_percent_send\x18\x05 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0emaxPercentSend\x12X\n\x10max_percent_recv\x18\x06 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0emaxPercentRecv\x12%\n\x0e\x64uration_hours\x18\x07 \x01(\x04R\rdurationHours\x12,\n\x07\x64\x65posit\x18\x08 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"deposit\"R\x07\x64\x65posit:\x0c\x88\xa0\x1f\x00\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\"\x9d\x03\n\x17UpdateRateLimitProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\x12\x1d\n\nchannel_id\x18\x04 \x01(\tR\tchannelId\x12X\n\x10max_percent_send\x18\x05 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0emaxPercentSend\x12X\n\x10max_percent_recv\x18\x06 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0emaxPercentRecv\x12%\n\x0e\x64uration_hours\x18\x07 \x01(\x04R\rdurationHours\x12,\n\x07\x64\x65posit\x18\x08 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"deposit\"R\x07\x64\x65posit:\x0c\x88\xa0\x1f\x00\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\"\xc2\x01\n\x17RemoveRateLimitProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\x12\x1d\n\nchannel_id\x18\x04 \x01(\tR\tchannelId\x12,\n\x07\x64\x65posit\x18\x05 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"deposit\"R\x07\x64\x65posit:\x0c\x88\xa0\x1f\x00\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\"\xc1\x01\n\x16ResetRateLimitProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\x12\x1d\n\nchannel_id\x18\x04 \x01(\tR\tchannelId\x12,\n\x07\x64\x65posit\x18\x05 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"deposit\"R\x07\x64\x65posit:\x0c\x88\xa0\x1f\x00\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\x42\xb5\x01\n\x14\x63om.stride.ratelimitB\x08GovProtoP\x01Z2github.com/Stride-Labs/stride/v9/x/ratelimit/types\xa2\x02\x03SRX\xaa\x02\x10Stride.Ratelimit\xca\x02\x10Stride\\Ratelimit\xe2\x02\x1cStride\\Ratelimit\\GPBMetadata\xea\x02\x11Stride::Ratelimitb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stride.ratelimit.gov_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\024com.stride.ratelimitB\010GovProtoP\001Z2github.com/Stride-Labs/stride/v9/x/ratelimit/types\242\002\003SRX\252\002\020Stride.Ratelimit\312\002\020Stride\\Ratelimit\342\002\034Stride\\Ratelimit\\GPBMetadata\352\002\021Stride::Ratelimit'
  _ADDRATELIMITPROPOSAL.fields_by_name['max_percent_send']._options = None
  _ADDRATELIMITPROPOSAL.fields_by_name['max_percent_send']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _ADDRATELIMITPROPOSAL.fields_by_name['max_percent_recv']._options = None
  _ADDRATELIMITPROPOSAL.fields_by_name['max_percent_recv']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _ADDRATELIMITPROPOSAL.fields_by_name['deposit']._options = None
  _ADDRATELIMITPROPOSAL.fields_by_name['deposit']._serialized_options = b'\362\336\037\016yaml:\"deposit\"'
  _ADDRATELIMITPROPOSAL._options = None
  _ADDRATELIMITPROPOSAL._serialized_options = b'\210\240\037\000\230\240\037\000\350\240\037\001'
  _UPDATERATELIMITPROPOSAL.fields_by_name['max_percent_send']._options = None
  _UPDATERATELIMITPROPOSAL.fields_by_name['max_percent_send']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _UPDATERATELIMITPROPOSAL.fields_by_name['max_percent_recv']._options = None
  _UPDATERATELIMITPROPOSAL.fields_by_name['max_percent_recv']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _UPDATERATELIMITPROPOSAL.fields_by_name['deposit']._options = None
  _UPDATERATELIMITPROPOSAL.fields_by_name['deposit']._serialized_options = b'\362\336\037\016yaml:\"deposit\"'
  _UPDATERATELIMITPROPOSAL._options = None
  _UPDATERATELIMITPROPOSAL._serialized_options = b'\210\240\037\000\230\240\037\000\350\240\037\001'
  _REMOVERATELIMITPROPOSAL.fields_by_name['deposit']._options = None
  _REMOVERATELIMITPROPOSAL.fields_by_name['deposit']._serialized_options = b'\362\336\037\016yaml:\"deposit\"'
  _REMOVERATELIMITPROPOSAL._options = None
  _REMOVERATELIMITPROPOSAL._serialized_options = b'\210\240\037\000\230\240\037\000\350\240\037\001'
  _RESETRATELIMITPROPOSAL.fields_by_name['deposit']._options = None
  _RESETRATELIMITPROPOSAL.fields_by_name['deposit']._serialized_options = b'\362\336\037\016yaml:\"deposit\"'
  _RESETRATELIMITPROPOSAL._options = None
  _RESETRATELIMITPROPOSAL._serialized_options = b'\210\240\037\000\230\240\037\000\350\240\037\001'
  _globals['_ADDRATELIMITPROPOSAL']._serialized_start=71
  _globals['_ADDRATELIMITPROPOSAL']._serialized_end=481
  _globals['_UPDATERATELIMITPROPOSAL']._serialized_start=484
  _globals['_UPDATERATELIMITPROPOSAL']._serialized_end=897
  _globals['_REMOVERATELIMITPROPOSAL']._serialized_start=900
  _globals['_REMOVERATELIMITPROPOSAL']._serialized_end=1094
  _globals['_RESETRATELIMITPROPOSAL']._serialized_start=1097
  _globals['_RESETRATELIMITPROPOSAL']._serialized_end=1290
# @@protoc_insertion_point(module_scope)
