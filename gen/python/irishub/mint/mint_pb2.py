# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: irishub/mint/mint.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x17irishub/mint/mint.proto\x12\x0cirishub.mint\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xd5\x01\n\x06Minter\x12[\n\x0blast_update\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1e\xc8\xde\x1f\x00\xf2\xde\x1f\x12yaml:\"last_update\"\x90\xdf\x1f\x01R\nlastUpdate\x12n\n\x0einflation_base\x18\x02 \x01(\tBG\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x15yaml:\"inflation_base\"R\rinflationBase\"{\n\x06Params\x12\x1d\n\nmint_denom\x18\x01 \x01(\tR\tmintDenom\x12L\n\tinflation\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\tinflation:\x04\x98\xa0\x1f\x00\x42\x9d\x01\n\x10\x63om.irishub.mintB\tMintProtoP\x01Z-github.com/irisnet/irishub/modules/mint/types\xa2\x02\x03IMX\xaa\x02\x0cIrishub.Mint\xca\x02\x0cIrishub\\Mint\xe2\x02\x18Irishub\\Mint\\GPBMetadata\xea\x02\rIrishub::Mintb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'irishub.mint.mint_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\020com.irishub.mintB\tMintProtoP\001Z-github.com/irisnet/irishub/modules/mint/types\242\002\003IMX\252\002\014Irishub.Mint\312\002\014Irishub\\Mint\342\002\030Irishub\\Mint\\GPBMetadata\352\002\rIrishub::Mint'
  _MINTER.fields_by_name['last_update']._options = None
  _MINTER.fields_by_name['last_update']._serialized_options = b'\310\336\037\000\362\336\037\022yaml:\"last_update\"\220\337\037\001'
  _MINTER.fields_by_name['inflation_base']._options = None
  _MINTER.fields_by_name['inflation_base']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\025yaml:\"inflation_base\"'
  _PARAMS.fields_by_name['inflation']._options = None
  _PARAMS.fields_by_name['inflation']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _PARAMS._options = None
  _PARAMS._serialized_options = b'\230\240\037\000'
  _globals['_MINTER']._serialized_start=97
  _globals['_MINTER']._serialized_end=310
  _globals['_PARAMS']._serialized_start=312
  _globals['_PARAMS']._serialized_end=435
# @@protoc_insertion_point(module_scope)