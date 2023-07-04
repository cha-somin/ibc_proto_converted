# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: secret/compute/v1beta1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from secret.compute.v1beta1 import types_pb2 as secret_dot_compute_dot_v1beta1_dot_types__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$secret/compute/v1beta1/genesis.proto\x12\x16secret.compute.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\"secret/compute/v1beta1/types.proto\"\x95\x02\n\x0cGenesisState\x12K\n\x05\x63odes\x18\x02 \x03(\x0b\x32\x1c.secret.compute.v1beta1.CodeB\x17\xc8\xde\x1f\x00\xea\xde\x1f\x0f\x63odes,omitemptyR\x05\x63odes\x12[\n\tcontracts\x18\x03 \x03(\x0b\x32 .secret.compute.v1beta1.ContractB\x1b\xc8\xde\x1f\x00\xea\xde\x1f\x13\x63ontracts,omitemptyR\tcontracts\x12[\n\tsequences\x18\x04 \x03(\x0b\x32 .secret.compute.v1beta1.SequenceB\x1b\xc8\xde\x1f\x00\xea\xde\x1f\x13sequences,omitemptyR\tsequences\"\x8f\x01\n\x04\x43ode\x12#\n\x07\x63ode_id\x18\x01 \x01(\x04\x42\n\xe2\xde\x1f\x06\x43odeIDR\x06\x63odeId\x12\x43\n\tcode_info\x18\x02 \x01(\x0b\x32 .secret.compute.v1beta1.CodeInfoB\x04\xc8\xde\x1f\x00R\x08\x63odeInfo\x12\x1d\n\ncode_bytes\x18\x03 \x01(\x0cR\tcodeBytes\"\xe3\x02\n\x08\x43ontract\x12\\\n\x10\x63ontract_address\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x0f\x63ontractAddress\x12O\n\rcontract_info\x18\x02 \x01(\x0b\x32$.secret.compute.v1beta1.ContractInfoB\x04\xc8\xde\x1f\x00R\x0c\x63ontractInfo\x12J\n\x0e\x63ontract_state\x18\x03 \x03(\x0b\x32\x1d.secret.compute.v1beta1.ModelB\x04\xc8\xde\x1f\x00R\rcontractState\x12\\\n\x14\x63ontract_custom_info\x18\x04 \x01(\x0b\x32*.secret.compute.v1beta1.ContractCustomInfoR\x12\x63ontractCustomInfo\"B\n\x08Sequence\x12 \n\x06id_key\x18\x01 \x01(\x0c\x42\t\xe2\xde\x1f\x05IDKeyR\x05idKey\x12\x14\n\x05value\x18\x02 \x01(\x04R\x05valueB\xe0\x01\n\x1a\x63om.secret.compute.v1beta1B\x0cGenesisProtoP\x01Z:github.com/scrtlabs/SecretNetwork/x/compute/internal/types\xa2\x02\x03SCX\xaa\x02\x16Secret.Compute.V1beta1\xca\x02\x16Secret\\Compute\\V1beta1\xe2\x02\"Secret\\Compute\\V1beta1\\GPBMetadata\xea\x02\x18Secret::Compute::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'secret.compute.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.secret.compute.v1beta1B\014GenesisProtoP\001Z:github.com/scrtlabs/SecretNetwork/x/compute/internal/types\242\002\003SCX\252\002\026Secret.Compute.V1beta1\312\002\026Secret\\Compute\\V1beta1\342\002\"Secret\\Compute\\V1beta1\\GPBMetadata\352\002\030Secret::Compute::V1beta1'
  _GENESISSTATE.fields_by_name['codes']._options = None
  _GENESISSTATE.fields_by_name['codes']._serialized_options = b'\310\336\037\000\352\336\037\017codes,omitempty'
  _GENESISSTATE.fields_by_name['contracts']._options = None
  _GENESISSTATE.fields_by_name['contracts']._serialized_options = b'\310\336\037\000\352\336\037\023contracts,omitempty'
  _GENESISSTATE.fields_by_name['sequences']._options = None
  _GENESISSTATE.fields_by_name['sequences']._serialized_options = b'\310\336\037\000\352\336\037\023sequences,omitempty'
  _CODE.fields_by_name['code_id']._options = None
  _CODE.fields_by_name['code_id']._serialized_options = b'\342\336\037\006CodeID'
  _CODE.fields_by_name['code_info']._options = None
  _CODE.fields_by_name['code_info']._serialized_options = b'\310\336\037\000'
  _CONTRACT.fields_by_name['contract_address']._options = None
  _CONTRACT.fields_by_name['contract_address']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _CONTRACT.fields_by_name['contract_info']._options = None
  _CONTRACT.fields_by_name['contract_info']._serialized_options = b'\310\336\037\000'
  _CONTRACT.fields_by_name['contract_state']._options = None
  _CONTRACT.fields_by_name['contract_state']._serialized_options = b'\310\336\037\000'
  _SEQUENCE.fields_by_name['id_key']._options = None
  _SEQUENCE.fields_by_name['id_key']._serialized_options = b'\342\336\037\005IDKey'
  _globals['_GENESISSTATE']._serialized_start=123
  _globals['_GENESISSTATE']._serialized_end=400
  _globals['_CODE']._serialized_start=403
  _globals['_CODE']._serialized_end=546
  _globals['_CONTRACT']._serialized_start=549
  _globals['_CONTRACT']._serialized_end=904
  _globals['_SEQUENCE']._serialized_start=906
  _globals['_SEQUENCE']._serialized_end=972
# @@protoc_insertion_point(module_scope)