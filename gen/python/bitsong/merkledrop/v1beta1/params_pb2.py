# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: bitsong/merkledrop/v1beta1/params.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'bitsong/merkledrop/v1beta1/params.proto\x12\x1a\x62itsong.merkledrop.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\x99\x01\n\x06Params\x12\x84\x01\n\x0c\x63reation_fee\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinBF\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.Coin\xf2\xde\x1f\x13yaml:\"creation_fee\"R\x0b\x63reationFee:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\x42\xf5\x01\n\x1e\x63om.bitsong.merkledrop.v1beta1B\x0bParamsProtoP\x01Z8github.com/bitsongofficial/go-bitsong/x/merkledrop/types\xa2\x02\x03\x42MX\xaa\x02\x1a\x42itsong.Merkledrop.V1beta1\xca\x02\x1a\x42itsong\\Merkledrop\\V1beta1\xe2\x02&Bitsong\\Merkledrop\\V1beta1\\GPBMetadata\xea\x02\x1c\x42itsong::Merkledrop::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'bitsong.merkledrop.v1beta1.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.bitsong.merkledrop.v1beta1B\013ParamsProtoP\001Z8github.com/bitsongofficial/go-bitsong/x/merkledrop/types\242\002\003BMX\252\002\032Bitsong.Merkledrop.V1beta1\312\002\032Bitsong\\Merkledrop\\V1beta1\342\002&Bitsong\\Merkledrop\\V1beta1\\GPBMetadata\352\002\034Bitsong::Merkledrop::V1beta1\310\341\036\000'
  _PARAMS.fields_by_name['creation_fee']._options = None
  _PARAMS.fields_by_name['creation_fee']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin\362\336\037\023yaml:\"creation_fee\"'
  _PARAMS._options = None
  _PARAMS._serialized_options = b'\230\240\037\000\350\240\037\001'
  _globals['_PARAMS']._serialized_start=126
  _globals['_PARAMS']._serialized_end=279
# @@protoc_insertion_point(module_scope)
