# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: neutron/contractmanager/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from neutron.contractmanager import params_pb2 as neutron_dot_contractmanager_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%neutron/contractmanager/genesis.proto\x12\x17neutron.contractmanager\x1a\x14gogoproto/gogo.proto\x1a$neutron/contractmanager/params.proto\"\x84\x01\n\x07\x46\x61ilure\x12\x1d\n\nchannel_id\x18\x01 \x01(\tR\tchannelId\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\x12\x0e\n\x02id\x18\x03 \x01(\x04R\x02id\x12\x15\n\x06\x61\x63k_id\x18\x04 \x01(\x04R\x05\x61\x63kId\x12\x19\n\x08\x61\x63k_type\x18\x05 \x01(\tR\x07\x61\x63kType\"\x9a\x01\n\x0cGenesisState\x12=\n\x06params\x18\x01 \x01(\x0b\x32\x1f.neutron.contractmanager.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12K\n\rfailures_list\x18\x02 \x03(\x0b\x32 .neutron.contractmanager.FailureB\x04\xc8\xde\x1f\x00R\x0c\x66\x61iluresListB\xe0\x01\n\x1b\x63om.neutron.contractmanagerB\x0cGenesisProtoP\x01Z6github.com/neutron-org/neutron/x/contractmanager/types\xa2\x02\x03NCX\xaa\x02\x17Neutron.Contractmanager\xca\x02\x17Neutron\\Contractmanager\xe2\x02#Neutron\\Contractmanager\\GPBMetadata\xea\x02\x18Neutron::Contractmanagerb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'neutron.contractmanager.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.neutron.contractmanagerB\014GenesisProtoP\001Z6github.com/neutron-org/neutron/x/contractmanager/types\242\002\003NCX\252\002\027Neutron.Contractmanager\312\002\027Neutron\\Contractmanager\342\002#Neutron\\Contractmanager\\GPBMetadata\352\002\030Neutron::Contractmanager'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['failures_list']._options = None
  _GENESISSTATE.fields_by_name['failures_list']._serialized_options = b'\310\336\037\000'
  _globals['_FAILURE']._serialized_start=127
  _globals['_FAILURE']._serialized_end=259
  _globals['_GENESISSTATE']._serialized_start=262
  _globals['_GENESISSTATE']._serialized_end=416
# @@protoc_insertion_point(module_scope)
