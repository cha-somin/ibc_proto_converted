# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: onomyprotocol/dao/v1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from onomyprotocol.dao.v1 import params_pb2 as onomyprotocol_dot_dao_dot_v1_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"onomyprotocol/dao/v1/genesis.proto\x12\x14onomyprotocol.dao.v1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a!onomyprotocol/dao/v1/params.proto\"\xde\x01\n\x0cGenesisState\x12:\n\x06params\x18\x01 \x01(\x0b\x32\x1c.onomyprotocol.dao.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12\x91\x01\n\x10treasury_balance\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBK\xc8\xde\x1f\x00\xf2\xde\x1f\x17yaml:\"treasury_balance\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x0ftreasuryBalanceB\xc6\x01\n\x18\x63om.onomyprotocol.dao.v1B\x0cGenesisProtoP\x01Z*github.com/onomyprotocol/onomy/x/dao/types\xa2\x02\x03ODX\xaa\x02\x14Onomyprotocol.Dao.V1\xca\x02\x14Onomyprotocol\\Dao\\V1\xe2\x02 Onomyprotocol\\Dao\\V1\\GPBMetadata\xea\x02\x16Onomyprotocol::Dao::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'onomyprotocol.dao.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.onomyprotocol.dao.v1B\014GenesisProtoP\001Z*github.com/onomyprotocol/onomy/x/dao/types\242\002\003ODX\252\002\024Onomyprotocol.Dao.V1\312\002\024Onomyprotocol\\Dao\\V1\342\002 Onomyprotocol\\Dao\\V1\\GPBMetadata\352\002\026Onomyprotocol::Dao::V1'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['treasury_balance']._options = None
  _GENESISSTATE.fields_by_name['treasury_balance']._serialized_options = b'\310\336\037\000\362\336\037\027yaml:\"treasury_balance\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_GENESISSTATE']._serialized_start=150
  _globals['_GENESISSTATE']._serialized_end=372
# @@protoc_insertion_point(module_scope)
