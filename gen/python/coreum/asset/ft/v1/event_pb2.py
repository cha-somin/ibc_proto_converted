# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: coreum/asset/ft/v1/event.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from coreum.asset.ft.v1 import token_pb2 as coreum_dot_asset_dot_ft_dot_v1_dot_token__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1e\x63oreum/asset/ft/v1/event.proto\x12\x12\x63oreum.asset.ft.v1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63oreum/asset/ft/v1/token.proto\"\xec\x03\n\x0b\x45ventIssued\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x16\n\x06issuer\x18\x02 \x01(\tR\x06issuer\x12\x16\n\x06symbol\x18\x03 \x01(\tR\x06symbol\x12\x18\n\x07subunit\x18\x04 \x01(\tR\x07subunit\x12\x1c\n\tprecision\x18\x05 \x01(\rR\tprecision\x12U\n\x0einitial_amount\x18\x06 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\rinitialAmount\x12 \n\x0b\x64\x65scription\x18\x07 \x01(\tR\x0b\x64\x65scription\x12\x37\n\x08\x66\x65\x61tures\x18\x08 \x03(\x0e\x32\x1b.coreum.asset.ft.v1.FeatureR\x08\x66\x65\x61tures\x12K\n\tburn_rate\x18\t \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x08\x62urnRate\x12`\n\x14send_commission_rate\x18\n \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x12sendCommissionRate\"\xfa\x01\n\x18\x45ventFrozenAmountChanged\x12\x18\n\x07\x61\x63\x63ount\x18\x01 \x01(\tR\x07\x61\x63\x63ount\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12W\n\x0fprevious_amount\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0epreviousAmount\x12U\n\x0e\x63urrent_amount\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\rcurrentAmount\"\xff\x01\n\x1d\x45ventWhitelistedAmountChanged\x12\x18\n\x07\x61\x63\x63ount\x18\x01 \x01(\tR\x07\x61\x63\x63ount\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12W\n\x0fprevious_amount\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0epreviousAmount\x12U\n\x0e\x63urrent_amount\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\rcurrentAmountB\xc4\x01\n\x16\x63om.coreum.asset.ft.v1B\nEventProtoP\x01Z3github.com/CoreumFoundation/coreum/x/asset/ft/types\xa2\x02\x03\x43\x41\x46\xaa\x02\x12\x43oreum.Asset.Ft.V1\xca\x02\x12\x43oreum\\Asset\\Ft\\V1\xe2\x02\x1e\x43oreum\\Asset\\Ft\\V1\\GPBMetadata\xea\x02\x15\x43oreum::Asset::Ft::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'coreum.asset.ft.v1.event_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.coreum.asset.ft.v1B\nEventProtoP\001Z3github.com/CoreumFoundation/coreum/x/asset/ft/types\242\002\003CAF\252\002\022Coreum.Asset.Ft.V1\312\002\022Coreum\\Asset\\Ft\\V1\342\002\036Coreum\\Asset\\Ft\\V1\\GPBMetadata\352\002\025Coreum::Asset::Ft::V1'
  _EVENTISSUED.fields_by_name['initial_amount']._options = None
  _EVENTISSUED.fields_by_name['initial_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _EVENTISSUED.fields_by_name['burn_rate']._options = None
  _EVENTISSUED.fields_by_name['burn_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _EVENTISSUED.fields_by_name['send_commission_rate']._options = None
  _EVENTISSUED.fields_by_name['send_commission_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _EVENTFROZENAMOUNTCHANGED.fields_by_name['previous_amount']._options = None
  _EVENTFROZENAMOUNTCHANGED.fields_by_name['previous_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _EVENTFROZENAMOUNTCHANGED.fields_by_name['current_amount']._options = None
  _EVENTFROZENAMOUNTCHANGED.fields_by_name['current_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _EVENTWHITELISTEDAMOUNTCHANGED.fields_by_name['previous_amount']._options = None
  _EVENTWHITELISTEDAMOUNTCHANGED.fields_by_name['previous_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _EVENTWHITELISTEDAMOUNTCHANGED.fields_by_name['current_amount']._options = None
  _EVENTWHITELISTEDAMOUNTCHANGED.fields_by_name['current_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_EVENTISSUED']._serialized_start=109
  _globals['_EVENTISSUED']._serialized_end=601
  _globals['_EVENTFROZENAMOUNTCHANGED']._serialized_start=604
  _globals['_EVENTFROZENAMOUNTCHANGED']._serialized_end=854
  _globals['_EVENTWHITELISTEDAMOUNTCHANGED']._serialized_start=857
  _globals['_EVENTWHITELISTEDAMOUNTCHANGED']._serialized_end=1112
# @@protoc_insertion_point(module_scope)
