# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/escrow/v1beta3/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from akash.escrow.v1beta3 import types_pb2 as akash_dot_escrow_dot_v1beta3_dot_types__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"akash/escrow/v1beta3/genesis.proto\x12\x14\x61kash.escrow.v1beta3\x1a\x14gogoproto/gogo.proto\x1a akash/escrow/v1beta3/types.proto\"\xd8\x01\n\x0cGenesisState\x12^\n\x08\x61\x63\x63ounts\x18\x01 \x03(\x0b\x32\x1d.akash.escrow.v1beta3.AccountB#\xc8\xde\x1f\x00\xea\xde\x1f\x08\x61\x63\x63ounts\xf2\xde\x1f\x0fyaml:\"accounts\"R\x08\x61\x63\x63ounts\x12h\n\x08payments\x18\x02 \x03(\x0b\x32\'.akash.escrow.v1beta3.FractionalPaymentB#\xc8\xde\x1f\x00\xea\xde\x1f\x08payments\xf2\xde\x1f\x0fyaml:\"payments\"R\x08paymentsB\xd5\x01\n\x18\x63om.akash.escrow.v1beta3B\x0cGenesisProtoP\x01Z9github.com/akash-network/akash-api/go/node/escrow/v1beta3\xa2\x02\x03\x41\x45X\xaa\x02\x14\x41kash.Escrow.V1beta3\xca\x02\x14\x41kash\\Escrow\\V1beta3\xe2\x02 Akash\\Escrow\\V1beta3\\GPBMetadata\xea\x02\x16\x41kash::Escrow::V1beta3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.escrow.v1beta3.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.akash.escrow.v1beta3B\014GenesisProtoP\001Z9github.com/akash-network/akash-api/go/node/escrow/v1beta3\242\002\003AEX\252\002\024Akash.Escrow.V1beta3\312\002\024Akash\\Escrow\\V1beta3\342\002 Akash\\Escrow\\V1beta3\\GPBMetadata\352\002\026Akash::Escrow::V1beta3'
  _GENESISSTATE.fields_by_name['accounts']._options = None
  _GENESISSTATE.fields_by_name['accounts']._serialized_options = b'\310\336\037\000\352\336\037\010accounts\362\336\037\017yaml:\"accounts\"'
  _GENESISSTATE.fields_by_name['payments']._options = None
  _GENESISSTATE.fields_by_name['payments']._serialized_options = b'\310\336\037\000\352\336\037\010payments\362\336\037\017yaml:\"payments\"'
  _globals['_GENESISSTATE']._serialized_start=117
  _globals['_GENESISSTATE']._serialized_end=333
# @@protoc_insertion_point(module_scope)