# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: injective/wasmx/v1/wasmx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from injective.wasmx.v1 import proposal_pb2 as injective_dot_wasmx_dot_v1_dot_proposal__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1einjective/wasmx/v1/wasmx.proto\x12\x12injective.wasmx.v1\x1a\x14gogoproto/gogo.proto\x1a!injective/wasmx/v1/proposal.proto\"\xd3\x01\n\x06Params\x12\x30\n\x14is_execution_enabled\x18\x01 \x01(\x08R\x12isExecutionEnabled\x12\x38\n\x19max_begin_block_total_gas\x18\x02 \x01(\x04R\x15maxBeginBlockTotalGas\x12\x33\n\x16max_contract_gas_limit\x18\x03 \x01(\x04R\x13maxContractGasLimit\x12\"\n\rmin_gas_price\x18\x04 \x01(\x04R\x0bminGasPrice:\x04\xe8\xa0\x1f\x01\"\xb0\x02\n\x12RegisteredContract\x12\x1b\n\tgas_limit\x18\x01 \x01(\x04R\x08gasLimit\x12\x1b\n\tgas_price\x18\x02 \x01(\x04R\x08gasPrice\x12#\n\ris_executable\x18\x03 \x01(\x08R\x0cisExecutable\x12\x1d\n\x07\x63ode_id\x18\x04 \x01(\x04\x42\x04\xc8\xde\x1f\x01R\x06\x63odeId\x12)\n\radmin_address\x18\x05 \x01(\tB\x04\xc8\xde\x1f\x01R\x0c\x61\x64minAddress\x12-\n\x0fgranter_address\x18\x06 \x01(\tB\x04\xc8\xde\x1f\x01R\x0egranterAddress\x12<\n\tfund_mode\x18\x07 \x01(\x0e\x32\x1f.injective.wasmx.v1.FundingModeR\x08\x66undMode:\x04\xe8\xa0\x1f\x01\x42\xdb\x01\n\x16\x63om.injective.wasmx.v1B\nWasmxProtoP\x01ZKgithub.com/InjectiveLabs/injective-core/injective-chain/modules/wasmx/types\xa2\x02\x03IWX\xaa\x02\x12Injective.Wasmx.V1\xca\x02\x12Injective\\Wasmx\\V1\xe2\x02\x1eInjective\\Wasmx\\V1\\GPBMetadata\xea\x02\x14Injective::Wasmx::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'injective.wasmx.v1.wasmx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.injective.wasmx.v1B\nWasmxProtoP\001ZKgithub.com/InjectiveLabs/injective-core/injective-chain/modules/wasmx/types\242\002\003IWX\252\002\022Injective.Wasmx.V1\312\002\022Injective\\Wasmx\\V1\342\002\036Injective\\Wasmx\\V1\\GPBMetadata\352\002\024Injective::Wasmx::V1'
  _PARAMS._options = None
  _PARAMS._serialized_options = b'\350\240\037\001'
  _REGISTEREDCONTRACT.fields_by_name['code_id']._options = None
  _REGISTEREDCONTRACT.fields_by_name['code_id']._serialized_options = b'\310\336\037\001'
  _REGISTEREDCONTRACT.fields_by_name['admin_address']._options = None
  _REGISTEREDCONTRACT.fields_by_name['admin_address']._serialized_options = b'\310\336\037\001'
  _REGISTEREDCONTRACT.fields_by_name['granter_address']._options = None
  _REGISTEREDCONTRACT.fields_by_name['granter_address']._serialized_options = b'\310\336\037\001'
  _REGISTEREDCONTRACT._options = None
  _REGISTEREDCONTRACT._serialized_options = b'\350\240\037\001'
  _globals['_PARAMS']._serialized_start=112
  _globals['_PARAMS']._serialized_end=323
  _globals['_REGISTEREDCONTRACT']._serialized_start=326
  _globals['_REGISTEREDCONTRACT']._serialized_end=630
# @@protoc_insertion_point(module_scope)
