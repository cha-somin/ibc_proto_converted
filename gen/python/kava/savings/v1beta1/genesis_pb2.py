# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/savings/v1beta1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from kava.savings.v1beta1 import store_pb2 as kava_dot_savings_dot_v1beta1_dot_store__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"kava/savings/v1beta1/genesis.proto\x12\x14kava.savings.v1beta1\x1a\x14gogoproto/gogo.proto\x1a kava/savings/v1beta1/store.proto\"\x97\x01\n\x0cGenesisState\x12:\n\x06params\x18\x01 \x01(\x0b\x32\x1c.kava.savings.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12K\n\x08\x64\x65posits\x18\x02 \x03(\x0b\x32\x1d.kava.savings.v1beta1.DepositB\x10\xc8\xde\x1f\x00\xaa\xdf\x1f\x08\x44\x65positsR\x08\x64\x65positsB\xc5\x01\n\x18\x63om.kava.savings.v1beta1B\x0cGenesisProtoP\x01Z)github.com/kava-labs/kava/x/savings/types\xa2\x02\x03KSX\xaa\x02\x14Kava.Savings.V1beta1\xca\x02\x14Kava\\Savings\\V1beta1\xe2\x02 Kava\\Savings\\V1beta1\\GPBMetadata\xea\x02\x16Kava::Savings::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.savings.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.kava.savings.v1beta1B\014GenesisProtoP\001Z)github.com/kava-labs/kava/x/savings/types\242\002\003KSX\252\002\024Kava.Savings.V1beta1\312\002\024Kava\\Savings\\V1beta1\342\002 Kava\\Savings\\V1beta1\\GPBMetadata\352\002\026Kava::Savings::V1beta1'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['deposits']._options = None
  _GENESISSTATE.fields_by_name['deposits']._serialized_options = b'\310\336\037\000\252\337\037\010Deposits'
  _globals['_GENESISSTATE']._serialized_start=117
  _globals['_GENESISSTATE']._serialized_end=268
# @@protoc_insertion_point(module_scope)
