# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stargaze/mint/v1beta1/mint.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n stargaze/mint/v1beta1/mint.proto\x12\x15stargaze.mint.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x81\x01\n\x06Minter\x12w\n\x11\x61nnual_provisions\x18\x01 \x01(\tBJ\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x18yaml:\"annual_provisions\"R\x10\x61nnualProvisions\"\xd2\x03\n\x06Params\x12\x1d\n\nmint_denom\x18\x01 \x01(\tR\tmintDenom\x12X\n\nstart_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"start_time\"\x90\xdf\x1f\x01R\tstartTime\x12\x8e\x01\n\x19initial_annual_provisions\x18\x03 \x01(\tBR\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f yaml:\"initial_annual_provisions\"R\x17initialAnnualProvisions\x12t\n\x10reduction_factor\x18\x04 \x01(\tBI\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x17yaml:\"reduction_factor\"R\x0freductionFactor\x12\x42\n\x0f\x62locks_per_year\x18\x05 \x01(\x04\x42\x1a\xf2\xde\x1f\x16yaml:\"blocks_per_year\"R\rblocksPerYear:\x04\x98\xa0\x1f\x00\x42\xd1\x01\n\x19\x63om.stargaze.mint.v1beta1B\tMintProtoP\x01Z3github.com/public-awesome/stargaze/v11/x/mint/types\xa2\x02\x03SMX\xaa\x02\x15Stargaze.Mint.V1beta1\xca\x02\x15Stargaze\\Mint\\V1beta1\xe2\x02!Stargaze\\Mint\\V1beta1\\GPBMetadata\xea\x02\x17Stargaze::Mint::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stargaze.mint.v1beta1.mint_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\031com.stargaze.mint.v1beta1B\tMintProtoP\001Z3github.com/public-awesome/stargaze/v11/x/mint/types\242\002\003SMX\252\002\025Stargaze.Mint.V1beta1\312\002\025Stargaze\\Mint\\V1beta1\342\002!Stargaze\\Mint\\V1beta1\\GPBMetadata\352\002\027Stargaze::Mint::V1beta1'
  _MINTER.fields_by_name['annual_provisions']._options = None
  _MINTER.fields_by_name['annual_provisions']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\030yaml:\"annual_provisions\"'
  _PARAMS.fields_by_name['start_time']._options = None
  _PARAMS.fields_by_name['start_time']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"start_time\"\220\337\037\001'
  _PARAMS.fields_by_name['initial_annual_provisions']._options = None
  _PARAMS.fields_by_name['initial_annual_provisions']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037 yaml:\"initial_annual_provisions\"'
  _PARAMS.fields_by_name['reduction_factor']._options = None
  _PARAMS.fields_by_name['reduction_factor']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\027yaml:\"reduction_factor\"'
  _PARAMS.fields_by_name['blocks_per_year']._options = None
  _PARAMS.fields_by_name['blocks_per_year']._serialized_options = b'\362\336\037\026yaml:\"blocks_per_year\"'
  _PARAMS._options = None
  _PARAMS._serialized_options = b'\230\240\037\000'
  _globals['_MINTER']._serialized_start=115
  _globals['_MINTER']._serialized_end=244
  _globals['_PARAMS']._serialized_start=247
  _globals['_PARAMS']._serialized_end=713
# @@protoc_insertion_point(module_scope)
