# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kyve/bundles/v1beta1/params.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!kyve/bundles/v1beta1/params.proto\x12\x14kyve.bundles.v1beta1\x1a\x14gogoproto/gogo.proto\"\xf2\x01\n\x06Params\x12%\n\x0eupload_timeout\x18\x01 \x01(\x04R\ruploadTimeout\x12Q\n\x0cstorage_cost\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0bstorageCost\x12O\n\x0bnetwork_fee\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\nnetworkFee\x12\x1d\n\nmax_points\x18\x04 \x01(\x04R\tmaxPointsB\xc7\x01\n\x18\x63om.kyve.bundles.v1beta1B\x0bParamsProtoP\x01Z,github.com/KYVENetwork/chain/x/bundles/types\xa2\x02\x03KBX\xaa\x02\x14Kyve.Bundles.V1beta1\xca\x02\x14Kyve\\Bundles\\V1beta1\xe2\x02 Kyve\\Bundles\\V1beta1\\GPBMetadata\xea\x02\x16Kyve::Bundles::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kyve.bundles.v1beta1.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.kyve.bundles.v1beta1B\013ParamsProtoP\001Z,github.com/KYVENetwork/chain/x/bundles/types\242\002\003KBX\252\002\024Kyve.Bundles.V1beta1\312\002\024Kyve\\Bundles\\V1beta1\342\002 Kyve\\Bundles\\V1beta1\\GPBMetadata\352\002\026Kyve::Bundles::V1beta1'
  _PARAMS.fields_by_name['storage_cost']._options = None
  _PARAMS.fields_by_name['storage_cost']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _PARAMS.fields_by_name['network_fee']._options = None
  _PARAMS.fields_by_name['network_fee']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_PARAMS']._serialized_start=82
  _globals['_PARAMS']._serialized_end=324
# @@protoc_insertion_point(module_scope)