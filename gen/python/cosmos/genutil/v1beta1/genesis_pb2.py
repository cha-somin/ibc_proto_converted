# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/genutil/v1beta1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from amino import amino_pb2 as amino_dot_amino__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$cosmos/genutil/v1beta1/genesis.proto\x12\x16\x63osmos.genutil.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x11\x61mino/amino.proto\"_\n\x0cGenesisState\x12O\n\x07gen_txs\x18\x01 \x03(\x0c\x42\x36\xea\xde\x1f\x06gentxs\xfa\xde\x1f\x18\x65ncoding/json.RawMessage\xa2\xe7\xb0*\x06gentxs\xa8\xe7\xb0*\x01R\x06genTxsB\xd2\x01\n\x1a\x63om.cosmos.genutil.v1beta1B\x0cGenesisProtoP\x01Z,github.com/cosmos/cosmos-sdk/x/genutil/types\xa2\x02\x03\x43GX\xaa\x02\x16\x43osmos.Genutil.V1beta1\xca\x02\x16\x43osmos\\Genutil\\V1beta1\xe2\x02\"Cosmos\\Genutil\\V1beta1\\GPBMetadata\xea\x02\x18\x43osmos::Genutil::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmos.genutil.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.cosmos.genutil.v1beta1B\014GenesisProtoP\001Z,github.com/cosmos/cosmos-sdk/x/genutil/types\242\002\003CGX\252\002\026Cosmos.Genutil.V1beta1\312\002\026Cosmos\\Genutil\\V1beta1\342\002\"Cosmos\\Genutil\\V1beta1\\GPBMetadata\352\002\030Cosmos::Genutil::V1beta1'
  _GENESISSTATE.fields_by_name['gen_txs']._options = None
  _GENESISSTATE.fields_by_name['gen_txs']._serialized_options = b'\352\336\037\006gentxs\372\336\037\030encoding/json.RawMessage\242\347\260*\006gentxs\250\347\260*\001'
  _globals['_GENESISSTATE']._serialized_start=105
  _globals['_GENESISSTATE']._serialized_end=200
# @@protoc_insertion_point(module_scope)
